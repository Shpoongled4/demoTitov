import java.util.ArrayList;

public class Parser {
    static char operation;

    public static void pars() throws IllegalAccessException {
        String userRead = Reader.read();
        char[] limit = new char[26];
        for (
                int i = 0; i < userRead.length(); i++) {
            limit[i] = userRead.charAt(i);
            if (limit[i] == '+') {
                operation = '+';
            }
            if (limit[i] == '-') {
                operation = '-';
            }
            if (limit[i] == '*') {
                operation = '*';
            }
            if (limit[i] == '/') {
                operation = '/';
            }
        }
        String[] chast = userRead.split("[+-/*\\\"]");

        if (chast.length == 5) {
            String str1 = chast[1];
            String str2 = chast[4];
            if ((str1.length() < 11) && (str2.length() < 11)) {
                String result = Signs.calculated(str1, str2, operation);
                if (result != null) {
                    System.out.println("\"" + result.substring(4) + "\"");
                }
            } else {
                throw new IllegalArgumentException("Bolshe 10 simvolov");

            }

        } else {
            String str1 = chast[1];
            String num1 = chast[3];
            if (chast[1].length() < 11) {
                if ((chast[1].length() < 11) || (Integer.parseInt(num1) < 11)) {
                    int number = Integer.parseInt(num1.trim());
                    String result = Signs.calculated(str1, number, operation);
                    if (result != null) {
                        if (result.length() < 45) {
                            System.out.println("\"" + result.substring(4) + "\"");
                        } else {
                            System.out.println("\"" + result.substring(4, 44) + "..." + "\"");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Bolshe 10 simvolov ili cifra >10");
                }
            } else {
                throw new IllegalArgumentException("Bolshe 10 simvolov ili cifra >10");
            }
        }
    }
}