package com.example.windows10.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Windows 10 on 3/31/2017.
 */

public class FriendsActivity extends AppCompatActivity{

    private View viewFriends;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        viewFriends = findViewById(R.id.btn_friends);
        viewFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            //public void onFriendsListener(View btn_Friends){}
        });

    }
}
