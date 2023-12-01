//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//Необходимо посчитать и вернуть сумму элементов этого массива.
//При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
// и в каждой ячейке может лежать только значение 0 или 1.
//Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sumElement(new int[][]{{1, 0, 1}, {1, 1, 1}, {1, 1, 0}}));
    }

    public static int sumElement(int[][] ints){
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints.length != ints[i].length){
                throw new RuntimeException("массив не квадратный, а " + ints.length + "*" + ints[i].length);
            }
            for (int j = 0; j < ints[i].length; j++) {
                if(ints[i][j] != 0 && ints[i][j] != 1){
                    throw new RuntimeException("Элемент массиа не равен 0 или 1");
                }
                sum+=ints[i][j];
            }
        }
        return sum;
    }

}
