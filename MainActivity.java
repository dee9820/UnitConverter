package com.example.ucunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

    }
        public void calculate(View view){
            String s = editText.getText().toString();
            long kg=Integer.parseInt(s);
            double gram= 1000*kg;
            textView.setText("value in Grams ="+gram);
    }
}
