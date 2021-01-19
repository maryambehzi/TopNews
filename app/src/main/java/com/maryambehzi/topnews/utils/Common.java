package com.maryambehzi.topnews.utils;

import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;

public class Common {

    public static Article currentArticle = null;

    public static int totalPage = 20;

    public static String BASE_URL = "https://newsapi.org/v2/";
    public static String apiKey = String.valueOf(R.string.api_key);


    public static String all_news_url = String.format("top-headlines?country=us&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String business_news_url = String.format("top-headlines?country=us&category=business&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String entertainment_news_url = String.format("top-headlines?country=us&category=entertainment&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String general_news_url = String.format("top-headlines?country=us&category=general&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String health_news_url = String.format("top-headlines?country=us&category=health&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String science_news_url = String.format("top-headlines?country=us&category=science&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String sports_news_url = String.format("top-headlines?country=us&category=sports&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");
    public static String technology_news_url = String.format("top-headlines?country=us&category=technology&apiKey=3a91cebd2d2f4741a2aeafdd758d54ee");


}
