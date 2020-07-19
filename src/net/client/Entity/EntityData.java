package net.client.Entity;

import java.awt.*;

public class EntityData{
    //Entity Data
    private String name;
    private Rectangle Sprite;
    private int id;
    private int posX;
    private int posY;
    private int X_Speed;
    private int Y_Speed;
    public EntityData(String entity_name,Rectangle Entity_Sprite,int Entity_posX,int Entity_posY,int Entity_X_Speed,int Entity_Y_Speed,int Entity_ID){
        this.name = entity_name;
        this.Sprite = Entity_Sprite;
        this.posX = Entity_posX;
        this.posY = Entity_posY;
        this.X_Speed = Entity_X_Speed;
        this.Y_Speed = Entity_Y_Speed;
        this.id = Entity_ID;
    }

}
