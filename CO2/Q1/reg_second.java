package com.example.regintent;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

 class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String Name = getIntent().getExtras().getString("name");
        String Phno = getIntent().getExtras().getString("phno");
        String Address = getIntent().getExtras().getString("address");
        EditText r1,r2,r3;
        r1=(EditText)findViewById(R.id.rname);
        r1.setText(Name);
        r2=(EditText)findViewById(R.id.rphno);
        r2.setText(Phno);
        r3=(EditText)findViewById(R.id.raddress);
        r3.setText(Address);
    }


}



