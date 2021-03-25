package com.example.bundle_aplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText cuser, cpass;
    Button masuk;
    String gnama, gpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuser = findViewById(R.id.txName);
        cpass = findViewById(R.id.txPasswords);
        masuk = findViewById(R.id.buttonMasuk);

        String email ="masuk@mail.com";
        String passwords = "123";

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gnama = cuser.getText().toString();
                gpass = cpass.getText().toString();

                if (gnama.isEmpty() || gpass.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),"e-mail atau passwords anda belum diisi!",Toast.LENGTH_LONG);
                    t.show();
                } else {
                    if (gnama.equals(email) && gpass.equals(passwords)) {
                        Toast t = Toast.makeText(getApplicationContext(),"Login sukses",Toast.LENGTH_LONG);
                        t.show();

                        Bundle bundata = new Bundle();
                        bundata.putString("email",gnama.trim());
                        bundata.putString("passwords",gpass.trim());

                        Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                        i.putExtras(bundata);
                        startActivity(i);
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),"e-mail atau passwords anda salah!",Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });
    }
}