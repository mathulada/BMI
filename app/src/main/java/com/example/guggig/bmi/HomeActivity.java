package com.example.guggig.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button start = findViewById(R.id.start_but);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast welcome = Toast.makeText(HomeActivity.this,"Welcome",Toast.LENGTH_SHORT);
                welcome.show();
                Intent intent = new Intent(HomeActivity.this,calculate.class);
                startActivity(intent);
            }
        });
        Button exit = findViewById(R.id.exit_but);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
