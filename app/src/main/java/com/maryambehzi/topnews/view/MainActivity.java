package com.maryambehzi.topnews.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.maryambehzi.topnews.utils.Common;
import com.maryambehzi.topnews.viewmodel.MainActivityViewModel;
import com.maryambehzi.topnews.adapter.NewsAdapter;
import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;
import com.waspar.falert.DoubleButtonListener;
import com.waspar.falert.Falert;
import com.waspar.falert.FalertButtonType;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button All, Business, Entertainment, General, Health, Science, Sport, Technology, nextPage;
    RecyclerView recyclerView;
    FloatingActionButton fab;
    String filterType = "all";
    SharedPreferences sharedPreferences ;
    SharedPreferences.Editor editor;
    ProgressBar progressBar;
    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("TopNews", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        fab = findViewById(R.id.fab);
        nextPage = findViewById(R.id.btn_next_page);
        recyclerView = findViewById(R.id.recycler);
        progressBar = findViewById(R.id.progressBar);

        MainActivityViewModel activityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflaterr = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = inflaterr.inflate(R.layout.filter_dialog, null, false); // init custum view

                All = customView.findViewById(R.id.all_filter);
                Business = customView.findViewById(R.id.business_filter);
                Entertainment = customView.findViewById(R.id.entertainment_filter);
                General = customView.findViewById(R.id.general_filter);
                Health = customView.findViewById(R.id.health_filter);
                Science = customView.findViewById(R.id.science_filter);
                Sport = customView.findViewById(R.id.sports_filter);
                Technology = customView.findViewById(R.id.technology_filter);

                All.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "all";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                Business.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "business";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                Entertainment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "entertainment";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                General.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "general";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                Health.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "health";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                Science.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "science";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                Sport.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "sport";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });
                Technology.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "technology";
                        Toast.makeText(MainActivity.this,filterType,Toast.LENGTH_SHORT).show();
                    }
                });

                Falert falert = new Falert(getApplicationContext())
                        .setButtonType(FalertButtonType.Double_BUTTON) // FalertButtonType.Double_BUTTON OR FalertButtonType.ONE_BUTTON
                        .customView(customView) // set your custom view here
                        .setAutoDismiss(true) // button rule, when user click on this
                        .setPositiveText("Set Filters") // set positive text
                        .setNegativeText("Cancel") // set negative text
                        .setPositiveButtonBackground(getResources().getColor(R.color.falert_green)) // button (positive) background color
                        .setNegativeButtonBackground(getResources().getColor(R.color.falert_red)) // button (negative) background color
                        .setHeaderIcon(getResources().getDrawable(R.drawable.ic_filterlist)) // header icon drawable
                        .setAlertRadius(40) // set radius for alert view
                        .setButtonRadius(80) // set radius for button
                        .setButtonTextSize(13) // button (all) text size
                        .setHeaderIconEnable(true) // visible Or invisible Icon Header
                        .setButtonEnable(true) // visible Or invisible Buttons
                        .setDoubleButtonListener(new DoubleButtonListener() {
                            @Override
                            public void onClickPositive() {
                                SwitchFilterRV(1);
                                page = 1;
                            }

                            @Override
                            public void onClickNegative() {
                                Toast.makeText(MainActivity.this, "Negative", Toast.LENGTH_SHORT).show();
                            }
                        });
                falert.show(getSupportFragmentManager() , "");
            }
        });

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (!recyclerView.canScrollVertically(1)) {
                    //TODO next page
                    Log.e("ERROR_NEXTPAGE", String.valueOf(sharedPreferences.getInt("currentPage", 0)));
                    if (Common.totalPage >= sharedPreferences.getInt("currentPage",0)*20)
                        nextPage.setVisibility(View.VISIBLE);
                    else {
                        editor.putInt("currentPage",1);
                        editor.commit();
                    }
                    nextPage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            page = sharedPreferences.getInt("currentPage", 0)+1;
                            editor.putInt("currentPage", page);
                            editor.commit();

                            Log.e("Filter", filterType);

                            SwitchFilterRV(page);
                        }
                    });


                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        activityViewModel.getAllArticle(1).observe(this, new Observer<List<Article>>() {
            @Override
            public void onChanged(@Nullable List<Article> articles) {
                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                progressBar.setVisibility(View.GONE);
                editor.putInt("currentPage",page);
                editor.commit();
            }
        });
    }

    private void SwitchFilterRV(int page){

        MainActivityViewModel activityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);


        switch (filterType){
            case "all":
                activityViewModel.getAllArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;

            case "business":
                activityViewModel.getBusinessArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
            case "entertainment":
                activityViewModel.getEntertainmentArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
            case "general":
                activityViewModel.getGeneralArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
            case "health":
                activityViewModel.getHealthArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
            case "science":
                activityViewModel.getScienceArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
            case "sport":
                activityViewModel.getSportsArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
            case "technology":
                activityViewModel.getTechnologyArticle(page).observe(MainActivity.this, new Observer<List<Article>>() {
                    @Override
                    public void onChanged(@Nullable List<Article> articles) {
                        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                        recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                        nextPage.setVisibility(View.GONE);
                        progressBar.setVisibility(View.GONE);
                    }
                });
                break;
        }
    }
}