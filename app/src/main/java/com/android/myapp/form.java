package com.android.myapp;

import static com.android.myapp.R.menu.menu_24;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class form extends AppCompatActivity {

    ListView L1;
    EditText T1;
    Button B1,B2,B4;

    ArrayList<String> Etudiant = new ArrayList<String>();
    ArrayAdapter  myAdapter;
    Integer x;
    String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.titolo));
        actionBar.setIcon(R.drawable.calculate_24);
        actionBar.setDisplayShowHomeEnabled(true);

        L1 = (ListView) findViewById(R.id.list);
        B1 = (Button) findViewById(R.id.b1);
        B2 = (Button) findViewById(R.id.b2);
        B4 = findViewById(R.id.b4);
        T1 = (EditText) findViewById(R.id.t1);

        Etudiant.add("Ahmed");
        Etudiant.add("Yessin");

        myAdapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, Etudiant);
        L1.setAdapter(myAdapter);
        //Add
        B1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                if(!(T1.getText().toString().trim().matches(""))){
                    Etudiant.add(T1.getText().toString());
                    myAdapter.notifyDataSetChanged();
                    T1.setText("");
                }
            }});
        L1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                item = adapterView.getItemAtPosition(i).toString()+" selectionner";
                x = i;
                Toast.makeText(form.this, item, Toast.LENGTH_SHORT).show();
            }
        });

        //Update

        B2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                String Val = T1.getText().toString();
                Etudiant.set(x , Val);
                myAdapter.notifyDataSetChanged();
            }});

        //Delete
        B4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                for (int i = 0; i < Etudiant.size(); i++) {
                    String Val2 = T1.getText().toString();
                    if (Etudiant.get(i).equals(Val2)) {
                        Etudiant.remove(i);
                        myAdapter.notifyDataSetChanged();
                        break;
                    }
                    else{
                        Toast.makeText(form.this, "no items found", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            });
        L1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                item = adapterView.getItemAtPosition(i).toString()+"supprimer";
                Toast.makeText(form.this, item, Toast.LENGTH_SHORT).show();
                Etudiant.remove(i);
                myAdapter.notifyDataSetChanged();
                return true;
            }

        });

    }
}