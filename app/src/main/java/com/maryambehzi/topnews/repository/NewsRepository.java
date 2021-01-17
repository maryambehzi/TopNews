package com.maryambehzi.topnews.repository;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.Retrofit.IDrinkShopAPI;
import com.maryambehzi.topnews.Retrofit.RetrofitClient;
import com.maryambehzi.topnews.model.Article;
import com.maryambehzi.topnews.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsRepository {
    MutableLiveData<List<Article>> mutableLiveData;
    private Application application;


    public final static String BASE_URL = "https://newsapi.org/v2/";

    String apiKey = String.valueOf(R.string.api_key);
    //String news_url = String.format("v2/top-headlines?country=us&category=%s&apiKey=%s", catName, apiKey);
    String all_news_url = String.format("top-headlines?country=us&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String business_news_url = String.format("top-headlines?country=us&category=business&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String entertainment_news_url = String.format("top-headlines?country=us&category=entertainment&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String general_news_url = String.format("top-headlines?country=us&category=general&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String health_news_url = String.format("top-headlines?country=us&category=health&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String science_news_url = String.format("top-headlines?country=us&category=science&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String sports_news_url = String.format("top-headlines?country=us&category=sports&apiKey=f62d0ae5fda3402282ec47be382fb2cb");
    String technology_news_url = String.format("top-headlines?country=us&category=technology&apiKey=f62d0ae5fda3402282ec47be382fb2cb");

    public NewsRepository(Application application) {
        this.application = application;
    }


    public MutableLiveData<List<Article>> getMutableLiveData(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(all_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataBusiness(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(business_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataEntertainment(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(entertainment_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataGeneral(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(general_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataHealth(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(health_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataScience(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(science_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataSports(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(sports_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }

    public MutableLiveData<List<Article>> getMutableLiveDataTechnology(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(technology_news_url)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            List<Article> articleList = newsRes.getArticles();
                            mutableLiveData.setValue(articleList);
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                    }
                });
        return mutableLiveData;
    }


}
