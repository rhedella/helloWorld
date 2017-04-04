package com.example.windows10.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.windows10.myapplication.Adapter.NewsAdapt;
import com.example.windows10.myapplication.Model.News;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Windows 10 on 4/3/2017.
 */

public class NewsFeedActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private NewsAdapt newsAdapt;
    private List<News> daftarBerita;
    private View viewNewsFeed;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);

        News news1 = new News("1","qwerty");
        News news2 = new News("2","qwerty");
        News news3 = new News("3","qwerty");
        News news4 = new News("4","qwerty");

        daftarBerita = new ArrayList<>();
        daftarBerita.add(news1);
        daftarBerita.add(news2);
        daftarBerita.add(news3);
        daftarBerita.add(news4);

        for (int i = 0; i < 10; i++) {
            daftarBerita.add(new News("Berita"+i,"Lorem Ipsum"));
        }
        //object = new class(data)
        newsAdapt = new NewsAdapt(daftarBerita);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(newsAdapt);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        /*
        viewNewsFeed = findViewById(R.id.btn_news_feed);
        viewNewsFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
    }
}
