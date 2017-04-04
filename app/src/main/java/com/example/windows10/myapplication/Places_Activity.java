package com.example.windows10.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Windows 10 on 4/3/2017.
 */

public class Places_Activity extends AppCompatActivity {

    private View viewPlaces;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        viewPlaces = findViewById(R.id.btn_places);
        viewPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
