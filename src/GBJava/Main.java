package GBJava;

import GBJava.Exception.MyArrayDataException;
import GBJava.Exception.MyArraySizeException;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arr =
                {{"1", "2", "3", "4"},
                        {"5", "new", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}};

        ArrayWork aw = new ArrayWork();
        try {
            aw.arrSizeCheck(arr);
        } catch (MyArraySizeException o) {
            o.printStackTrace();
            System.out.println("The size is larger than needed!");
        }
        StringToInt sti = new StringToInt();
        try {
            sti.StrToInt(arr);
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println("Not a number!");
        }

    }
}