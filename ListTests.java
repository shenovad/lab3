import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ListTests {
    
    @Test
    public void testFilter(){
        // String [] testList = {"apple", "banana","peach"};
        List<String> newList = new ArrayList<>();

        ListExamples.filter(testList, "peach");
        assertArrayEquals();
    }

    @Test 
    public void testMerge(){

    }
}
