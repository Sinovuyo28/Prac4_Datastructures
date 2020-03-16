import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetNumbersTest {

    @Before
    public void setUp() throws Exception {
        SetNumbers tester = new SetNumbers();

    }



    @Test
    public void hashSetImp()
    {
        SetNumbers tester = new SetNumbers();
        tester.hashSetImp();





    }

    @Test
    public void treeSetImp() {

        SetNumbers tester = new SetNumbers();
        tester.treeSetImp();

    }
}