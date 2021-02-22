package o3_innerClasses;

public class O5_Resume {

    public void method() {
        int a = 9;
        class LocalOne {
            int inside = 9;
            void method () {
                inside += a;
                System.out.println("method is running");
            }
        }
//        a++;
        LocalOne localOne = new LocalOne();
        localOne.method();
    }

    static class WithStaticInner {
        private int secret2 = 0;
    }

    class WithInner {
        private int secret = 0;

        protected abstract class Nested {
            //            static int a;
            static final int b = 0;

            abstract void doSecret();
        }

        private class NestedOne extends Nested {
            void doSecret() {
            }
        }
    }
}
