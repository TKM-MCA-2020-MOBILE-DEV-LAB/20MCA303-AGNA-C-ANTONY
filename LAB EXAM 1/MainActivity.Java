package com.example.gasbooking;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    TextView t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.Dcode);
        e2=(EditText)findViewById(R.id.Ccode);
        e3=(EditText)findViewById(R.id.moblie);
        b1=(Button)findViewById(R.id.reg);



    }
    public void booking(View view){
        String distributor=e1.getText().toString();
        String consumer=e2.getText().toString();
        String mobile=e3.getText().toString();
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("distributor",distributor);
        i.putExtra("consumer",consumer);
        i.putExtra("phno",mobile);
        startActivity(i);


    }
    public void OnResume(View view){
        super.onResume();
        SharedPreferences sh = getSharedPreferences("SharedPrefernceTest", MODE_PRIVATE);
        String distribution_retrived=sh.getString("distributor","");
        String consumer_retrived=sh.getString("consumer","");
        String phno_retrived=sh.getString("phno","");
        t1.setText(distribution_retrived);
        t2.setText(consumer_retrived);
        t3.setText(phno_retrived);
    }


    @Override
        protected  void onPause()
        {
            super.onPause();
            SharedPreferences sharedPreferences = getSharedPreferences("SharedPrefernceTest", MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(" distributor", e1.getText().toString());
            editor.putString("consumer",e2.getText().toString());
            editor.putString("phno",e3.getText().toString());
            editor.commit();
        }

}
