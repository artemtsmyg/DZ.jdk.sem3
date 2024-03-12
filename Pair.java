/**
 * Класс Pair представляет пару значений различных типов.
 *
 * @param <T1> тип первого элемента пары
 * @param <T2> тип второго элемента пары
 */

public class Pair <T1, T2>{
    private T1 value1;
    private T2 value2;

    /**
     * Конструктор для создания новой пары значений.
     *
     * @param t1 значение первого элемента
     * @param t2 значение второго элемента
     */

    public Pair(T1 t1, T2 t2){
        value1 = t1;
        value2 = t2;
    }

    /**
     * Метод для получения первого элемента пары.
     *
     * @return первый элемент пары
     */

    public T1 getFirst(){
        return value1;
    }

    /**
     * Метод для получения второго элемента пары.
     *
     * @return второй элемент пары
     */
    
    public T2 getSecond(){
        return value2;
    }

    /**
     * Переопределение метода toString для удобного вывода значений пары.
     *
     * @return строковое представление пары
     */

    @Override
    public String toString(){
        return String.format("Pair[Первый элемент = %s, Второй элемент = %s]", value1, value2);
    }

    /**
     * Метод для тестирования функционала класса Pair.
     *
     * @param args аргументы командной строки
     */

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String,Integer>("Text", 123456);
        System.out.println(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());        

        PairRecord<String, Integer> pairRecord = new PairRecord<String,Integer>();
        System.out.println(pairRecord);
        System.out.println(pairRecord.value1()); 
        System.out.println(pairRecord.value2()); 
    }
}