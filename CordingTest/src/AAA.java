
public class AAA {
	
	public int dnum(int input){
		int times = 1;
		int dnum = 0;
		
		while(true) {
			if(dnum == 10) {
				return dnum;
			}
			times *= 10;
			dnum++;
			
			if(input < times) {
				return dnum;
			}
		}
	}
	
	public int xTen(int input) {
		int num = 1;
		
		for(int i = 0; i < input; i++) {
			num *= 10;
		}
		return num;
	}
	
	public int searchValue(int input, int search) {
		int inputDnum = dnum(input);
		int searchDnum = dnum(search);
		int count = 0;
		
		for(int i = 0; i < inputDnum; i++) {
			int divide = xTen(dnum(input) - searchDnum);
			
			if(input / divide == search) {
				count++;
			}
			input = input % xTen(dnum(input) - 1);
			divide /= 10;
		}
		return count;
	}
	public int searchValueTotal(int start, int end, int searchValue) {
		int total = 0;
		
		for(int i = start; i < end; i++) {
			int input = start;
			start++;
		}
		return total;
	}

	
	
}
