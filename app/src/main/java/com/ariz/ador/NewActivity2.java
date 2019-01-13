package com.ariz.ador;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class NewActivity2 extends Activity {

    ImageButton f1, f2, f3, f4, f5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.new_activity2);

        // Locate the button in activity_main.xml
        f1 = (ImageButton) findViewById(R.id.matcha);
        f2 = (ImageButton) findViewById(R.id.caramel);
        f3 = (ImageButton) findViewById(R.id.van);
        f4 = (ImageButton) findViewById(R.id.straw);
        f5 = (ImageButton) findViewById(R.id.maple);

        // Capture button clicks
        f1.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2.this,
                        NewActivity3.class);
                startActivity(myIntent);
            }
        });

        f2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2.this,
                        NewActivity3a.class);
                startActivity(myIntent);
            }
        });
        f3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2.this,
                        NewActivity3b.class);
                startActivity(myIntent);
            }
        });
        f4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2.this,
                        NewActivity3c.class);
                startActivity(myIntent);
            }
        });
        f5.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(NewActivity2.this,
                        NewActivity3d.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.new_activity2, menu);
        return true;
    }
}
