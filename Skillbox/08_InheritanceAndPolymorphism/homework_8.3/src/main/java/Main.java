public class Main {

  public static void main(String[] args) {

    PhysicalPerson physicalPerson = new PhysicalPerson();
    LegalPerson legalPerson = new LegalPerson();
    IndividualBusinessman individualBusinessman = new IndividualBusinessman();

    physicalPerson.put(4560);
    physicalPerson.take(560);
    System.out.println(physicalPerson.print());
    System.out.println("-------------------");

    legalPerson.put(156000);
    System.out.println(legalPerson.print());
    legalPerson.take(6000);
    System.out.println("Баланс после снятия 6000руб: " + legalPerson.getAmount());
    System.out.println("-------------------");

    individualBusinessman.put(201000);
    System.out.println(individualBusinessman.print());
    individualBusinessman.put(900);
    System.out.println("Баланс после пополнения 900 рублей: " + individualBusinessman.getAmount());
    individualBusinessman.put(10000);
    System.out
        .println("Баланс после пополнения 10 000 рублей: " + individualBusinessman.getAmount());
  }
}
