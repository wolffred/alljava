import java.util.ArrayList;
import java.util.List;

public class Arr {
    private int size;
    List<Integer> numbers = new ArrayList<>();

    Arr(int size) {
        this.size = size;


        for (int i = 1; i <= size; i++ ){


            numbers.add(i);
            //System.out.println(numbers.get(i));

        }

    }



}
