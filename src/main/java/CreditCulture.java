public class CreditCulture {
    public static void main(String[] args) {

    }
    public double  monthlyPayment( int sumOfcredit,int numberOfMonths,double monthsBid){
        double result =  sumOfcredit * (monthsBid * Math.pow(monthsBid + 1,numberOfMonths))/
                (Math.pow(monthsBid + 1,numberOfMonths)-1);
        return result;
    }
    public int totalAmount(double monthsBid,int numberOfMonth,double sumOfCredit){
        int result = (int) (((++numberOfMonth)*sumOfCredit*(monthsBid/2))+sumOfCredit);
        return result;

    }
    public double overpayments(int numberOfMonth,int sumOfCredit,double monthsBid){
        double result = (++numberOfMonth)*sumOfCredit*(monthsBid/2);
        return result;
    }
}
