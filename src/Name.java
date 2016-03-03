public class Name implements Title {
    private Object firstName;
    private Object lastName;
    private Object gender;


    public Name(Object firstName, Object lastName, Object gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Object firstNameFirst() {
        return assignTitle() + " " + firstName + " " + lastName;
    }

    public Object firstNameLast() {
        return assignTitle() + " " + lastName + "," + firstName;
    }

    @Override
    public Object assignTitle() {
        if (gender.equals("M")) {
            return "Mr.";
        }
        return "Ms.";
    }
}
