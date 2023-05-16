package homework.taskAdditional;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.show();
        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "Red");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        apple.show();
    }
}
