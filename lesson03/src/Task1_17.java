public class Task1_17 {

    static int functionR(int x){
        return (int) ((Math.sqrt(x+1) + Math.sqrt(x-1))/(2*Math.sqrt(x)));
    }

    static int functionS(int x){
        return Math.abs(x) + Math.abs(x+1);
    }
}
