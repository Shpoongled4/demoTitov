public class Signs {
    static String result;

    public static String calculated(
            String str1,
            String str2,
            char sig) {
        switch (sig) {
            case '+':
                System.out.println("\"" + str1.concat(str2) + "\"");
                break;
            case '-':
                if (str1.contains(str2)) {
                    String[] str3 = str1.split(str2);
                    for (String paf : str3) {
                        System.out.println("\"" + paf + "\"");
                    }
                } else {
                    System.out.println("\"" + str1 + "\"");
                }
                break;
            case '*':
                System.out.println("Nelzya ymnojat string na string");
                break;
            case '/':
                System.out.println("Nelzya delit string na string");
                break;
            default:
                throw new IllegalArgumentException("Ya ne znau takoy operacii");
        }
        return result;
    }
    public static String calculated(
            String str1,
            int num1,
            char sig2) {

        switch (sig2) {
            case '+':
                System.out.println("Postavte chislo v kovichki");
                break;
            case '-':
                System.out.println("Postavte chislo v kovichki");
                break;
            case '*':
                for (int a = 0; a < num1; a++) {
                    result = result + str1;
                    result.substring(5);
                }
                break;
            case '/':
                int res1 = str1.length() / num1;
                System.out.println("\"" + str1.substring(0, res1) + "\"");
                break;
            default:
                throw new IllegalArgumentException("Ya ne znau takoy operacii");
        }
        return result;
    }

}
