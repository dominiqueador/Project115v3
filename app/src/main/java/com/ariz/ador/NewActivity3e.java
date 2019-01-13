package com.ariz.ador;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;


public class NewActivity3e extends Activity {

    ImageButton b1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.chosen_icedco);

        b1 = (ImageButton) findViewById(R.id.cart);

        // Capture button clicks
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent myIntent = new Intent(NewActivity3e.this, NewActivity4.class);
                myIntent.putExtra("detail", "1 x   Iced Coffee       PHP 150");
                startActivity(myIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.chosen_icedco, menu);
        return true;
    }
}
