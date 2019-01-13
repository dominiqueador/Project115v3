package com.ariz.ador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class NewActivity2a extends Activity {

    ImageButton c1, c2, c3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.new_activity3);

        // Locate the button in activity_main.xml
        c1 = (ImageButton) findViewById(R.id.icedco);
        c2 = (ImageButton) findViewById(R.id.milkco);
        c3 = (ImageButton) findViewById(R.id.nitro);


        // Capture button clicks
        c1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2a.this,
                        NewActivity3e.class);
                startActivity(myIntent);
            }
        });

        c2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2a.this,
                        NewActivity3f.class);
                startActivity(myIntent);
            }
        });
        c3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2a.this,
                        NewActivity3g.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_activity3, menu);
        return true;
    }
}
