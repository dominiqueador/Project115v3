package com.ariz.ador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class NewActivity2b extends Activity {

    ImageButton h1, h2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.new_activity4);

        // Locate the button in activity_main.xml
        h1 = (ImageButton) findViewById(R.id.misto);
        h2 = (ImageButton) findViewById(R.id.blonde);


        // Capture button clicks
        h1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2b.this,
                        NewActivity3h.class);
                startActivity(myIntent);
            }
        });

        h2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2b.this,
                        NewActivity3i.class);
                startActivity(myIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_activity4, menu);
        return true;
    }
}
