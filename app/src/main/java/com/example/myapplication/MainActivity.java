package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.inicio){
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
        } else if (id == R.id.mapas){
            startActivity(new Intent(MainActivity.this, LocationActivity.class));
        }else if (id == R.id.lugares){
            startActivity(new Intent(MainActivity.this, LugaresActivity.class));
        }else if (id == R.id.info){
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        }else if (id == R.id.fb){
            String url = "http://www.facebook.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }else if (id == R.id.inst){
            String url = "http://www.instagram.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}