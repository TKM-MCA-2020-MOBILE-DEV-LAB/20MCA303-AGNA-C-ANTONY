package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView view1;
    TextView view2;
    TextView view3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view1 = (TextView) findViewById(R.id.v2);
        view2 = (TextView) findViewById(R.id.v3);
        view3 = (TextView) findViewById(R.id.v1);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        String value3 = extras.getString("Value3");
        view1.setText(value1);
        view2.setText(value2);
        view3.setText(value3);

    }
}
