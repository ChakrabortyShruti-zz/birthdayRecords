import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataStructureTest {
    @Test
    public void testSplitLineShouldSplitTheLinesWithewLineCharacter() throws Exception {
        String guestRecords = "Rodolfo,Balistreri,Male,32,Crooks ton,Georgia,Bangladesh\nJuana,Champlin,Female,26,West Shanna,Georgia,Bangladesh";
        DataStructure list = new DataStructure(guestRecords);
        assertEquals(2, list.getData().size());
    }
}