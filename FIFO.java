import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        int list1[] = {4,7,6,1,7,6,1,2,7,2};
        //int list1[] = {1,2,3,4,1,2,5,1,2,3,4,5};
//        int list1[]= {3,2,1,3,4,1,6,2,4,3,4,2,1,4,5,2,1,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Frames: ");
        int F = sc.nextInt();
        int Fifo[] = new int[F];
        boolean check = false;
        int Hit =0;
        for (int i = 0; i < list1.length; i++)
        {
            for (int j=0; j<Fifo.length; j++){
                if(list1[i]==Fifo[j]){
                    check = true;
                    break;
                }
            }
            if(check){
                Hit++;
                check = false;
                for (int j=0; j<Fifo.length; j++){
                    System.out.print(Fifo[j]+" ");
                }
                System.out.print("\n");
            }else{
                Fifo[(i-Hit)%F] = list1[i];
            }
        }
        System.out.println("No of Hits : "+Hit);
        System.out.println("No of Miss : "+(list1.length-Hit));
    }
}
