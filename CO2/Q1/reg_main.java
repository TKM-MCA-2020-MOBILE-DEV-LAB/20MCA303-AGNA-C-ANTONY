package com.example.regintent;
import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.email);
        e3=(EditText)findViewById(R.id.phn);
        e4=(EditText)findViewById(R.id.address);
        b1=(Button)findViewById(R.id.register);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);

    }
    public void register_details(View view)
    {
        String name=e1.getText().toString();
        String email=e2.getText().toString();
        String phno=e3.getText().toString();
        String address=e4.getText().toString();
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("name",name);
        i.putExtra("email",email);
        i.putExtra("phno",phno);
        i.putExtra("address",address);
        startActivity(i);

    }

    @Override
    protected  void onResume()
    {
        super.onResume();
        SharedPreferences sh = getSharedPreferences("SharedPrefernceTest", MODE_PRIVATE);
        String name_retrived=sh.getString("name","");
        String email_retrived=sh.getString("email","");
        String phno_retrived=sh.getString("phno","");
        String address=sh.getString("address","");
        t1.setText(name_retrived);
        t2.setText(email_retrived);
        t3.setText(phno_retrived);
        t4.setText(address);

    }

    @Override
    protected  void onPause()
    {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPrefernceTest", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", e1.getText().toString());
        editor.putString("email",e2.getText().toString());
        editor.putString("phno",e3.getText().toString());
        editor.putString("address",e4.getText().toString());
        editor.commit();
    }



}

