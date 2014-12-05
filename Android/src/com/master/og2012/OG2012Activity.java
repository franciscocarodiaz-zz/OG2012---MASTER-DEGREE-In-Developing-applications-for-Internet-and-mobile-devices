package com.master.og2012;



import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OG2012Activity extends Activity {
	
    /** Es el método que se ejecuta cuando la Activity empiece a ejecutarse por primera vez */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        //Definimos el layout o lienzo que mostrará nuestra Activity
        setContentView(R.layout.main);
        
      //Inicializamos la BD con algunos datos
		inicializarUsuarios();
		inicializarStadiums();
        
      //Primero tenemos que recoger los elementos creados en main.xml
        final Button entrar = (Button) findViewById(R.id.ButtonEnterMain1);
        final Button salir = (Button) findViewById(R.id.ButtonExitMain1);
        final EditText usuario = (EditText)findViewById(R.id.EditTextDialogMainUser);
    	final EditText password = (EditText)findViewById(R.id.EditTextDialogMainPass);
        
      //Agregamos a cada botón un evento click para cuando se produzca su pulsación.
        entrar.setOnClickListener(new OnClickListener() {
			
			/** Se llama a este método cuando se produzca el click en el botón.
			 * 
			 * @param v Será el View clickeado, en nuestro caso, un Button.
			 */
			public void onClick(View v) {
				
				String user = usuario.getText().toString();
				String pass = password.getText().toString();
				
				//Comprobamos que se ha escrito el usuario y la contraseña
				if(user.length()>0 && pass.length()>0){
					
					//Comprobamos el usario.
					if(doLogin(user, pass)){
						
						Toast.makeText(OG2012Activity.this, "Bienvenido " + user,
								Toast.LENGTH_SHORT).show();
						
						//Lanzamos la siguiente actividad para entrar en la aplicación
						fireActivityIndex_og2012();
						
					}else{
						
						Toast.makeText(OG2012Activity.this, "Credenciales inválidas",
								Toast.LENGTH_SHORT).show();
						
					}
					
				}
				else{
					
					Toast.makeText(OG2012Activity.this, "Por favor introduzca algún valor en el nombre de usuario y la contraseña",
							Toast.LENGTH_SHORT).show();
				}
				
				
				
			}
		});
        
        
        salir.setOnClickListener(new OnClickListener(){
			
			/** Se llama a este método cuando se produzca el click en el botón.
			 * 
			 * @param v Será el View clickeado, en nuestro caso, un Button.
			 */
			public void onClick(View v) {
				finish();
			}
		});
        
        
        
        
        
    }
    
  //Funciones auxiliares
    
    //Inicialización datos usuarios
    private void inicializarUsuarios(){
    	
    	// TODO Hay que controlar que no se inserten datos ya existentes
    	
    	BaseDatosCurso ayudanteBD = new BaseDatosCurso(OG2012Activity.this);
		ayudanteBD.abre();
		ayudanteBD.nuevoUsuario("admin", "negro");
		ayudanteBD.cierra();
    	
    }
    
    
    
    //Inicialización datos estadios
    private void inicializarStadiums(){
    	
    	BaseDatosCurso ayudanteBD = new BaseDatosCurso(OG2012Activity.this);
		ayudanteBD.abre();
    	
    	boolean ins1 = true;
    	boolean ins2 = true;
    	boolean ins3 = true;
    	
    	//Sevilla
    	int latitudE6 = (int) (37.38264 * 1e6);
        int longitudE6 = (int) (-5.996295 *  1e6);
        ins1 = ayudanteBD.nuevoStadium("Sanchez_Pizjuan",latitudE6,longitudE6);
         
        //Barcelona
        latitudE6 = (int) (41.35 * 1e6);
	  	longitudE6 = (int) (2.33 * 1e6);
	  	ins2 = ayudanteBD.nuevoStadium("Camp_Nou",latitudE6,longitudE6);
        
	  	
	 	//Madrid
		latitudE6 = (int) (40.24 * 1e6);
		longitudE6 = (int) (-3.7 * 1e6);
		ins3 = ayudanteBD.nuevoStadium("Santiago_Bernabeu",latitudE6,longitudE6);
		
		
		if( ins1 && ins2 && ins3){
			
			Toast.makeText(OG2012Activity.this, "Estadios inicializadas en BD correctamente", Toast.LENGTH_LONG).show();
			
		}else{
			
			// TODO Hay que controlar que no se inserten datos ya existentes
			
		}
		
		ayudanteBD.cierra();
    	
    }
    
    
    
    //Método que llama a la nueva actividad de los deportes.
	 
   private void fireActivityIndex_og2012(){
   	
   	//Creamos el objeto intent para realizar la llamada.
   	Intent activityIndex_og2012 = new Intent(OG2012Activity.this, Index_og2012.class);
   	//Realizamos la llamada y cerramos esta actividad.
   	startActivity(activityIndex_og2012);
   	finish();
   }
   
   
   
   /**Método que comprueba el login de usuario en la BD local.
    * 
    * @param usuario Usuario de la aplicación.
    * @param password Contraseña del usuario.
    * @return true si el login es correcto
    */
   private boolean doLogin(String usuario, String password){
	   
	   boolean ret = false;
	   
		// Creamos nuestro objeto base de datos y abrimos la base de datos.
		BaseDatosCurso ayudanteBD = new BaseDatosCurso(OG2012Activity.this);
		ayudanteBD.abre();
		// Hacemos la peticion sql a la base de datos, que nos devuelve un
		// cursor
		// con los datos
		Cursor c = ayudanteBD.compruebaUsuario(usuario);

		//Si hay al menos una fila (si hay, es una porque el usuario es PK) en la BD que contenga al usuario...
		if( c.getCount() != 0 ){
			
			c.moveToFirst();
			
			//Comprobamos si el password del usuario es correcto
			ret = (c.getString(1).equals(password));
			
		}
		
		c.close();
		ayudanteBD.cierra();
		

		return ret;
   	
   }
   
    
}