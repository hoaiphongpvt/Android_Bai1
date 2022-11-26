package com.example.modern_art_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRelativeLayout;
    Button btnLinearLayout;
    Button btnTableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRelativeLayout = (Button) findViewById(R.id.btnRelativeLayout);
        btnLinearLayout = (Button) findViewById(R.id.btnLinearLayout);
        btnTableLayout = (Button) findViewById(R.id.btnTableLayout);

        btnRelativeLayout.setOnClickListener(view -> openRelativeLayout());
        btnLinearLayout.setOnClickListener(view -> openLinearLayout());
        btnTableLayout.setOnClickListener(view -> openTableLayout());

    }

    public void openRelativeLayout() {
        Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(intent);
    }

    public void openLinearLayout() {
        Intent intent = new Intent(MainActivity.this, LinearLayout.class);
        startActivity(intent);
    }

    public void openTableLayout() {
        Intent intent = new Intent(MainActivity.this, TableLayout.class);
        startActivity(intent);
    }
}