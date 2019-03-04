package com.example.admin.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView detailGmbr;
    TextView detailJudul,detailDeskripsi;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);//gunanya agar membukka layout activity detail

        detailGmbr = (ImageView) findViewById(R.id.detailgmbr);
        detailJudul = (TextView) findViewById(R.id.detailjdl);
        detailDeskripsi=(TextView) findViewById(R.id.detaildeskripsi);
        getData();

    }
    private void getData() {
        detailJudul.setText(getIntent().getStringExtra("id_juduL"));//mengambil data judul
        detailDeskripsi.setText(getIntent().getStringExtra("id_deskrip"));//mengambil data agar bisa ditampilkan

        Glide.with(this).load(getIntent().getIntExtra("image",0))
        .into(detailGmbr); //digunakan untuk mengirim gambar agar bisa ditampilkan dilayout baru

    }
}
