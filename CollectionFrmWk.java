import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class CollectionFrmWk {
public static void main(){

    ArrayList<Integer> arr =new ArrayList<>();                     // ArrayList--->Concrete class
    List<Integer> list =new ArrayList<>();
   // Collection<Integer> collection = new ArrayList<>();

    arr.add(5);
    arr.add(7);
    System.out.println(arr);
    arr.add(9);
    System.out.println(arr);
    arr.remove(0);
    System.out.println(arr);
    list.add(5);
    list.add(9);

   // arr.addAll(list);                                     //concatenate 2 arraylist
    list.addAll(arr);
     System.out.println(arr.size());                            
            System.out.println(list);
            System.out.println();



//to traverse list using iterator
Iterator<Integer> iter = arr.iterator();
while(iter.hasNext()){
    System.out.println("element= " + iter.next());
}

List<Integer> list1= new ArrayList<>();
list1.add(56);
list1.add(85);
list1.add(22);
list1.add(12);
System.out.println(list1.get(1));
list1.set(1,10);
System.out.println(list1.get(1));
System.out.println(list1);

Object[] array = list1.toArray();                                                                    //to convert to array
for(Object obj: array){
    System.out.println(obj);
}

System.out.println(list1.contains(56));                         //to check any item present

ArrayList<String> list2 =new ArrayList<>();
list2.add("ram");
list2.add("aam");
list2.add("maan");
Collections.sort(list2);                            //to asc sort
System.out.println(list2);

Collections.sort(list2, Collections.reverseOrder());            //to des sort
System.out.println(list2);

ArrayList<Integer> newlist =(ArrayList<Integer>)arr.clone();                //clone
System.out.println(newlist);



// arraylist aur linkedlist ke saare methods same hai clone ko chod kar ,,,,linkedlist mai lastindexof() method extra hota hai 
LinkedList<Integer> ll= new LinkedList<>();
ll.add(5);
ll.addFirst(13);
ll.addLast(56);
System.out.println(ll.peek());                  //return 1st element/head
System.out.println(ll.poll());                  //return and remove the head element
System.out.println(ll.offer(25));               //almost same as addLast()
System.out.println(ll);
}
}
