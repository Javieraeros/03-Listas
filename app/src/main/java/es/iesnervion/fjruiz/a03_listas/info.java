package es.iesnervion.fjruiz.a03_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import es.iesnervion.fjruiz.a03_listas.LolTeam;

public class info extends AppCompatActivity {

    LolTeam seleccionado;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        datos = getIntent().getExtras();
        seleccionado = (LolTeam) datos.getParcelable("equipo");

        TextView numerito=(TextView) findViewById(R.id.Numerito);
        numerito.setText(seleccionado.getID().toString());

        TextView informacion=(TextView) findViewById(R.id.info);
        informacion.setText(seleccionado.getInfo().toString());
    }
}
