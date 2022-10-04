class Sample {
    public int a;

    // b는 private으로 선언했으므로 AccessEx에서 접근
    // 할 수 없기 때문에 오류가 발생한다.
    // private int b;
    int b;

    int c;
}

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
        aClass.b = 10;
        aClass.c = 10;
    }
}

