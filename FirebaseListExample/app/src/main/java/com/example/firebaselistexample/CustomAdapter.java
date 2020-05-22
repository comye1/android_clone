package com.example.firebaselistexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<User> arrayList;
    private Context context;

    public CustomAdapter(ArrayList<User> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView_profile;
        TextView textView_id;
        TextView textView_pw;
        TextView textView_userName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView_profile = itemView.findViewById(R.id.imageView_profile);
            this.textView_id = itemView.findViewById(R.id.textView_id);
            this.textView_pw = itemView.findViewById(R.id.textView_pw);
            this.textView_userName = itemView.findViewById(R.id.textView_userName);

        }
    }
}
