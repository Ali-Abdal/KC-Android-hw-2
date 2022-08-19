package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView namextx = findViewById(R.id.txtinname);
        TextView agextx = findViewById(R.id.txtinage);
        TextView emailxtx = findViewById(R.id.txtinemail);
        TextView phonextx = findViewById(R.id.txtinphone);
        TextView jobxtx = findViewById(R.id.txtinjob);

        Bundle cvbundle = getIntent().getExtras();

        String nme2 = cvbundle.getString("name");
        namextx.setText(nme2);

        int age2 = cvbundle.getInt("age");
        agextx.setText(String.valueOf(age2));

        String email2 = cvbundle.getString("email");
        emailxtx.setText(email2);

        int phone2 = cvbundle.getInt("phone");
        phonextx.setText(String.valueOf(phone2));

        String job2 = cvbundle.getString("job");
        jobxtx.setText(job2);










    }




}