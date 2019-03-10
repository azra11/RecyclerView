package com.example.admin.recyclerview;
/*
Digunakan untuk object yang berdiri sendiri yang tidak bergantung dengan classlain (berdiri sendiri) , menjadi pola
dan acuan bagi data yang akan ditambahkan pada recycleview
 */
public class pola {
    private int img;
    private String Judul;
    private String Deskripsi;

    public pola(int img, String judul, String deskripsi) {
        this.img = img;
        Judul = judul;
        Deskripsi = deskripsi;
    }


    public int getImg() {
        return img;
    }

    public String getJudul() {
        return Judul;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }
}
