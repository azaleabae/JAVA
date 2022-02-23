// �ڵ� �ۿ°��� 

// ���� ������
	// �ؾ� �ɰ͵��� �ܰ躰�� ������.
	// �ܰ躰�� ���� �͵鿡 ���� ������ �����Ѵ�.
	// �ּ��� ��ü������ �޾��༭ ���߿� ���� ���ذ� �� �ֵ��� �ؾ���
	// �޼��尡 ������ ���� ������ toLowerCase ����� ���������� ������ ���� ������ �ִ�.
	// �޼���� ��¿ �� ���� �ܿ��� �ڴ�.

class CreateID1 {
    public String CreateID1(String ID) {
 
        ID = ID.toLowerCase(); // 1�ܰ�) ��� �빮�ڸ� �ҹ��ڷ� ġȯ
 
        String pattern = "[^-_.0-9a-z]";
        ID = ID.replaceAll(pattern, ""); // 2�ܰ�) ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� ����
 
        pattern = "\\.{2,}";
        ID = ID.replaceAll(pattern, "."); // 3�ܰ�) ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
 
        if (ID.charAt(0) == '.') // 4�ܰ�) ��ħǥ(.)�� ó���� ��ġ�ϸ� ����
            ID = ID.substring(1);
 
        if (!"".equals(ID) && ID.charAt(ID.length() - 1) == '.') // 4�ܰ�) ��ħǥ(.)�� ���� ��ġ�ϸ� ����
            ID = ID.substring(0, ID.length() - 1);
 
        if ("".equals(ID)) // 5�ܰ�) �� ���ڿ��̶��, new_id�� "a"�� ����
            ID = "a";
 
        // 6�ܰ�) ���̰� 16�� �̻��̸�,
        if (ID.length() >= 16) {
            ID = ID.substring(0, 15); // ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����
            if (ID.charAt(ID.length() - 1) == '.') // 4�ܰ�) ��ħǥ(.)�� ���� ��ġ�ϸ� ����
                ID = ID.substring(0, ID.length() - 1);
        }
 
        // 7�ܰ�) ���̰� 2�� �����̸�,
        if (ID.length() <= 2) {
            while (ID.length() < 3) {
                ID += ID.substring(ID.length() - 1);
            }
        }
 
        return ID;
    }
}

//// �����غ��� �ɰ�

// public String?
// 18��° �� ���� �ǹ�����