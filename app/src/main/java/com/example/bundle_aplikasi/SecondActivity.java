package com.example.bundle_aplikasi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView chname, chpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        chname = findViewById(R.id.tBunNama);
        chpass = findViewById(R.id.tBunPass);

        Bundle hbundata = getIntent().getExtras();

        String hmail = hbundata.getString("email");
        String hpass = hbundata.getString("passwords");

        chname.setText(hmail);
        chpass.setText(hpass);
    }
}
