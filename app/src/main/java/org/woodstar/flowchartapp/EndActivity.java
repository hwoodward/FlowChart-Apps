package org.woodstar.flowchartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {
    public static final String END_MESSAGE_ID = "org.woodstar.flowchartapp.END_MSG_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        int messageId = getResources().getIdentifier(intent.getStringExtra(END_MESSAGE_ID), "string", getPackageName());
        String endMessage = getString(messageId);
        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(endMessage);
    }
}
