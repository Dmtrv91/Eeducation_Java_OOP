import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] coordinates = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Point bottomLeft = new Point(coordinates[0], coordinates[1]);
        Point toRight = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, toRight);

        int pointCount = Integer.parseInt(reader.readLine());

        while (pointCount-->0) {
            int[] pointCoordinates = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Point newPoint = new Point(pointCoordinates[0], coordinates[1]);

            System.out.println(rectangle.contains(newPoint));
        }
    }
}