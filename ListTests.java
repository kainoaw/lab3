import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
	@Test
    public void testFilter(){
        String[] a = {"AB", "BC", "CA", "DG", "AD"};
        String[] b = {"AB", "CA", "AD"};
        List<String> list = Arrays.asList(a);
        List<String> result = Arrays.asList(b);
        assertEquals(ListExamples.filter(list, new StringChecker(){
           public boolean checkString(String s){
            if (s.contains("A")){
                return true;
            }
            return false;
           }
        }), result);
    }
    @Test
    public void testMerge(){
        String[] a = {"A", "B", "F", "R"};
        String[] b = {"C", "D", "K", "W"};
        String[] c = {"A","B","C", "D","F", "K","R", "W"};
        List<String> list1 = Arrays.asList(a);
        List<String> list2 = Arrays.asList(b);
        List<String> result = Arrays.asList(c);
        assertEquals(ListExamples.merge(list1, list2), result);
    }
}