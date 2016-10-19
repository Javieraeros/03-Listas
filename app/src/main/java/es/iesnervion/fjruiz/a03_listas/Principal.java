package es.iesnervion.fjruiz.a03_listas;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Principal extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        LolTeam origen=new LolTeam(0,"Origen","Peaso equipo loco",R.drawable.origen,15);
        LolTeam[] teams=new LolTeam[]{origen};


        MyArrayAdapter a=new MyArrayAdapter(this,R.layout.fila,R.id.texto,teams);
        setListAdapter(a);
    }
}
