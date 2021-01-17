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

    public LiveData<List<Article>> getAllArticle(){
        return newsRepository.getMutableLiveData();
    }
    public LiveData<List<Article>> getBusinessArticle(){
        return newsRepository.getMutableLiveDataBusiness();
    }
    public LiveData<List<Article>> getEntertainmentArticle(){
        return newsRepository.getMutableLiveDataEntertainment();
    }
    public LiveData<List<Article>> getGeneralArticle(){
        return newsRepository.getMutableLiveDataGeneral();
    }
    public LiveData<List<Article>> getHealthArticle(){
        return newsRepository.getMutableLiveDataHealth();
    }
    public LiveData<List<Article>> getScienceArticle(){
        return newsRepository.getMutableLiveDataScience();
    }
    public LiveData<List<Article>> getSportsArticle(){
        return newsRepository.getMutableLiveDataSports();
    }
    public LiveData<List<Article>> getTechnologyArticle(){
        return newsRepository.getMutableLiveDataTechnology();
    }

}
