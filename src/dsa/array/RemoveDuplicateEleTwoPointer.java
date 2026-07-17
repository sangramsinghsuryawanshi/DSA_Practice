package dsa.array;

public class RemoveDuplicateEleTwoPointer {
    public static void main(String[] args) {
        int []a={0,0,1,1,1,2,2,3,3,4};
        int k=1;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[k-1]){
                a[k] = a[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
