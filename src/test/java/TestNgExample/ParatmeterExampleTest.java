package TestNgExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParatmeterExampleTest {

	int i=0;
  @Parameters({"username","password"})
  @Test
  public void test1(String username,String password) {
    System.out.println(++i+")"+username);
    System.out.println(++i+")"+password);
  }
}
