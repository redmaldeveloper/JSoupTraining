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
        syntaxSelect();

        /*
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
        */

    }


    private static void syntaxSelect() {
        String html = "<html>"
                    + "<head><title>My Random Title</title></head>"
                    + "<body>"
                    + "<p>First Paragraph</p>"
                    + "<p>Second Paragraph</p>"
                    + "<div id='firstDiv'><a href='www.google.com'>Google</a>"
                    + "<h3><a>REDMAL Header</a><h3>"
                    + "</div>"
                    + "<div id='secondDiv' class='header'><img name='google' src='google.png' />"
                    + "<img name='yahoo' src='yahoo.jpg' />"
                    + "</div>"
                    + "</body>"
                    + "</html>";

        Document document = Jsoup.parse(html);
        Elements links = document.select("a[href]");

        for (Element link : links){
            System.out.println("Href: " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }
    }
}
