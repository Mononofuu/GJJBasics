package sort;

public class MergeSort {

    public static void sort(int[] target){
        int aSize = target.length%2==0?target.length/2:target.length/2 + 1;
        int[] a = new int[aSize];
        int[] b = new int[target.length-aSize];
        System.arraycopy(target,0,a,0,aSize);
        System.arraycopy(target,aSize,b,0,b.length);
        if (a.length>1)sort(a);
        if (b.length>1)sort(b);
        int[] result = merge(a,b);
        System.arraycopy(result,0,target,0,result.length);
    }

    private static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        int aIndex=0;
        int bIndex=0;
        while (aIndex+bIndex!=result.length+1){
            if (aIndex==a.length){
                System.arraycopy(b,bIndex,result,aIndex+bIndex,b.length-bIndex);
                break;
            }else if (bIndex==b.length){
                System.arraycopy(a,aIndex,result,aIndex+bIndex,a.length-aIndex);
                break;
            }
            if (a[aIndex]<b[bIndex]){
                result[aIndex + bIndex]=a[aIndex++];
            }else {
                result[aIndex + bIndex]=b[bIndex++];
            }
        }
        return result;
    }
}
