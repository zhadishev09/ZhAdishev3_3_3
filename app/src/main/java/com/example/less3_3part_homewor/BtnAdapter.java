package com.example.less3_3part_homewor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BtnAdapter extends RecyclerView.Adapter<BtnViewHolder> {

    private ArrayList<String> names;
    public BtnAdapter(ArrayList<String> names){
        this.names = names;
    }

    @NonNull
    @Override
    public BtnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BtnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_button, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BtnViewHolder holder, int position) {
        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}