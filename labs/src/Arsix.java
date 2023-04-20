import java.util.ArrayList;
import java.util.List;

public class Arsix {

    private int size;
    List<Integer> numbers = new ArrayList<>();

    Arsix(int size) {
        this.size = size;


        for (int i = 1; i <= 6; i++ ){

            int n = (int)(Math.random()*49)+1;

            numbers.add(n);
            //System.out.println(numbers.get(i));

        }

    }



}


