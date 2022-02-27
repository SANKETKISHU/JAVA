class Test{
    Test(int a){
           System.out.println("Test:"+a);
    }
}

public class Test_1 extends Test{
    Test_1(int a){
        super(a);
        System.out.println("Test_1:"+a);
    }
    public static void main(String args[]){
        Test_1 t=new Test_1(100);
    }
}