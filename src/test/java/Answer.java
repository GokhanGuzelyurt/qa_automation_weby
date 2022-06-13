import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Answer {

    /**
     *  we ha ve two person they are running together
     *  they have same speed
     *  they will run different root and root have different lenght
     *  they are starting same point
     *  example:
     *  gokhan , sahin [8,6]  /2
     *                 4,3    /2
     *                 2 3    /2
     *                 0 3    /3
     *                 0 0    /2*2**2*=24
     *                 24/8 , 24/6
     *         answer: [3,      4]
     * @param
     */
    public static int[] numberOfLaps(int gokhan, int sahin) {
        int[] res = new int[2];
        for (int i = 1; i <= gokhan * sahin; i++) {
            if (i % gokhan == 0 && i % sahin == 0) {
                res[0] = i / gokhan;
                res[1] = i / sahin;
                return res;
            }
        }
        return res;
    }

    public static int[] nbrOfLaps(int x, int y) {
        int j = 1, k = 1;
        while (j * x != y * k) {
            if (j * x > y * k) k++;
            else j++;
        }
        return new int[]{j, k};
    }

    public static int gcd(int a, int b){

        if (b==0) return a;

        return gcd(b,a%b);
    }
//    public static int[] nbrOfLaps(int x, int y) {
//        int leastCommonMultiple = (x * y)/ gcd(x,y);
//        return [leastCommonMultiple / x, leastCommonMultiple / y];
//    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfLaps(5, 3)));
        System.out.println(Arrays.toString(numberOfLaps(4, 6)));
    }








}
