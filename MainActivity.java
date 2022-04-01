package com.example.android_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    String message = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DontTouch(View view) {
        message();
    }

    private void message() {
        TextView messageTextView = (TextView) findViewById(R.id.buttonMessage);

        if (counter == 0) {
            messageTextView.setText("Hey, can't you read?!");
        } else if (counter == 1) {
            messageTextView.setText("Don't push that!");
        } else if (counter == 2) {
            messageTextView.setText("What did I just say?!");
        } else if (counter == 3) {
            messageTextView.setText("I'm not kidding! Don't touch that!");
        } else if (counter == 4) {
            messageTextView.setText("Are you doing this to spite me?");
        } else if (counter == 5) {
            messageTextView.setText("You probably get invited to a lot of parties don't you?");
        } else {
            messageTextView.setText("If you keep pressing that, I'm gonna run out of things to say.");
        }
        counter = counter + 1;
    }
}