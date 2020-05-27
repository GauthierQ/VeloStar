package com.example.velostar.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.velostar.R;
import com.google.android.gms.maps.MapView;

public class DataViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_item_name;
    private TextView tv_item_socles;
    private TextView tv_item_socles_dispo;
    private TextView tv_item_velo_dispo;
   // private MapView mv_item_map;

    public DataViewHolder(@NonNull View v) {
        super(v);
        tv_item_name = v.findViewById(R.id.tv_item_name);
        tv_item_socles = v.findViewById(R.id.tv_item_socles);
        tv_item_socles_dispo = v.findViewById(R.id.tv_item_socles_dispo);
        tv_item_velo_dispo = v.findViewById(R.id.tv_item_velo_dispo);
       // mv_item_map = v.findViewById(R.id.mv_item_map);

    }

    public TextView getTv_item_name() {
        return tv_item_name;
    }

    public TextView getTv_item_socles() {
        return tv_item_socles;
    }

    public TextView getTv_item_socles_dispo() {
        return tv_item_socles_dispo;
    }

    public TextView getTv_item_velo_dispo() {
        return tv_item_velo_dispo;
    }

   /* public MapView getMv_item_map() {
        return mv_item_map;
    }*/
}
