package denominator.designate;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import denominator.BaseReadOnlyLiveTest;

@Test
public class DesignateReadOnlyLiveTest extends BaseReadOnlyLiveTest {

  @BeforeClass
  private void setUp() {
    manager = new DesignateConnection().manager;
  }
}
