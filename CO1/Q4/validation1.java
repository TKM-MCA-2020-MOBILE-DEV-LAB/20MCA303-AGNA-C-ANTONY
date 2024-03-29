package com.example.validation1;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5;
    Button b3;
    RadioButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.name);
        e2=(EditText)findViewById(R.id.address);
        e3=(EditText)findViewById(R.id.email);
        e4=(EditText)findViewById(R.id.password);
        e5=(EditText)findViewById(R.id.phone);
        b3=(Button)findViewById(R.id.validate);
        b1=(RadioButton)findViewById(R.id.male);
        b2=(RadioButton)findViewById(R.id.female);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                validate();
            }
        });

    }

    public void validate() {
        String name = e1.getText().toString();
        String email = e3.getText().toString().trim();
        String address = e2.getText().toString();
        String password = e5.getText().toString();
        String namePattern = "[0-9!@#$%^&*]";
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String phone = e4.getText().toString();
        int valid = 1;

        if (name.length() == 0) {
            e1.getText().clear();
            e1.requestFocus();
            e1.setError("No valid name written");
            Toast.makeText(getApplicationContext(), "Enter valid name", Toast.LENGTH_SHORT).show();
            valid++;
        }
        if (name.matches(namePattern)) {
            e1.getText().clear();
            e1.requestFocus();
            e1.setError("Name contains illegal characters");
            Toast.makeText(getApplicationContext(), "Enter valid name", Toast.LENGTH_SHORT).show();
            valid++;
        }
        if (address.length() == 0) {
            e2.getText().clear();
            e2.requestFocus();
            e2.setError("No valid address written");
            Toast.makeText(getApplicationContext(), "Enter valid address", Toast.LENGTH_SHORT).show();
            valid++;
        }
        if (email.length() == 0) {
            e3.getText().clear();
            e3.requestFocus();
            e3.setError("No valid email written");
            Toast.makeText(getApplicationContext(), "Enter valid email", Toast.LENGTH_SHORT).show();
            valid++;
        }
        if (!email.matches(emailPattern)) {
            e3.getText().clear();
            e3.requestFocus();
            e3.setError("Invalid email pattern");
            Toast.makeText(getApplicationContext(), "Enter valid email ", Toast.LENGTH_SHORT).show();
            valid++;
        }
        if (password.length() == 0) {
            e4.requestFocus();
            e4.setError("Enter valid password");
            valid++;
        }
        if (password.length() < 5) {
            e4.requestFocus();
            e4.setError("Enter an 8 digit password");
            valid++;

        }
        if (!password.equals("admin")) {
            Toast.makeText(getApplicationContext(), "Incorrect password", Toast.LENGTH_SHORT).show();
        }


        if (b1.isChecked()) {
            Toast.makeText(getApplicationContext(), "Welcome Mr." + name, Toast.LENGTH_SHORT).show();
        }
        if (b2.isChecked()) {
            Toast.makeText(getApplicationContext(), "Welcome Ms." + name, Toast.LENGTH_SHORT).show();

        }


        if (phone.length() == 0) {
            e5.requestFocus();
            e5.setError("Enter valid password");
            valid++;
        }
        if(valid==1)
        {
            Toast.makeText(getApplicationContext(), "VALIDATED", Toast.LENGTH_SHORT).show();
        }
    }

}