

public class Task4 {
    public static void main(String[] args) {
        Integer[] test = {2, 4, 1, 2, null};
        checkNull(test);
    }

    public static void checkNull(Integer[] array){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                result.append(i).append(" ");
            }
            if (!result.isEmpty()){
                throw new RuntimeException("В списке есть налы, их индексы: " + result);
            }
        }
    }

}
