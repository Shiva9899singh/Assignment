class SearchArray{
	public boolean searchA(int[] a,int value) {
		boolean c = false;
		for(int e : a) {
			
			if(e == value) {
				c = true;
			    return c;
			}
			
		}
		return c;
	}
	
}
public class arrayfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int check = 19; 
		SearchArray obj = new SearchArray();
	System.out.print(obj.searchA(arr, check));
		
	}

}