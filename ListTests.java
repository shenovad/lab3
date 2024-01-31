import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests {
    
    @Test
    public void testFilter(){
        List<String> newList = new ArrayList<>();

        newList.add("apple");
        newList.add("banana");
        newList.add("orange");

        List<String> tester = ListExamples.filter(newList, "b");
        assertArrayEquals(new String []{"banana"}, tester);
    }

    @Test 
    public void testMerge(){

    }
}
