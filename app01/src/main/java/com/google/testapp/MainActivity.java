 package com.google.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

 public class MainActivity extends AppCompatActivity {
     TextView textView;
     private int index =0;
     private int[] number;

     private  static final int Number_length =100;
     Button button;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView = findViewById(R.id.txtOne);
         button = findViewById(R.id.btn1);
         this.number = new int[Number_length];
    }
    public  void buttonOnclick(View v){
        if (v.getId() == R.id.btn1){
            increament();
            textView.setText(" "+number[index]);
            }
    }
    private void rest() {
        if (index == Number_length -1 ) {
            this.index = 0;
          }
        }
        private void increament() {
            rest();
            index++;
            number[index] = index;
        }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu_main,menu);
         return super.onCreateOptionsMenu(menu);
     }

     @Override
     public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         if (item.getItemId() == R.id.exit){
             System.exit(0);
         }
         if (item.getItemId() == R.id.zekr){
             Intent intent1 = new Intent(this, about_activity.class);
             startActivity(intent1);
         }

         return super.onOptionsItemSelected(item);
     }
 }