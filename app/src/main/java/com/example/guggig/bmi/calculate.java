package com.example.guggig.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        final Button calculate = findViewById(R.id.Calculate_but);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText height = findViewById(R.id.height_text);
                EditText weight = findViewById(R.id.weigth_text);
                int H = Integer.parseInt(height.getText().toString());
                int W = Integer.parseInt(weight.getText().toString());
                float calHeight = H/100f;
                float BMI = W/(calHeight*calHeight);
                String em = "";
                if (BMI < 18.5){
                    em = "ผอมมากจ้า ลมพัดจะปลิวอยู่แล้ว...";
                }
                else if (BMI < 25){
                    em = "หุ่นดี อย่าเสร่อบ่นว่าอ้วนแล้ว";
                }
                else if (BMI < 30){
                    em = "อ้วน อ้วนเหมียนหนูรัตน์";
                }
                else {
                    em = "อีดอก เกียมซื้อรถเข็น..";
                }
                Toast print = Toast.makeText(calculate.this,em,Toast.LENGTH_LONG);
                print.show();
                AlertDialog.Builder Dialog = new AlertDialog.Builder(calculate.this);
                Dialog.setTitle("ผลการคำนวณจร้าาา");
                Dialog.setMessage(em);

                Dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                Dialog.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                Dialog.show();
            }
        });
    }
}
