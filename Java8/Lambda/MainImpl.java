package Java8.Lambda;

public class MainImpl {
    public static void main(String[] args) {
        Operationable opeartion = (x,y)->y==0?0:x/y;

        int result = opeartion.calculate(15000, 100);
        System.out.println(result);
        
    }
}
