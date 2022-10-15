package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.inicio){
            startActivity(new Intent(LocationActivity.this, HomeActivity.class));
        } else if (id == R.id.mapas){
            startActivity(new Intent(LocationActivity.this, LocationActivity.class));
        }else if (id == R.id.lugares){
            startActivity(new Intent(LocationActivity.this, LugaresActivity.class));
        }else if (id == R.id.info){
            startActivity(new Intent(LocationActivity.this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}