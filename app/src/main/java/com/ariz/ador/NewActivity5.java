package com.ariz.ador;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class NewActivity5 extends Activity implements OnClickListener {

    EditText etFName;
    EditText etContact;
    EditText etTime;

    Button btnSubmit;

    RadioButton r1, r2, r3, r4,r5,r6;

    public static String loc = "";
    public static String pay = "";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert_details);

        etFName = (EditText) findViewById(R.id.etFName);
        etContact = (EditText) findViewById(R.id.etContact);
        etTime = (EditText) findViewById(R.id.etTime);

        r1 = (RadioButton) findViewById(R.id.dapitan);
        r2 = (RadioButton) findViewById(R.id.noval);
        r3 = (RadioButton) findViewById(R.id.espana);
        r4 = (RadioButton) findViewById(R.id.debit);
        r5 = (RadioButton) findViewById(R.id.credit);
        r6 = (RadioButton) findViewById(R.id.cash);


        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, NewActivity6.class);
        intent.putExtra("fname", etFName.getText().toString());
        intent.putExtra("lname", etContact.getText().toString());
        if (r1.isChecked()) {
            intent.putExtra("loc", r1.getText().toString());
        }
        if (r2.isChecked()) {
            intent.putExtra("loc", r2.getText().toString());
        }
        if (r3.isChecked()) {
            intent.putExtra("loc", r3.getText().toString());
        }
        intent.putExtra("time", etTime.getText().toString());
        if (r4.isChecked()) {
            intent.putExtra("pay", r4.getText().toString());
        }
        if (r5.isChecked()) {
            intent.putExtra("pay", r5.getText().toString());
        }
        if (r6.isChecked()) {
            intent.putExtra("pay", r6.getText().toString());
        }
        startActivity(intent);


    }
}
