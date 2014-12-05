package com.master.og2012;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Index_og2012 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		//Definimos el layout o lienzo que mostrará nuestra Activity
        setContentView(R.layout.index_og2012);
        
      //Primero tenemos que recoger los botones creados en index_og2012.xml
        final Button salir = (Button) findViewById(R.id.ButtonExitIndexOg20121);
        final ImageButton bSoccer = (ImageButton) findViewById(R.id.imageButton4);
        
		// Agregamos a cada botón un evento click para cuando se produzca su
		// pulsación.
		salir.setOnClickListener(new OnClickListener() {

			/**
			 * Se llama a este método cuando se produzca el click en el botón.
			 * 
			 * @param v
			 * Será el View clickeado, en nuestro caso, un Button.
			 */
			public void onClick(View v) {
				finish();
			}
		});
		
		
		bSoccer.setOnClickListener(new OnClickListener() {

			/**
			 * Se llama a este método cuando se produzca el click en el botón.
			 * 
			 * @param v
			 * Será el View clickeado, en nuestro caso, un Button.
			 */
			public void onClick(View v) {
				fireActivity(IndexSoccerActivity.class);
			}
		});
		

	}
	
	@Override
	public void onBackPressed() {

		//Creamos el objeto intent para realizar la llamada.
	   	Intent activityOG2012 = new Intent(Index_og2012.this, OG2012Activity.class);
	   	//Realizamos la llamada y cerramos esta actividad.
	   	startActivity(activityOG2012);
	   	finish();
		
	    return;
	}

	
	
	
	//Funciones auxiliares
    
    
		 //Método que llama a la nueva actividad del deporte elegido.
		 
	   private void fireActivity(Class<?> cls){
	   	
	   	//Creamos el objeto intent para realizar la llamada.
	   	Intent activityIndex_og2012 = new Intent(Index_og2012.this, cls);
	   	//Realizamos la llamada y cerramos esta actividad.
	   	startActivity(activityIndex_og2012);
	   	finish();
	   }
	

}
