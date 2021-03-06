package es.iesnervion.fjruiz.a03_listas;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends ListActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        LolTeam origen=new LolTeam(0,"Origen","Peaso equipo loco",R.drawable.origen,15);
        LolTeam tsm=new LolTeam(1,"Team Solo Mid","Meh",R.drawable.tsm,18);
        LolTeam skt=new LolTeam(2,"SKT","Te reviento la vida tt",R.drawable.skt,99);
        LolTeam g2=new LolTeam(3,"Gamers2","Los Newbies",R.drawable.g2,0);
        LolTeam clg=new LolTeam(4,"Counter Logic Gaming","NPI de que equipo es",R.drawable.clg,23);


        LolTeam[] teams=new LolTeam[10005];
        for(int i=0;i<10000;i=i+5){
            teams[i]=origen;
            teams[i+1]=tsm;
            teams[i+2]=skt;
            teams[i+3]=g2;
            teams[i+4]=clg;
        }

        MyArrayAdapter a=new MyArrayAdapter(this,R.layout.fila,R.id.texto,teams);
        setListAdapter(a);

        lv=getListView();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent info=new Intent(this,info.class);
        LolTeam equipoSeleccionado=(LolTeam) this.getListAdapter().getItem(position);
        info.putExtra("equipo",equipoSeleccionado);
        startActivity(info);
    }
}
