public class DeliveryPartner extends IPartner {
        DeliveryPartner(String pName){
            super(pName);
        }

        void performDelivery(String pOrderId, DeliveryMetaData pDeliveryMetaData){
            double restaurantLocLatitude = pDeliveryMetaData.getRestaurantLoc().getLatitude();
		    double restaurantLocLongitude = pDeliveryMetaData.getRestaurantLoc().getLongitude();

            // wait(5);
            for(int i =0; i <1000000; i++){}

            System.out.println(pOrderId +" " + name + " delivery picked up!");
            
            // wait(5);
            for(int i =0; i <1000000; i++){}
            
            System.out.println(pOrderId +" " + name + " delivery on the way!");
            
            // wait(5);
            for(int i =0; i <1000000; i++){}

            double userLocLatitude = pDeliveryMetaData.getUserLoc().getLatitude();
		    double userLocLongitude = pDeliveryMetaData.getUserLoc().getLongitude();

            //wait(5);
            for(int i =0; i <1000000; i++){}

            System.out.println(pOrderId +" " + name + " delivered the order. CONGRATULATIONS!!!");            
        }
}
