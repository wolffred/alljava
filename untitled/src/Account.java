import java.util.ArrayList;
import java.util.List;

public class Account {
    private double value;
    List<Trade> tradeObjects = new ArrayList<>();

    public Account() {
        this(0);
    }

    public Account(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
