public class Name implements Title {
    private String firstName;
    private String lastName;
    private String gender;


    public Name(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String firsttNameFirst() {
        return assignTitle()+" "+firstName+" "+lastName;
    }

    public String firstNameLast(){
        return assignTitle()+" "+lastName+","+firstName;
    }

    @Override
    public String assignTitle() {
        if (gender.equals("M")) {
            return  "Mr.";
        }
        return "Ms.";
    }
}
