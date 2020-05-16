package com.example.app4_learnnplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBooks = (Button) findViewById(R.id.btnBooks);

        btnBooks.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // create an intent to start another activity called
                // DemoActivities2 (which we would create later)
                Intent i = new Intent(MainActivity.this, BookActivity.class);
                
                // start new activity
                startActivity(i);
            }
        });


    }

}
