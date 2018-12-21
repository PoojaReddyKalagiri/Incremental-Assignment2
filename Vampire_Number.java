import java.util.*;
public class Vampire_Number{
    //calculate length of the number
    private static int length(long n){
        return Long.toString(n).length();
    }

    private static boolean Check(long n, long n1, long n2){
        if(Long.toString(n1).endsWith("0") && Long.toString(n2).endsWith("0")) return false;

        int nLen = length(n);
        if(length(n1) != nLen / 2 || length(n2) != nLen / 2) return false;

        char[] arr1 = Long.toString(n).toCharArray();
        char[]arr2 = (Long.toString(n1) + Long.toString(n2)).toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        List<Long> v_num = new ArrayList<Long>(); // storing vampire numbers in array list
        for (long i = 1000; v_num.size() <= 100; i++) {
            if ((length(i) % 2) != 0) {
                i = i * 10;
                continue;
            }
            for (long n1 = 2; n1 <= Math.sqrt(i) + 1; n1++) {
                if (i % n1 == 0) {
                    long n2 = i / n1;
                    if (Check(i, n1, n2) && n1 <= n2) {
                        v_num.add(i);

                    }
                }
            }
        }
        //printing vampire numbers
        for(long l:v_num){
            System.out.println(l);
        }
    }
}