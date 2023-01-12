import java.util.*;

public class Party {
    private Map<Integer, Guest> guests = new HashMap<>();
    private Set<String> meals = new HashSet<>();

    Scanner scanner = new Scanner(System.in);
    public void addGuest() {
        System.out.println("Dodaj gościa:");
        Guest guest = new Guest();
        guests.put(guest.displayPhoneNumber(),guest);
        meals.add(guest.displayMeal());
    }

    public void displayGuests(){
        int i = 1;
        for (Guest guest : guests.values()){
            System.out.print(i++ + ". - ");
            guest.displayGuest();
        }
    }
    public void displayMeals(){
        System.out.println("Lista potraw:");
        for (String meal : meals){
            System.out.println(meal);

        }
    }
    public void getGuestByPhoneNumber(){
        System.out.println("Podaj numer osoby którą chcesz znaleźć:");
        Integer search = Integer.valueOf(scanner.nextLine());
        Guest wanted = guests.get(search);
        if (wanted != null){
            wanted.displayGuest();
        } else {
            System.out.println("Brak gościa o takim numerze telefonu!");
        }
    }
}
