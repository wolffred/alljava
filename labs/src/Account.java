import java.util.ArrayList;
import java.util.List;

public class Account {

    private int value;
    List<Trade> tradeObjects = new ArrayList<>();

    Account(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void loop(){
        for(int i = 0; i <= tradeObjects.size(); i++){
            System.out.println(tradeObjects.get(i));
        }
    }

    public void under(){
        for(int i = 0; i <= tradeObjects.size(); i++){
            if (tradeObjects.get(i).getPrice() < 10){
                System.out.println(tradeObjects.get(i));
            }
        }
    }


}
