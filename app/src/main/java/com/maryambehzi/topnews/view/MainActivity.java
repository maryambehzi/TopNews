package com.maryambehzi.topnews.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.maryambehzi.topnews.viewmodel.MainActivityViewModel;
import com.maryambehzi.topnews.adapter.NewsAdapter;
import com.maryambehzi.topnews.R;
import com.maryambehzi.topnews.model.Article;
import com.waspar.falert.DoubleButtonListener;
import com.waspar.falert.Falert;
import com.waspar.falert.FalertButtonType;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button All, Business, Entertainment, General, Health, Science, Sport, Technology;
    RecyclerView recyclerView;
    FloatingActionButton fab;
    String filterType = "all";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.recycler);

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
                    }
                });
                Business.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "business";
                    }
                });
                Entertainment.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "entertainment";
                    }
                });
                General.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "general";
                    }
                });
                Health.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "health";
                    }
                });
                Science.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "science";
                    }
                });
                Sport.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "sport";
                    }
                });
                Technology.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        filterType = "technology";
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
                        .setHeaderIcon(getResources().getDrawable(R.drawable.luncher)) // header icon drawable
                        .setAlertRadius(40) // set radius for alert view
                        .setButtonRadius(80) // set radius for button
                        .setButtonTextSize(13) // button (all) text size
                        .setHeaderIconEnable(true) // visible Or invisible Icon Header
                        .setButtonEnable(true) // visible Or invisible Buttons
                        .setDoubleButtonListener(new DoubleButtonListener() {
                            @Override
                            public void onClickPositive() {
                                switch (filterType){
                                    case "all":
                                        activityViewModel.getAllArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;

                                    case "business":
                                        activityViewModel.getBusinessArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                    case "entertainment":
                                        activityViewModel.getEntertainmentArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                    case "general":
                                        activityViewModel.getGeneralArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                    case "health":
                                        activityViewModel.getHealthArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                    case "science":
                                        activityViewModel.getScienceArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                    case "sport":
                                        activityViewModel.getSportsArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                    case "technology":
                                        activityViewModel.getTechnologyArticle().observe(MainActivity.this, new Observer<List<Article>>() {
                                            @Override
                                            public void onChanged(@Nullable List<Article> articles) {
                                                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                                                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
                                            }
                                        });
                                        break;
                                }
                            }

                            @Override
                            public void onClickNegative() {
                                Toast.makeText(MainActivity.this, "Negative", Toast.LENGTH_SHORT).show();
                            }
                        });
                falert.show(getSupportFragmentManager() , "");
            }
        });

        activityViewModel.getAllArticle().observe(this, new Observer<List<Article>>() {
            @Override
            public void onChanged(@Nullable List<Article> articles) {
                recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
                recyclerView.setAdapter(new NewsAdapter( articles, MainActivity.this));
            }
        });


    }

}