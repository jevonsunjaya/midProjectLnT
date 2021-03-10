package com.example.midprojectlnt;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Regis extends AppCompatActivity {
    EditText editUsername, editPass, editConfirmPass, editEmail;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        editUsername = findViewById(R.id.editUsername);
        editEmail = findViewById(R.id.editPass);
        editPass = findViewById(R.id.editPass);
        editConfirmPass= findViewById(R.id.editConfirmPass);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {

                                         }
                                     });

        Intent i = new Intent(getApplicationContext(), Regis.class);
        startActivity(i);


    }
}