public class Trade {
    String id;
    String Symbol;
    int quantity;
    int price;

    public Trade(String id, String symbol, int quantity, int price){
        this.id = id;
        this.Symbol = Symbol;
        this.quantity = quantity;
        this.price =price;
    }

    public Trade(String id, String symbol, int quantity){
        this.id = id;
        this.Symbol = Symbol;
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String toString(){
        return this.id+":"+this.Symbol+":"+this.price+":"+this.quantity+":";
    }

}
