package com.example.clonediaryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_month) TextView main_month;
    @BindView(R.id.main_year) TextView main_year;
    @BindView(R.id.horizontal_scroll_view)
    RecyclerView horizontal_scroll_view;

    private List<String> months = new ArrayList<>();
    private List<String> years = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the current view
        ButterKnife.bind(this);

        String[] monthList = new DateFormatSymbols(Locale.ENGLISH).getShortMonths();

        for(int i=0; i<12; i++){
            months.add(monthList[i]);
        }
        for(int i=0; i<10; i++){
            int a = 2020;
            years.add(""+(a+i));
        }
        //RecyclerView에 1.레이아웃매니저세팅 2.어댑터 세팅
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        horizontal_scroll_view.setLayoutManager(horizontalLayoutManager);
    }
    @OnClick(R.id.main_month)
    public void onClickMonth(){
        Animation animation = new AlphaAnimation(0,1);
        animation.setDuration(1000);
        horizontal_scroll_view.setAdapter(new SimpleStringRecyclerViewAdapter(months));
        horizontal_scroll_view.setVisibility(View.VISIBLE);
        horizontal_scroll_view.setAnimation(animation);
    }

    @OnClick(R.id.main_year)
    public void onClickYear(){
        Animation animation = new AlphaAnimation(0,1);
        animation.setDuration(1000);
        horizontal_scroll_view.setAdapter(new SimpleStringRecyclerViewAdapter(years));
        horizontal_scroll_view.setVisibility(View.VISIBLE);
        horizontal_scroll_view.setAnimation(animation);
    }
}
