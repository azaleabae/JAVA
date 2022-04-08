import java.util.HashSet;
import java.util.TreeSet;

// 김씨와 이씨는 각각 몇 명 인가요?
// "이재영"이란 이름이 몇 번 반복되나요?
// 중복을 제거한 이름을 출력하세요.
// 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
public class DupulicateName {

	public static void main(String[] args) {

		String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";

		String[] name = input.split(",");

		int countKim = 0;
		int countLee = 0;
		int countLjy = 0;

		HashSet<String> hash = new HashSet<>(); // 중복허용은 안하지만 순서는 뒤죽박죽
		TreeSet<String> tree = new TreeSet<>();	// 중복허용도 안하고 순서 자동정렬

		for (int i = 0; i < name.length; i++) {
			hash.add(name[i]);
			tree.add(name[i]);

			if (name[i].startsWith("김"))
				countKim++;

			if (name[i].startsWith("이"))
				countLee++;

			if (name[i].equals("이재영"))
				countLjy++;

		}

		System.out.println("김씨는 " + countKim + "명이고 이씨는 "+ countLee + "명 입니다.");
		System.out.println("이재영씨는 " + countLjy + "명 입니다.");
		System.out.println();
		System.out.println(hash);
		System.out.println();
		System.out.println(tree);

	}

}
