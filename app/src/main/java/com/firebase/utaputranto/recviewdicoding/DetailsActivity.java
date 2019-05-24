package com.firebase.utaputranto.recviewdicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    ImageView backdropImg, profilImg;
    TextView tv_item_nama,tv_item_asal,porsi,kalori,lemak,protein,karbo;
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_ASAL = "extra_asal";
    public static final String EXTRA_PORSI= "extra_porsi";
    public static final String EXTRA_PROFIL= "extra_profil";
    public static final String EXTRA_BACKDROP= "extra_backrop";
    public static final String EXTRA_KALORI= "extra_kalori";
    public static final String EXTRA_LEMAK= "extra_lemak";
    public static final String EXTRA_PROTEIN= "extra_protein";
    public static final String EXTRA_KARBO= "extra_karbo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        backdropImg = findViewById(R.id.backdropImg);
        profilImg = findViewById(R.id.profilImg);

        tv_item_nama = findViewById(R.id.tv_item_nama);
        tv_item_asal = findViewById(R.id.tv_item_asal);
        porsi       = findViewById(R.id.porsi);
        kalori         = findViewById(R.id.kalori);
        lemak       = findViewById(R.id.lemak);
        protein        = findViewById(R.id.protein);
        karbo       = findViewById(R.id.karbo);

        String mName = getIntent().getStringExtra(EXTRA_NAME);
        String mAsal = getIntent().getStringExtra(EXTRA_ASAL);
        String mPorsi = getIntent().getStringExtra(EXTRA_PORSI);
        String mProfil = getIntent().getStringExtra(EXTRA_PROFIL);
        String mBackdrop = getIntent().getStringExtra(EXTRA_BACKDROP);
        String mKalori = getIntent().getStringExtra(EXTRA_KALORI);
        String mLemak = getIntent().getStringExtra(EXTRA_LEMAK);
        String mProtein = getIntent().getStringExtra(EXTRA_PROTEIN);
        String mKarbo = getIntent().getStringExtra(EXTRA_KARBO);


        tv_item_nama.setText(mName);
        tv_item_asal.setText(mAsal);
        porsi.setText("Kandungan per " + mPorsi);
        kalori.setText("Kalori = " + mKalori);
        lemak.setText("Lemak = " + mLemak);
        protein.setText("Protein = " + mProtein);
        karbo.setText("Protein = " + mKarbo);

        Glide.with(this)
                .load(mProfil)
                .into(profilImg);

        Glide.with(this)
                .load(mBackdrop)
                .into(backdropImg);



    }
}
