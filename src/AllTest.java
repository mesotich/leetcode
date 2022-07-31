import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses({ZeroTest.class,NotTargetTest.class,SameTest.class,BigDataTests.class})
@RunWith(Suite.class)
public class AllTest {


}
