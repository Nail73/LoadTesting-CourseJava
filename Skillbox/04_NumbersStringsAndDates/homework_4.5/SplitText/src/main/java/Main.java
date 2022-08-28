public class Main {

  public static void main(String[] args) {
    String text = "Although London and Liverpool were spared the harshest Tier 3 in small glimmers of light, just 700,000 people - one per cent of the population - will be subject to the loosest grade of restrictions. Meanwhile, around 55million residents will be in the toughest two levels after the blanket national lockdown ends on December 2, according to the breakdown released today. Tier 3 will be brought in for huge swathes of the country including the bulk of the North, much of the Midlands, all of Kent, and Bristol - putting a wrecking ball through pubs, restaurants and clubs now forced to close except for takeaway. Only Cornwall, Scilly and the Isle of Wight have been put into the loosest Tier 1, which allows socialising inside homes and pubs subject to the Rule of Six. As a result most of England will be banned from mixing indoors with other households, apart from five days over Christmas. Pubs in Tier 2 will only be able to serve alcohol with 'substantial' meals.";
    System.out.println(text);
  }

  public static String splitTextInToWords(String text) {
    String myText = text.replaceAll("[;\\-,.\\s0-9]", " ");
    // String myText = text.replaceAll("[\\p{Punct}0-9]", " ");
    String[] arrayText = myText.split(" ");
    String returnText = "";

    for (int i = 0; i < arrayText.length; i++) {
      if (!arrayText[i].equals("")) {
        returnText = returnText + arrayText[i] + "\n";
      }
    }
    return returnText.trim();
  }
}


