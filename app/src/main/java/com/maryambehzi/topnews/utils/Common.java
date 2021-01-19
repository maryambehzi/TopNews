package com.maryambehzi.topnews.utils;

import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;

public class Common {

    public static Article currentArticle = null;

    public static int totalPage = 20;

    public static String BASE_URL = "https://newsapi.org/v2/";
    public static String apiKey = String.valueOf(R.string.api_key);


    public static String all_news_url = String.format("top-headlines?country=us&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String business_news_url = String.format("top-headlines?country=us&category=business&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String entertainment_news_url = String.format("top-headlines?country=us&category=entertainment&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String general_news_url = String.format("top-headlines?country=us&category=general&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String health_news_url = String.format("top-headlines?country=us&category=health&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String science_news_url = String.format("top-headlines?country=us&category=science&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String sports_news_url = String.format("top-headlines?country=us&category=sports&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    public static String technology_news_url = String.format("top-headlines?country=us&category=technology&apiKey=f62d0ae5fda3402282ec47be382fb2cb");


}
