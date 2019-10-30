package com.example.catdog;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.RecyclerView;

    import android.content.Context;
    import android.os.Bundle;
    import android.widget.ImageView;

    import com.synnapps.carouselview.CarouselView;
    import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;
    private LineAdapter lineAdapter;



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
