package com.example.velostar.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.velostar.R;
import com.example.velostar.model.Records;
import com.example.velostar.viewholder.DataViewHolder;

import java.util.List;

public class DatasAdapter extends RecyclerView.Adapter<DataViewHolder> {

    private List<Records> data;

    public DatasAdapter(List<Records> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mainViewHolder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        DataViewHolder dataViewHolder = new DataViewHolder(mainViewHolder);

        return dataViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {

        Records data = this.data.get(position);

        TextView tv_item_name = holder.getTv_item_name();
        tv_item_name.setText(data.getFields().getName()+"");

        TextView tv_item_socle = holder.getTv_item_socles();
        tv_item_socle.setText(data.getFields().getSocle()+"");

        TextView tv_item_socle_dispo = holder.getTv_item_socles_dispo();
        tv_item_socle_dispo.setText(data.getFields().getSocleDispo()+"");

        TextView tv_item_velo_dispo = holder.getTv_item_velo_dispo();
        tv_item_velo_dispo.setText(data.getFields().getVeloDispo()+"");





        if(position %2 == 1){
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }else{
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFAF8FD"));
        }



    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
