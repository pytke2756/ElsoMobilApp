package com.example.elsomobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnBevitel;
    private EditText etNev;
    private TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btnBevitel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nev = etNev.getText().toString();
                String koszones = "Hello " + nev;
                txtHello.setText(koszones);
            }
        });
    }

    private void init(){
        btnBevitel = findViewById(R.id.btn_bevitel);
        etNev = findViewById(R.id.et_nev);
        txtHello = findViewById(R.id.txt_hello);
    }
}