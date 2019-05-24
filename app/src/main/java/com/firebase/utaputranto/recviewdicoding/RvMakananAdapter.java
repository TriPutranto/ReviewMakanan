package com.firebase.utaputranto.recviewdicoding;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RvMakananAdapter extends RecyclerView.Adapter<RvMakananAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Makanan> makanans;

    public RvMakananAdapter(Context context,ArrayList<Makanan>makanans) {
        this.context=context;
        this.makanans = makanans;
    }

    public ArrayList<Makanan> getMakanans(){
        return makanans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        final Makanan makanan = makanans.get(i);
        Glide.with(context)
                .load(makanan.getProfilImg())
                .into(viewHolder.profilImg);
        viewHolder.tv_item_nama.setText(makanan.getNama());
        viewHolder.tv_item_asal.setText(makanan.getAsal());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotodetail = new Intent(context, DetailsActivity.class);
                gotodetail.putExtra(DetailsActivity.EXTRA_NAME,makanan.getNama());
                gotodetail.putExtra(DetailsActivity.EXTRA_ASAL,makanan.getAsal());
                gotodetail.putExtra(DetailsActivity.EXTRA_PORSI,makanan.getPorsi());
                gotodetail.putExtra(DetailsActivity.EXTRA_PROFIL,makanan.getProfilImg());
                gotodetail.putExtra(DetailsActivity.EXTRA_BACKDROP,makanan.getBackdropImg());
                gotodetail.putExtra(DetailsActivity.EXTRA_KALORI,makanan.getKalori());
                gotodetail.putExtra(DetailsActivity.EXTRA_LEMAK,makanan.getLemak());
                gotodetail.putExtra(DetailsActivity.EXTRA_PROTEIN,makanan.getProtein());
                gotodetail.putExtra(DetailsActivity.EXTRA_KARBO,makanan.getKarbo());

                context.startActivity(gotodetail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getMakanans().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profilImg;
        TextView tv_item_nama, tv_item_asal;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profilImg = itemView.findViewById(R.id.profilImg);
            tv_item_nama = itemView.findViewById(R.id.tv_item_nama);
            tv_item_asal = itemView.findViewById(R.id.tv_item_asal);
        }
    }
}
