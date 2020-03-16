// import hashset and set class inorder to have access to the set class for data storage

import java.util.HashSet;
import  java.util.Set;
import java.util.TreeSet;

public class SetNumbers {
    // set class has two implementations hashSet and  treeSet, hashSet is the unordered set of data in other words it doesn't
    // matter when you add a number/word when you run the program it will not be in order

    public void   hashSetImp(){
    Set<Integer> hashSet = new HashSet<>();
        hashSet.add(20);
        hashSet.add(96);
        hashSet.add(952);
        hashSet.add(120);
        System.out.println('\n'+"This is the HashSet implementation");
        for (int element :hashSet){
        System.out.println(element+ " ");
    }}

    public int treeSetImp(){
    Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(96);
        treeSet.add(952);
         treeSet.add(120);

        System.out.println('\n'+"This is the tree implementation");

        for (int inorderNum : treeSet){
        System.out.println(inorderNum+ " ");

    }
    return 96;
    }


}
