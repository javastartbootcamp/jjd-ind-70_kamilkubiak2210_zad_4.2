package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Kamil", "IT");
        Task task1 = new Task("Sprzątanie", "posprzątać kuchnie", 0, person1);
        System.out.println("Nazwa zadania: " + task1.getName() + " - " + task1.getDescription() + "\nPriorytet: "
                + task1.getPriority() + " " + "\nOsoba: " + task1.getPerson().getFirstName() + " " + task1.getPerson().getLastName());
        System.out.println("Mały prioytet? " + task1.lowPriority(task1.getPriority()));
        System.out.println("Średni prioytet? " + task1.mediumPriority(task1.getPriority()));
        System.out.println("Duży prioytet? " + task1.highPriority(task1.getPriority()));

        System.out.print("\n");

        Person person2 = new Person("Jacek", "Kracek");
        Task task2 = new Task("Umyć okna", "umyć okna w sypialni", -1, person2);
        System.out.println("Nazwa zadania: " + task2.getName() + " - " + task2.getDescription() + "\nPriorytet: "
                + task2.getPriority() + " " + "\nOsoba: " + task2.getPerson().getFirstName() + " " + task2.getPerson().getLastName());
        System.out.println("Mały prioytet? " + task2.lowPriority(task2.getPriority()));
        System.out.println("Średni prioytet? " + task2.mediumPriority(task2.getPriority()));
        System.out.println("Duży prioytet? " + task2.highPriority(task2.getPriority()));
    }
}
