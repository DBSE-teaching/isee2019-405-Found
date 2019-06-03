package com.example.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setTitle("Settings");
        Button Resetpin= (Button)findViewById(R.id.Resetpin);
        Resetpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent resetpinIntent=new Intent(getApplicationContext(), Resetpin_screen.class);
                startActivity(resetpinIntent);
            }
        });
        Button currency= (Button) findViewById(R.id.Currency);
        currency.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent currencyIntent=new Intent(getApplicationContext(), Currency.class);
                startActivity(currencyIntent);
            }
        });
        Button categories= (Button) findViewById(R.id.Categories);
        categories.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent categoriesIntent=new Intent(getApplicationContext(), Categories.class);
                startActivity(categoriesIntent);
            }
        });
        Button recurrence1= (Button) findViewById(R.id.Recurrence);
        recurrence1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent recurrenceIntent=new Intent(getApplicationContext(), Recurrency.class);
                startActivity(recurrenceIntent);
            }
        });
        Button email= (Button) findViewById(R.id.BttnEmail);
        email.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent emailIntent=new Intent(getApplicationContext(), EmailReport.class);
                startActivity(emailIntent);
            }
        });
    }
}
