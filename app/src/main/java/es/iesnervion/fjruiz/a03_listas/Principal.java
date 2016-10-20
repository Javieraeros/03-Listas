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
        LolTeam tsm=new LolTeam(1,"Team Solo Mid","Meh",R.drawable.tsm,18);
        LolTeam skt=new LolTeam(2,"SKT","Te reviento la vida tt",R.drawable.skt,99);
        LolTeam g2=new LolTeam(3,"Gamers2","Los Newbies",R.drawable.g2,0);
        LolTeam clg=new LolTeam(4,"Counter Logic Gaming","NPI de que equipo es",R.drawable.clg,23);


        LolTeam[] teams=new LolTeam[]{origen,tsm,skt,skt,g2,clg};


        MyArrayAdapter a=new MyArrayAdapter(this,R.layout.fila,R.id.texto,teams);
        setListAdapter(a);
    }
}
