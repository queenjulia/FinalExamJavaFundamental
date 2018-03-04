package ua.org.oa.schirova;

import java.util.Arrays;

public class DynamicStringList implements SimpleList {

    private String [] mas;
    private int currentMasSize; //в этой переменной текущий размер забитых элементов массива

    public DynamicStringList () {
        mas = new String[0];
        currentMasSize = 0;
    };

    public DynamicStringList (int startLenghtMas) {
        mas = new String[startLenghtMas];
        currentMasSize = 0;
    }

    @Override
    public void add(String s) {
        if(s == null || s.equals("") || s.equals(" ")) {
            System.out.println("You are not input a value");
            return;
        }
        if (currentMasSize >= mas.length) {
            String [] tempMas = mas;
            mas = new String[mas.length +1];
            System.arraycopy(tempMas, 0, mas, 0, tempMas.length);
            mas[mas.length -1] = s;
        }
        else {
            mas[currentMasSize]=s;
        }
        currentMasSize ++;
    }

    @Override
    public String get() {
        return mas[currentMasSize -1];
    }

    @Override
    public String get(int id) {
        if(id >= currentMasSize) {
            System.out.println("This element is absent");
            return null;
        }
        else return mas[id];
    }

    @Override
    public String remove() {
        String s = mas[currentMasSize -1];
        mas[currentMasSize -1] = null;
        currentMasSize --;
        return s;
    }

    @Override
    public String remove(int id) {
        if(id >= currentMasSize) {
            System.out.println("This element is absent");
            return null;
        }
        else {
            String s = mas[id];
            currentMasSize --;
            System.arraycopy(mas, id+1, mas, id, currentMasSize - 1);
            return s;
        }
    }

    @Override
    public boolean delete() {
        for (int i = 0; i <= currentMasSize; i++) {
            mas[i] = null;
        }
        currentMasSize = 0;
        return true;
    }

    @Override
    public String toString() {
        String rezult = "[ ";
        for (int i = 0;  i < currentMasSize; i++) {
            rezult = rezult.concat(mas[i]);

            if(i+1 < currentMasSize){
                rezult = rezult.concat(", ");
            }
        }
        rezult = rezult.concat(" ]");
        return rezult;
    }
}
