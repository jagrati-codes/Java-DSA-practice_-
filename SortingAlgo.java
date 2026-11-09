public class SortingAlgo {
    static void bubblesort(int [] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){                 //rounds
        for(int j=0;j<n-1-i;j++){           //neighbouring elements ke comparison ke liye
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
   } 

    static void selectionsort(int [] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){                //rounds
        int minIndex=i;
        for(int j=i+1;j<n;j++){           //to find min Index value
            if(arr[minIndex]>arr[j]){
                minIndex=j;}
            }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

        }
    }

    static void insertionsort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int curr=i;                           //i=1 liya kyoki i=0 lete toh prev -1 ho jata
            int prev=i-1;
            int currVal=arr[curr];
            while(prev>=0 && currVal<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--; 
            }// ab hamare pass ek khali jagah aa gayi hai
            //place the current value
            arr[prev+1]=currVal;
        }
    }
   
   public static void main(String[] args) {
        int[] arr={5,7,8,0,1};
        bubblesort(arr);
        for(int val:arr){
        System.out.println(val);}

        selectionsort(arr);
        for(int val:arr){
        System.out.println(val);}

        insertionsort(arr);
        for(int val:arr){
        System.out.println(val);}
    }
}

    

