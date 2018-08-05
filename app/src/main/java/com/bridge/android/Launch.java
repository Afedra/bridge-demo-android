package com.bridge.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch);

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.bridge);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        Bitmap bitmap2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.deloitte);
        ImageView imageView2 = (ImageView) findViewById(R.id.logo2);
        imageView.setImageBitmap(bitmap);
        imageView2.setImageBitmap(bitmap2);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent i = new Intent(Launch.this, Login.class);
                    startActivity(i);

                }
            }
        };
        thread.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
