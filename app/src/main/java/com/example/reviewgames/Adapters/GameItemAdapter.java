package com.example.reviewgames.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.reviewgames.Data.Data;
import com.example.reviewgames.Data.DownloadPhoto;
import com.example.reviewgames.Models.GameItems;
import com.example.reviewgames.R;

import java.util.ArrayList;

public class GameItemAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<GameItems> gameList;

    public GameItemAdapter(Context context, ArrayList<GameItems> gameList) {
        this.context = context;
        this.gameList = gameList;
    }

    @Override
    public int getCount() {
        return gameList.size();
    }

    @Override
    public Object getItem(int position) {
        return gameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return gameList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyView dataitem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            dataitem = new MyView();
            convertView = inflater.inflate(R.layout.main_gen, null);
            dataitem.tvName = convertView.findViewById(R.id.tv_name_game);
            dataitem.tvShortDesc = convertView.findViewById(R.id.tv_short_desc_game);
            dataitem.imvGameItems = convertView.findViewById(R.id.imv_game);
            dataitem.ratingBarGame = convertView.findViewById(R.id.detail_rating);
            convertView.setTag(dataitem);

         } else {
            dataitem = (MyView) convertView.getTag();
        }
        new DownloadPhoto(dataitem.imvGameItems).execute(gameList.get(position).getUrlPhotos());
        dataitem.tvName.setText(gameList.get(position).getNameGame());
        dataitem.tvShortDesc.setText(gameList.get(position).getShortDesc());
        dataitem.ratingBarGame.setRating(Data.rating[position]);




        return convertView;
    }

    private class MyView {
        TextView tvName, tvShortDesc;
        ImageView imvGameItems;
        RatingBar ratingBarGame;
    }
}

