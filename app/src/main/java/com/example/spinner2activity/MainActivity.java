package com.example.spinner2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  static  final String TAG="MainActivity";
    Spinner sp;
    int current_item=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=(Spinner) findViewById(R.id.spinner1);
       final EditText editText_show =(EditText) findViewById(R.id.editText_otherCollege);

       try {
           sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
               @Override
               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                   if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4 || position == 5) {
                       editText_show.setVisibility(View.GONE);

                   } else {

                       editText_show.setVisibility(View.VISIBLE);
                   }
               }

               @Override
               public void onNothingSelected(AdapterView<?> parent) {

               }
           });
       }catch(Exception e)
         {
             Log.e(TAG,"Some Exception has occured"+e.getMessage());
         }
    }
}
