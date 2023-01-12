import java.util.Scanner;

public class Guest {
    private String name;
    private String meal;
    private Integer phoneNumber;
    private boolean confirmed;

    Scanner scanner = new Scanner(System.in);
    public Guest () {

        this.name = this.getName();
        this.meal = this.getMeal();
        this.phoneNumber = this.getPhoneNumber();
        this.confirmed = this.isConfirmed();
    }

    public String getName() {
        System.out.println("Podaj imię osoby:");
        String name = scanner.nextLine();
        return name;
    }

    public String getMeal() {
        System.out.println("Podaj jaki posiłek chce osoba:");
        String meal = scanner.nextLine();
        return meal;
    }

    public Integer getPhoneNumber() {
        System.out.println("Podaj numer telefonu");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        return phoneNumber;
    }

    public boolean isConfirmed() {
        System.out.println("Czy osoba potwierdziła (N jeśli nie, Y jeśli tak)");
        String confirmed = scanner.nextLine();
        if (confirmed.equals("Y") || confirmed.equals("y") ) {
            return true;
        } else {
            return false;
        }
    }
    public void displayGuest(){
        System.out.println(name + " / " + phoneNumber);
    }
    public String displayMeal(){
        return meal;
    }
    public Integer displayPhoneNumber(){
        return phoneNumber;
    }
}
