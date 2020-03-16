import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListInterface {

    public void myList() {

        List<String> colours = new ArrayList<String>();

        colours.add("Blue");
        colours.add("Pink");
        colours.add("Purple");
        colours.add("Brown");
        colours.add("Black");
        // colours.add(new Integer(320));

        System.out.println('\n');

        Iterator<String> iterator = colours.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);

        }
    }
      /* for(Object next : colours){

            System.out.println(colours);
        }*/
      public void insertNamesToStack () {

          Stack<String> stack = new Stack<String>();
          stack.push("Luvuyo Louis May");
          stack.push("Mandisa Cynthia May");
          stack.push("Sinovuyo May");
          stack.push("Bulelani May");
          stack.push("Sibahle Imange May");
          stack.pop();

          Iterator<String> itr = stack.iterator();
          while (itr.hasNext()) {
              System.out.println(itr.next());
          }
      }


    }
