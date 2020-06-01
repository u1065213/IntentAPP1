package com.example.intentapp;

import android.content.Intent;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =  findViewById(R.id.button);
        btn.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText height = findViewById(R.id.editText);
            EditText weight = findViewById(R.id.editText2);

            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SecondActivity.class);

            Bundle bundle = new Bundle();
            bundle.putString("HEIGHT", height.getText().toString());
            bundle.putString("WEIGHT", weight.getText().toString());

            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
}

