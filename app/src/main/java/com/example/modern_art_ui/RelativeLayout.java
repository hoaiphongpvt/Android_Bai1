package com.example.modern_art_ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

public class RelativeLayout extends AppCompatActivity {

    TextView view1;
    TextView view2;
    TextView view3;
    TextView view4;
    TextView view5;
    SeekBar seekBar;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        view1 = (TextView) findViewById(R.id.view1);
        view2 = (TextView) findViewById(R.id.view2);
        view3 = (TextView) findViewById(R.id.view3);
        view4 = (TextView) findViewById(R.id.view4);
        view5 = (TextView) findViewById(R.id.view5);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        builder = new AlertDialog.Builder(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                int seeBarValue = seekBar.getProgress();
                view1.setBackgroundColor(Color.rgb(105 + seeBarValue,  108 + seeBarValue, 62 + seeBarValue));
                view2.setBackgroundColor(Color.rgb(246 + seeBarValue,  163 + seeBarValue, 196 + seeBarValue));
                view3.setBackgroundColor(Color.rgb(231 + seeBarValue,  10 + seeBarValue, 14 + seeBarValue));
                view4.setBackgroundColor(Color.rgb(236 + seeBarValue,  241 + seeBarValue, 241 + seeBarValue));
                view5.setBackgroundColor(Color.rgb(14 + seeBarValue,  91 + seeBarValue, 86 + seeBarValue));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info:
                //Setting message manually and performing action on button click
                builder.setMessage(R.string.grinfo)
                        .setCancelable(false)
                        .setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Group info");
                alert.show();
        }
        return super.onOptionsItemSelected(item);
    }
}