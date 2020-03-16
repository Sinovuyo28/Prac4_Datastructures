import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.*;

public class ListInterfaceTest {



    @Test
    public void myList() {
        ListInterface testing = new ListInterface();
        List<String> colours = new ArrayList<String>();

        colours.add("Blue");
        colours.add("Pink");
        colours.add("Purple");
        colours.add("Brown");
        colours.add("Black");

       /* String element1 = colours.get(0);
        String element2 = colours.get(1);
        assertEquals("Blue",element1);
        assertEquals("Pink", element2);
       assertThat(myList(), hasItem("Blue") );*/

        assertThat(colours,hasItem("Purple"));
        assertThat(colours,hasItem("Pink"));
        assertThat(colours,hasItem("Blue"));
        assertThat(colours,hasItem("Brown"));
        assertThat(colours,hasItem("Black"));

    }
}