import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Created by Redmal on 1/17/2019.
 */
public class Day4 {

    public static void main(String[] args) throws IOException {
        String html = "<html><head><title>Sample Redmal Title</title></head>"
                + "<body>"
                + "<p>First Content</p>"
                + "<div id='firstDiv'><a href='www.google.com'>Google</a>"
                + "<h3><a>Redmal Header</a><h3>"
                +"</div>"
                +"</body></html>";

        Document document = Jsoup.parse(html);

        //a w/ href
        Element link = document.select("a").first();

        //head element w/ title
        Element link2 = document.select("head").first();

        System.out.println("Outer html: " + link.outerHtml());
        System.out.println("Inner html: " + link.html() + "\n");

        System.out.println("Outer html: " + link2.outerHtml());
        System.out.println("Inner html: " + link2.html());
    }
}
