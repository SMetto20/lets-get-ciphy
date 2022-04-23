//import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
public class MainTest {
    @Test
    public void checkLetter_stringInput_ArrayList(){
        Main main = new Main();
        List<Character>expectedOutput = new ArrayList<Character>();
        expectedOutput.add('A');
        assertEquals(expectedOutput, main.checkLetter('a'));
    }


}