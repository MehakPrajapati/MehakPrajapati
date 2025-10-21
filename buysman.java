package CBCLASS;

import java.util.*;

public class buysman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pair[] arr = new pair[n];
        for (int i = 0; i < arr.length; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr[i] = new pair(st, et);
        }
        Arrays.sort(arr, new Comparator<pair>() {
            public int compare(pair s1, pair s2) {
                return s1.et - s2.et;
            }
        });
        int activity = 1;
        int endtime = arr[0].et;
        for (int i = 1; i < arr.length; i++) {
            if (endtime <= arr[i].st) {
                endtime = arr[i].et;
                activity++;
            }
        }
        System.out.println(activity);

    }

    static class pair {
        int st;
        int et;

        public pair(int si, int et) {
            this.st = st;
            this.et = et;
        }
    }
}
