package com.example.clonediaryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SimpleStringRecyclerViewAdapter extends RecyclerView.Adapter<SimpleStringRecyclerViewAdapter.ViewHolder> {
    private List<String> items;

    //1. 어댑터 생성
    public SimpleStringRecyclerViewAdapter(List<String> values) {
        this.items = values;

    }

    //2. 아이템 뷰 레이아웃을 ViewHolder에 연결
    @Override
    public SimpleStringRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_year, parent, false);

        return new SimpleStringRecyclerViewAdapter.ViewHolder(view);

    }

    //3. ViewHolder를 통해 아이템의 데이터값을 삽입
    @Override
    public void onBindViewHolder(SimpleStringRecyclerViewAdapter.ViewHolder holder, final int position) {
        holder.year.setText(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    //리스트 아이템의 뷰에 접근하게 해주는 클래스
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final View mView;
        private final TextView year;


        public ViewHolder(View view) {
            super(view);
            mView = view;
            year = (TextView) view.findViewById(R.id.tv_year);
        }

        @Override
        public String toString() {
            return super.toString() + " '";
        }
    }
}

