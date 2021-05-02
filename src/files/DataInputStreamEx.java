package files;

import java.io.*;

public class DataInputStreamEx {

    public static void main(String[] args) {

        try (DataOutputStream outputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
             DataInputStream inputStream = new DataInputStream(
                     new FileInputStream("my_test.bin"))
        ) {


            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeDouble(5.55);
            outputStream.writeLong(1_000_000L);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readLong());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
