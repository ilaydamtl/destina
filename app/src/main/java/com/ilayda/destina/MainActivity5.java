package com.ilayda.destina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button astrolojiHakkinda;
    Button burclarinĂ–zellikleri;
    Button burclarHakkinda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        burclarHakkinda=findViewById(R.id.button9);
        burclarHakkinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this,MainActivity8.class));
            }
        });

        burclarinĂ–zellikleri=findViewById(R.id.button8);
        burclarinĂ–zellikleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this,MainActivity7.class));
            }
        });

        astrolojiHakkinda=findViewById(R.id.button6);
        astrolojiHakkinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity5.this,MainActivity6.class));
            }
        });
    }
}