package ru.mai;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JDOMProj {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.fandom.com/articles/wandavision-showrunner-doctor-strange").get();
        Elements elem = doc.select("img");
        for (Element element:elem) {
            System.out.println(element);
        }
        Elements elem2 = doc.select("p");
        for (Element element:elem2) {
            System.out.println(element);
        }
    }
}
