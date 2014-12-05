package Utilities;

import Exceptions.NumeroParametrosIncorrecto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaFichDefineEx {
    static String input_file = null;
    static String output_file = null;
    public static void compruebaParametros(String[] array) throws NumeroParametrosIncorrecto{
    if (array.length < 2)
        throw new NumeroParametrosIncorrecto();
    input_file = array[0];
    output_file = array[1];
    }
    public static void main (String[] args) {
    int byte_count = 0;
    byte[] buffer = new byte[512];
    FileInputStream fin;
    FileOutputStream fout;
    try {
    compruebaParametros(args);
    fin = new FileInputStream(input_file);
    fout = new FileOutputStream(output_file);
    int bytes_in_one_read;
    while ((bytes_in_one_read = fin.read(buffer)) != -1) {
    fout.write(buffer, 0, bytes_in_one_read);
    byte_count += bytes_in_one_read;
    }
    }
    catch (NumeroParametrosIncorrecto e) {
    System.out.println(
    "Sintaxis: java CopiaFichDefineEx [archivo_entrada][archivo_salida]");
    }
    catch (FileNotFoundException e) {
    System.out.println("No se puede abrir: " + input_file);
    }
    catch (IOException e) {
    System.out.println("!Se produjo una excepción E/S!");
    e.printStackTrace();} 
    finally {
if (byte_count > 0)
System.out.println(byte_count + " bytes escritos");
}
}
}