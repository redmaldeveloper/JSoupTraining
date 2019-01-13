import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String html = "<div><p>This is a paragraph</p>"
                        + "<p>This is also a paragraph</p>";

        Document document = Jsoup.parseBodyFragment(html);

        Element body = document.body();

        Elements paragraphs = body.getElementsByTag("p");

        for (Element paragraph : paragraphs){
            System.out.println("Paragraph line: " + paragraph);
            System.out.println("Text only: " + paragraph.text());
        }

    }
}
