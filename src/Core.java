package logic;

public class Core {
    private Reader reader;
    private Parser parser;
    private Printer printer;

    private	Core(){
        reader = new Reader();
        parser = new Parser();
        printer = new Printer();
    }
    public static Core create()
    {
        return new Core();
    }

    public void start()
    {
        try {

            System.out.println("Please enter calculations in the format: '3+5,6-3' or 'II*V,X/II' \n");
            String str = reader.read();
            if(parser.parserString(str))
                printer.print(parser.getOperation());

        }
        catch(IllegalArgumentException ex ) {
            System.out.println(ex);
        }
    }
}
