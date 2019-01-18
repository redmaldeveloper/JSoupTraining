import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Redmal on 1/17/2019.
 */



public class Day4_c {

    public static void main(String[] args) throws IOException {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a id='googleA' href='www.google.com'>Google</a></div>"
                + "<div class='comments'><a href='www.sample1.com'>Sample1</a>"
                + "<a href='www.sample2.com'>Sample2</a>"
                + "<a href='www.sample3.com'>Sample3</a><div>"
                +"</div>"
                + "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
                + "<img name='yahoo' src='yahoo.jpg' />"
                +"</div>"
                +"</body></html>";

        Document document = Jsoup.parse(html);

        //Set attribute and text
        Element link = document.getElementById("googleA");
        System.out.println("Outer HTML before modification: " + link.outerHtml());
        link.attr("href", "www.yahoo.com");
        link.text("Yahoo");
        System.out.println("Outer HTML after modification: " + link.outerHtml() + "\n\n");

        //Add a class
        Element div = document.getElementById("sampleDiv");
        System.out.println("Outer HTML before modification: " + div.outerHtml());
        div.addClass("header");
        System.out.println("Outer HTML after modification: " + div.outerHtml() + "\n\n");

        //Remove a class
        Element div1 = document.getElementById("imageDiv");
        System.out.println("Outer HTML before modification: " + div1.outerHtml());
        div1.removeClass("header");
        System.out.println("Outer HTML after modification: " + div1.outerHtml() + "\n\n");

        //Bulk update
        Elements links = document.select("div.comments a");
        System.out.println("Outer HTML before modification: " + links.outerHtml());
        links.attr("rel", "nofollow");
        System.out.println("Outer HTML after modification: " + links.outerHtml());

        //Variation bulk update w/ loop
        Elements links1 = document.select("a[href]");
        for (Element myLinks : links1){
            myLinks.attr("rel", "nofollow");
            System.out.println("Updated: " + myLinks.outerHtml());
        }
    }
}
