package Exceptions;

import java.io.FileNotFoundException;

public class ArchivoNoexiste extends FileNotFoundException{
    public ArchivoNoexiste() {
        super("ArchivoNoexiste");
    }
}
