package es.iesnervion.fjruiz.a03_listas;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Documentación TODO
 */

public class MyArrayAdapter extends ArrayAdapter {
    public MyArrayAdapter(Context context, int resource,int textViewResourceID, Object[] objects) {
        super(context, resource,textViewResourceID, objects);
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent){
        //Sin view holder
        /*View v=super.getView(position,convertView,parent);
        TextView txt=(TextView) v.findViewById(R.id.texto);
        ImageView icon=(ImageView) v.findViewById(R.id.icon);
        LolTeam p=(LolTeam) getItem(position);

        txt.setText(p.getName());
        icon.setImageResource(p.getIcon());*/

        View v=convertView;
        ViewHolder holder;

        LolTeam equipo=(LolTeam) getItem(position);

        if(v==null) {

            v=super.getView(position,convertView,parent);
            TextView txt=(TextView) v.findViewById(R.id.texto);
            ImageView icon=(ImageView) v.findViewById(R.id.icon);

            holder=new ViewHolder(v,R.id.texto,R.id.icon);
            v.setTag(holder);
        }else {
            holder=(ViewHolder) v.getTag();
        }
        holder.getLab().setText(equipo.getName());
        holder.getImg().setImageResource(equipo.getIcon());
        return v;
    }

}
