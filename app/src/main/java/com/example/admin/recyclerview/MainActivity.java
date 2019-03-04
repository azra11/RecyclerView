package com.example.admin.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView LIst;
    LinearLayoutManager linear;
    List<pola> item;
    adapter ADapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LIst =(RecyclerView) findViewById(R.id.list);
        linear =new LinearLayoutManager(this);
        LIst.setLayoutManager(linear);

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

        ADapter = new adapter(this,item);
        LIst.setAdapter(ADapter);
    }
}
