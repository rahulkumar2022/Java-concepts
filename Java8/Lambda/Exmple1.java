package Java8.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exmple1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T","rfv","adg","Afre","hfc","gft");
        System.out.println(sort(list));
    }
    public static List<String> sort(List<String> list){
        Collections.sort(list, (a, b) -> b.compareTo(a));
        return list;
    }
}
