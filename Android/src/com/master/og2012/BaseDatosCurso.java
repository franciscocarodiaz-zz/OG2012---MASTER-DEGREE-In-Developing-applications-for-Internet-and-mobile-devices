package com.master.og2012;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/** 
 * Clase que implementa una base de datos donde se guardaran las configuraciones del programa.
 */
public class BaseDatosCurso {

	/**
	 * Constantes que nos ayudarï¿½n en el uso de la BD.
	 */
	private static final String NOMBRE_BASEDATOS = "baseDatosCurso";
	private static final int VERSION_BASEDATOS = 4;
	
	private static final String CREAR_TABLA_USUARIOS = "create table tablaUsuarios (usuario text primary key not null, password text not null);";
	private static final String CREAR_TABLA_STADIUM = "create table tablaStadium (stadium text primary key not null, latitud integer not null, longitud integer not null);";
	
	private static final String TABLA_USUARIOS = "tablaUsuarios";
	private static final String TABLA_STADIUM = "tablaStadium";
	
	public static final String CLAVE_USUARIO = "usuario";
	public static final String CLAVE_PASSWORD = "password";
	public static final String CLAVE_STADIUM = "stadium";
	public static final String CLAVE_LATITUD = "latitud";
	public static final String CLAVE_LONGITUD = "longitud";
	
	/**
     * Variable que guarda el objeto que accede a la base de datos.
     */
	private DataBaseHelper mAyudanteBD;
	
	/**
	* Variable que guarda la base de datos en sï¿½.
	*/
	private SQLiteDatabase mBd;
	
	/**
	* Contexto donde se usarï¿½ la base de datos.
	*/
	private final Context mContexto;
	
	/**
	 * Implementaciï¿½n de la clase DataBaseHelper.
	 */
	private static class DataBaseHelper extends SQLiteOpenHelper{
		
		/** Mï¿½todo constructor de la clase, llamamos a la clase padre para que cree el objeto.
		*
		* @param context Contexto donde se usarï¿½ la base de datos.
		*/
		DataBaseHelper(Context context) {
			super(context, NOMBRE_BASEDATOS, null, VERSION_BASEDATOS);
		}
		
		/** Mï¿½todo que se ejecuta cuando es necesario crear la base de datos desde 0.
		* 
		* @param db Base de datos.
		*/
		@Override
		public void onCreate(SQLiteDatabase db) {
			
			//Creamos las tablas en la base de datos.
			db.execSQL(CREAR_TABLA_USUARIOS);
			db.execSQL(CREAR_TABLA_STADIUM);
			
		}
		
		/** Mï¿½todo que se ejcuta cuando es necesario actualizar la base de datos
		*
		* @param db  Base de datos.
		* @param oldVersion Versiï¿½n anterior.
		* @param newVersion Versiï¿½n nueva.
		*/
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			//Borramos las tablas de la base de datos y creamos nuevas desde 0.
			db.execSQL("DROP TABLE IF EXISTS tablaUsuarios");
			db.execSQL("DROP TABLE IF EXISTS tablaStadium");
            onCreate(db);
		}
	}
	
	/** Mï¿½todo que crea un objeto de esta clase.
	*
	* @param ctx Contexto donde se usarï¿½ la base de datos
	*/
	public BaseDatosCurso(Context ctx) {
		
        mContexto = ctx;
    }
	
	/** Mï¿½todo que se usa para abrir el acceso a la base de datos.
	*
	* @throws SQLException Si ha habido algï¿½n error al abrir la base de datos.
	*
	* @return la base de datos.
	*/
	public BaseDatosCurso abre() throws SQLException {
		
		//Creamos el ayudante de acceso para la base de datos.
    	mAyudanteBD = new DataBaseHelper(mContexto);
		//Creamos la variable para la base de datos.
        mBd = mAyudanteBD.getWritableDatabase();
        return this;
    }
	
	/** Mï¿½todo que cierra la base de datos.
	*
	*/
	public void cierra(){
		
    	mAyudanteBD.close();
	}
	
	/** Mï¿½todo que crea un nuevo usuario en la BD.
	*
	* @param usuario Usuario a aï¿½adir.
	* @param password Contraseï¿½a del usuario en el servidor SOAP.
	*
	* @return Si se ha conseguido aï¿½adir al usuario.
	*/
	public boolean nuevoUsuario(String usuario, String password){
		
		ContentValues valoresIniciales = new ContentValues();
		valoresIniciales.put(CLAVE_USUARIO, usuario);
		valoresIniciales.put(CLAVE_PASSWORD, password);
		
		return mBd.insert(TABLA_USUARIOS, null, valoresIniciales)>0;
	}
	
	/** Mï¿½todo que comprueba si un usuario estï¿½ en la base de datos y lo devuelve.
	*
	* @param usuario Usuario a comprobar.
	*
	* @return Un cursor que tiene guardados los datos del usuario.
	*/
	public Cursor compruebaUsuario(String usuario){
		
		return mBd.query(TABLA_USUARIOS, new String[]{CLAVE_USUARIO,CLAVE_PASSWORD}, CLAVE_USUARIO + "='"+ usuario +"'", null, null, null, null);
	}
	
	/** Mï¿½todo que actualiza la contraseï¿½a de un usuario
	*
	* @param usuario Usuario a aï¿½adir.
	* @param password Contraseï¿½a del usuario en el servidor SOAP.
	*
	* @return Si la contraseï¿½a ha sido actualizada.
	*/
	public boolean actualizaPass(String usuario, String password){
		
		ContentValues valores = new ContentValues();
		valores.put(CLAVE_PASSWORD, password);
		
		return mBd.update(TABLA_USUARIOS, valores, CLAVE_USUARIO + "='"+ usuario +"'", null) > 0;
	}
	
	
	
	
	
	/** Método que crea un nuevo estadio en la BD.
	*
	* @param stadium Estadio a añadir.
	* @param latitud Latitud de la ubicación del estadio.
	* @param longitud Longitud de la ubicación del estadio.
	*
	* @return Si se ha conseguido añadir al estadio.
	*/
	public boolean nuevoStadium(String stadium, Integer latitud, Integer longitud){
		
		ContentValues valoresIniciales = new ContentValues();
		
		valoresIniciales.put(CLAVE_STADIUM, stadium);
		valoresIniciales.put(CLAVE_LATITUD, latitud);
		valoresIniciales.put(CLAVE_LONGITUD, longitud);
		
		return mBd.insert(TABLA_STADIUM, null, valoresIniciales)>0;
		
	}
	
	/**Método que recoge los lugares de un estadio.
	*
	* @param estadio Estadio sobre el que se recogerán sus lugares.
	*
	* @return Un cursor con los lugares de estadio.
	*/
	public Cursor recogeLugaresEstadio(String stadium){
		
		return mBd.query(TABLA_STADIUM, new String[]{CLAVE_STADIUM,CLAVE_LATITUD,CLAVE_LONGITUD}, CLAVE_STADIUM + "='" + stadium +"'", null, null, null, null);
		
	}
	
	
	
}
