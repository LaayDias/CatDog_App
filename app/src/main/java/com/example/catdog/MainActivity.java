package com.example.catdog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.catdog.data.Product;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    /* banner*/
    private int[] imagesAnimation = new int[]{
            R.drawable.banner_um,
            R.drawable.banner_dois,
            R.drawable.banner_tres
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView mRecyclerView = findViewById(R.id.rv_products_list);

        // Configurando o gerenciador de layout para ser uma lista.
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        //Gerando list

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "", "", 1, "", 1.0, 3.4, false, 0));
        list.add(new Product(1, "", "", 1, "", 1.0, 3.4, false, 0));
        list.add(new Product(1, "", "", 1, "", 1.0, 3.4, false, 0));
        list.add(new Product(1, "", "", 1, "", 1.0, 3.4, false, 0));
        list.add(new Product(1, "", "", 1, "", 1.0, 3.4, false, 0));

        // Adiciona o adapter que irá anexar os objetos à lista.
        // Está sendo criado com lista vazia, pois será preenchida posteriormente.
        LineAdapter mAdapter = new LineAdapter(list);
        mRecyclerView.setAdapter(mAdapter);

        CarouselView carouselView = findViewById(R.id.carousel);
        carouselView.setPageCount(imagesAnimation.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(imagesAnimation[position]);
            }
        });

    } /* fim banner*/


}
