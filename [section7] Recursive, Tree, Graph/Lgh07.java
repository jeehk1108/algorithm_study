import java.util.*;
class Main {
	static int n;
	static int[] ch;
	public void DFS(int L){
		if(L==n+1){ // 부분집합 하나 만들어짐
			String tmp="";
			for(int i=1; i<=n; i++){
				if(ch[i]==1) tmp+=(i+" ");
			}
			// 공집합일 경우 출력 X
			if(tmp.length()>0) System.out.println(tmp);
		}
		else{
			// L원소에 대해 사용함(1)을 표시
			ch[L]=1;
			// 가지 뻗기 (ex. 왼쪽) -> 사용 O로 가정
			DFS(L+1);
			
			// L원소에 대해 사용하지않음(0)을 표시
			ch[L]=0;
			// 가지 뻗기 (ex. 오른쪽) -> 사용 X로 가정
			DFS(L+1);
		}
	}

	public static void main(String[] args){
		Main T = new Main();
		n=3;
		// 인덱스 0은 사용하지 않음
		ch=new int[n+1];
		T.DFS(1);
	}	
}