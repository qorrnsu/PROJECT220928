import java.util.Scanner;

public class WordGameApp {

    static String[] word = {"아버지", ""};
    static Scanner sc = new Scanner(System.in);
    static Player[] player;

    static void run() {
        int num;
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        num = sc.nextInt();
        player = new Player[num];
    }

    public static void main(String[] args) {

        System.out.println("끝말잇기 게임을 시작합니다...");

        run();

        for (int i = 0; i < player.length; i++) {
            player[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요>>");
            player[i].name = sc.next();
        }

        System.out.println("시작하는 단어는 " + word[0] + "입니다");

        boolean check = true;
        while (check) {

            for (Player value : player) {

                System.out.print(value.name + ">>");
                word[1] = value.getWordFromUser();
                check = value.checkSuccess();
                word[0] = word[1];

                if (!check) {
                    System.out.print(value.name + " 님이 졌습니다.");
                    break;
                }

            }

        }

    }
}

class Player{

    String name;

    String getWordFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    boolean checkSuccess() {
        char lastChar = WordGameApp.word[0].charAt(WordGameApp.word[0].length()-1);
        char firstChar = WordGameApp.word[1].charAt(0);

        return lastChar == firstChar;
    }

}


