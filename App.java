import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        atmInterface op=new atmimplement();
        int atmNumber = 12345;
        int atmPin = 123;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("! Welcome to ATM Interface !");
            System.out.print("Enter ATM Number = ");
            int atmnumber=in.nextInt();
            System.out.print("Enter Your PIN = ");
            int pin=in.nextInt();
            if((atmNumber==atmnumber)&&(atmPin==pin)){
                while(true){
                    System.out.println("!!!     Welcome to ATM Machine    !!!");
                    System.out.println("1. Transaction history \n2. Withdraw \n3. Deposit \n4. Transfer \n5. Quit");
                    System.out.println("Enter choice = ");
                    int choice=in.nextInt();
                    if (choice==1){
                        op.viewtansactionHistory();
                        op.viewcheckBalance();
                    
                    }
                    else if(choice==2){
                        System.out.println("Enter amount = "); 
                        double withdrawAmt=in.nextDouble();
                        op.withdrawnAmt(withdrawAmt);
                    }
                    else if(choice==3){
                        System.out.println("Enter amount = ");
                        double depositAmt=in.nextDouble();
                        op.depositAmt(depositAmt);
                    }
                    else if (choice==4){
                        System.out.println("Currently In-active! Please try again later!");
                    }
                    else if(choice==5){
                        System.out.println("Thank you for using ATM.\nPlease collect your ATM Card.");
                        System.exit(0);
                    }
                    else{
                        System.out.println("Please enter a correct choice number!");
                    }
                }
            }
            else{
                System.out.println("Invalid ATM number or PIN!");
                System.exit(0);
            }
        }
    }
}
