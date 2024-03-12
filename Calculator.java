/**
 * Класс Calculator для выполнения математических операций над числами.
 */

public class Calculator {
    /**
     * Метод для сложения двух чисел.
     *
     * @param num1 первое число
     * @param num2 второе число
     * @param <T1> тип первого числа
     * @param <T2> тип второго числа
     * @return результат сложения
     */
    public static <T1 extends Number, T2 extends Number> Number sum(T1 num1, T2 num2){
        return num1.doubleValue() + num2.doubleValue();
    }

        /**
     * Метод для вычитания одного числа из другого.
     *
     * @param num1 первое число
     * @param num2 второе число
     * @param <T1> тип первого числа
     * @param <T2> тип второго числа
     * @return результат вычитания
     */

    public static <T1 extends Number, T2 extends Number> Number subtract(T1 num1, T2 num2){
        return num1.doubleValue() - num2.doubleValue();
    }

       /**
     * Метод для умножения двух чисел.
     *
     * @param num1 первое число
     * @param num2 второе число
     * @param <T1> тип первого числа
     * @param <T2> тип второго числа
     * @return результат умножения
     */
    
    public static <T1 extends Number, T2 extends Number> Number multiply(T1 num1, T2 num2){
        return num1.doubleValue() * num2.doubleValue();
    }

       /**
     * Метод для деления одного числа на другое.
     *
     * @param num1 делимое число
     * @param num2 делитель
     * @param <T1> тип делимого числа
     * @param <T2> тип делителя
     * @return результат деления
     * @throws RuntimeException если делитель равен 0
     */

    public static <T1 extends Number, T2 extends Number> Number divide(T1 num1, T2 num2){
        if(num2.doubleValue() == 0) throw new RuntimeException("Разделить на 0");
        return num1.doubleValue() / num2.doubleValue();
    }

    /**
     * Метод для тестирования математических операций.
     *
     * @param args аргументы командной строки
     */

    public static void main(String[] args) {
        System.out.println(sum(3,1));
        System.out.println(sum(1,1.000003));

        System.out.println(subtract(1,1));
        System.out.println(subtract(1,1.12345));

        System.out.println(multiply(2,1));
        System.out.println(multiply(2,1.000003));

        System.out.println(divide(2,1));
        System.out.println(divide(2,1.25));
        System.out.println(divide(2,0));
    }

}