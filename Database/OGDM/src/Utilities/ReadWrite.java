package Utilities;
import java.io.*;
import Exceptions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ReadWrite {
    static final File arch = new File("C://JDeveloper/mywork/OG2012/OGDM/log.txt");
    static int nlineas = 0;
    
    public static void writeLog(String arg) throws IOException {
    // crear un objeto de tipo archivo
    DataOutputStream archivo = null;
    
    try {
    // Creando archivo
    FileOutputStream flujo = new FileOutputStream(arch,true);
    archivo = new DataOutputStream(flujo);
    Date fec = new Date ();
    // grabando al archivo
        while(nlineas<10){
            archivo.writeUTF(" ("+ nlineas++ + ")-" + fec.toString() + "-->" + arg + "\n");
        }
    archivo.close();
        
    }
    catch(FileNotFoundException fnfe){
    System.out.println("Archivo no encontrado");
    }
    catch (IOException ioe) {
    System.out.println("Error de escritura");}
    }
}
