package tasks;

public class ThirdTask {
    public static void main(String[] args) {
        //создаю массив
        int [] array = new int[] { 1,2,3,4,5 };

        //меняю местами первый и последний элементы массива
        int a = array[0];
        int b = array[array.length-1];
        array[0] = b;
        array[array.length-1] = a;
        int middle = 0;

        //вычисляю номер среднего элемента и присваиваю значение переменной
        if (array.length%2 != 0)
        {middle = array.length/2 + 1;}
        else
        {middle = array.length/2;}

        //вычисляю сумму первого и среднего элементов
        int sum = array[0] + array[middle-1];
        System.out.println(sum);

    }
}
