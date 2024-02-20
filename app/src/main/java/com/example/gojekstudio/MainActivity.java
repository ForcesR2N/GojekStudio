package com.example.gojekstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_siswa);

        RecyclerView recyclerView = findViewById(R.id.recycleview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Nafi", "1", R.drawable.cat));
        items.add(new Item("Aldi", "2", R.drawable.cat));
        items.add(new Item("Alikha", "3", R.drawable.cat));
        items.add(new Item("Allam", "4", R.drawable.cat));
        items.add(new Item("Jadin", "5", R.drawable.cat));
        items.add(new Item("Arsya", "6", R.drawable.cat));
        items.add(new Item("Azzam", "7", R.drawable.cat));
        items.add(new Item("Azzan", "8", R.drawable.cat));
        items.add(new Item("Zain", "9", R.drawable.cat));
        items.add(new Item("Daffa", "10", R.drawable.cat));
        items.add(new Item("Dylan", "11", R.drawable.cat));
        items.add(new Item("Dzaky", "12", R.drawable.cat));
        items.add(new Item("Hilal", "13", R.drawable.cat));
        items.add(new Item("Jeremy", "14", R.drawable.cat));
        items.add(new Item("Jojo", "15", R.drawable.cat));
        items.add(new Item("Khalisa", "16", R.drawable.cat));
        items.add(new Item("Rendra", "17", R.drawable.cat));
        items.add(new Item("Farras", "18", R.drawable.cat));
        items.add(new Item("Anam", "19", R.drawable.cat));
        items.add(new Item("Evan", "20", R.drawable.cat));
        items.add(new Item("Fakhry", "21", R.drawable.cat));
        items.add(new Item("Kaka", "22", R.drawable.cat));
        items.add(new Item("Rizal", "23", R.drawable.cat));
        items.add(new Item("Nafisah", "24", R.drawable.cat));
        items.add(new Item("Nail", "25", R.drawable.cat));
        items.add(new Item("Hatta", "26", R.drawable.cat));
        items.add(new Item("Afdhal", "27", R.drawable.cat));
        items.add(new Item("Nico", "28", R.drawable.cat));
        items.add(new Item("Ocean", "29", R.drawable.cat));
        items.add(new Item("Fikri", "30", R.drawable.cat));
        items.add(new Item("Radit", "31", R.drawable.cat));
        items.add(new Item("Rifqi", "32", R.drawable.cat));
        items.add(new Item("Royyan", "33", R.drawable.cat));
        items.add(new Item("Ruga", "34", R.drawable.cat));
        items.add(new Item("Satria", "35", R.drawable.cat));
        items.add(new Item("Hilmi", "36", R.drawable.cat));
        items.add(new Item("Zaskia", "37", R.drawable.cat));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));
    }
}