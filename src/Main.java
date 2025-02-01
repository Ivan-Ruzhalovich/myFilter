import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] mas = {1,2,3,4,5,6};
        Object[] stringsMas = {"Java","Python","Go","C#"};
        System.out.println(Arrays.toString(Filtering.filter(mas,(o)->(int)o * (int)o)));
        System.out.println(Arrays.toString(Filtering.filter(stringsMas,(o)->String.valueOf(o).length())));
    }
}