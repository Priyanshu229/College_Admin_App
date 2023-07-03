package com.example.adminbitsindri;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.adminbitsindri.faculty.UpdateFaculty;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    CardView addNotice;
    CardView addGalleryImage, addEBook, addFaculty;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        addNotice= findViewById(R.id.addNotice);
        addGalleryImage = findViewById(R.id.addGalleryImage);
        addEBook = findViewById(R.id.addEBook);
        addFaculty = findViewById(R.id.addFaculty);



        addNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, uploadNotice.class);
                startActivity(intent);
            }
        });

        addGalleryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UploadImage.class);
                startActivity(intent);
            }
        });

        addEBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UploadPdfActivity.class);
                startActivity(intent);

            }
        });
        addFaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UpdateFaculty.class);
                startActivity(intent);

            }
        });




    }

}

