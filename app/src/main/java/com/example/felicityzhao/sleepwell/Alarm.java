package com.example.felicityzhao.sleepwell;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Alarm extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm);

        TextView title = (TextView) findViewById(R.id.get_alarm);
        title.setText("Alarm");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        Intent intent1 = new Intent(Alarm.this, Home.class);
                        startActivity(intent1);
                        return true;
                    case R.id.navigation_music:
                        Intent intent2 = new Intent(Alarm.this, Music.class);
                        startActivity(intent2);
                        return true;
                    case R.id.navigation_alarm:

                        return true;
                    case R.id.navigation_analysis:
                        Intent intent4 = new Intent(Alarm.this, Analysis.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        });

    }
}
