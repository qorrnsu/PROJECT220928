public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;

        a = null; // 이 부분에서 가비지가 발생한다.
        d = c;
        c = null;
    }
}
