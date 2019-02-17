package com.example.felicityzhao.sleepwell;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent1 = new Intent(MainActivity.this, Home.class);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_music:
                    Intent intent2 = new Intent(MainActivity.this, Music.class);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_alarm:
                    Intent intent3 = new Intent(MainActivity.this, Alarm.class);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_analysis:
                    Intent intent4 = new Intent(MainActivity.this, Analysis.class);
                    startActivity(intent4);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

}
