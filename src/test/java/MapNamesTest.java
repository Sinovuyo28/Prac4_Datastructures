import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MapNamesTest {

    @Before
    public void setUp() throws Exception {

        MapNames map =  new MapNames();
    }


    @Test
    public void heroNames() {

        MapNames map =  new MapNames();
        String names = map.heroNames();

        Assert.assertEquals("The first struggle hero is :", "Bantu Stephen Biko",names);
    }
}