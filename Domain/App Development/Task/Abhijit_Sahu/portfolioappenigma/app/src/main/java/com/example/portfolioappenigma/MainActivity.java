package com.example.portfolioappenigma;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // match this with your XML file name
    }

    public void openGitHub(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/abhijit-sahu-276"));
        startActivity(intent);
    }

    public void openLinkedIn(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://linkedin.com/in/abhijitsahu276"));
        startActivity(intent);
    }

    public void sendEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:abhijitsahu276@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contact from Portfolio App");
        startActivity(Intent.createChooser(intent, "Send Email"));
    }


}