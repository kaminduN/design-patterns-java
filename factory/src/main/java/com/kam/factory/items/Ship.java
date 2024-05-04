package com.kam.factory.items;

public class Ship implements Transport {
     @Override
     public void deliver() {
          System.out.println("Delivering by ship");
     }

     @Override
     public Transport createTransportVahicle() {
         return new Ship();
     }
}
