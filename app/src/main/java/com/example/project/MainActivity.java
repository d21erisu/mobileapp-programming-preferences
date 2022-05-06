package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences prefRef;
    private SharedPreferences.Editor prefRefEditor;
    private TextView showText;
    private Button openButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        //  startActivity(intent);

        prefRef = getPreferences(MODE_PRIVATE);
        prefRefEditor = prefRef.edit();

        showText= findViewById(R.id.mainTextView);
        showText.setText(prefRef.getString("MyAppPreferenceString", "No preference found."));

        openButton=findViewById(R.id.mainButton);
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


    }

}
