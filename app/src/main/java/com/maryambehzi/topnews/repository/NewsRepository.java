package com.maryambehzi.topnews.repository;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.maryambehzi.topnews.Retrofit.ITopNewsAPI;
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


    public MutableLiveData<List<Article>> getMutableLiveData(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.all_news_url, page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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

    public MutableLiveData<List<Article>> getMutableLiveDataBusiness(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.business_news_url, page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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

    public MutableLiveData<List<Article>> getMutableLiveDataEntertainment(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.entertainment_news_url, page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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

    public MutableLiveData<List<Article>> getMutableLiveDataGeneral(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.general_news_url, page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();

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

    public MutableLiveData<List<Article>> getMutableLiveDataHealth(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.health_news_url,page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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

    public MutableLiveData<List<Article>> getMutableLiveDataScience(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.science_news_url,page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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

    public MutableLiveData<List<Article>> getMutableLiveDataSports(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.sports_news_url, page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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

    public MutableLiveData<List<Article>> getMutableLiveDataTechnology(int page){
        if (mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }
        ITopNewsAPI serviceApi = RetrofitClient.getClient(Common.BASE_URL).create(ITopNewsAPI.class);
        serviceApi.getNews(Common.technology_news_url, page)
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        if (response.isSuccessful()){
                            News newsRes = response.body();
                            Common.totalPage = newsRes.getTotalResults();
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
