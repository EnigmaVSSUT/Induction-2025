package com.example.myportfolioapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;  // ✅ This is the key import

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Make sure your layout name is correct

        ImageButton githubBtn = findViewById(R.id.githubBtn);
        ImageButton linkedinBtn = findViewById(R.id.linkedinBtn);
        ImageButton emailBtn = findViewById(R.id.emailBtn);

        // GitHub
        githubBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/subham-652"));
            startActivity(intent);
        });

        // LinkedIn
        linkedinBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://www.linkedin.com/in/subham-kumar-giri-61371633b//in/yourprofile"));
            startActivity(intent);
        });

        // Email
        emailBtn.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:subhamkugiri21@gmail.com"));
            startActivity(Intent.createChooser(emailIntent, "Send email"));
        });
    }
}
