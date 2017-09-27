package com.msrahman.horizontallistviewusingrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Context context;
    HorizontalRecyclerViewAdapter adapter;
    ArrayList<ItemModel> itemModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        int spacingInPixels=3;

        //For Horizontal Spacing
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(spacingInPixels));
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        //Set Adapter
        recyclerView.setLayoutManager(layoutManager);
        adapter = new HorizontalRecyclerViewAdapter(this, new ArrayList<ItemModel>());
        recyclerView.setAdapter(adapter);


        itemModels = new ArrayList<>();

        ItemModel itemModel1 = new ItemModel(1, R.drawable.man, "Mango", new ItemActivity());
        ItemModel itemModel2 = new ItemModel(2, R.drawable.man, "Orange", new ItemActivity());
        ItemModel itemModel3 = new ItemModel(3, R.drawable.man, "Banana", new ItemActivity());
        ItemModel itemModel4 = new ItemModel(4, R.drawable.man, "Apple", new ItemActivity());
        ItemModel itemModel5 = new ItemModel(5, R.drawable.man, "Peara", new ItemActivity());
        itemModels.add(itemModel1);
        itemModels.add(itemModel2);
        itemModels.add(itemModel3);
        itemModels.add(itemModel4);
        itemModels.add(itemModel5);

        adapter.refreshList(itemModels);

    }
}
