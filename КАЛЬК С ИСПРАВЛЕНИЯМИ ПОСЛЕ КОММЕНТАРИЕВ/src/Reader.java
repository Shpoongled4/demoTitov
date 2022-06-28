import java.util.Scanner;

public class Reader {
    public static String read() throws IllegalAccessException {
        Scanner in = null; /**Присваиваем null, чтобы отрабатывал один цикл */
        try {
            in = new Scanner(System.in); /** System.in - для считывания с консоли*/
            return in.nextLine();        /** Присваиваем введенную строку*/
        } catch (Exception ex) {         /** В ином случае выбрасываем исключение*/
            throw new IllegalAccessException("There was some problems of reading line from the console !");
        } finally {
            in.close();                  /**Закрываем ресурс сканнера*/
        }
    }
}
