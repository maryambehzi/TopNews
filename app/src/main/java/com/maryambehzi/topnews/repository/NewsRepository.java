package com.maryambehzi.topnews.repository;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.Retrofit.IDrinkShopAPI;
import com.maryambehzi.topnews.Retrofit.RetrofitClient;
import com.maryambehzi.topnews.model.Article;
import com.maryambehzi.topnews.model.News;
import com.maryambehzi.topnews.utils.Common;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsRepository {
    MutableLiveData<List<Article>> mutableLiveData;
    private Application application;



  
    public NewsRepository(Application application) {
        this.application = application;
    }


    public MutableLiveData<List<Article>> getMutableLiveData(){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.all_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.business_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.entertainment_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.general_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.health_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.science_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.sports_news_url)
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
        IDrinkShopAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(IDrinkShopAPI.class);
        serviceApi.getNews(Common.technology_news_url)
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
