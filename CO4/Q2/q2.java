package com.example.a19mca43.spin_new;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] courses = {"BCA", "BSc", "MCA", "MSc", "PhD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Spinner spin = (Spinner) findViewById( R.id.spinner );
        spin.setOnItemSelectedListener( this );
        ArrayAdapter Arrayadapt = new ArrayAdapter( this, android.R.layout.simple_spinner_item, courses );
        Arrayadapt.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spin.setAdapter( Arrayadapt );

    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText( getApplicationContext(), courses[position], Toast.LENGTH_LONG ).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
