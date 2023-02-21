package com.example.reservar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotificationsActivity extends AppCompatActivity {
    private ListView notificationsListView;
    private String[] notificationsList = {"Notification 1", "Notification 2", "Notification 3", "Notification 4", "Notification 5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications_activity);

        notificationsListView = findViewById(R.id.notifications_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notificationsList);
        notificationsListView.setAdapter(adapter);
    }
}
