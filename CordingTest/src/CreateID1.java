// 코드 퍼온거임 

// 보고 느낀점
	// 해야 될것들을 단계별로 나눈다.
	// 단계별로 나눈 것들에 대해 조건을 대입한다.
	// 주석은 구체적으로 달아줘서 나중에 봐도 이해갈 수 있도록 해야함
	// 메서드가 더럽게 많긴 하지만 toLowerCase 말고는 떠오르지도 않은걸 보면 갈길이 멀다.
	// 메서드는 어쩔 수 없이 외워야 겠다.

class CreateID1 {
    public String CreateID1(String ID) {
 
        ID = ID.toLowerCase(); // 1단계) 모든 대문자를 소문자로 치환
 
        String pattern = "[^-_.0-9a-z]";
        ID = ID.replaceAll(pattern, ""); // 2단계) 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
 
        pattern = "\\.{2,}";
        ID = ID.replaceAll(pattern, "."); // 3단계) 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
 
        if (ID.charAt(0) == '.') // 4단계) 마침표(.)가 처음에 위치하면 제거
            ID = ID.substring(1);
 
        if (!"".equals(ID) && ID.charAt(ID.length() - 1) == '.') // 4단계) 마침표(.)가 끝에 위치하면 제거
            ID = ID.substring(0, ID.length() - 1);
 
        if ("".equals(ID)) // 5단계) 빈 문자열이라면, new_id에 "a"를 대입
            ID = "a";
 
        // 6단계) 길이가 16자 이상이면,
        if (ID.length() >= 16) {
            ID = ID.substring(0, 15); // 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
            if (ID.charAt(ID.length() - 1) == '.') // 4단계) 마침표(.)가 끝에 위치하면 제거
                ID = ID.substring(0, ID.length() - 1);
        }
 
        // 7단계) 길이가 2자 이하이면,
        if (ID.length() <= 2) {
            while (ID.length() < 3) {
                ID += ID.substring(ID.length() - 1);
            }
        }
 
        return ID;
    }
}

//// 조사해봐야 될것

// public String?
// 18번째 줄 무슨 의미인지