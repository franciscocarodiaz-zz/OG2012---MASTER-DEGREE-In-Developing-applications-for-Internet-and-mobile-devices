package com.master.og2012;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;


/**
* Clase que implementa una lista de Overlays que representan los lugares que el usuario a�ade a la aplicaci�n
*/
public class LugaresOverlay extends ItemizedOverlay {

	/**
	* Lista de los luigares a�adidos.
	*/
	private ArrayList<OverlayItem> mOverlays;
	
	/**
	* Contexto de la actividad donde se usa esta clase.
	*/
	private Context mContext;
	
	/** M�todo constructor de la clase.
	*
	* @param defaultMarker Es la im�gen que representar� el lugar en el mapa. 
	* @param ctxt Contexto donde se usar� la lista.
	*
	* @return Lista de overlays para a�adir lugares a un mapa.
	*/
	public LugaresOverlay(Drawable defaultMarker, Context ctxt) {
		
		//Llamamos a este m�todo para que configure el lugar donde se va a pintar la im�gen,
		//llamamos a boundCenterBottom para que lo coloque centrado desde la parte inferior del punto.
		super(boundCenterBottom(defaultMarker));
		
		//Guardamos el contexto y creamos la lista.
		mContext = ctxt;
		mOverlays = new ArrayList<OverlayItem>();
	}

	/** M�todo que lee de la lista de elementos y devuelve el overlay en la posici�n marcada.
	* 
	* @param i posici�n del overlay.
	*
	* @return El overlay pedido, null si el �ndice est� fguera de rango.
	*/
	@Override
	protected OverlayItem createItem(int i) {
		
		if(size()>0 && i<size())
			return mOverlays.get(i);
		else
			return null;
	}

	/** M�todo que devuelve el tama�o de la lista.
	*
	*/
	@Override
	public int size() {
		
		return mOverlays.size();
	}
	
	/** M�todo que add un overlay a la lista
	*
	* @param overlay El elemento que se add.
	*/
	public void addOverlay(OverlayItem overlay){
	
		//A�adimos el overlay a la lista y refrescamos la lista con populate()
		mOverlays.add(overlay);
		populate();
	}

	/** M�todo que borra toda la lista.
	*
	*/
	public void borraTodo(){
		mOverlays.clear();
	}
	
	
}
