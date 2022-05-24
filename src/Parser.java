package logic;
import java.util.ArrayList;

import commons.Converter;
import interfaces.ArithmeticOperation;

public class Parser {

    private ArrayList<ArithmeticOperation> operations;
    private String oprt = "";
    private int indx = 0;

    public Parser()
    {
        this.operations = new ArrayList<ArithmeticOperation>();
    }

    public ArrayList<ArithmeticOperation> getOperation()
    {
        return operations;
    }

    public boolean parserString(String str) throws IllegalArgumentException {
//Оставляем только арабские или только римские
        String [] strArr =  str.split(",");
        boolean isRoman = true, isArabic = true;

        for (String item : strArr) {

            if(parseOperator(item)) {
                String a = item.substring(0, indx);
                String b = item.substring(indx + 1, item.length());

                if(isRoman && Converter.isRoman(a) && Converter.isRoman(b)) {
                    operations.add(new logic.RomanNumerals(Converter.romanToInt(a), Converter.romanToInt(b), oprt));
                    isArabic = false;
                }
                else if(isArabic && Converter.isConvertibleToInt(a) && Converter.isConvertibleToInt(b)) {
                    operations.add(new logic.ArabicNumerals(Converter.stringToInt(a), Converter.stringToInt(b), oprt));
                    isRoman = false;
                }
                else {
                    throw new IllegalArgumentException("The inserted string should contain only roman or only arabic numerals !");
                }
            }
        }
        return true;
    }
// Оставляем только =-*/
    private boolean parseOperator(String str) throws IllegalArgumentException {
        if(str.contains("*")) {
            indx = str.indexOf("*");
            oprt = "*";
        }
        else if(str.contains("/")) {
            indx = str.indexOf("/");
            oprt = "/";
        }
        else if(str.contains("+")) {
            indx = str.indexOf("+");
            oprt = "+";
        }
        else if(str.contains("-")) {
            indx = str.indexOf("-");
            oprt = "-";
        }
        else {
            throw new IllegalArgumentException("The inserted string was not in correct format !");
        }
        return true;
    }
}
