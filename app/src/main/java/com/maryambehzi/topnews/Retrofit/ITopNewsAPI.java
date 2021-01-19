package com.maryambehzi.topnews.Retrofit;

import com.maryambehzi.topnews.model.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ITopNewsAPI {
    @GET
    Call<News> getNews(@Url String urlString, @Query("page") int page);
}
