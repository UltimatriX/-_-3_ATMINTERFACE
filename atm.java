public class atm{
    private double checkBalance;
    private double depositAmt;
    private double withdrawnAmt;
    public atm(){}
    public double getcheckBalance(){
        return checkBalance;
    }
    public void setcheckbalance(double checkBalance){
        this.checkBalance = checkBalance;
    }
    public double getdepositAmt(){
        return depositAmt;
    }
    public void setdepositAmt(double depositAmt){
        this.depositAmt = depositAmt;
    }
    public double getwithdrawnAmt(){
        return withdrawnAmt;
    }
    public void setwithdrawnAmt(double withdrawnAmt){
        this.withdrawnAmt = withdrawnAmt;
    }

}
