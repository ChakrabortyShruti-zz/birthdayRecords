public enum Gender {
    Female,
    Male;

    @Override
    public String toString() {
        if(this.name().equals("Female"))
            return "Ms.";
        return "Mr.";
    }
}
