package BackToSenderLogistics;

public class DispatchRiders {
    static int basePay = 5000;
    static int amountPerParcel = 0;

    public static int ridersPayment(int successfulDelivery){
        if(successfulDelivery <= 0) throw new InvalidInputException("Invalid input");
        if(successfulDelivery >= 1 && successfulDelivery <= 50) amountPerParcel = 160;
        if(successfulDelivery > 50 && successfulDelivery <= 59) amountPerParcel = 200;
        if(successfulDelivery > 59 && successfulDelivery <= 69) amountPerParcel = 250;
        if(successfulDelivery >= 70) amountPerParcel = 500;

        return successfulDelivery * amountPerParcel + basePay;
    }
}
