package com.example.espresso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Активити для установки текста по клику на кнопку
 *
 * @author Moiseeva Anastasia on 06.10.2020
 */
public class MainActivity extends AppCompatActivity {

    private EditText mEnterEditText;
    private Button mSetTextButton;
    private TextView mEnteredTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnterEditText = findViewById(R.id.enter_edit_text);
        mSetTextButton = findViewById(R.id.set_text_button);
        mEnteredTextView = findViewById(R.id.entered_text_view);

        mSetTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mEnterEditText.getText().toString();
                if (!text.isEmpty()) {
                    mEnteredTextView.setText(text);
                }
            }
        });
    }
}