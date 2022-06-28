public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        /**ВАЖНО! Я много переписывал логику калькулятора, по итогу остался 1 баг, который я не знаю как убрать.
         Если внутри стринга стоит какой либо знак, программа берет его для вычисления и не отрабатывает
         (пример: "Bye-bye!"), но без знака "-" работает.*/
        System.out.println("Vvedite [\"a\" + \"b\" || \"a\" - \"b\" || \"a\" * x || \"a\" / x] gde a&b eto slova, x - eto cifri   +Enter");
        Parser.pars();
    }
}