package com.example.midprojectlnt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perform_action(View v)
    {
        TextView tv= (TextView) findViewById(R.id.editNew);

        //alter text of textview widget
        tv.setText("This text view is clicked");
        Intent i = new Intent(getApplicationContext(), Regis.class);
        startActivity(i);

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }


}