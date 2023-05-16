package practiceInheriance;

public class Person {
    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Person(){}

    void showInfo(){
        System.out.println(this.age + " " + this.name + " " + this.weight);
    }
    // если final перед классом значит класс не наследуется
    // если final перед переменной, значит его нельзя перезаписать, часто пишется капсом
}
