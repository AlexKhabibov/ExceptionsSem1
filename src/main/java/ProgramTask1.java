// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.

public class ProgramTask1 {
    public static void main(String[] args) {
        int [] ints = {1, 4, 6, 7};
//        System.out.println(getSize(ints, 3));
        Task1.findElementsMessage(ints, 5, 6);
        Task1.findElementsMessage(ints, 3, 9 );
        Task1.findElementsMessage(null, 3, 6 );
        Task1.findElementsMessage(ints, 3, 6 ) ;
    }

    public static int getSize(int[] ints, int minLength) {
        if (ints.length < minLength)
            return -1;
        return ints.length;
    }


}
