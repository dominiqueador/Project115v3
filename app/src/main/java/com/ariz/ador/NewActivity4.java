package com.ariz.ador;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class NewActivity4 extends Activity {

    TextView tView;
    Button checkout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.order_details);


        Intent myIntent = getIntent(); // this is just for example purpose
        String message = myIntent.getStringExtra("detail");
        tView = (TextView) findViewById(R.id.tView);
        tView.setText(message);

        checkout = (Button) findViewById(R.id.checkout);
        checkout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent next = new Intent(NewActivity4.this,
                        NewActivity5.class);
                startActivity(next);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.order_details, menu);
        return true;
    }
}
