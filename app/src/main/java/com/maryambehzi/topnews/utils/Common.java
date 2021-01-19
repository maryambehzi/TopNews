package com.maryambehzi.topnews.utils;

import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;

public class Common {

    public static Article currentArticle = null;

    public static int totalPage = 20;

    public static String BASE_URL = "https://newsapi.org/v2/";
    public static String apiKey = String.valueOf(R.string.api_key);


    public static String all_news_url = String.format("top-headlines?country=us&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String business_news_url = String.format("top-headlines?country=us&category=business&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String entertainment_news_url = String.format("top-headlines?country=us&category=entertainment&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String general_news_url = String.format("top-headlines?country=us&category=general&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String health_news_url = String.format("top-headlines?country=us&category=health&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String science_news_url = String.format("top-headlines?country=us&category=science&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String sports_news_url = String.format("top-headlines?country=us&category=sports&apiKey=c70447b7749e48bb8fff4fad6242ec67");
    public static String technology_news_url = String.format("top-headlines?country=us&category=technology&apiKey=c70447b7749e48bb8fff4fad6242ec67");


}
