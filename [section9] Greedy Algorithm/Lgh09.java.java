package sec9;

import java.util.*;

class Time implements Comparable<Time> {
	public int s, e;
	
	Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	//정렬
	@Override
	public int compareTo(Time o) {
		if (this.e==o.e) //끝나는 시간이 같으면
			return this.s-o.s;	//오름차순 정렬 (시작시간)
		else 
			return this.e-o.e;	//(끝나는 시간)
	}
}


public class No9 {
	
	public int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		
		Collections.sort(arr);
		
		int et = 0;
		for (Time ob : arr) {
			if (ob.e >= et) {
				cnt ++;
				et = ob.e;
			}
		}
		
		return cnt;
	}
	
	
	public static void main(String[] args) {
		No9 T = new No9();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			int x = kb.nextInt();
			int y = kb.nextInt();
			arr.add(new Time(x,y));
		}
		
		System.out.println(T.solution(arr, n));
	}
}
