package net.client.Inventory;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    private int Item_ID;
    private String Item_Name;
    private List<Item> item_list = new ArrayList<>();
    public Item(int id,String name){
        this.Item_ID = id;
        this.Item_Name = name;
    }
    public void GetItemFromName(String item_name){

    }
    public void GetItemFromID(int item_id){

    }
    public void RegisterItems(){

    }
    public abstract void OnUse();
}
