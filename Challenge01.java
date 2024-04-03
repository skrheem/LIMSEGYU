package chap05;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);

		System.out.println("성적을 입력하려는 학생의 수는 몇 명 입니까?");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요 : ");
		for (int i = 0; i < numOfStudents; i++) {
			scores[i] = in.nextInt();
		}
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
//		for (int i = 0; i < scores.length; i++)
//			System.out.println(scores[i]);
		for (int s : scores) {
			if (s >= 90)
				System.out.println("A");
			else if (s >= 80 && s < 90)
				System.out.println("B");
			else if (s >= 70 && s < 80)
				System.out.println("C");
			else if (s >= 60 && s < 70)
				System.out.println("D");
			else if (s < 60)
				System.out.println("F");
		}

	}

}
