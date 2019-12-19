package Scripts;

import org.testng.annotations.Test;


import Generic.BaseTest1;
import POM.actitime_enter_timetrack_private;
import POM.actitime_login_private;

public class actitime_logout extends BaseTest1
{
	@Test
	public void loginscript()
	{	
	actitime_login_private ob=new actitime_login_private(driver);
	ob.setusername("admin");
	ob.setpassword("manager");
	ob.clicklogin();
	actitime_enter_timetrack_private ob1=new actitime_enter_timetrack_private(driver);
	ob1.element_visibility(ob1.getlogout());
	}
	
}
