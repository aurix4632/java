import java.util.*;
class collections
{
    public static void main(String arg[])
    {
        List t1=new LinkedList();
        t1.add("Apple");
        t1.add("Banana");
        t1.add("Grapes");
        t1.add("Orange");
        ListIterator it=t1.listIterator();
        System.out.println("Fruits Names : ");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}


