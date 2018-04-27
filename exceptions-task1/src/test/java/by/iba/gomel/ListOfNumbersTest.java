/**
 *
 */
package by.iba.gomel;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for testing ListOfNumbers class.
 */
public class ListOfNumbersTest {
    /**
     * Instance of testing class.
     */
    ListOfNumbers list;
    /**
     * File to be read.
     */
    String        inFile;
    /**
     * File to be written.
     */
    String        outFile;

    /**
     * Test method for {@link by.iba.gomel.ListOfNumbers#getListNum()}.
     */
    @Test
    public void testGetListNum() {
        Assert.assertEquals("Method getListNum", 10, this.list.getListNum().size());
    }

    /**
     * Pretest initialization.
     */
    @Before
    @Test
    public void testInit() {
        this.list = new ListOfNumbers();
        this.inFile = "InFile.txt";
        this.outFile = "OutFile.txt";
    }

    /**
     * Test method for {@link by.iba.gomel.ListOfNumbers#ListOfNumbers()}.
     */
    @Test
    public void testListOfNumbers() {
        Assert.assertNotNull("Instance creation failed.", this.list);
    }

    /**
     * Test method for {@link by.iba.gomel.ListOfNumbers#readList(java.lang.String)}.
     */
    @Test
    public void testReadList() {
        Assert.assertEquals("Method readFile() failed.", 17,
                this.list.readList(this.inFile).size());
    }

    /**
     * Test method for {@link by.iba.gomel.ListOfNumbers#toString()}.
     */
    @Test
    public void testToString() {
        Assert.assertEquals("Method toString() failed.", "ListOfNumbers contains 10 elements.",
                this.list.toString());
    }

    /**
     * Test method for {@link by.iba.gomel.ListOfNumbers#writeList(java.lang.String)}.
     */
    @Test
    public void testWriteList() throws IOException {
        Assert.assertTrue("Method writeListOfNumbers() failed.", this.list.writeList(this.outFile));
    }

}
