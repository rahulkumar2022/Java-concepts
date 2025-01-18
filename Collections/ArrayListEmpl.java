package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ArrayListEmpl {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,8,88,66,555,3,4,9));
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numberList);
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        System.out.println(numberList);
        System.out.println(list);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
