import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenderTest {
    @Test
    public void testToGetThePrefixForMale() throws Exception {
        Gender jack = Gender.Male;
        assertEquals(jack.toString(),"Mr.");
    }

    @Test
    public void testToGetThePrefixForFemale() throws Exception {
        Gender jinnie = Gender.Female;
        assertEquals(jinnie.toString(),"Ms.");
    }
}