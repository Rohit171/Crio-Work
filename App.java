/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
    //    Search_Amazon tests = new Search_Amazon(); // Initialize your test class
    //     tests.browserlaunch();
    //     tests.Amazon();
    //     tests.endTest();


    // Count_hyperlinks ch = new Count_hyperlinks();
    // ch.browserlaunch();
    // ch.Count_hyperlinks();
    // ch.endTest();

    Post_on_linkedin pl=new Post_on_linkedin();
    pl.browserlaunch();
    pl.Post_on_linkedin();
    pl.endTest();

    // Imdb_ratings rating = new Imdb_ratings();
    // rating.browserlaunch();
    // rating.Imdb_ratings();
    // rating.endTest();

    //  Window_handle hd = new Window_handle();
    //  hd.browserlaunch();
    //  hd.Window_handle();
    //  hd.endTest();
     
    // Frames_text ft = new Frames_text();
    // ft.browserlaunch();
    // ft.Frames_text();
    // ft.endTest();
       
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}
