
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({VoitureTest.class, ServiceTest.class, MatriceTest.class})
public class SuiteTest {
}
