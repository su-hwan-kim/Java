package sec02.exam07;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {

        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        // strArray[0]과 strArray[2] 서로 다른 객체를 참조
        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);

        // equals 문자열 비교
        System.out.println(strArray[0].equals(strArray[2]));
    }

}
