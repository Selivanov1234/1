package GBJava;

import GBJava.Exception.MyArrayDataException;

import java.util.Arrays;

public class StringToInt {

    public void StrToInt(String[][] strings) throws MyArrayDataException {
        Integer[][] myArr = new Integer[strings[0].length][strings[1].length];
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    myArr[i][j] = Integer.parseInt(strings[i][j].trim());
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("MADE - not a number: \nits address is here: " + Arrays.deepToString(myArr) +
                            " the symbol or word: " + strings[i][j]);

                }
                System.out.println("Элементы массива: " + myArr[i][j] + "\t");
            }
                System.out.println();
            }
            for (int k = 0; k < myArr.length; k++) {
                for (int l = 0; l < myArr[k].length; l++) {
                    sum += myArr[k][l];
                }
            }
            System.out.println("Сумма: " + sum);
        }
    }
