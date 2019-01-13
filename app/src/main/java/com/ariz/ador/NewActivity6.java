package com.ariz.ador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity6 extends Activity {

    TextView tvView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");
        String loc = intent.getStringExtra("loc");
        String time = intent.getStringExtra("time");
        String pay = intent.getStringExtra("pay");


        tvView.setText(
                "Name: " + fName +
                        "\nContact Number: " + lName +
                        "\nLocation: " + loc +
                        "\nTime of Pick Up: " + time +
                        "\nMode of Payment: " + pay
        );


            }
}
