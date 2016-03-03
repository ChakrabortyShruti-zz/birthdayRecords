import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    @Test
    public void testShouldGiveTheLastNameFirstWithAppropriatePrefixForMan() throws Exception {
        Person sanjit = new Person("Sanjit", "Das", 22, "M", "Kolkata", "WestBengal", "India");
        assertEquals("Mr. Das,Sanjit", sanjit.StylePrefered("last-first"));
    }

    @Test
    public void testShouldGiveTheFirstNameFirstWithAppropriatePrefixForMan() throws Exception {
        Person sanjit = new Person("Sanjit", "Das", 22, "M", "Kolkata", "WestBengal", "India");
        assertEquals("Mr. Sanjit Das", sanjit.StylePrefered("first-last"));
    }

    @Test
    public void testShouldGiveTheFirstNameFirstWithAppropriatePrefixForWoman() throws Exception {
        Person sanjita = new Person("Sanjita", "Das", 22, "F", "Kolkata", "WestBengal", "India");
        assertEquals("Ms. Sanjita Das", sanjita.StylePrefered("first-last"));
    }

    @Test
    public void testShouldGiveTheLastNameFirstWithAppropriatePrefixForWoman() throws Exception {
        Person sanjita = new Person("Sanjita", "Das", 22, "F", "Kolkata", "WestBengal", "India");
        assertEquals("Ms. Das,Sanjita", sanjita.StylePrefered("last-first"));
    }

    @Test
    public void testShouldGiveTheNameWithCountry() throws Exception {
        Person sanjita = new Person("Sanjita", "Das", 22, "F", "Kolkata", "WestBengal", "India");
        assertEquals("Ms. Das,Sanjita", sanjita.StylePrefered("last-first"));
    }
}
