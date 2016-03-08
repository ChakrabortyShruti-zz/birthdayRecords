import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GuestsTest {
    private ArrayList<Person> invitees = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        Name name1 = new Name("Sanjita", "Das");
        String age1 = "32";
        Gender gender1 = Gender.Female;
        Address address1 = new Address("Kolkata", "West-Bengal", "India");
        Person p1 = new Person(name1, gender1, age1, address1);

        Name name2 = new Name("Sanjit", "Das");
        String age2 = "22";
        Gender gender2 = Gender.Male;
        Address address2 = new Address("Kolkata", "West-Bengal", "India");
        Person p2 = new Person(name2, gender2, age2, address2);

        Name name3 = new Name("Sangita", "Das");
        String age3 = "22";
        Gender gender3 = Gender.Female;
        Address address3 = new Address("Kolkata", "West-Bengal", "America");
        Person p3 = new Person(name3, gender3, age3, address3);

        invitees.add(p1);
        invitees.add(p2);
        invitees.add(p3);
    }

    @Test
    public void testGetNameToGetTheNameInFirstLastFormat() throws Exception {
        Guests detail = new Guests(invitees);
        assertEquals("Ms. Sanjita Das" + "\n" + "Mr. Sanjit Das" + "\n" + "Ms. Sangita Das", detail.getName("--firstLast"));
    }

    @Test
    public void testGetNameShouldRepresentNameInLastFirstFormat() throws Exception {
        Guests detail = new Guests(invitees);
        assertEquals("Ms. Das,Sanjita" + "\n" + "Mr. Das,Sanjit" + "\n" + "Ms. Das,Sangita", detail.getName("--lastFirst"));
    }

    @Test
    public void testGetNameWithAddressShouldRepresentNameWithCountryInFirstLastFormat() throws Exception {
        Guests detail = new Guests(invitees);
        assertEquals("Ms. Sanjita Das,India" + "\n" + "Mr. Sanjit Das,India", detail.getNamesWithAddress("--firstLast","India"));
    }

    @Test
    public void testGetNameWithAddressShouldRepresentNameWithCountryInLastFirstFormat() throws Exception {
        Guests detail = new Guests(invitees);
        assertEquals("Ms. Das,Sanjita,India" + "\n" + "Mr. Das,Sanjit,India", detail.getNamesWithAddress("--lastFirst","India"));
    }

    @Test
    public void testGetNameWithAgeShouldRepresentNameWithCountryAndAgeInFirstLastFormat() throws Exception {
        Guests detail = new Guests(invitees);
        assertEquals("Ms. Das,Sanjita,India,32" + "\n" + "Mr. Das,Sanjit,India,22", detail.getNameWithAge("--lastFirst","India","22"));
    }

    @Test
    public void testGetNameWithAgeShouldRepresentNameWithCountryAndAgeInLastFirstFormat() throws Exception {
        Guests detail = new Guests(invitees);
        assertEquals("Ms. Sanjita Das,India,32" + "\n" + "Mr. Sanjit Das,India,22", detail.getNameWithAge("--firstLast","India","22"));
    }
}