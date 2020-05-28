package com.example.velostar.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.velostar.R;

public class DataViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_item_name;
    private TextView tv_item_socles;
    private TextView tv_item_socles_dispo;
    private TextView tv_item_velo_dispo;
    private TextView tv_item_update;
    private ImageView iv_item_etat;

    public DataViewHolder(@NonNull View v) {
        super(v);
        tv_item_name = v.findViewById(R.id.tv_item_name);
        tv_item_socles = v.findViewById(R.id.tv_item_socles);
        tv_item_socles_dispo = v.findViewById(R.id.tv_item_socles_dispo);
        tv_item_velo_dispo = v.findViewById(R.id.tv_item_velo_dispo);
        tv_item_update = v.findViewById(R.id.tv_item_update);
        iv_item_etat = v.findViewById(R.id.iv_item_etat);

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

    public TextView getTv_item_update() {
        return tv_item_update;
    }

    public ImageView getIv_item_etat() {
        return iv_item_etat;
    }
}
