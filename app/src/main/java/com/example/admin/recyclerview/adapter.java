package com.example.admin.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.holder> {

    Context context;//penanda siapa yang akses class adapter
    List<pola> item;//memanggul pola dilist karena banyak

    public adapter(Context context, List<pola> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview,null);
        return new holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, final int i) { //ada final agar submethod bisa menggunakan

        Glide.with(context).load(item.get(i).getImg()).into(holder.Gambar);//untuk manggil ini harus menggunakan library glide dan ini
        //digunakan untuk memanggil gambar
        holder.Judul.setText(item.get(i).getJudul());//holder itu nama variabel diatas
        holder.Deskripsi.setText(item.get(i).getDeskripsi());
        holder.Cardlist.setOnClickListener(new View.OnClickListener() {//supaya pas dipencet bisa menuju layout lain
        @Override
        public void onClick(View v) {
            Intent in = new Intent(v.getContext(),DetailActivity.class); //ketika diklik dari main activity akan ke detail activty
            in.putExtra("id_juduL",item.get(i).getJudul()); //ini submethod digunakan untuk mengirim ke detailactivty
            in.putExtra("id_deskrip", item.get(i).getDeskripsi());//submethod digunakan untuk mengirimke detail acitivity
            in.putExtra("image",item.get(i).getImg()); //getImg didapat dari pola
            v.getContext().startActivity(in);
            Toast.makeText(context,item.get(i).getJudul(),Toast.LENGTH_SHORT).show();
        }
    });
    }

    @Override
    public int getItemCount() {
        return item.size();//mendeteksi data yang dipunya
    }

    class holder extends RecyclerView.ViewHolder  { /* class digunakan untuk mendeklarasikan gambar*/
        CardView Cardlist;
        ImageView Gambar;
        TextView Judul,Deskripsi;
        public holder(@NonNull View itemView) {
            super(itemView);
            Cardlist = (CardView) itemView.findViewById(R.id.cardlist);
            Gambar = (ImageView) itemView.findViewById(R.id.gambar);
            Judul = (TextView) itemView.findViewById(R.id.judul);
            Deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
        }
    }
}
