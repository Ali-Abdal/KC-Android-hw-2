package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cv> cvArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nametxt = findViewById(R.id.txtname);
        EditText jobtxt = findViewById(R.id.txtjob);
        EditText agetxt = findViewById(R.id.txtage);
        EditText phonetxt = findViewById(R.id.txtphone);
        EditText emailtxt = findViewById(R.id.txtemail);
        Button nextbtn = findViewById(R.id.btnnext);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(agetxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }
                else if(nametxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }
                else if(jobtxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }
                else if(phonetxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }
                else if(emailtxt.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "تأكد من ملئ الفراغات", Toast.LENGTH_SHORT).show();
                }
                else {

                    String nme = nametxt.getText().toString();
                    String jobe = jobtxt.getText().toString();
                    int agee = Integer.parseInt (agetxt.getText().toString());
                    int phonenum = Integer.parseInt(phonetxt.getText().toString());
                    String mail = emailtxt.getText().toString();

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    intent.putExtra("name", nme);
                    intent.putExtra("job", jobe);
                    intent.putExtra("age", agee);
                    intent.putExtra("age", agee);
                    intent.putExtra("phone", phonenum);
                    intent.putExtra("email", mail);

                    startActivity(intent);




            }}
        });
    }
}