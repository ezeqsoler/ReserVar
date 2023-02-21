package com.example.reservar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParkingLot3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_lot_3);

        // Set the title of the activity
        setTitle(R.string.parking_lot_3_button_label);

        // Set the counters for available spaces and capacity
        int availableSpaces = 20;
        int capacity = 30;
        String counterText = getString(R.string.counter_text, availableSpaces, capacity);
        TextView counterTextView = findViewById(R.id.counter_text_view);
        counterTextView.setText(counterText);
    }
}
