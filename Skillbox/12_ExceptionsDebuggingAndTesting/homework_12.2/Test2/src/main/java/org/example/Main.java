package org.example;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.logging.Level;
import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) throws Exception {

        int randomNumber = (int) (1000 - (Math.random() * 1000));

        LogManager.getLogManager().reset();

        String url = "http://numbersapi.com/#" + randomNumber + "/trivia";
        System.out.println("Loading page now-----------------------------------------------: " + url);

        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        HtmlPage page = webClient.getPage(url);
        webClient.waitForBackgroundJavaScript(30 * 1000);
        String pageAsXml = page.asXml();

        Document doc = Jsoup.parse(pageAsXml, url);
        Elements pngs = doc.select("#result-temporary-text");
        System.out.println(pngs.text());
    }

}
