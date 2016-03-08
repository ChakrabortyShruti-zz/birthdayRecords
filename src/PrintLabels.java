import java.io.IOException;
import java.util.ArrayList;

public class PrintLabels {
    private static Records guests;
    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile(args[1]);
        ArrayList<Person> record = file.getStructuredFile();
        guests = new Records(record);
        if(args.length == 2)
            getName(args[0]);
        getNameWithCountry(args[0],args[2]);
    }

    private static void getNameWithCountry(String arg, String arg1) {
        System.out.println(guests.getNamesWithAddress(arg,arg1));
    }

    public static void getName(String opt){
        System.out.println(guests.getNameRepresentations(opt));
    }
}
