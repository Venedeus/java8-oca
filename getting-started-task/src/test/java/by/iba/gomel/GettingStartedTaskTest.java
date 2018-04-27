package by.iba.gomel;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class GettingStartedTaskTest {
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	

	@Test
	public void testMain() {
		GettingStartedTask.main(new String[] {});
		Assert.assertEquals("Yauheni Shviatsou string should be in system out", "Yauheni Shviatsou", this.log.getLog() );	
	}
}
