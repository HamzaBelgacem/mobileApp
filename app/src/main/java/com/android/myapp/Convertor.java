package com.android.myapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Convertor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.titolo2));
        actionBar.setIcon(R.drawable.ic_baseline_attach_money_24);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));
        actionBar.setDisplayShowHomeEnabled(true);

        EditText nb1 = (EditText) findViewById(R.id.n1);
        Button bt1 = (Button) findViewById(R.id.b1);
        Button bt2 = (Button) findViewById(R.id.b2);
        Button bt3 = (Button) findViewById(R.id.b3);
        TextView result = (TextView) findViewById(R.id.C2);

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(!(nb1.getText().toString().trim().matches(""))){
                    double x = Double.parseDouble(nb1.getText().toString());
                    double somme = 0;
                    somme = (x * 2.40);

                    result.setText(String.valueOf("Answer : " + somme + " CAD"));
                }
                else   result.setText(String.valueOf(" !!!"));
            }});

        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(!(nb1.getText().toString().trim().matches(""))) {
                    double x = Double.parseDouble(nb1.getText().toString());
                    double somme = 0;
                    somme = (x * 3.24);

                    result.setText(String.valueOf("Answer : " + somme + " USD"));
                }
                else   result.setText(String.valueOf(" !!!"));
            }});
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(!(nb1.getText().toString().trim().matches(""))) {
                    double x = Double.parseDouble(nb1.getText().toString());
                    double somme = 0;
                    somme = (x * 3.21);

                result.setText(String.valueOf("Answer : " + somme + " EUR"));
               }
                  else   result.setText(String.valueOf(" !!!"));
            }});
    }
}