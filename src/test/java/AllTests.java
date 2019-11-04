import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value =
        {
                TestVetex.class,
                TestEdge.class
        })
public class AllTests
{
    // empty
}
