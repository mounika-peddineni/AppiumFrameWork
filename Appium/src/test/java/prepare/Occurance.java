package prepare;

public class Occurance {
public static void main(String[] args) {
	int[]  arr = {10,20,30,40,40,50,20};

for(int i=0; i<arr.length; i++)
{
	int count = 1;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j]&&i!=j)
			count++;
	}
	if(count>=1)
		System.out.println("Frequency of "+arr[i]+":"+count);
}
}
}