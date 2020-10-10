package com.pepivsky.exampleqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import net.glxn.qrgen.javase.QRCode;

public class MainActivity extends AppCompatActivity {
    ImageView ivQRCode;

    public static final String MYURL = "https://github.com/pepivsky";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivQRCode = findViewById(R.id.ivQRCode);
        //Bitmap bitmap = new Bitmap();
    }
    /*private void generateQRCode(){
        try {
            Bitmap bitmap = QRCode.from(MYURL)
                    .withCharset("UTF-8")
                    .withSize(1500, 1500)




        }catch (Exception e) {

        }
    }*/
}