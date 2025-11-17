package experiments;

public class Exceptions {
    public static void main(String[] args) {
        // целочисленные int - Integer
        // с плавающей точкой double  - Double
        // символьный char - Character
        // boolean - Boolean

        String[] strArray = {"str1", "str2", "str3"};
        // Boolean[] bolArray = {true, false, True, "true"};

        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        uncheckedException(strArray);
    }

    private static void uncheckedException(String[] strArray){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArray[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Created exception!!!");
        }
        System.out.println("Program is working");
    }

    private static void pause() throws InterruptedException {
        checkedException();
        System.out.println("pause 3 sec");
    }

    private static void checkedException() throws InterruptedException {
        Thread.sleep(3000);
    }
}

