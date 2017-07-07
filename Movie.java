/**
 * Created by chand on 7/7/2017.
 */
public class Movie {
    private String title;
    private String category;

    public Movie(){

    }
    public Movie(String title, String category){
        this.title = title;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie: " + title;
    }
}
