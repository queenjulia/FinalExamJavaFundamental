package ua.org.oa.schirova;

public class RunningDynamicStringList {
    public static void main(String[] args) {
        int masSize = 20;
        int delIndex = 2;
        int getIndex = 3;

        DynamicStringList test1 = new DynamicStringList();
        DynamicStringList test2 = new DynamicStringList(20);

        //Добавление елементов
        test2.add("q");
        test2.add("g");
        test2.add("h");
        test2.add("j");
        test2.add("k");
        test2.add("l");
        test2.add("o");
        test2.add("y");
        test2.add("z");
        test2.add("x");

        System.out.println("Вывод массива: " + test2.toString() + "\n");

        System.out.println("Получения последнего элемента массива: " + test2.get() + "\n");

        System.out.println("Получения элемента массива по индеку: " + test2.get(getIndex) + "\n");

        System.out.println("Удаление последнего элемента массива: " + test2.remove());
        System.out.println("Вывод массива: " + test2.toString() + "\n");

        System.out.println("Удаление элемента массива по индексу: " + test2.remove(delIndex));
        System.out.println("Вывод массива: " + test2.toString() + "\n");

        System.out.println("Удаление всех элементов массива: " + test2.delete());
        System.out.println("Вывод массива: " + test2.toString() + "\n");



    }
}
