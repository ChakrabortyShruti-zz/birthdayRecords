public class Address {
    private Object city;
    private Object state;
    private Object country;

    public Address(Object city, Object state, Object country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Object getCountry() {
        return country;
    }
}
