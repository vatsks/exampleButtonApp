package com.example.examplebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view){

        EditText editTextName=findViewById(R.id.editTextName);
        EditText editTextPwd=findViewById(R.id.editTextPwd);
        Log.i("Name",editTextName.getText().toString());
        Log.i("Password",editTextPwd.getText().toString());


        Log.i("Info","success!!");
        Toast.makeText(this,"HELLO "+ editTextName.getText().toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}