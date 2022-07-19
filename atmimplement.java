import java.util.HashMap;
import java.util.Map;

public class atmimplement implements atmInterface{
    atm Atm=new atm();
    Map<Double,String> ministatement=new HashMap<>();
    
    @Override
    public void viewcheckBalance(){
        System.out.println("Available Balance = "+Atm.getcheckBalance());

    }
   
    @Override
    public void withdrawnAmt(double withdrawnAmt){
        if((withdrawnAmt%500==0)||(withdrawnAmt%200==0)||(withdrawnAmt%100==0)){
            if(withdrawnAmt<=Atm.getcheckBalance()){
                ministatement.put(withdrawnAmt, " amount withdrawn.");
                System.out.println("Collect "+withdrawnAmt+" amount");
                Atm.setcheckbalance(Atm.getcheckBalance()-withdrawnAmt);
                viewcheckBalance();
            }
            else{
                System.out.println("Insufficient Funds in your account");
            }
        }
        else{
            System.out.println("Please enter the amount in the multiples of 100, 200, 500.");
        }
        

    }
    
    @Override
    public void depositAmt(double depositAmt){
        ministatement.put(depositAmt, " ammount deposited.");
        System.out.println(depositAmt+" deposited Successfully.");
        Atm.setcheckbalance(Atm.getcheckBalance()+depositAmt);
        viewcheckBalance();
    }
   
    @Override
    public void viewtansactionHistory(){
        for(Map.Entry<Double,String> m:ministatement.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }

}
