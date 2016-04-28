import java.util.Scanner;

/**
 * Created by Pranav on 20/12/15.
 */
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class ArrayGeneration {

    public static int[] sortedArray(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int i = 0, j = 0, k = 0;

        int[] C = new int[N+M];

        while (i <= N - 1 && j <= M - 1) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
                k++;
            } else {
                C[k] = B[j];
                j++;
                k++;
            }
        }
        while (i <= N-1) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j <= M-1) {
            C[k] = B[j];
            j++;
            k++;
        }
        return (C);
    }

    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        int N,M;
        Scanner S = new Scanner(System.in);
        N = S.nextInt();
        int [] A = new int[N];
        for(int x = 0;x<N ; x++)
        {
            A[x] = S.nextInt();
        }
        M = S.nextInt();
        int[] B = new int[M];
        for(int y = 0;y<M ; y++)
        {
            B[y] = S.nextInt();
        }

        int[] D = new int[N + M];

        D = sortedArray(A,B);

        for(int l = 0;l<D.length;l++){
            System.out.print(D[l]+ " " );

        }

    }
}