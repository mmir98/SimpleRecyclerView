package com.example.simplerecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Model> data;

    RecyclerViewAdapter(Context mContext, List<Model> data){
        this.mContext= mContext;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.recyclerview_row_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.text_tv.setText(data.get(position).getText());
        holder.subText_tv.setText(data.get(position).getSubText());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView text_tv;
        TextView subText_tv;

        MyViewHolder(View itemView) {
            super(itemView);
            text_tv = itemView.findViewById(R.id.text_tv);
            subText_tv = itemView.findViewById(R.id.subtext_tv);
        }
    }
}
