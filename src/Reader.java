/**
 * Исключение в случае пустоты
 */
package logic;

import java.util.Scanner;

public class Reader {

    public String read() throws IllegalArgumentException {
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            return in.nextLine();
        }
        catch(Exception ex ) {
            throw new IllegalArgumentException("There was some problems of reading line from the console !");
        }
        finally {
            in.close();
        }
    }

}
