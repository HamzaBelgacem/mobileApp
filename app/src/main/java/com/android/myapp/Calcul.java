package com.android.myapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calcul extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.titolo));
        actionBar.setIcon(R.drawable.calculate_24);
        actionBar.setDisplayShowHomeEnabled(true);

        EditText nb1 = (EditText) findViewById(R.id.n1);
        EditText nb2 = (EditText) findViewById(R.id.n2);
        Button bt = (Button) findViewById(R.id.b1);
        TextView result = (TextView) findViewById(R.id.result);

        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if((nb1.getText().toString().trim().length() > 0)||(nb2.getText().toString().trim().length() > 0)) {
                    double x = Double.parseDouble(nb1.getText().toString());
                    double y = Double.parseDouble(nb2.getText().toString());


                    double somme = 0;
                    somme = (x + y) / 2;

                    result.setText(String.valueOf("Answer : " + somme));
                }
                else   result.setText(String.valueOf("Answer : !!!"));


            }});
}}