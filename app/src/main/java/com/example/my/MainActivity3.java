package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
private EditText etuserr,etpass;
private Button btlognin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        anhxa();
        Intent i= getIntent();
        String user= i.getStringExtra("user");
        String pass =i.getStringExtra("pass");
        etuserr.setText(user);
        etpass.setText(pass);
        btlognin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etuserr.getText().length()!=0 &&etpass.getText().length()!=0){
                    if(etuserr.getText().toString().equals(etuserr)&& etpass.getText().toString().equals(etpass)) {
                        Toast.makeText(MainActivity3.this, "Bạn đã đăng nhập thành công ", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity3.this,profile.class);
                        startActivity(intent);
                    }else if(etuserr.getText().toString().equals("Thuan")&& etpass.getText().toString().equals("789")) {
                        Toast.makeText(MainActivity3.this, "Bạn đã đăng nhập thành công ", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity3.this,profile.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity3.this, "Bạn đã đăng nhập thất bại ", Toast.LENGTH_SHORT).show();}}
                else {
                    Toast.makeText(MainActivity3.this, "Mời bạn nhập đủ thông tin ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void anhxa() {
        etuserr= (EditText)findViewById(R.id.etuser);
        etpass=(EditText)findViewById(R.id.etpw);
        btlognin=(Button)findViewById(R.id.btlognin);
    }
}