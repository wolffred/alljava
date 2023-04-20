public class Main {
    public static void main(String [] args){
        boolean isMale = false;
        boolean isTall = false;

        if(isMale && isTall){
                System.out.println("Tall Male");
        }else if(!isMale && isTall){
            System.out.println("Tall Female");
        }else if(isMale && !isTall){
            System.out.println("Short Male");
        }else{
                System.out.println("Short Female");
        }
    }
}