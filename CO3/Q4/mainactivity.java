package com.example.optionmenu;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater i= getMenuInflater();
        i.inflate(R.menu.option_menu,menu);
        return  true;
        // return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.action_HOME)
        {
            Intent homeintent=new Intent(MainActivity.this, Home.class);
            startActivity(homeintent);
        }
        if(id==R.id.action_About)
        {
            Intent aboutintent=new Intent(MainActivity.this,about.class);
            startActivity(aboutintent);
        }
        if (id==R.id.action_Contact)
        {
            Intent contactintent=new Intent(MainActivity.this,contact.class);
            startActivity(contactintent);
        }
        if(id==R.id.action_Settings)
        {
            Intent settingsintent=new Intent(MainActivity.this,settings.class);
            startActivity(settingsintent);
        }
        return super.onOptionsItemSelected(item);
    }
}

