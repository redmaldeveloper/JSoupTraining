/**
 * Created by Redmal on 1/13/2019.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class Day2 {

    public static void main(String[] args) throws IOException {
        String url = "http://yahoo.com/";
        Document document = Jsoup.connect(url).get();

        System.out.println("Title: " + document.title());
        System.out.println("Head: " + document.head());
    }
}
