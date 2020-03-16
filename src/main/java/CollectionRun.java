import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class CollectionRun {

    public static void main (String [] args){

        CollectionRun run = new CollectionRun();
        run.insertNamesToStack();


       SetNumbers set = new SetNumbers();
       set.hashSetImp();
       set.treeSetImp();


       MapNames map = new MapNames();
       map.heroNames();

       ListInterface list = new ListInterface();
       list.myList();

    }

    public String insertNamesToStack () {

        Stack<String> stack = new Stack<String>();
        stack.push("Luvuyo ");
        stack.push("Mandisa ");
        stack.push("Sinovuyo ");
        stack.push("Bulelani ");
        stack.push("Sibahle ");
        //stack.pop();

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        return (String) stack.get(0);
    }
    }



