public class BooleanForLife {
    public static Boolean[] toObject(boolean[] array) {

        Boolean[] result = new Boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = new Boolean(array[i]);
        }
        return result;}
}
