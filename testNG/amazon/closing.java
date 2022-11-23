package amazon;

import org.testng.annotations.AfterTest;

public class closing extends count {
  
  @AfterTest
  public void closing_window() {
	  d.close();
  }
}
