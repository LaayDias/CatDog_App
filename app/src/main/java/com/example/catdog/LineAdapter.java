package com.example.catdog;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.catdog.data.Product;
import com.example.catdog.util.LineHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LineAdapter extends RecyclerView.Adapter<LineHolder> {
    private final List<Product> mProducts;

    public LineAdapter(ArrayList products) {
        mProducts = products;
    }

    @Override
    public LineHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new LineHolder(LayoutInflater.from(parent.getContext()).inflate((R.layout.activity_card_prod_um),parent, false));
    }

    @Override
    public void onBindViewHolder( LineHolder holder, int position) {
        holder.title.setText(String.format(Locale.getDefault(), "%s, %d - %s",
                mProducts.get(position).getTitle(),
                mProducts.get(position).getImage(),
                mProducts.get(position).getPrice()
        ));

    }

    @Override
    public int getItemCount() {
        return mProducts != null ? mProducts.size() : 0 ;
    }
}
