
public class Minmax {

	public static int getSmallest(int[] a, int total){  
		int temp,min,max;  
		int sum =0;
		for (int i = 0; i < 5; i++)   
		        {  
		            for (int j = i + 1; j < 5; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		min = a[0];
		for(int i =0;i <a.length;i++){
			
			if(a[i] != min){
			sum = sum+a[i];}
		}System.out.println("min"+sum);
		//Code for Maximum
		for (int i = 0; i < 5; i++)   
        {  
            for (int j = i + 1; j < 5; j++)   
            {  
                if (a[i] < a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
max = a[0];
for(int i =0;i <a.length;i++){
	
	if(a[i] != max){
	sum = sum+a[i];}
}System.out.println("max"+sum);
		       return a[0]; 
	}
	public static void main(String args[]){  
		int a[]={7,8,9,5,6};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Smallest: "+getSmallest(a,5));  
		System.out.println("Smallest: "+getSmallest(b,7));  
		}
}

