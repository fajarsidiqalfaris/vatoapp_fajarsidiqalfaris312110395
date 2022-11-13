package com.example.vato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TintableCheckedTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView designer;
    ImageView pengembang;
    ImageView dokter;
    ImageView barbel;
    ImageView dvlpr;
    ImageView manager;
    ImageView guru;
    ImageView op;
    ImageView marketing;
    ImageView supir;
    ImageView magang;
    ImageView lainnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        op = findViewById(R.id.op);
        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,operator_produksi.class));
            }
        });
    }
}