package practiceEncapsulation;

public class Example {
    // public - доступно везде
    // default - в пределах пакета
    // protected - в пределах пакета, и в классах наследниках, используется достаточно редко
    // private - только в пределах этого класса
    // class пишется с public
    // вопрос с собеса
    // наследует ли значение подкласс, если у индификатора поля значение private
    // ответ да. наследование есть,, но нет доступа
    public String name = "qwerty";
    private String privateName = "privateQwerty";

    // геттеры и сеттеры - метода для доступа к полям
    // сеттер записыват в поле  = меняет
    // геттер дает это поле     = не меняет
    private String surname;
    private int age;
    private double weight;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
