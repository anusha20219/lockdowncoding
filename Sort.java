import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class GFG {

    private static void printSortedArr (int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (Integer elem : arr) {
            if (elem == 0) {
                count0++;
            }
            else if (elem == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }

        while (count0 != 0) {
            System.out.print(0 + " ");
            count0--;
        }

        while (count1 != 0) {
            System.out.print(1 + " ");
            count1--;
        }

        while (count2 != 0) {
            System.out.print(2 + " ");
            count2--;
        }
        System.out.println();
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int numTests = Integer.parseInt(line);

        for (int i = 0; i < numTests; i++) {
            String line2 = br.readLine();
            int size = Integer.parseInt(line2);
            int[] arr = new int[size];
            String line3 = br.readLine();
            String[] inps = line3.split(" ");

            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(inps[j]);
            }

            printSortedArr(arr);
        }
    }
}
