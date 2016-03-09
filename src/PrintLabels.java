import java.io.IOException;

public class PrintLabels {

    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile(args[1]);
        String guestDetail = file.getFileContent();
        DataStructure records = new DataStructure(guestDetail);
        Guests guests = new Guests(records.getData());
        if (args.length == 2)
            System.out.println(guests.getName(args[0]));
        if (args.length == 3)
            System.out.println(guests.getNamesWithAddress(args[0], args[2]));
        else
            System.out.println(guests.getNameWithAge(args[0], args[2], args[3]));
    }
}
