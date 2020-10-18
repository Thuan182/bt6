package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class profile extends AppCompatActivity {
Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        anhxa();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(profile.this, "Thanks you ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(profile.this,listview.class);
                startActivity(intent);
            }
        });
    }

    private void anhxa() {
        button=(Button)findViewById(R.id.buttoman);
    }
}