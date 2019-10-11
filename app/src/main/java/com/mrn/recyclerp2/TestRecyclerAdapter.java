package com.mrn.recyclerp2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.RecyclerViewHolder> {

    ArrayList<String> mylist;


    TestRecyclerAdapter(ArrayList<String> list){

        mylist = list;


    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        String name = mylist.get(position);
        holder.txtname.setText(name);

    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{

            TextView txtname ;
            ImageView imgname;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
             txtname = itemView.findViewById(R.id.txtname);
             imgname = itemView.findViewById(R.id.imgname);
        }
    }

}
