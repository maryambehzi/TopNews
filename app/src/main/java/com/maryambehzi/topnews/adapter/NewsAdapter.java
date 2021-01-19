package com.maryambehzi.topnews.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.maryambehzi.topnews.utils.Common;
import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;
import com.maryambehzi.topnews.view.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>  {

    List<Article> articles;
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
        Context mContext = holder.title.getContext();
        holder.title.setText(articles.get(position).getTitle());
        holder.date.setText(articles.get(position).getPublishedAt());
        holder.source.setText(articles.get(position).getSource().getName());
        String photoUrl = articles.get(position).getUrlToImage();
        try {
            Picasso.get().load(photoUrl).into(holder.imageView);
        }catch (Exception e){
            e.printStackTrace();
        }
        holder.setItemClickListener(new IItemClickListener() {
            @Override
            public void onClick(View v) {
                Common.currentArticle = articles.get(position);

                mContext.startActivity(new Intent(mContext, DetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return articles.size();
    }


    public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title, date, source;
        ImageView imageView;
        IItemClickListener itemClickListener;


        public void setItemClickListener(IItemClickListener itemClickListener){
            this.itemClickListener = itemClickListener;
        }

        public NewsViewHolder(@NonNull final View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txt_news_title);
            date = itemView.findViewById(R.id.txt_news_date);
            source = itemView.findViewById(R.id.txt_news_source);
            imageView = itemView.findViewById(R.id.img_news_image);

            itemView.setOnClickListener(this);
            
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view);

        }
    }

}
