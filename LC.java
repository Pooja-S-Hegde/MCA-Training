public class LC {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
    int arr[]={1,0,1,0,1,0};
    int n=arr.length;
    int i=0,j=n-1;
    while(i<j){
        if(arr[i]==1 && arr[j]==0){
            swap(arr,i,j);
            i++;
            j--;
        }else {
                if (arr[i] == 0) i++;
                if (arr[j] == 1) j--;
            }

    }
      for (int k = 0; k < n; k++) {
            System.out.println(arr[k] + " ");
        }
    }
}
