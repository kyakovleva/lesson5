import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class FirstClass {
    private Logger logger = LogManager.getLogger(FirstClass.class);
    ///WebDriver driver;
    ///private config

//       public void setUp(){
//           WebDriverManager.chr       }

    @Test
    public void testLog(){
           logger.warn("Warn");
           logger.info("Info");

    }

//    @Test
//    public void openOtus(){
//           driver.get("https://otus.ru/");
//    }
}
