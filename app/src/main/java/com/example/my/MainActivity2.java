package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText etuserr,etpass;
    private Button btdk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        anhxa();
        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchlayout = new Intent(getApplicationContext(), MainActivity3.class);
                if (etpass.getText().length() != 0 && etpass.getText().length() != 0) {
                    switchlayout.putExtra("user", etuserr.getText().toString());
                    switchlayout.putExtra("pass", etpass.getText().toString());
                    Log.e("n", etuserr.getText() + "." + etpass.getText());
                    startActivity(switchlayout);
                }
                else{
                    Toast.makeText(MainActivity2.this, "Mời bạn nhập đủ thông tin ", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void anhxa() {
        etuserr= (EditText)findViewById(R.id.etus);
        etpass= (EditText)findViewById(R.id.etmk);
        btdk=(Button)findViewById(R.id.btdk);
    }

}