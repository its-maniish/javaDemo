public class ternary {
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int c=30;
        int res;
        res=(a<b?(a>c?c:a):(a<c?b:c));
        System.out.println(res);
    }
    
}
