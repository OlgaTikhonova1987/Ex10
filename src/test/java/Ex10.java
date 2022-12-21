import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Ex10 {
    @Test
    public void test101() {
        int symbolsCount = 15;
        String testVar = "TestTestTestTes";
        Boolean boolTest = (testVar.length() > symbolsCount) ? Boolean.TRUE : Boolean.FALSE;
        System.out.println("The length = " + testVar.length());
        assertEquals(Boolean.TRUE, boolTest, "Text is not longer than " + symbolsCount +  " symbols");
    }
}
