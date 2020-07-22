package com.example.project7_h_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
            MenuInflater mInflater = getMenuInflater();
            mInflater.inflate(R.menu.menu,menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem ImageView) {
        switch (ImageView.getItemId()) {
            case R.id.op1: img.setImageResource(R.drawable.dog);
            break;

            case R.id.op2: img.setImageResource(R.drawable.cat);
            break;

            case R.id.op3: img.setImageResource(R.drawable.rabbit);
            break;
        }

        return super.onOptionsItemSelected(ImageView);
    }
}
