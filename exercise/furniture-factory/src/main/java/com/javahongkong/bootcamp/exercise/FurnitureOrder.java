package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        ordersOfFurnitures.put(type,furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() { //hashmap loop
        // TODO: Complete the method
        float totalCost = 0.0f;
        for ( Furniture type : ordersOfFurnitures.keySet()){
            int quantity = ordersOfFurnitures.get(type);
             float cost = type.cost();
             totalCost += quantity * cost;
        }
        return totalCost;
    }

    public int getTypeCount(Furniture type) { //
        // TODO: Complete the method
        return ordersOfFurnitures.getOrDefault(type,0);
    }

    public float getTypeCost(Furniture type) { // 
        // TODO: Complete the method
        int quantity = ordersOfFurnitures.getOrDefault(type,0);
        float cost = type.cost();
        return quantity * cost;
    }

    public int getTotalOrderQuantity() { // 
        // TODO: Complete the method
        int totalQuantity = 0;
        for (int quantity : ordersOfFurnitures.values()){
            totalQuantity += quantity;
        }
        return totalQuantity;
    }   
}