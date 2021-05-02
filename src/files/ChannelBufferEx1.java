package files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {

            System.out.println("Length " + file.length());

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder verse = new StringBuilder();

            int byteRead = channel.read(buffer);

            while (byteRead > 0) {
                System.out.println("Read: " + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()) {
                    verse.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(verse.toString());

            String addString = "\n Have you no thought, O dreamer, that it may be all maya, illusion?\n";

//            ByteBuffer buffer2 = ByteBuffer.allocate(addString.getBytes().length);
//            buffer2.put(addString.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

            ByteBuffer buffer3 = ByteBuffer.wrap(addString.getBytes());
            channel.write(buffer3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
