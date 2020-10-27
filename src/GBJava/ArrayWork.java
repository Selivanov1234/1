package GBJava;

import GBJava.Exception.MyArraySizeException;

public class ArrayWork {

    public void arrSizeCheck (String [][] strings) throws MyArraySizeException {
        if (strings[0].length > 4 | strings[1].length > 4 ) {
            throw new MyArraySizeException("MASE - too many elements");
        }
    }
}
