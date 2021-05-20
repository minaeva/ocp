package exam_questions.lambdas;

import java.util.function.Supplier;

class Document {
    void printAuthor() {
        System.out.println("Document-Author");
    }
}

class RFP extends Document {
    @Override
    void printAuthor() {
        System.out.println("RFP-Author");
    }
}

public class Test4 {
    public static void main(String[] args) {
        check(Document::new);
        check(RFP::new);
    }

    private static void check(Supplier<Document> supplier) {
//    private static void check(Supplier<? extends Document> supplier) {//yes

//    private static void check(Supplier<? super Document> supplier) { //NOT
//    private static void check(Supplier<RFP> supplier) { //NOT
//    private static void check(Supplier<? extends RFP> supplier) {//NOT
//    private static void check(Supplier<? super RFP> supplier) {//NOT
//    private static void check(Supplier supplier) {//NOT
        supplier.get().printAuthor();
    }
}


//    Given options to fill the blanks:
//
//    Supplier<Document>
//    Supplier<? extends Document>
//    Supplier<? super Document>
//    Supplier<RFP>
//    Supplier<? extends RFP>
//    Supplier<? super RFP>
//    Supplier
//
//
//    How many of the above options can fill the blank space, such that output is:
//    Document-Author
//    RFP-Author

/*

Blank space of check(______________ supplier) method needs to be filled such that
check(...) method compiles, two statements invoking check(...) method compile and output is:

Document-Author
RFP-Author


'Document::new' is same as '() -> {return new Document();}'
and 'RFP::new' is same as '() -> {return new RFP();}'
and as these are the implementations of get method of Supplier interface,
hence let's check all the options one by one:

1. Supplier<Document>:- Method parameter will be initialized as:
Supplier<Document> supplier = () -> {return new Document();};
or
Supplier<Document> supplier = () -> {return new RFP();};
No issues as get() method either returns Document or RFP instance.

2. Supplier<? extends Document>:- Method parameter will be initialize as:
Supplier<? extends Document> supplier = () -> {return new Document();};
or
Supplier<? extends Document> supplier = () -> {return new RFP();};
=>
If target type is a wildcard-parameterized functional interface,
then type inference of exam_questions.lambdas.lambda expression is based on following from the JLS:

If T is a wildcard-parameterized functional interface type
and the exam_questions.lambdas.lambda expression is implicitly typed,
then the ground target type is the non-wildcard parameterization of T.

Based on above JLS statement, ground target type of above exam_questions.lambdas.lambda expression will be:
Supplier<Document> and this means above expression is equivalent to:

=>
Supplier<? extends Document> supplier = (Supplier<Document>)() -> {return new Document();};
or
Supplier<? extends Document> supplier = (Supplier<Document>)() -> {return new RFP();};

No issues as get() method either returns Document or RFP instance.


3. Supplier<? super Document>:- Method parameter will be initialize as:
Supplier<? super Document> supplier = () -> {return new Document();};
or
Supplier<? super Document> supplier = () -> {return new RFP();};

Based on above JLS statement, ground target type of above exam_questions.lambdas.lambda expression will be:
Supplier<Document> and this means above expression is equivalent to:
Supplier<? super Document> supplier = (Supplier<Document>)() -> {return new Document();};
or
Supplier<? super Document> supplier = (Supplier<Document>)() -> {return new RFP();};

There is no issue with exam_questions.lambdas.lambda expressions (method invocation)
but get() method would return an Object type
and invoking printAuthor() method on Object type is not possible. Hence compilation error.


4. Supplier<RFP>:- Method parameter will be initialized as:
Supplier<RFP> supplier = () -> {return new Document();};
or
Supplier<RFP> supplier = () -> {return new RFP();};
1st statement causes compilation failure.


5. Supplier<? extends RFP>:- Method parameter will be initialized as:
Supplier<? extends RFP> supplier = () -> {return new Document();};
or
Supplier<? extends RFP> supplier = () -> {return new RFP();};

Based on above JLS statement, ground target type of above exam_questions.lambdas.lambda expression will be:
Supplier<RFP> and this means above expression is equivalent to:
Supplier<? extends RFP> supplier = (Supplier<RFP>)() -> {return new Document();};
or
Supplier<? extends RFP> supplier = (Supplier<RFP>)() -> {return new RFP();};

2nd statement compiles successfully but 1st statement fails to compile.


6. Supplier<? super RFP>:- Method parameter will be initialized as:
Supplier<? super RFP> supplier = () -> {return new Document();};
or
Supplier<? super RFP> supplier = () -> {return new RFP();};
Based on above JLS statement, ground target type of above exam_questions.lambdas.lambda expression will be:
Supplier<RFP> and this means above expression is equivalent to:
Supplier<? super RFP> supplier = (Supplier<RFP>)() -> {return new Document();};
or
Supplier<? super RFP> supplier = (Supplier<RFP>)() -> {return new RFP();};

1st statement fails to compile.
There is no issue with the exam_questions.lambdas.lambda expression of 2nd statement (method invocation)
but get() method would return an Object type and invoking printAuthor() method on Object type is not possible.
Hence compilation error.

7. Supplier:- Doesn't compile as raw type's get() method returns Object type,
so printAuthor() method can't be invoked.



Hence out of given 7 options, only two options 'Supplier<Document>' and 'Supplier<? extends Document>' will give the desired output.




 */
