package net.client.Inventory;

public abstract class Inventory {
    public void CreateInventory(){

    }
    public abstract String GetInventoryName();
    public abstract void OnSlotChanged(Item item);
}
