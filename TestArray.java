package MyJava;

/**
 *
 * @author Meher Khan
 */
class TestArray {

    int[] m1() {

        System.out.println("m1 method");
        int[] a = {20, 30, 30};
        return a;

    }

    void m2(double[] d) {
        System.out.println("m2 method");
        for (double dd : d) {
            System.out.println(dd);
        }

    }

    public static void main(String[] args) {

        //one print inside m1 method and secod print in main method
        TestArray t = new TestArray();// object creation
        int[] x = t.m1();

        for (int xx : x) {// for each loop
            System.out.println(xx);
        }

        //Both time print inside m2 method
        double[] d = {10.6, 12.7, 20.5};//Declaration and Initialization
        t.m2(d); // m2 method called and pass the value

        /*multidimensional array*/
        int[][] a = {{10, 20, 30}, {40, 50, 60}};
        System.out.println("multidimensional array value " + a[0][1]);
        System.out.println("multidimensional array value " + a[1][0]);
        System.out.println("multidimensional array value " + a[0][2]);
    }

}
