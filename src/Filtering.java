import java.util.Arrays;

public class Filtering {
    public static Object[] filter(Object[] mas,Filter f){
        return Arrays.stream(mas).map((o)->f.apply(o)).toArray();
    }
}
