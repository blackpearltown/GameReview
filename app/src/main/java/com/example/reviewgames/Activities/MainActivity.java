package com.example.reviewgames.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.example.reviewgames.Adapters.GameItemAdapter;
import com.example.reviewgames.Data.Data;
import com.example.reviewgames.Models.GameItems;
import com.example.reviewgames.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    Button btnCategory;
    int position;

    private AdapterView.OnItemClickListener onItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getApplicationContext(), ViewDetailActivity.class);
            intent.putExtra("id", (int) gridview.getAdapter().getItemId(position));
            startActivity(intent);
        }
    };
    private View.OnClickListener toCategoryClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
            intent.putExtra("position", position);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = findViewById(R.id.gridview);
        btnCategory = findViewById(R.id.btn_category);
        GameItemAdapter postentryadapter = new GameItemAdapter(getApplicationContext(), loadData());
        gridview.setAdapter(postentryadapter);
        gridview.setOnItemClickListener(onItemClick);
        btnCategory.setOnClickListener(toCategoryClick);
    }

    private ArrayList<GameItems> loadData() {
        ArrayList<GameItems> gameItems = new ArrayList<>();
        for (int i = 0; i < Data.id.length; i++) {
            GameItems post = new GameItems(Data.id[i], Data.nameGame[i],
                    Data.urlPhoto[i], Data.shortDesc[i], Data.rating[i]);
            gameItems.add(post);
        }
        return gameItems;
    }

}
