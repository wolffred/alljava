public class Book {
    String title;
    private String rating;

    Book(String title, String rating){
        this.title = title;
        this.rating = rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getRating(){
        return rating;
    }
}
