package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

    public static void main(String[] args) throws IOException {
        String mashaRupasova = "Мы отбрасываем тени,\n" +
                "Мы живём в такой \n" +
                "Большой —\n" +
                "Очень Солнечной —\n" +
                "Системе\n" +
                "И питаемся \n" +
                "Лапшой.";

        try (FileWriter writer = new FileWriter("/Users/sveta/Desktop/1.txt")) {
/*
            for (int i = 0; i < mashaRupasova.length(); i++) {
                writer.write(mashaRupasova.charAt(i));
            }*/
            writer.write(mashaRupasova);
            System.out.println("done");
        }
    }
}
