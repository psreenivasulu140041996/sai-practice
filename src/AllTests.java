import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ addTest.class, squareTest.class })
public class AllTests {

}
