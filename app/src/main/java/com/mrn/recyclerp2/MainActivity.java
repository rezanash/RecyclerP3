package com.mrn.recyclerp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList();
        list.add("mehdi");
        list.add("reza");
        list.add("ramin");
        list.add("hosein");
        list.add("shayan");

        RecyclerView recycler = findViewById(R.id.recycler);

        TestRecyclerAdapter adapter = new TestRecyclerAdapter(list);
        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));
    }
}
