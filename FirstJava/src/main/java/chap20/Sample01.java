package chap20;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Sample01 {

    public static void main(String[] args) {
        Document document;
        try {
            document = Jsoup.connect("https://www.namgarambooks.co.kr/category/출간 도서 소개").get();
            Elements elements = (Elements) document.select("#container #content #searchList ol li a");
            elements.stream()
                    .forEach(name -> System.out.println(name.text()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
