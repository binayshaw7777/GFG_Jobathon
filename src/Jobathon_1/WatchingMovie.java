package Jobathon_1;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://practice.geeksforgeeks.org/contest/job-a-thon-hiring-challenge-1/problems/#
public class WatchingMovie {
    public static void main(String[] args) {
        int K1 = 1;
        int[] testCase1 = {4, 3, 1, 2, 5};
        int K2 = 3;
        int[] testCase2 = {9, 7, 7, 7, 4};
        int K3 = 2;
        int[] testCase3 = {4, 2, 4, 6, 7, 1, 8, 6};

        System.out.println("-> "+solve(testCase1.length, K1, testCase1));
        System.out.println("-> "+solve(testCase2.length, K2, testCase2));
        System.out.println("-> "+solve(testCase3.length, K3, testCase3));

    }

    static int solve(int N, int K, int h[]) {
        if (h == null || N == 0 || N < K) return 0;
        int total = 0;
        int req = N - K;
        int[] act = new int[req];
        Arrays.fill(act, 1);
        int[] pow = new int[req];

        if (K == 1) {
            for (int i = 1; i < N; i++) {
                if (h[i] > h[i-1])
                    total++;
            }
            return N - total;
        }

        for (int i = 0; i < N; i++) {
            if (i+K < N) {
                pow[i] = (int) Math.pow(h[i], K);
                for (int j = i; j < i + K; j++) {
                    System.out.println(act[i] +" * " + h[i]);
                    act[i] *= h[j];
                    System.out.println("act[i] = " + act[i]);
                }
                System.out.println(pow[i] +" - " + act[i]);
                if (pow[i] <= act[i])
                    total += 1;
            }
        }

        return N - total - 1;
    }
}
