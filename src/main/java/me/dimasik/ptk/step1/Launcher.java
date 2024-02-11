package me.dimasik.ptk.step1;

public final class Launcher {
    public static void main(String[] args) {
        boolean bool = true; // default false
        byte b = 0b1111011;
        short s = 12312; // useless. A lot of compilers (or runtime environments) cast 16 short to 32 int
        int i = 123123;
        long l = 123123L;

        float f = 123.2F; // 32b
        double d = 123.2; // 64b

        String string = "123";

        // All primitives have wrapper class (for use it like reference data type)
        // boolean -> Boolean
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double

        Integer integerView = 123;
        System.out.println(integerView.getClass());
        System.out.println(int.class);

        int[] array = new int[5]; // {0, 0, 0, 0, 0}
        array = new int[] {1, 2, 3};

        System.out.println(bool);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(string);
    }
}
