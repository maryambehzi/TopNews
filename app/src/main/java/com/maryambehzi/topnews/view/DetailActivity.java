package com.maryambehzi.topnews.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.maryambehzi.topnews.utils.Common;
import com.maryambehzi.topnews.R;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView title, source, date, description;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = findViewById(R.id.txt_article_title);
        source = findViewById(R.id.txt_news_source);
        date = findViewById(R.id.txt_article_date);
        description = findViewById(R.id.txt_article_description);
        image = findViewById(R.id.img_article_image);

        title.setText(Common.currentArticle.getTitle());
        date.setText(Common.currentArticle.getPublishedAt());
        description.setText(Common.currentArticle.getDescription());
        Picasso.get().load(Common.currentArticle.getUrlToImage()).into(image);





    }
}