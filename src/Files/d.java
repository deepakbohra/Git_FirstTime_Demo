package Files;

public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr= {11,5,2,11,1,8,44,8};
		int len=intArr.length;
		System.out.println("Duplicate element in the Array is: ");
		
		for(int i=0;i<len;i++)
		{for(int j=i+1; j<len;j++)
			{if(intArr[i]==intArr[j])
				System.out.println(intArr[j]);
				}
		
		System.out.println("Chagig in the master");
		} 
	}

	

}
