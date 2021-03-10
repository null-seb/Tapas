package offer.easy;

public class printNumbers {
    public int[] printNumbers(int n){
        int end=(int)Math.pow(10,n);
        int[] res=new int[end];
        for (int i=0;i<end;i++){
            res[i]=i+1;
        }
        return res;
    }
}
