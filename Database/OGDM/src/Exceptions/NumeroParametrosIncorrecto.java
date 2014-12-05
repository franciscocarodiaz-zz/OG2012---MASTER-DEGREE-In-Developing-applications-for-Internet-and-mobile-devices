package Exceptions;
import java.io.*;

public class NumeroParametrosIncorrecto extends ArrayIndexOutOfBoundsException {
    public NumeroParametrosIncorrecto(String string) {
        super(string);
    }

    public NumeroParametrosIncorrecto(int i) {
        super(i);
    }

    public NumeroParametrosIncorrecto() {
        super("NumeroParametrosIncorrectos");
    }
}
