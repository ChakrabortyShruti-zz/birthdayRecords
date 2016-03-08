import java.io.IOException;
import java.util.ArrayList;

public class PrintLabels {
    private static Guests guests;

    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile(args[1]);
        ArrayList<Person> record = file.getStructuredFile();
        guests = new Guests(record);
        if (args.length == 2)
                System.out.println(guests.getName(args[0]));
        if (args.length == 3)
            System.out.println(guests.getNamesWithAddress(args[0], args[2]));
        else
            System.out.println(guests.getNameWithAge(args[0], args[2], args[3]));
    }
}
