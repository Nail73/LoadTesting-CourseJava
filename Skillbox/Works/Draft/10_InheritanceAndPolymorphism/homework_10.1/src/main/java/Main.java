public class Main {

  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount();
    CardAccount cardAccount = new CardAccount();
    DepositAccount depositAccount = new DepositAccount();

    BankAccount first = new BankAccount();
    BankAccount second = new BankAccount();

    first.put(1000);
    second.put(500);
    System.out.println("Баланс счета first: " + first.getAmount());
    System.out.println("Баланс счета second: " + second.getAmount());

    first.send(second, 100);

    System.out.println("Баланс счета first после перевода: " + first.getAmount());
    System.out.println();

    bankAccount.put(1000);
    System.out.println("Средства на банковском счете: " + bankAccount.getAmount());
    bankAccount.take(500);
    System.out.println("Средства на банковском счете после списания: " + bankAccount.getAmount());
    bankAccount.put(-100);
    bankAccount.take(5000);
    System.out.println("Средства на банковском счете: " + bankAccount.getAmount());
    System.out.println();

    cardAccount.put(700);
    System.out.println("Средства на карточном счете: " + cardAccount.getAmount());
    cardAccount.take(300);
    System.out.println("Средства на карточном счете после списания: " + cardAccount.getAmount());
    cardAccount.put(-100);
    cardAccount.take(5000);
    System.out.println("Средства на карточном счете: " + cardAccount.getAmount());
    System.out.println();

    depositAccount.put(300);
    System.out.println("Средства на депозитном счете: " + depositAccount.getAmount());
    depositAccount.take(100);
    System.out
        .println("Средства на депозитном счете после списания: " + depositAccount.getAmount());
    depositAccount.put(-100);
    depositAccount.take(5000);
    System.out.println("Средства на депозитном счете: " + depositAccount.getAmount());
    System.out.println();
  }
}
