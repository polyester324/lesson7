package practiceEncapsulation;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.name);
        //System.out.println(example1.privateName); ошибка
        example.setSurname("Korolev");
        System.out.println(example.getSurname());
    }
}
