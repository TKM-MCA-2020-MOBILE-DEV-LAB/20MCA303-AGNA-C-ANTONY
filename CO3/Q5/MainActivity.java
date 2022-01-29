package com.example.arraylist;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=findViewById(R.id.list);
        String[] item_view=new String[]{"Java","Python","C","C++","MySQL"};
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,item_view);
        listview.setAdapter(myAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public  void  onItemClick(AdapterView<?> parent,View view,int position,long id) {
                String item_name=item_view[position];
                Toast.makeText(MainActivity.this,"Welocme to "+ item_name, Toast.LENGTH_SHORT).show();
            }

        });
    }
}
