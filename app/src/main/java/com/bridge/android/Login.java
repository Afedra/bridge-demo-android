package com.bridge.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.bridge);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        Bitmap bitmap2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.deloitte);
        ImageView imageView2 = (ImageView) findViewById(R.id.logo2);
        imageView.setImageBitmap(bitmap);
        imageView2.setImageBitmap(bitmap2);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Home.class);
                startActivity(i);
            }
        });
    }
}
