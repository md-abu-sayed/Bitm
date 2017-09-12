package com.example.toshiba.text_radio_chackbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText fullName,age;
    private RadioGroup radioGroupCheck;
    private RadioButton gender;
    private CheckBox stu,tec;
    private Button submit;
    private TextView resultTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fullName= (EditText) findViewById(R.id.fname);
        age= (EditText) findViewById(R.id.age);

        radioGroupCheck= (RadioGroup) findViewById(R.id.radioGroup);
       // personMale= (RadioButton) findViewById(R.id.male);
       // personFemale= (RadioButton) findViewById(R.id.female);

        stu= (CheckBox) findViewById(R.id.studet);
        tec= (CheckBox) findViewById(R.id.teacher);

        submit= (Button) findViewById(R.id.result);

        resultTest= (TextView) findViewById(R.id.resultShow);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String res=fullName.getText().toString();
                String res1=age.getText().toString();
             //  resultTest.setText("Name : "+res+" Age : "+res1);


                StringBuilder stringBuilder=new StringBuilder();
                if(stu.isChecked()){
                    String value=stu.getText().toString();
                    stringBuilder.append("I am "+value);
                }
                if(tec.isChecked()){
                    String value1=tec.getText().toString();
                    stringBuilder.append("I am "+value1);
                }

                int radio=radioGroupCheck.getCheckedRadioButtonId();
                gender= (RadioButton) findViewById(radio);
                String person=gender.getText().toString();

               // resultTest.setText("Gender : "+person);
                resultTest.setText("Name : "+res+" Age : "+res1+" Gender : "+person+" "+stringBuilder);


            }
        });

    }

}
