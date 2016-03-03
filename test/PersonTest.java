import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    @Test
    public void testShouldGiveTheFirstNameFirstWithAppropriatePrefixForWoman() throws Exception {
        HashMap<Object, Object> p1 = new HashMap<>();
        p1.put("FirstName", "Sanjita");
        p1.put("LastName", "Das");
        p1.put("Age", 22);
        p1.put("Gender", "F");
        p1.put("City", "Kolkata");
        p1.put("State", "West-Bengal");
        p1.put("Country", "India");

        HashMap<Object, Object> p2 = new HashMap<>();
        p2.put("FirstName", "Sanjit");
        p2.put("LastName", "Das");
        p2.put("Age", 22);
        p2.put("Gender", "M");
        p2.put("City", "Kolkata");
        p2.put("State", "West-Bengal");
        p2.put("Country", "India");

        HashMap<Object, Object> p3 = new HashMap<>();
        p3.put("FirstName", "Sangita");
        p3.put("LastName", "Das");
        p3.put("Age", 22);
        p3.put("Gender", "F");
        p3.put("City", "Kolkata");
        p3.put("State", "Paris");
        p3.put("Country", "Uk");

        ArrayList<Object> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);

        detail.getNameRepresentations("first-last");
        assertEquals("Ms. Sanjita Das"+"\n"+"Mr. Sanjit Das"+"\n"+"Ms. Sangita Das", detail.toString());
    }

    @Test
    public void testShouldGiveTheLastNameFirstWithAppropriatePrefixForWoman() throws Exception {
        HashMap<Object, Object> p1 = new HashMap<>();
        p1.put("FirstName", "Sanjita");
        p1.put("LastName", "Das");
        p1.put("Age", 22);
        p1.put("Gender", "F");
        p1.put("City", "Kolkata");
        p1.put("State", "West-Bengal");
        p1.put("Country", "India");

        HashMap<Object, Object> p2 = new HashMap<>();
        p2.put("FirstName", "Sanjit");
        p2.put("LastName", "Das");
        p2.put("Age", 22);
        p2.put("Gender", "M");
        p2.put("City", "Kolkata");
        p2.put("State", "West-Bengal");
        p2.put("Country", "India");

        HashMap<Object, Object> p3 = new HashMap<>();
        p3.put("FirstName", "Sangita");
        p3.put("LastName", "Das");
        p3.put("Age", 22);
        p3.put("Gender", "F");
        p3.put("City", "Kolkata");
        p3.put("State", "Paris");
        p3.put("Country", "Uk");

        ArrayList<Object> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);

        detail.getNameRepresentations("last-first");
        assertEquals("Ms. Das,Sanjita" + "\n" + "Mr. Das,Sanjit" + "\n" + "Ms. Das,Sangita", detail.toString());
    }


    @Test
    public void testShouldGiveTheNameWithCountryInFormalFormat() throws Exception {
        HashMap<Object, Object> p1 = new HashMap<>();
        p1.put("FirstName", "Sanjita");
        p1.put("LastName", "Das");
        p1.put("Age", 22);
        p1.put("Gender", "F");
        p1.put("City", "Kolkata");
        p1.put("State", "Karachi");
        p1.put("Country", "Pakistan");

        HashMap<Object, Object> p2 = new HashMap<>();
        p2.put("FirstName", "Sanjit");
        p2.put("LastName", "Das");
        p2.put("Age", 22);
        p2.put("Gender", "M");
        p2.put("City", "Kolkata");
        p2.put("State", "West-Bengal");
        p2.put("Country", "India");

        HashMap<Object, Object> p3 = new HashMap<>();
        p3.put("FirstName", "Sangita");
        p3.put("LastName", "Das");
        p3.put("Age", 22);
        p3.put("Gender", "F");
        p3.put("City", "Kolkata");
        p3.put("State", "Paris");
        p3.put("Country", "Uk");

        ArrayList<Object> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);
        detail.getNamesWithAddress("last-first", "Pakistan");
        assertEquals("Ms. Das,Sanjita,Pakistan", detail.toString());
    }
    @Test
    public void testShouldGiveTheNameWithCountry() throws Exception {
        HashMap<Object, Object> p1 = new HashMap<>();
        p1.put("FirstName", "Sanjita");
        p1.put("LastName", "Das");
        p1.put("Age", 22);
        p1.put("Gender", "F");
        p1.put("City", "Kolkata");
        p1.put("State", "West-Bengal");
        p1.put("Country", "India");

        HashMap<Object, Object> p2 = new HashMap<>();
        p2.put("FirstName", "Sanjit");
        p2.put("LastName", "Das");
        p2.put("Age", 22);
        p2.put("Gender", "M");
        p2.put("City", "Kolkata");
        p2.put("State", "West-Bengal");
        p2.put("Country", "India");

        HashMap<Object, Object> p3 = new HashMap<>();
        p3.put("FirstName", "Sangita");
        p3.put("LastName", "Das");
        p3.put("Age", 22);
        p3.put("Gender", "F");
        p3.put("City", "Kolkata");
        p3.put("State", "Paris");
        p3.put("Country", "Uk");

        ArrayList<Object> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);
        detail.getNamesWithAddress("last-first", "Uk");
        assertEquals("Ms. Das,Sangita,Uk", detail.toString());

        detail.getNamesWithAddress("first-last", "India");
        assertEquals("Ms. Sanjita Das,India" + "\n" + "Mr. Sanjit Das,India", detail.toString());
    }

    @Test
    public void testShouldGiveTheNameWithCountryInCasualFormat() throws Exception {
        HashMap<Object, Object> p1 = new HashMap<>();
        p1.put("FirstName", "Sanjita");
        p1.put("LastName", "Das");
        p1.put("Age", 22);
        p1.put("Gender", "F");
        p1.put("City", "Kolkata");
        p1.put("State", "West-Bengal");
        p1.put("Country", "Pakistan");

        HashMap<Object, Object> p2 = new HashMap<>();
        p2.put("FirstName", "Sanjit");
        p2.put("LastName", "Das");
        p2.put("Age", 22);
        p2.put("Gender", "M");
        p2.put("City", "Kolkata");
        p2.put("State", "West-Bengal");
        p2.put("Country", "India");

        HashMap<Object, Object> p3 = new HashMap<>();
        p3.put("FirstName", "Sangita");
        p3.put("LastName", "Das");
        p3.put("Age", 22);
        p3.put("Gender", "F");
        p3.put("City", "Kolkata");
        p3.put("State", "Paris");
        p3.put("Country", "Uk");

        ArrayList<Object> details = new ArrayList<>();
        details.add(p1);
        details.add(p2);
        details.add(p3);

        Records detail = new Records(details);

        detail.getNamesWithAddress("first-last", "India");
        assertEquals("Mr. Sanjit Das,India", detail.toString());
    }
}
