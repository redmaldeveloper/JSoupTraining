/**
 * Created by Redmal on 1/13/2019.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Day2 {
    private static int counter = 0;

    public static void main(String[] args) throws IOException {
        String url = "http://yahoo.com/";
        Document document = Jsoup.connect(url).get();

        Elements paragraphs = document.getElementsByTag("p");
        TestRun: for (Element paragraph : paragraphs){
            System.out.println((counter+1) + " " + paragraph);
            counter += 1;
            if(counter==10){
                break TestRun;
            }
        }
    }
}
