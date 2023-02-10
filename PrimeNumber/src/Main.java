
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		int fac=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				fac++;
			}
		}
		System.out.println((fac==2)?"Prime":"Not Prime");
	}

}
