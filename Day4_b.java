/**
 * Created by Redmal on 1/17/2019.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Day4_b {

    public static void main(String[] args) throws IOException {

        String url = "https://www.yahoo.com";

        Document document = Jsoup.connect(url).get();

        Element link = document.select("a").first();

        System.out.println("Relative Link: " + link.attr("href"));
        System.out.println("Absolute Link: " + link.attr("abs:href"));
        System.out.println("Absolute Link: " + link.absUrl("href"));


    }
}
