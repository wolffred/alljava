public class Main{
    public static void main (String [] args){
        Book book1 = new Book("Harry", "PG");

        book1.title = "Potter";

        System.out.println(book1.title);

        book1.setRating("PG-13");

        System.out.println(book1.getRating() );


    }
}