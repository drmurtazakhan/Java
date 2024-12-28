import java.util.*;

public class TestEnumeration {

    public static void main(String[] args){

        LinkedList list = new LinkedList();

        for(int i = 0; i < 6; i++)
            list.add(new Integer(i));

        Enumeration listEnumerator = Collections.enumeration(list);

        while(listEnumerator.hasMoreElements())
            System.out.print(listEnumerator.nextElement() + " ");

        System.out.println();

        System.out.println(list);
    }
}
