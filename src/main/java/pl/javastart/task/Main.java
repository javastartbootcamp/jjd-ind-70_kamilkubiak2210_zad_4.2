package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Kamil", "IT");
        Tasks tasks1 = new Tasks("Sprzątanie", "posprzątać kuchnie", 0, person1);
        System.out.println("Nazwa zadania: " + tasks1.getTaskName() + " - " + tasks1.getTaskDescription() + "\nPriorytet: "
                + tasks1.getPriority() + " " + "\nOsoba: " + tasks1.getPerson().getFirstName() + " " + tasks1.getPerson().getLastName());
        System.out.println("Mały prioytet? " + tasks1.lowPriority(tasks1.getPriority()));
        System.out.println("Średni prioytet? " + tasks1.mediumPriority(tasks1.getPriority()));
        System.out.println("Duży prioytet? " + tasks1.highPriority(tasks1.getPriority()));

        System.out.print("\n");

        Person person2 = new Person("Jacek", "Kracek");
        Tasks tasks2 = new Tasks("Umyć okna", "umyć okna w sypialni", -1, person2);
        System.out.println("Nazwa zadania: " + tasks2.getTaskName() + " - " + tasks2.getTaskDescription() + "\nPriorytet: "
                + tasks2.getPriority() + " " + "\nOsoba: " + tasks2.getPerson().getFirstName() + " " + tasks2.getPerson().getLastName());
        System.out.println("Mały prioytet? " + tasks2.lowPriority(tasks2.getPriority()));
        System.out.println("Średni prioytet? " + tasks2.mediumPriority(tasks2.getPriority()));
        System.out.println("Duży prioytet? " + tasks2.highPriority(tasks2.getPriority()));
    }
}
