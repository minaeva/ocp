package regex;

public class Regex4 {

    public static void main(String[] args) {
        String s1 = "Hello,    my     friend!  How      is    Java?  ";
        System.out.println(s1);

//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll(" {2,}", " "); //-> Hello, my friend! How is Java?
//        s1 = s1.replaceAll("\\bi\\w+", "4444"); //Hello,    my     friend!  How      4444    Java?
        s1 = s1.replaceFirst("\\bH\\w+", "44"); //44,    my     friend!  How      is    Java?
        System.out.println(s1);
    }

}
