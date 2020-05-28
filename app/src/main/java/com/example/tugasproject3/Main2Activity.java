package com.example.tugasproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Main2Activity extends AppCompatActivity {

    private TextView title, hasil;
    private Button hasill;
    private ImageView img_bangun;
    private TextInputLayout textInput1, textInput2, textInput3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        hasill = findViewById(R.id.btnHasil);
        textInput1 = findViewById(R.id.textField);
        textInput2 = findViewById(R.id.textField2);
        textInput3 = findViewById(R.id.textField3);
        title = findViewById(R.id.title);
        hasil = findViewById(R.id.hasil);
        img_bangun = findViewById(R.id.img_bangun);

        Intent i = getIntent();

        operation(i);
    }

    public void operation(Intent i){
        switch (i.getStringExtra("Bangun")) {
            case "k" :
                getSupportActionBar().setTitle("HITUNG LUAS BELAH KETUPAT");
                title.setText("BELAH KETUPAT");
                img_bangun.setImageResource(R.drawable.ketupat);
                textInput1.setHint("Diagonal 1");
                textInput2.setHint("Diagonal 2");

                hasill.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textInput1.getEditText().getText().toString().equals("") || textInput2.getEditText().getText().toString().equals("")) {
                            Toast.makeText(Main2Activity.this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                        }else{
                            int d1 = Integer.parseInt(textInput1.getEditText().getText().toString());
                            int d2 = Integer.parseInt(textInput2.getEditText().getText().toString());

                            float luas_ketupat = (1/2) * d1 * d2;

                            hasil.setText("LUASNYA ADALAH " + luas_ketupat);
                        }
                    }
                });

                break;
            case "s" :
                getSupportActionBar().setTitle("HITUNG LUAS SEGITIGA");
                title.setText("SEGITIGA");
                img_bangun.setImageResource(R.drawable.segitiga);

                textInput1.setHint("Alas");
                textInput2.setHint("Tinggi");

                hasill.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textInput1.getEditText().getText().toString().equals("") || textInput2.getEditText().getText().toString().equals("")) {
                            Toast.makeText(Main2Activity.this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                        }else{
                            int a = Integer.parseInt(textInput1.getEditText().getText().toString());
                            int t = Integer.parseInt(textInput2.getEditText().getText().toString());

                            float luas_segitiga = (1/2) * a * t;

                            hasil.setText("LUASNYA ADALAH " + luas_segitiga);
                        }
                    }
                });

                break;
            case "t":
                getSupportActionBar().setTitle("HITUNG LUAS TRAPESIUM");
                title.setText("TRAPESIUM");
                img_bangun.setImageResource(R.drawable.trapesium);

                textInput1.setHint("Nilai A");
                textInput2.setHint("Nilai B");
                textInput3.setHint("Tinggi");
                textInput3.setVisibility(View.VISIBLE);

                hasill.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textInput1.getEditText().getText().toString().equals("") || textInput2.getEditText().getText().toString().equals("") || textInput3.getEditText().getText().toString().equals("")) {
                            Toast.makeText(Main2Activity.this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                        }else{
                            int a = Integer.parseInt(textInput1.getEditText().getText().toString());
                            int b = Integer.parseInt(textInput2.getEditText().getText().toString());
                            int t = Integer.parseInt(textInput3.getEditText().getText().toString());

                            float luas_trapesium = ((a + b) * t) / 2;

                            hasil.setText("LUASNYA ADALAH " + luas_trapesium);
                        }
                    }
                });

                break;
            case "l":
                getSupportActionBar().setTitle("HITUNG LUAS LAYANG-LAYANG");
                title.setText("LAYANG-LAYANG");
                img_bangun.setImageResource(R.drawable.layang);

                textInput1.setHint("Diagonal 1");
                textInput2.setHint("Diagonal 2");

                hasill.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (textInput1.getEditText().getText().toString().equals("") || textInput2.getEditText().getText().toString().equals("")) {
                            Toast.makeText(Main2Activity.this, "Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                        }else{

                            int d1 = Integer.parseInt(textInput1.getEditText().getText().toString());
                            int d2 = Integer.parseInt(textInput2.getEditText().getText().toString());

                            float luas_layang = (1/2) * d1 * d2;

                            hasil.setText("LUASNYA ADALAH " + luas_layang);
                        }
                    }
                });

                break;
            default:
                Toast.makeText(this, "Default", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
