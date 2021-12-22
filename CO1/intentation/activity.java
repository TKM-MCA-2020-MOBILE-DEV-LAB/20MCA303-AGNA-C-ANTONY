package com.example.admin.intentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callactivity(View view){
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }
}
