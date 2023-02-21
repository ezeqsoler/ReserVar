package com.example.reservar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button ButtonLot1;
    private Button ButtonLot2;
    private Button ButtonLot3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set toolbar as action bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ButtonLot1 = findViewById(R.id.button_lot1);
        ButtonLot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ParkingLot1Activity.class);
                startActivity(intent);
            }
        });

        ButtonLot2 = findViewById(R.id.button_lot2);
        ButtonLot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ParkingLot2Activity.class);
                startActivity(intent);
            }
        });

        ButtonLot3 = findViewById(R.id.button_lot3);
        ButtonLot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ParkingLot3Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_messages:
                Intent intentMessages = new Intent(this, MessagesActivity.class);
                startActivity(intentMessages);
                return true;
            case R.id.action_home:
                return true;
            case R.id.action_notifications:
                Intent intentNotifications = new Intent(this, NotificationsActivity.class);
                startActivity(intentNotifications);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
