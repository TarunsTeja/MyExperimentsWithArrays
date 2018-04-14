
public class sum {

	public static int getSmallest(int[] a, int total){  
		int xy,min,max;  
		int sumelements[]=new int[5];
		for (int i =0;i<=4;i++){
			xy = a[i];
			int plus =0;
			for(int k=0;k<=4;k++){
				
				if (a[k]==xy){
					continue;
				}else{
					plus=plus+a[k];
					}
			}
		sumelements[i]=plus;
		}
		
		       return a[0]; 
	}
	public static void main(String args[]){  
		int a[]={1,2,3,4,5};  
		//int b[]={44,66,99,77,33,22,55};  
		System.out.println("Smallest: "+getSmallest(a,5));  
	//	System.out.println("Smallest: "+getSmallest(b,7));  
		}
}

