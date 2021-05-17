package a1_classDesign;

public class Test10 {

    public static void main(String[] args) {
        Test10 test10 = new Test10();
        test10.toString();
    }


    /*
        Which methods of the Object class are invoked by the Object‘s toString() method?

        getClass() and hashCode():

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        BTW, getClass() and hashCode() are native methods:

        public final native Class<?> getClass();
        public native int hashCode();
        */


}
