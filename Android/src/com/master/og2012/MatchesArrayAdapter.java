package com.master.og2012;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MatchesArrayAdapter extends ArrayAdapter<Match> {

	//Atributos de clase
	private final Context context;
	private final Match[] values;
 
	
	//Constructor
	public MatchesArrayAdapter(Context context, Match[] values) {
		
		super(context, R.layout.content_list_matches, values);
		this.context = context;
		this.values = values;
		
	}
 
	
	//Método que llamará Android cuando tenga que dibujar una View (fila de la lista)
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		//Obtenemos un inflador de Views
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		//Inflamos la view con el layout de contenido de partido
		View rowView = inflater.inflate(R.layout.content_list_matches, parent, false);
		
		//Obtenemos los objetos de la view (fila de la lista) para después rellenarlos
		ImageView imageView1 = (ImageView) rowView.findViewById(R.id.logoMatchTeam1);
		ImageView imageView2 = (ImageView) rowView.findViewById(R.id.logoMatchTeam2);
		TextView textView1 = (TextView) rowView.findViewById(R.id.labelMatchStadium);
		
		//El texto lo seteamos con el nombre del estadio donde se celebra el partido
		textView1.setText(values[position].getStadium());
 
		// Obtenemos el nombre de los dos equipos
		String sTeam1 = values[position].getTeam1();
		String sTeam2 = values[position].getTeam2();
		
		//Pintamos la bandera correspondiente del equipo 1
		if (sTeam1.equals("spa")) {
			imageView1.setImageResource(R.drawable.spa);
		} else if (sTeam1.equals("gbr")) {
			imageView1.setImageResource(R.drawable.gbr);
		}
		
		//Pintamos la bandera correspondiente del equipo 2
		if (sTeam2.equals("spa")) {
			imageView2.setImageResource(R.drawable.spa);
		} else if (sTeam2.equals("gbr")) {
			imageView2.setImageResource(R.drawable.gbr);
		}
 
		return rowView;
	}
	
}
