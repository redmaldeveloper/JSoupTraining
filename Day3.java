

/**
 * Created by Redmal on 1/14/2019.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Day3 {

    public static void main(String[] args) throws IOException {

        CompareAttr();

        /*
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a>"
                + "<h3><a>Sample</a><h3>"
                +"</div>"
                + "<div id='sampleDiv2'><a href='www.yahoo.com'>Yahoo</a>"
                + "<h3><a>Sample2</a><h3>"
                +"</div>"
                + "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
                + "<img name='yahoo' src='yahoo.jpg' />"
                +"</div>"
                +"</body></html>";

        Document document = Jsoup.parse(html);


        //a w/ href
        Elements links = document.select("a[href]");

        for (Element link : links){
            System.out.println("Href: " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }


        //img w/ .png src
        Elements pngs = document.select("img[src$=.png]");

        for (Element png : pngs){
            System.out.println("Name: " + png.attr("name"));
            System.out.println("Src: " + png.attr("src"));
        }


        //div w/ class=header
        Element headerDiv = document.select("div.header").first();
        System.out.println("Header Div ID: " + headerDiv.id());


        //div --multiple
        Elements listDivs = document.select("div");

        for (Element divs : listDivs){
            System.out.println("ID: " + divs.id());
        }


        //direct a after h3
        Elements sampleLinks = document.select("h3 > a");

        for (Element link : sampleLinks){
            System.out.println("Text: " + link.text());
        }
        */
    }


    public static void CompareAttr(){
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a>"
                + "<h3><a>Sample</a><h3>"
                +"</div>"
                +"</body></html>";

        String html2 = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<h3><a>SampleFirst</a><h3>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a>"
                + "<h3><a>Sample</a><h3>"
                +"</div>"
                +"</body></html>";

        Document document = Jsoup.parse(html);

        //a w/ href 1
        Element links = document.select("a[href]").first();
        System.out.println("Link 1 Test: " + links.attr("href"));

        //a w/ href 2
        Element links2 = document.select("a").first();
        System.out.println("Link 2 Test: " + links2.attr("href"));

        //a w/ href 3  - no result, test success
        Document document2 = Jsoup.parse(html2);
        Element links3 = document2.select("a").first();
        System.out.println("Link 3 Test: " + links3.attr("href"));
    }
}
