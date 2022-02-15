package com.example.gasbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String Distibutor = getIntent().getExtras().getString("distibutor");
        String Consumer = getIntent().getExtras().getString("consumer");
        String phno = getIntent().getExtras().getString("phno");
        EditText r1,r2,r3;
        r1=(EditText)findViewById(R.id.rDcode);
        r1.setText(Distibutor);
        r2=(EditText)findViewById(R.id.rCcode);
        r2.setText(Consumer);
        r3=(EditText)findViewById(R.id.rphno);
        r3.setText(phno);
    }
}
