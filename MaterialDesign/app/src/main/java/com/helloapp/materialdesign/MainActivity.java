package com.helloapp.materialdesign;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_search:
                Toast.makeText(MainActivity.this, "Search Selected", Toast.LENGTH_SHORT).show();
            break;

            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "Settings Selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_share:
                Toast.makeText(MainActivity.this, "Share Selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_help:
                Toast.makeText(MainActivity.this, "Help Selected", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
