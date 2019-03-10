package com.example.admin.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView LIst,List2,List3;
    LinearLayoutManager linear,ver;
    GridLayoutManager grid;
    List<pola> item;
    adapter ADapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LIst =(RecyclerView) findViewById(R.id.list);
        linear =new LinearLayoutManager(this);
        LIst.setLayoutManager(linear);
        ADapter = new adapter(this,item);
        LIst.setAdapter(ADapter);

       List3 =(RecyclerView) findViewById(R.id.list2);
        ver =new LinearLayoutManager(this);
        List3.setLayoutManager(ver);
        ADapter = new adapter(this,item);
        List3.setAdapter(ADapter);

        List2 =(RecyclerView) findViewById(R.id.list3);
        grid = new GridLayoutManager(MainActivity.this, 2);
        List2.setLayoutManager(grid);
        ADapter=new adapter(this,item);
        List2.setAdapter(ADapter);



        item = new ArrayList<>();
        item.add(new pola(R.drawable.tottti,"Fracesco Totti","Francesco Totti,  (lahir di Roma, Italia, 27 September 1976; umur 42 tahun) merupakan seorang pemain sepak bola berkebangsaan Italia yang saat ini membela tim AS Roma. Sebagai pemain kelahiran Roma dan lulusan akademi sepak bola AS Roma, Totti hingga kini dikenal sebagai simbol AS Roma dan mendapatkan julukan \"Sang Pangeran Roma\" oleh tifosi setia klub tersebut. Bersama Gabriel Batistuta, Hidetoshi Nakata, dan Cafu, Totti mengantarkan klub ibukota Italia itu meraih gelar Serie-A yang ketiga pada tahun 2001."));
        item.add(new pola(R.drawable.cantona,"Eric Cantona","Selama lima tahun berseragam Setan Merah, julukan MU, Cantona bergelimang gelar. Total, sembilan piala ia persembahkan untuk MU.\n" +
                "\n" +
                "Cantona membantu MU menjadi juara Liga Inggris sebanyak empat kali (1992/93, 1993/94, 1995/96 dan 1996/97). Selain itu,  dua Piala FA Inggris (1993/1994 dan 1995/96) juga diraihnya. Lainnya ialah tiga gelar Charity Shield (1993, 1994 dan 1996).\n" +
                "\n" +
                "Pada tahun terakhirnya di Old Trafford, ban kapten menetap di lengan Cantona. Tapi, ia malah memutuskan untuk pensiun di akhir musim.\n" +
                "\n" +
                "Ada anggapan bahwa kekalahan MU di semifinal Liga Champions 1996/1997 dari Borussia Dortmund menjadi biang keladi gantung sepatunya Cantona. Saking frustrasinya, ia sampai melewati kesempatan tampil di Piala Dunia 1998 bersama Timnas Prancis."));
        item.add(new pola(R.drawable.solksjaer,"Ole gunnar Solskjaer","Solskjaer mempunyai julukan super sub karena kemampuannya ynag bisa merubah ketertinggalan tim menjadi sebuah kemenangan , solskjaer adalah pahlawan pada saat final ucl 1999 dan ia sekarang menjadi pelatih MU"));

        item.add(new pola(R.drawable.florenzi,"Alesandro Florenzi","Florenzi merupakan pesepakbola asli roma yang dibesarkan oleh akademi roma , florenzi diproyeksikan menjadi kapten setelah de rossi pensiun ia merupakan pemain yang sangat loyal terhadap klubnya"));
        item.add(new pola(R.drawable.derossi,"Daniele De Rossi","De rossi merupak kapten dari kesebelas AS Roma , dia pemimpin saat ini menggantikan Totti yang pensiun , kesetiaannya terhadap klub membuat De Rossi menjadi legenda di AS Roma"));
        item.add(new pola(R.drawable.rafael,"Rafael Da silva","Rafael Da Silva merupakan pesepakbola asal brazil yang saat ini sedang merumput bersama lyon"));
        item.add(new pola(R.drawable.scholes,"Paul Scholes","Paul Scholes (lahir 16 November 1974; umur 44 tahun) adalah mantan pemain sepak bola dari Inggris yang menghabiskan semua kariernya bermain untuk klub Manchester United.\n" +
                "Ia memulai Karier debutnya pada musim 1994-95 dan menjadi Pemain kunci ketika United memenangkan Treble Winners pada musim 1998-99\n" +
                "Merupakan salah satu pemain yang bersinar pada generasinya,Dia Diidolakan berbagai Pesepak bola Kelas dunia karena gaya permainannya di lapangan hijau. Ia adalah bagian dari Class of '92 Manchester United, beserta Ryan Giggs, Gary Neville, Phil Neville, David Beckham, Nicky Butt, dan pemain lainnya yang tersebar ke liga-liga domestik Inggris.\n" +
                "Pada akhir musim 2010/2011 Paul Scholes resmi pensiun dari Manchester United.Setelah pensiun, Paul Scholes akan menjadi staff kepelatihan Manchester United, namun pada awal tahun 2012 Scholes kembali bermain untuk Manchester United sebelum ia pensiun lagi Pada Mei 2013.\n"));

    }

    public void onSuccess(List<pola> model) {
        this.item.clear();
        this.item.addAll(model);
        this.ADapter.notifyDataSetChanged();
    }
}

