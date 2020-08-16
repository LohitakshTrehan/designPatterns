package DecoratorPattern.JavaInputOutputExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {

            // Decorating the concrete class component
            InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                    new FileInputStream("DecoratorPattern/JavaInputOutputExample/test.txt") // FileInputStream is a concrete component of InputStream abstract component
                )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}