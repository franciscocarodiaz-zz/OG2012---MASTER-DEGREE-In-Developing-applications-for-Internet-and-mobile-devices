package com.master.og2012;


import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapStadiumActivity extends MapActivity  {

	
	/**
	 * Variable para el control de los overlay de mapa.
	 */
	private List<Overlay> mMapOverlays;
	
	private  MapView mMapa;
	
	private static String mStadium;
	
	/**
	 * Variable para guardar los lugares del mapa
	 */
	private LugaresOverlay listaStadiums;
	
	
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_stadium);
        
        //Obtenemos el parámetro stadium procedente de la Activity anterior
        mStadium = getIntent().getStringExtra("stadium");
        
        mMapa = (MapView)findViewById(R.id.mapa);
        
        
        //Nos creamos el controlador del mapa para configurarlo
        MapController mControlMapa = mMapa.getController();
        
        //Para centrar el mapa
        int latitudE6 = (int) (40.24 * 1e6);
		int longitudE6 = (int) (-2.42 * 1e6);
        GeoPoint centro = new GeoPoint(latitudE6, longitudE6);
        mControlMapa.setCenter(centro);
        mControlMapa.setZoom(7);
        
        
        
      //Creamos la variable de control de overlays.
        mMapOverlays = mMapa.getOverlays();
        
        
        Drawable drawable = this.getResources().getDrawable(R.drawable.city);
        listaStadiums = new LugaresOverlay(drawable, MapStadiumActivity.this);
        
        
        BaseDatosCurso ayudanteBd = new BaseDatosCurso(MapStadiumActivity.this);
        ayudanteBd.abre();
        Cursor c = ayudanteBd.recogeLugaresEstadio(mStadium);
        
        
      //Recorremos las provincias para obtener sus datos
        if(c.getCount()>0){
        	
        	//Recorremos los datos devueltos
        	c.moveToFirst();
        	              	
        	while(!c.isAfterLast()){
        		String nombreStadium = c.getString(0);
            	latitudE6 = c.getInt(1);
        		longitudE6 = c.getInt(2); 
        		listaStadiums.addOverlay(new OverlayItem(new GeoPoint(latitudE6, longitudE6), nombreStadium, nombreStadium));
        		c.moveToNext();
        	} 
        
        }        
        
        c.close();
        ayudanteBd.cierra();
      
        
        
		  
		  //Se añaden los lugares a la lista de overlays que ya tenía el mapa
			mMapOverlays.add(listaStadiums);
		  //Se refresca el mapa para que pinte todo los overlays
	    	mMapa.postInvalidate(); 
        
        
    }
	
	
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
