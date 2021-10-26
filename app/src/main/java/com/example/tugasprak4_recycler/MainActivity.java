package com.example.tugasprak4_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new ItemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("Facebook","Sosial Media","400mb",R.drawable.facebook));
        itemArrayList.add(new Item("Telegram","Komunikasi","320mb",R.drawable.telegram));
        itemArrayList.add(new Item("Line","Komunikasi","81mb",R.drawable.line));
        itemArrayList.add(new Item("Opera Mini","Browser","18mb",R.drawable.opera));
        itemArrayList.add(new Item("TikTok","Pemutar & Editor Vidio","61mb",R.drawable.tiktok));
        itemArrayList.add(new Item("Edge","Browser","120mb",R.drawable.edge));
        itemArrayList.add(new Item("Bigo Live","Streaming","57mb",R.drawable.bigo));
        itemArrayList.add(new Item("Mobel Lejen","Game Laga Fps","999mb",R.drawable.ml));
        itemArrayList.add(new Item("Turbo VPN","Innovative Connection","17mb",R.drawable.vpn));
        itemArrayList.add(new Item("Shoppe: Belanja di 11.11","Belanja","450mb",R.drawable.shoppe));
    }
}