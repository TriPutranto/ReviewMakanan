package com.firebase.utaputranto.recviewdicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Makanan> data;
    RecyclerView rvMakanan;
    RvMakananAdapter rvMakananAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        rvMakanan = findViewById(R.id.rvMakanan);
        rvMakananAdapter = new RvMakananAdapter(this,data);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        rvMakanan.setLayoutManager(layoutManager);
        rvMakanan.setAdapter(rvMakananAdapter);

    }
    private void addData() {
        data = new ArrayList<>();
        data.add(new Makanan("Nasi Uduk", "Indonesian Food", "http://raw.cdn.baca.co.id/25465d9b-febb-4ea0-a678-cd2ef6be2e5c",
                "https://cdn1-production-images-kly.akamaized.net/O6mcDdRamNkW7XRF0CM-zjPuofc=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1557598/original/043630500_1491389074-shutterstock_478336309.jpg",
                "160 gr", "260 kkal", "32,84 g", "12,5 g", "4,07 g"));
        data.add(new Makanan("Nasi Kuning", "Indonesian Food", "https://i2.wp.com/www.qetring.com/wp-content/uploads/2018/09/Nasi-Kuning-Manado-WP.png?fit=600%2C600&ssl=1",
                "https://cdn1-production-images-kly.akamaized.net/B5YYsDgGHfoOI0AseKjHHZ-7uZM=/680x383/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2534089/original/096747500_1544766546-resep-nasi-kuning-dengan-rice-cooker-untuk-pemula-anti-gagal.jpg",
                "105 gr","100 kkal", "21,9 g", "0,18 g", "1,98 g"));
        data.add(new Makanan("Lontong Sayur", "Indonesian Food", "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2018/10/25/3495813588.jpg",
                "https://previews.123rf.com/images/ferli/ferli1808/ferli180800026/105659143-lontong-sayur-rice-cake-with-soup.jpg",
                "400 gr", "357 kkal", "59,1 g", "8,39 g", "11,11 g"));
        data.add(new Makanan("Nasi Goreng", "Chinese Food", "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2016/05/nasi-goreng.jpg?itok=f6_VrVGC",
                "https://cdn.idntimes.com/content-images/community/2019/05/2509089-s-3fea1699c17af6a7cbd91c2a32d08117_600x400.jpg",
                "149 gr", "250 kkal", "31,38 g", "9,28 g", "9,38 g"));
        data.add(new Makanan("Bubur Ayam", "Indonesian Food", "http://farlys.com/wp-content/uploads/2013/07/bubur-ayam-ala-hongkong.jpg",
                "https://cdn1-production-images-kly.akamaized.net/8ycdZikbNU05Drwava_zwTgT308=/680x383/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2468992/original/046300400_1543257688-resep-bubur-ayam-sarapan-simpel-20-menit.jpg",
                "240 gr", "372 kkal","36,12 g","12,39 g","27,56"));
        data.add(new Makanan("Roti Tawar", "Western Food", "https://asset-a.grid.id//crop/0x0:0x0/700x465/photo/bobofoto/original/20152_tips-menyimpan-roti-tawar-agar-bisa-tahan-lebih-lama.jpg",
                "https://cdn1-production-images-kly.akamaized.net/FDDIbtrQVHxnzqRJJwXqIzdftkU=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2396503/original/013705500_1540956520-HL.jpg",
                "25 gr", "66 kkal", "12,65 g", "0,82 g","1,91 g"));
        data.add(new Makanan("Nasi Pecel", "Indonesian Food", "http://www.resepasia.com/media/cache/image_recipe_large/uploads/media/nasi-pecel-sego-pecel-sambel-pecel-pecel-madiun-sambel-pecel-madiun-sego-pecel-madiun-madiun-makanan-khas-madiun_1440495024.jpg",
                "https://anakjajan.files.wordpress.com/2018/05/dscf1863.jpg?w=672&h=372&crop=1",
                "120 gr", "276 kkal", "38,09 g", "11,2 g", "7,9 g"));
    }
}
