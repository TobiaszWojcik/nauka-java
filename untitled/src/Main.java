import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Random random = new Random();
//        int randomvalue = random.nextInt(100) + 1;
//        int value = 101;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Podaj liczbę:");
//            value = scanner.nextInt();
//            if (value > randomvalue){
//                System.out.println("Podana liczba jest za duża");
//            } else if (value < randomvalue) {
//                System.out.println("Podana liczba jest za mała");
//            }
//        } while (value != randomvalue);
//        System.out.println("Brawo!! Zgadłeś, ta liczba to :" + randomvalue);

//        String[] names = new String[3];
//
//        names[0] = "Jak";
//        names[2] = "Piotr";
//        names[1] = "Adam";
//
//        for (String name : names ){
//            System.out.println(name);
//        }
//        List<String> fornames = new ArrayList<>();
        Party party = new Party();


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            System.out.println("Wybierz opcię:");
            System.out.println("1 - Wyświetl listę gości");
            System.out.println("2 - Dodaj gościa");
            System.out.println("3 - Wyświetl potrawy");
            System.out.println("4 - Znajdź gościa po numerze telefonu");
            System.out.println("9 - Zamknij program");

            byte option = scanner.nextByte();

            switch (option){
                case 1 -> party.displayGuests();

                case 2 ->party.addGuest();

                case 3 -> party.displayMeals();

                case 4 -> party.getGuestByPhoneNumber();

                case 9 -> exit = true;

                default -> System.out.println("Nie ma takiej opcji!");
            }
        }
    }
}
