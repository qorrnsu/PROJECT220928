import java.util.Arrays;
import java.util.Scanner;

class Seat {

    private final String[] seat = new String[10];

    public Seat() {
        Arrays.fill(seat, "---");
    }

    public void show() {
        for (String s : seat) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void set(String name, int num) {
        seat[num-1] = name;
    }

    public boolean reset(String name) {
        for (int i = 0; i < seat.length; i++) {
            if (name.equals(seat[i])) {
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}

class Reservation {
    Scanner sc = new Scanner(System.in);
    private final Seat[] s;
    private final String[] seatGrade = {"S", "A", "B"};

    public Reservation() {
        s  = new Seat[3];
        for (int i = 0; i < s.length; i++) s[i] = new Seat();
    }

    public void reserve() {

        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int grade = sc.nextInt();

        System.out.print(seatGrade[grade-1]+">>");
        s[grade-1].show();

        System.out.print("이름>>");
        String name = sc.next();

        System.out.print("번호>>");
        int num = sc.nextInt();

        s[grade-1].set(name, num);

    }

    public void check() {

        for (int i = 0; i < s.length; i++ ) {
            System.out.print(seatGrade[i] + ">>");
            s[i].show();
        }

        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>");
        int grade = sc.nextInt();

        System.out.print(seatGrade[grade-1]+">>");
        s[grade-1].show();

        System.out.print("이름>>");
        String name = sc.next();

        boolean result = s[grade-1].reset(name);

        System.out.println(result ? "<<<취소를 완료하였습니다.>>>" : "존재하지 않는 정보입니다.");
    }

    public void run() {

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");

            int option = sc.nextInt();

            switch(option) {
                case 1:
                    reserve();
                    break;
                case 2:
                    check();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    return;
            }

        }

    }

}

public class ReservationSystem {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Reservation r = new Reservation();
        r.run();
    }
}

