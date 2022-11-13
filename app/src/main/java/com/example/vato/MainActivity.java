package com.example.vato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity{

    EditText username, password;
    Button tombol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        tombol = findViewById(R.id.loginbutton);


        MaterialButton loginbutton = (MaterialButton) findViewById(R.id.loginbutton);


        //admin and admin

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("fajarsidiqalfaris") && password.getText().toString().equals("12345678")) {
                    //password benar
                    Toast.makeText(MainActivity.this, "BERHASIL MASUK", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                } else
                    //password salah
                    Toast.makeText(MainActivity.this, "Username atau Password salah !!!", Toast.LENGTH_SHORT).show();


            }
        });
    }

}