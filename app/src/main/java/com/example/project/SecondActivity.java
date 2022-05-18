package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private SharedPreferences secondPrefRef;
    private SharedPreferences.Editor secondPrefRefEditor;
    private EditText enterData;
    private Button saveButton;
    private TextView displayInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondPrefRef = getSharedPreferences("jarjar", MODE_PRIVATE);
        secondPrefRefEditor = secondPrefRef.edit();


        enterData =findViewById(R.id.secondEditText);
        saveButton= findViewById(R.id.storeButton);
        displayInput=findViewById(R.id.secondTextView);
        displayInput.setText(secondPrefRef.getString("abc", "No preference found."));

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayInput.setText(enterData.getText());
                secondPrefRefEditor.putString("abc", displayInput.getText().toString());
                secondPrefRefEditor.apply();




            }
        });
    }
}