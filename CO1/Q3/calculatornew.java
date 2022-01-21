package com.example.calculatornew;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText e1,e2,e3;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.number1);
        e2=(EditText)findViewById(R.id.number2);
        e3=(EditText)findViewById(R.id.output);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.sub);
        b3=(Button)findViewById(R.id.div);
        b4=(Button)findViewById(R.id.mul);


    }
    public void add(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1+n2);
        e3.setText(n3);

    }

    public void subtract(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1-n2);
        e3.setText(n3);
    }
    public void divide(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1/n2);
        e3.setText(n3);
    }
    public void multiply(View view)
    {
        int n1=Integer.parseInt(e1.getText().toString());
        int n2=Integer.parseInt(e2.getText().toString());
        String n3=String.valueOf(n1*n2);
        e3.setText(n3);
    }
}
