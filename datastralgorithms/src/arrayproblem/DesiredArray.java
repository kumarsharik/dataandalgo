package arrayproblem;

public class DesiredArray {
	
public static int stepsToGetDesiredArray(int darr[]) {
	int result=0;
	int countzero=0;
	while(countzero<darr.length) {
		for (int i = 0; i < darr.length; i++) {
			
		}
	for (int i = 0; i < darr.length; i++) {
		if(darr[i]%2!=0) {
			darr[i]=darr[i]-1;
			result++;
		}
		else if(darr[i]==0) {
			countzero++;
		}
		
	}
	for (int i = 0; i < darr.length; i++) {
	if(darr[i]%2==0) {
			darr[i]=darr[i]/2;
			result++;
		}
	}}
	
	return result;
}
public static void main(String[] args) {
	int arr[]= {2, 3};
	System.out.println(stepsToGetDesiredArray(arr));
}

}