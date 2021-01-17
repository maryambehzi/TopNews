package com.maryambehzi.topnews.Retrofit;

import com.maryambehzi.topnews.model.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IDrinkShopAPI {
    @GET
    Call<News> getNews(@Url String urlString);
}
