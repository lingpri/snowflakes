package my.priya;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferUtil
{

    public static void main(String[] args) {

        System.out.println(ByteOrder.nativeOrder());
        ByteBuffer bbuf = ByteBuffer.allocate(1024);
        byte[] hello = "Hello".getBytes();
        bbuf.put(hello);

        //reset it back to to the Initial Position
        bbuf.flip();

        while(bbuf.hasRemaining()){
            System.out.println((char)bbuf.get() );
        }
    }


}