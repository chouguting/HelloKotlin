import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(50);
        list.add(-5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(100);
        list.add(0);
        System.out.println(list);
        for(int i = list.size()-1;i>=0;i--){
            for(int j = 0;j<i;j++){
                if(list.get(j)>list.get(j+1)){
                    Collections.swap(list, j, j+1);
                }
            }
        }
        System.out.println(list);

    }
}
