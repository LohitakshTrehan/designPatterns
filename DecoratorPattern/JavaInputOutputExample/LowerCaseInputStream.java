package DecoratorPattern.JavaInputOutputExample;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream { // FilterInputStream is the abstract decorator

    /**
     * Input Stream is the Abstract component
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * Now we need to implement 2 read methods.
     * They take a byte (or an array of bytes) and convert
     * each byte that represents a character into lower case.
     */
    
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}