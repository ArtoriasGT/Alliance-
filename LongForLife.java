public class LongForLife {
public static Long[] toObject(long[] array) {

    Long[] result = new Long[array.length];
    for (int i = 0; i < array.length; i++) result[i] = new Long(array[i]);
    return result;}
}