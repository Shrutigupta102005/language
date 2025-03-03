public class mergeSort{

	public static void main(String[] args) {
		int[] arr= {5,7,3,4,2};
		int[] ans=sort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+" ");
		}
		
	}
	public static int[] sort(int[] arr,int s,int e) {
		if(s==e){
			int[] bs=new int[1];
			bs[0]=arr[s];
			return bs;
		}
		int mid=(s+e)/2;
		int[] a=sort(arr,s,mid);
		int[] b=sort(arr,mid+1,e);
		return merge(a,b);
		
	}
	public static int[] merge(int[] arr1,int[] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int[] arr=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[k]=arr2[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			arr[k]=arr1[i];
			k++;
			i++;
		}
		while(j<m) {
			arr[k]=arr2[j];
			k++;
			j++;
		}
		return arr;
		
	}

}