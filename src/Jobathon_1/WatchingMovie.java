package Jobathon_1;

//https://practice.geeksforgeeks.org/contest/job-a-thon-hiring-challenge-1/problems/#
public class WatchingMovie {
    public static void main(String[] args) {
        int K1 = 1;
        int[] testCase1 = {4, 3, 1, 2, 5};
        int K2 = 3;
        int[] testCase2 = {9, 7, 7, 7, 4};
        int K3 = 2;
        int[] testCase3 = {4, 2, 4, 6, 7, 1, 8, 6};
        int K4 = 3;
        int[] testCase4 = {4, 5, 6, 7, 8};

        System.out.println("-> " + solve(testCase1.length, K1, testCase1));
        System.out.println("-> " + solve(testCase2.length, K2, testCase2));
        System.out.println("-> " + solve(testCase3.length, K3, testCase3));
        System.out.println("-> " + solve(testCase4.length, K4, testCase4));
    }

    static int solve(int N, int K, int[] h) {
        int total = 0;

        if (K == 0 || h.length == 1) return N - total;

        for (int i = 0; i < N; i++) {
            int ik = i + K;
            int j = i + 1;

            while (j < N && j <= ik) {
                if (h[j] >= h[i]) {
                    total += 1;
                    break;
                }
                j++;
            }
        }

        return N - total;
    }
}
