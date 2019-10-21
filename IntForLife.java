public class IntForLife {
int[] pepe = new int[10];
        for (int i = 0; i < pepe.length; i++) {
        pepe[i] = i;
        }
        String[] s = new String[10];
        for (int i = 0; i < s.length; i++){
        s[i] = "" + pepe[i] + " " + (pepe[i] % 2 == 0);
        }
