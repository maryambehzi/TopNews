package com.maryambehzi.topnews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;
import com.maryambehzi.topnews.model.Source;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter  extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>  {

    List<Article> articles;
    List<Source> sources;
    private Context context;

    public NewsAdapter(List<Article> articles, Context context) {
        this.articles = articles;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, final int position) {
        holder.title.setText(articles.get(position).getTitle());
        holder.date.setText(articles.get(position).getPublishedAt());
        holder.source.setText(articles.get(position).getSource().getName());
        String photoUrl = articles.get(position).getUrlToImage();
        Picasso.get().load(photoUrl).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return articles.size();
    }


    public class NewsViewHolder extends RecyclerView.ViewHolder{
        TextView title, date, source;
        ImageView imageView;

        public NewsViewHolder(@NonNull final View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_news_title);
            date = itemView.findViewById(R.id.txt_news_date);
            source = itemView.findViewById(R.id.txt_news_source);
            imageView = itemView.findViewById(R.id.img_news_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();


                }
            });
        }
    }

}
