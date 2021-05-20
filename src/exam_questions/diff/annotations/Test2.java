package exam_questions.diff.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.SOURCE)//reflection won't work
@interface SmartPhone {

    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("exam_questions.diff.annotations.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("Annotation info from xiaomiClass " + smartPhone.OS() +
                " " +smartPhone.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("exam_questions.diff.annotations.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from iphoneClass " + smartPhone2.OS() +
                " " +smartPhone2.yearOfCompanyCreation());
    }
}

@SmartPhone()
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
