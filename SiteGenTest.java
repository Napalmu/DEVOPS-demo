import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiteGenTest {

    @Test
    public void testHtmlString() {
        String correctHtml = "<html><head><title>My favorite movies</title></head><body><h1>My favorite movies</h1><ul><li>Star Wars</li><li>Star Trek</li><li>Battlestar Galactica</li></ul></body></html>";
        Assertions.assertEquals(correctHtml, SiteGen.htmlString);
    }

}

