package com.example.espresso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enterText;
    Button setText;
    TextView settedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterText = findViewById(R.id.editText_enter_text);
        setText = findViewById(R.id.button_set_text);
        settedText = findViewById(R.id.textView_entered_text);

        setText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String text = enterText.getText().toString();
                if (!text.isEmpty()){
                    settedText.setText(text);
                }
            }
        });
    }
}