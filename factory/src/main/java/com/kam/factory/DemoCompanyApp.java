package com.kam.factory;

public class DemoCompanyApp {

    private LogisticsCompanyFactory companyFactory;

    DemoCompanyApp(LogisticsCompanyFactory factory){
        this.companyFactory = factory;
        System.out.println("DemoApp created");
    }

    static LogisticsCompanyFactory applicationConfiguration(String type){
        if (type.equals("road")) {
            return new RoadLogisticsFactory();
        }if(type.equals("sea")){
            return new SeaLogisticsFactory();
        }else{
            throw new IllegalArgumentException("Invalid type: " + type);
        }
    }

    void planDelivery(){
        companyFactory.planDelivery().deliver();
    }


    public static void main(String[] args) {

        DemoApp app = new DemoApp(applicationConfiguration("road"));

        app.planDelivery();


    }
}
