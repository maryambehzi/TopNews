package com.maryambehzi.topnews;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView title , source, date;
    ImageView image;
    IItemClickListener itemClickListener;

    public void setItemClickListener(IItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }


    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.txt_news_title);
        source = itemView.findViewById(R.id.txt_news_source);
        date = itemView.findViewById(R.id.txt_news_date);
        image = itemView.findViewById(R.id.img_news_image);

        itemView.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view);
    }
}
