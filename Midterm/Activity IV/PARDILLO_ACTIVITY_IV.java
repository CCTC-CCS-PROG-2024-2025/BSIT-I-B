import java.util.Scanner;
class GESITE_ACTIVITY_IV{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a non negative integer");
        
        int nni=sc.nextInt();
        //nni= non negative integer

        if (nni<0){
            System.out.println("please enter a non negative integer");
        }else{
            int factorial=1;

            for (int i=1;i<=nni;i++){
                factorial*=i;
                System.out.println("the factorial of"+nni+"is:"+factorial);
            }
        }
        
    }
}