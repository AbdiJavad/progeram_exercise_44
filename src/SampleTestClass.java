import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class SampleTestClass {

    @Test
    public void testString() {

        String testString = "my test test ali";

        assertTrue(16 == testString.length());
        assertTrue('y' == testString.charAt(1));
        //assertTrue("stt" == testString.substring(5, 9));
        assertTrue(13 == testString.indexOf("ali"));

    }


}
