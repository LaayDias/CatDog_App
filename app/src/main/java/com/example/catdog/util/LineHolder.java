package com.example.catdog.util;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.catdog.R;


public class LineHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public ImageView imageView;
    public TextView price;
    public Button btnComprar;


    public LineHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.textViewTitle);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        price = (TextView) itemView.findViewById(R.id.txtPrice);
        btnComprar = (Button) itemView.findViewById(R.id.buttonComprar);
    }
}
