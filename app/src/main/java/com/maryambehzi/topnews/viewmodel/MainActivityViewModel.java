package com.maryambehzi.topnews.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.maryambehzi.topnews.model.Article;
import com.maryambehzi.topnews.repository.NewsRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    NewsRepository newsRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        newsRepository = new NewsRepository(application);
    }

    public LiveData<List<Article>> getAllArticle(int page){
        return newsRepository.getMutableLiveData(page);
    }
    public LiveData<List<Article>> getBusinessArticle(int page){
        return newsRepository.getMutableLiveDataBusiness(page);
    }
    public LiveData<List<Article>> getEntertainmentArticle(int page){
        return newsRepository.getMutableLiveDataEntertainment(page);
    }
    public LiveData<List<Article>> getGeneralArticle(int page){
        return newsRepository.getMutableLiveDataGeneral(page);
    }
    public LiveData<List<Article>> getHealthArticle(int page){
        return newsRepository.getMutableLiveDataHealth(page);
    }
    public LiveData<List<Article>> getScienceArticle(int page){
        return newsRepository.getMutableLiveDataScience(page);
    }
    public LiveData<List<Article>> getSportsArticle(int page){
        return newsRepository.getMutableLiveDataSports(page);
    }
    public LiveData<List<Article>> getTechnologyArticle(int page){
        return newsRepository.getMutableLiveDataTechnology(page);
    }


}
