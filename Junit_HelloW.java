import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Junit_HelloW {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}