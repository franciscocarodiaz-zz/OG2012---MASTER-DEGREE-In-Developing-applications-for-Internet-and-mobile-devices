package com.master.og2012;




import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.app.ListActivity;
import android.content.Intent;
import android.widget.ListView;

public class IndexSoccerActivity extends ListActivity  {
	
	/**
	 * Constante con los strings de las opciones a mostrar en la lista.
	 */
	static final String[] OPCIONES = new String[] {"General Information", "Current Matches", "Teams", "News", "About us"};	
	
	
	/** Es el método que se ejecuta cuando la Activity empiece a ejecutarse por primera vez */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        //Definimos el layout o lienzo que mostrará nuestra Activity
        setContentView(R.layout.index_soccer);
        
        //Seteamos el contenido de la lista y el tipo de la misma
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OPCIONES));
        
    }

    
    /** Método que recibe el evento de click sobre un elemento de la lista.
	 * 
	 * @param l Es el ListView donde se produjo el click
	 * @param v Es el View dentro de la lista donde se produjo el clic.
	 * @param position Es la posicion del View dentro de la lista.
	 * @param id El id de la fila del elemento que fue clickeado.
	 */
	

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		super.onListItemClick(l, v, position, id);
		
		int i = (int)id;
		
		switch(i){
		
			// Si el usuario pulsa sobre "General info"
			case 0:
				break;
	
				
			// Si el usuario pulsa sobre "Matches"
			case 1:
				
				//Vamos hacia la Activity de Matches
				
				//Creamos el objeto intent para realizar la llamada.
			   	Intent activityMatches = new Intent(IndexSoccerActivity.this, MatchesActivity.class);
			   	
			   	//Realizamos la llamada y cerramos esta actividad.
			   	startActivity(activityMatches);
			   	
			   	finish();
				break;
				
				
			// Si el usuario pulsa sobre "Teams"
			case 2:
				break;
	
			// Si el usuario pulsa sobre "News"
			case 3:
				break;
	
			// Si el usuario pulsa sobre "About us"
			case 4:
				break;
				
		}
		
	}
	
    
}
