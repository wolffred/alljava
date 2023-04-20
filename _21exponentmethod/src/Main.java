public class Main{
    public static void main(String [] args){
        System.out.println(expo(2, 3));
    }

    public static int expo(int basenum, int pownum){
        int result = 1;

        for(int i = 0; i < pownum; i++){
            result = result * basenum;
        }

        return result;

    }
}