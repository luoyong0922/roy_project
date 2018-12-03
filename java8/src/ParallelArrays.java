import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Java 8增加了大量的新方法来对数组进行并行处理。
 * 可以说，最重要的是parallelSort()方法，
 * 因为它可以在多核机器上极大提高数组排序的速度。
 */
public class ParallelArrays {
    public static void main( String[] args ) {
        long[] arrayOfLong = new long [ 20000 ];

        Arrays.parallelSetAll( arrayOfLong,
                index -> ThreadLocalRandom.current().nextInt( 1000000 ) );
        System.out.print("unsorted:");
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();

        Arrays.parallelSort( arrayOfLong );
        System.out.print("sorted:");
        Arrays.stream( arrayOfLong ).limit( 10 ).forEach(
                i -> System.out.print( i + " " ) );
        System.out.println();
    }
}