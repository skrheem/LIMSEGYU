package chap05;

import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Grade A = Grade.A;
        Grade B = Grade.B;
        Grade C = Grade.C;
        Grade D = Grade.D;
        Grade F = Grade.F;
        Scanner in = new Scanner(System.in);

        System.out.println("성적을 입력하려는 학생의 수는 몇 명 입니까?");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요 : ");
        for (int i = 0; i < numOfStudents; i++) {
            scores[i] = in.nextInt();
        }
        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < scores.length; i++)
			System.out.print(scores[i] + " ");
        System.out.print("\n");
//        for (int s : scores) {
//            if (s >= 90)
//                System.out.println("A");
//            else if (s >= 80)
//                System.out.println("B");
//            else if (s >= 70)
//                System.out.println("C");
//            else if (s >= 60)
//                System.out.println("D");
//            else
//                System.out.println("F");
//        }
        for(int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90)
                System.out.println((i+1) + "번 학생의 등급은 " + A.getDescription());
            else if (scores[i] >= 80)
                System.out.println((i+1) + "번 학생의 등급은 " + B.getDescription());
            else if (scores[i] >= 70)
                System.out.println((i+1) + "번 학생의 등급은 " + C.getDescription());
            else if (scores[i] >= 60)
                System.out.println((i+1) + "번 학생의 등급은 " + D.getDescription());
            else
                System.out.println((i+1) + "번 학생의 등급은 " + F.getDescription());
        }
    }
    public enum Grade {
        A("최우수입니다."),
        B("우수입니다."),
        C("보통입니다."),
        D("미흡입니다."),
        F("탈락입니다.");

        private final String description;

        Grade(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
