package com.example.demo9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NewsContentActivity extends AppCompatActivity {

    public static void actionStart(Context context,String newTitle,String newsContent){
        Intent intent = new Intent(context, NewsContentActivity.class);
        intent.putExtra("news_title",newTitle);
        intent.putExtra("news_content",newsContent);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_content);
        String newsTitle = getIntent().getStringExtra("news_title");
        String newsContent = getIntent().getStringExtra("news_content");
        NewsContentFragment newsContentFragment = (NewsContentFragment) getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);
        newsContentFragment.refresh(newsTitle,newsContent);
    }
}