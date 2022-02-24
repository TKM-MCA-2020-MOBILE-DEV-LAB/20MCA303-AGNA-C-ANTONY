package com.example.co5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ListView listView=findViewById(R.id.l1);
        String[] film_stars={"Fahad Fazil","Tovino","Nivin","MohanLal","Jayaram","Mammootty","Suresh Gopi","SRK","NTR","SB"};
       try{
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,film_stars);
        listView.setAdapter(adapter);
       }
       catch (Exception e){
           Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
       }


    }
}
