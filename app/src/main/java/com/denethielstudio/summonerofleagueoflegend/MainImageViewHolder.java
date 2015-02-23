package com.denethielstudio.summonerofleagueoflegend;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by neopoliticatv on 23/02/15.
 */
public class MainImageViewHolder extends RecyclerView.ViewHolder{
    protected ImageView thumbnail;

    public MainImageViewHolder(View view){
        super(view);
        this.thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
    }
}
