package com.example.tugasproject3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Toolbar toolbar;
    private Button ketupatt, segitigaa, trapesiumm, layangg;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        ketupatt = findViewById(R.id.btnKetupat);
        segitigaa = findViewById(R.id.btnSegitiga);
        trapesiumm = findViewById(R.id.btnTrapesium);
        layangg = findViewById(R.id.btnLayang);
        image = findViewById(R.id.imageView);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        ketupatt.setOnClickListener(click);
        segitigaa.setOnClickListener(click);
        trapesiumm.setOnClickListener(click);
        layangg.setOnClickListener(click);
    }

    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnKetupat :
                    image.setImageResource(R.drawable.ketupat);

                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    i.putExtra("Bangun", "k");
                    startActivity(i);

                    break;
                case R.id.btnSegitiga :
                    image.setImageResource(R.drawable.segitiga);

                    i = new Intent(MainActivity.this, Main2Activity.class);
                    i.putExtra("Bangun", "s");
                    startActivity(i);

                    break;
                case R.id.btnTrapesium :
                    image.setImageResource(R.drawable.trapesium);

                    i = new Intent(MainActivity.this, Main2Activity.class);
                    i.putExtra("Bangun", "t");
                    startActivity(i);

                    break;
                case R.id.btnLayang :
                    image.setImageResource(R.drawable.layang);

                    i = new Intent(MainActivity.this, Main2Activity.class);
                    i.putExtra("Bangun", "l");
                    startActivity(i);

                    break;
                default:
                    image.setImageResource(R.drawable.segitiga);
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.account) {
            startActivity(new Intent(MainActivity.this, Main3Activity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
