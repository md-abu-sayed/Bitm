package com.bitm.trainer.basiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView basicLV;
    /*ArrayList<String> nameList;*/
    ArrayList<Trainee>trainees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basicLV = (ListView) findViewById(R.id.basicLV);
        trainees=new ArrayList<>();
        trainees.add(new Trainee("Minhajul Islam","173074"));
        trainees.add(new Trainee("Asifa Akter","154509"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));
        trainees.add(new Trainee("Rabeya Begum","153993"));

        TraineeAdapter traineeAdapter=new TraineeAdapter(this,trainees);

        /*nameList = new ArrayList<>();
        nameList.add("Minhajul Islam");
        nameList.add("Asifa Akter");
        nameList.add("Rabeya Begum");
        nameList.add("Minhajul Islam");
        nameList.add("Asifa Akter");
        nameList.add("Rabeya Begum");
        nameList.add("Minhajul Islam");
        nameList.add("Asifa Akter");
        nameList.add("Rabeya Begum");
        nameList.add("Minhajul Islam");
        nameList.add("Asifa Akter");
        nameList.add("Rabeya Begum");
        nameList.add("Minhajul Islam");
        nameList.add("Asifa Akter");
        nameList.add("Rabeya Begum");
        nameList.add("Minhajul Islam");
        nameList.add("Asifa Akter");
        nameList.add("Rabeya Begum");*/
/*
        ArrayAdapter<String>nameAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nameList);
*/
/*
        ArrayAdapter<String>nameAdapter= new ArrayAdapter<>(this, R.layout.list_row,R.id.nameText, nameList);
*/
        basicLV.setAdapter(traineeAdapter);
        basicLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
