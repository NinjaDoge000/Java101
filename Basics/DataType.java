class main {

    public static void main(String args[]) {

        // primitive
        
        byte b = 100;                // 1 byte
        short s = 3000;              // 2 bytes
        int num = 30;                // 4 bytes
        long l = 1000L;              // 8 bytes
        float f = 3.14f;             // 4 bytes
        double d = 3.14;             // 8 bytes
        char c = 'a';                // 2 bytes
        boolean bool = true;         // 1bit or bytes JVM dependent
        String str = "Hello Java";

        System.out.println(str);

        // type conversion casting
        int a = 1000;
        byte by = (byte) a;
        
        System.out.println(by);
        
    }
}