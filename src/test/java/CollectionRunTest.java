import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CollectionRunTest {


    @Test
    public void insertNamesToStack() {

        CollectionRun collect = new CollectionRun();

      String fam =  collect.insertNamesToStack();

        Assert.assertEquals("The name at the bottom of the stack is: ", "Luvuyo ", fam);
    }
}