package com.e.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layouts);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            Toast.makeText(this, ""+bundle.getString("callFrom"), Toast.LENGTH_LONG).show();
        }
    }
}
