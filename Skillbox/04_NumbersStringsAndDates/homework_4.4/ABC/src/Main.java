public class Main {

  public static void main(String[] args) {
    String e = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
    for (char c : e.toCharArray()) {
      int code = (int) c;
      System.out.format("\t%04X ", code);
    }
    System.out.println();
    String r = "а,б,в,г,д,е,ё,ж,з,и,й,к,л,м,н,о,п,р,с,т,у,ф,х,ц,ч,ш,ъ,ы,ь,э,ю,я";
    for (char c : r.toCharArray()) {
      int code = (int) c;
      System.out.format("\t%04X ", code);
    }
    System.out.println("\n");
    for (char i = 'a'; i <= 'z'; i++) {
      int c = i;
      System.out.println("Код буквы: " + i + " равен - " + c);
    }

    System.out.println("\n");
    for (char x = 'а'; x <= 'я'; x++) {
      int c = x;
      System.out.println("Код буквы: " + x + " равен - " + c);

    }
  }
}