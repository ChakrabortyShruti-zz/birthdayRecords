public enum Gender {
    Female("Ms."),
    Male("Mr.");

    private final String honorific;

    Gender(String honorific) {
        this.honorific = honorific;
    }

    @Override
    public String toString() {
        return honorific;
    }
}
