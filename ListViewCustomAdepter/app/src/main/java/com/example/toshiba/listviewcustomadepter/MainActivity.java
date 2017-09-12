package com.example.toshiba.listviewcustomadepter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryName;
    private int[] flags={R.drawable.s,R.drawable.sai,R.drawable.say_pic,R.drawable.sayed};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listV);
        countryName=getResources().getStringArray(R.array.country);
        /* using arrayadapter
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.custom_view,R.id.textView1,countryName);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             String value=countryName[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
            }
        });*/
        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        listView.setAdapter(adapter);
    }

}
