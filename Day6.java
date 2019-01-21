/**
 * Created by Redmal on 1/20/2019.
 */

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;



public class Day6 {

    public static void main(String[] args) {
        String html = "<p><a href='http://example.com/'"
                    + " onClick='checkData()'>Link</a></p>";

        System.out.println("Initial HTML: " + html);
        String safeHtml = Jsoup.clean(html, Whitelist.basic());

        System.out.println("Clean HTML: " + safeHtml);
    }
}
