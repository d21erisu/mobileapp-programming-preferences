package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences prefRef;
    private SharedPreferences.Editor prefRefEditor;
    private TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        prefRef = getPreferences(MODE_PRIVATE);
        prefRefEditor = prefRef.edit();


        showText= findViewById(R.id.mainTextView);
        showText.setText(prefRef.getString("MyAppPreferenceString", "No preference found."));
    }

}
