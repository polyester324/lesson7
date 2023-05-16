package homework.taskAdditional;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "Red");
            System.out.println(field.get(apple));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
