package com.master.og2012;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MatchesActivity extends ListActivity {

	// Atributos de clase
	static final Match[] MATCHES = new Match[] { new Match("spa", "gbr",
			"Sanchez_Pizjuan") };

	/**
	 * Es el método que se ejecuta cuando la Activity empiece a ejecutarse por
	 * primera vez
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		// Definimos el layout o lienzo que mostrará nuestra Activity
		// setContentView(R.layout.matches);

		setListAdapter(new MatchesArrayAdapter(this, MATCHES));

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		// Creamos el objeto intent para realizar la llamada.
		Intent activityOG2012 = new Intent(MatchesActivity.this, MapStadiumActivity.class);

		activityOG2012.putExtra("stadium", "Sanchez_Pizjuan");

		// Realizamos la llamada y cerramos esta actividad.
		startActivity(activityOG2012);
		finish();

	}

}
