package commons;

/**
 *
 */
public class Converter {
    public static boolean isRoman(String strParam) {
        //Проверяем входные римские цифры
        switch(strParam) {
            case "I": return true;
            case "II": return true;
            case "III": return true;
            case "IV": return true;
            case "V": return true;
            case "VI": return true;
            case "VII": return true;
            case "VIII": return true;
            case "IX": return true;
            case "X": return true;
            default: return false;
        }
    }
//Исключаем ноль и больше 10
    public static boolean isConvertibleToInt(String strParam) {
        try {
            int param = Integer.parseInt(strParam);
            if(param == 0 || param > 10) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int romanToInt(String strParam) {
        int param = 0;
        //Приравниваем Римские к Арабским
        switch(strParam) {
            case "I": param = 1; break;
            case "II": param = 2; break;
            case "III": param = 3; break;
            case "IV": param = 4; break;
            case "V": param = 5; break;
            case "VI": param = 6; break;
            case "VII": param = 7; break;
            case "VIII": param = 8; break;
            case "IX": param = 9; break;
            case "X": param = 10; break;
        }
        return param;
    }
// Приводим Арабские значения >10 к Римским
    public static String intToRoman(int param) {
        String strResult = "", strParam = intToString(param);

        if(strParam.contains("-")) {
            strResult = "-";
            strParam = strParam.substring(1, strParam.length());
        }

        switch(strParam.length()) {

            case 3:
                switch(strParam) {
                    case "100": strResult += "C";
                } break;

            case 2:
                strResult += arabicToRomanDecimal(strParam.substring(0, 1));
                strResult += arabicToRomanUnit(strParam.substring(1, strParam.length()));
                break;

            case 1:
                strResult += arabicToRomanUnit(strParam);
                break;
        }
        return strResult;
    }

    private static String arabicToRomanDecimal(String strParam) {
        String str = "";
        switch(strParam) {
            case "1": str = "X"; break;
            case "2": str = "XX"; break;
            case "3": str = "XXX"; break;
            case "4": str = "XL"; break;
            case "5": str = "L"; break;
            case "6": str = "LX"; break;
            case "7": str = "LXX"; break;
            case "8": str = "LXXX"; break;
            case "9": str = "XC"; break;
        }
        return str;
    }
// Переводим Арабские в Римские
    private static String arabicToRomanUnit(String strParam) {
        String str = "";
        switch(strParam) {
            case "1": str = "I"; break;
            case "2": str = "II"; break;
            case "3": str = "III"; break;
            case "4": str = "IV"; break;
            case "5": str = "V"; break;
            case "6": str = "VI"; break;
            case "7": str = "VII"; break;
            case "8": str = "VIII"; break;
            case "9": str = "IX"; break;
        }
        return str;
    }

    public static int stringToInt(String strParam) {
        try {
            return Integer.parseInt(strParam);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static String intToString(int param) {
        return String.format("%d", param);
    }

}