import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void testShouldGiveFirstNameFirst() throws Exception {
        Name jack = new Name("Jack", "Joe", "M");
        assertEquals("Mr. Jack Joe",jack.firsttNameFirst());
    }

    @Test
    public void testShouldGiveLasttNameFirst() throws Exception {
        Name jack = new Name("Jack", "Joe", "M");
        assertEquals("Mr. Joe,Jack",jack.firstNameLast());
    }
}
