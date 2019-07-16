package com.spacetech.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_about = findViewById(R.id.button_about);
        Button button_profile = findViewById(R.id.button_profile);


            button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityB();

            }
        });
            button_profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivityC();
                }
            });

    }


    public void openActivityB() {
        Intent intent = new Intent(this, ActivityB.class);
                startActivity (intent);
    }

    public void openActivityC() {
        Intent intent = new Intent(this, ActivityC.class);
            startActivity (intent);
    }
}
