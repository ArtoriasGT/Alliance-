import java.util.stream.IntStream;

public class FTARRAY {
    public static void main(String[] args) {


        int pepega = 10;
        int[] zero = new int[pepega];
        IntStream.iterate(0, i -> !(pepega.length <= i), i -> i + 1).forEachOrdered(i -> {
            zero[i] = i / i;
            System.out.println(zero[i]);
        });
    }


            double[][] zer1 = new double[15][];
            for (int i = 0; i < zer1.length; i++) {
                zer1[i] = new double[15];
            }

            for (int i = 0; i < zer1.length; i++) {
                for (int j = 0; j < zer1[i].length; j++) {
                    System.out.println("" + i + "," + j);
                }
            }



            long sen = 20;
            long[] zer2 = new long[(int) sen];
            for (long i = 0; i < sen; i++) {
                zer2[i] = i / i;
                System.out.println(zer2[i]);
            }



        
            boolean[] boolArr = new boolean[true; false];
            boolean[] g = new boolean[5];
            g[0] = true;
            g[3] = false;
            System.out.println(boolArr[g]);
        }

