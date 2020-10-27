
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //read input
        int n = Integer.parseInt(reader.readLine());
        //Upper part
        for (int row = 1; row <= n; row++) {
            printCurrentRow(n, row);
        }
        for (int row = n - 1; row > 0; row--){
            printCurrentRow(n, row);
        }
    }

    public static void printCurrentRow(int width, int row) {
            System.out.print(printSpace(" ", width - row));
            System.out.print(printSpace(" *", row));
            System.out.println();
    }


    public static String printSpace(String str, int count) {
        StringBuilder sb = new StringBuilder();

        while (count -- > 0) {
            sb.append(str);
        }
        return sb.toString();
    }
}