package isi.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@SuiteClasses({ countPositiveTest.class, findLastTest.class, lastZeroTest.class, oddOrPosTest.class })
public class AllTests {
	public static void main (String[] args)
    {
       junit.textui.TestRunner.run (suite());
    }
	
	public static junit.framework.Test suite()
    {
       return new JUnit4TestAdapter (AllTests.class);
    }
}
