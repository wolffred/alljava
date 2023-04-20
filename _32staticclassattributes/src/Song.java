public class Song {
    private String title;
    private int length;
    private static int songsCount = 0;

    Song(String title, int length){
        this.title = title;
        this.length = length;
        songsCount++;
        System.out.println("Songs count = " + songsCount);
    }

    public int getSongsCount(){
        return songsCount;
    }
}
