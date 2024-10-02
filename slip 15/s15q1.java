
import java.util.*;
class slip15
{
    public static void main(String arg[])
    {
        LinkedList t1=new LinkedList();
        t1.add("Apple");
        t1.add("Banana");
        t1.add("Grapes");
        t1.add("Orange");
        ListIterator it=t1.listIterator(t1.size());
        System.out.println("Fruits Names : ");
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
}




