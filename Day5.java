/**
 * Created by Redmal on 1/18/2019.
 */


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Day5 {

    public static void main(String[] args) throws IOException {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<div id='sampleDiv'><a id='googleA' href='www.google.com'>Google</a></div>"
                +"</body></html>";

        Document document = Jsoup.parse(html);

        Element div = document.getElementById("sampleDiv");

        System.out.println("Outer HTML before Mod: \n" + div.outerHtml());
        div.text("This is some sample content.");

        System.out.println("Outer HTML after Mod: \n" + div.outerHtml());

        //prepend and append text
        div.prepend("Initial text.");
        div.append("End text.");

        System.out.println("\n" + div.outerHtml());
    }

}
