package com.example.reservar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MessagesActivity extends AppCompatActivity {

    private EditText licensePlateEditText;
    private EditText messageEditText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_activity);

        // Find the views by their IDs
        licensePlateEditText = findViewById(R.id.license_plate_edit_text);
        messageEditText = findViewById(R.id.message_edit_text);
        sendButton = findViewById(R.id.send_button);

        // Set a click listener for the Send button
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the license plate and message values from the EditText views
                String licensePlate = licensePlateEditText.getText().toString();
                String message = messageEditText.getText().toString();

                // Send the message to the person with the given license plate
                sendMessage(licensePlate, message);
            }
        });
    }

    private void sendMessage(String licensePlate, String message) {
        // TODO: Implement sending the message to the person with the given license plate
        Toast.makeText(this, "Message sent to " + licensePlate, Toast.LENGTH_SHORT).show();
    }
}
