import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    @Test
    public void testShouldGiveTheFirstNameFirstWithAppropriatePrefixForWoman() throws Exception {
        Name name1 = new Name("Sanjita","Das");
        String age1 = "22";
        Gender gender1 = Gender.Female;
        Address address1 = new Address("Kolkata", "West-Bengal", "India");
        Person p1 = new Person(name1,gender1,age1,address1);

        Name name2 = new Name("Sanjit","Das");
        String age2 = "22";
        Gender gender2 = Gender.Male;
        Address address2 = new Address("Kolkata", "West-Bengal", "India");
        Person p2 = new Person(name2,gender2,age2,address2);

        Name name3 = new Name("Sangita","Das");
        String age3 = "22";
        Gender gender3 = Gender.Female;
        Address address3 = new Address("Kolkata", "West-Bengal", "India");
        Person p3 = new Person(name3,gender3,age3,address3);

        ArrayList<Person> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);
        assertEquals("Ms. Sanjita Das" + "\n" + "Mr. Sanjit Das" + "\n" + "Ms. Sangita Das", detail.getNameRepresentations("--firstLast"));
    }

    @Test
    public void testShouldGiveTheNameWithCountry() throws Exception {
        Name name1 = new Name("Sanjita","Das");
        String age1 = "22";
        Gender gender1 = Gender.Female;
        Address address1 = new Address("Kolkata", "West-Bengal", "India");
        Person p1 = new Person(name1,gender1,age1,address1);

        Name name2 = new Name("Sanjit","Das");
        String age2 = "22";
        Gender gender2 = Gender.Male;
        Address address2 = new Address("Kolkata", "West-Bengal", "India");
        Person p2 = new Person(name2,gender2,age2,address2);

        Name name3 = new Name("Sangita","Das");
        String age3 = "22";
        Gender gender3 = Gender.Female;
        Address address3 = new Address("Kolkata", "West-Bengal", "Uk");
        Person p3 = new Person(name3,gender3,age3,address3);

        ArrayList<Person> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);
        detail.getNamesWithAddress("last-first", "Uk");
        assertEquals("Ms. Das,Sangita,Uk", detail.getNamesWithAddress("last-first", "Uk"));

        assertEquals("Ms. Sanjita Das,India" + "\n" + "Mr. Sanjit Das,India", detail.getNamesWithAddress("--firstLast", "India"));
    }

    @Test
    public void testShouldGiveTheLastNameFirstWithAppropriatePrefixForWoman() throws Exception {
        Name name1 = new Name("Sanjita","Das");
        String age1 = "22";
        Gender gender1 = Gender.Female;
        Address address1 = new Address("Kolkata", "West-Bengal", "India");
        Person p1 = new Person(name1,gender1,age1,address1);

        Name name2 = new Name("Sanjit","Das");
        String age2 = "22";
        Gender gender2 = Gender.Male;
        Address address2 = new Address("Kolkata", "West-Bengal", "India");
        Person p2 = new Person(name2,gender2,age2,address2);

        Name name3 = new Name("Sangita","Das");
        String age3 = "22";
        Gender gender3 = Gender.Female;
        Address address3 = new Address("Kolkata", "West-Bengal", "India");
        Person p3 = new Person(name3,gender3,age3,address3);

        ArrayList<Person> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);

        assertEquals("Ms. Das,Sanjita" + "\n" + "Mr. Das,Sanjit" + "\n" + "Ms. Das,Sangita", detail.getNameRepresentations("--lastFirst"));
    }


    @Test
    public void testShouldGiveTheNameWithCountryInFormalFormat() throws Exception {
        Name name1 = new Name("Sanjita","Das");
        String age1 = "22";
        Gender gender1 = Gender.Female;
        Address address1 = new Address("Kolkata", "West-Bengal", "Pakistan");
        Person p1 = new Person(name1,gender1,age1,address1);

        Name name2 = new Name("Sanjit","Das");
        String age2 = "22";
        Gender gender2 = Gender.Male;
        Address address2 = new Address("Kolkata", "West-Bengal", "India");
        Person p2 = new Person(name2,gender2,age2,address2);

        Name name3 = new Name("Sangita","Das");
        String age3 = "22";
        Gender gender3 = Gender.Female;
        Address address3 = new Address("Kolkata", "West-Bengal", "Uk");
        Person p3 = new Person(name3,gender3,age3,address3);
        ArrayList<Person> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);
        assertEquals("Ms. Das,Sanjita,Pakistan", detail.getNamesWithAddress("--lastFirst", "Pakistan"));
    }

    @Test
    public void testShouldGiveTheNameWithCountryInCasualFormat() throws Exception {
        Name name1 = new Name("Sanjita","Das");
        String age1 = "22";
        Gender gender1 = Gender.Female;
        Address address1 = new Address("Kolkata", "West-Bengal", "India");
        Person p1 = new Person(name1,gender1,age1,address1);

        Name name2 = new Name("Sanjit","Das");
        String age2 = "22";
        Gender gender2 = Gender.Male;
        Address address2 = new Address("Kolkata", "West-Bengal", "India");
        Person p2 = new Person(name2,gender2,age2,address2);

        Name name3 = new Name("Sangita","Das");
        String age3 = "22";
        Gender gender3 = Gender.Female;
        Address address3 = new Address("Kolkata", "West-Bengal", "Uk");
        Person p3 = new Person(name3,gender3,age3,address3);

        ArrayList<Person> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);

        assertEquals("Ms. Sanjita Das,India\nMr. Sanjit Das,India", detail.getNamesWithAddress("--firstLast", "India"));
    }
}
