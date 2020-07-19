package net.client.Entity;

public abstract class Entity {
    private int Entity_X_Velocity;
    private int Entity_Y_Velocity;
    private int Entity_X_Position;
    private int Entity_Y_Position;
    private String Entity_Name;
    private EntityData Entity_Data;
    public Entity(EntityData entitydata){
       this.Entity_Data = entitydata;
    }
    public int getXVelocity() {
        return Entity_X_Velocity;
    }

    public void setXVelocity(int entity_X_Velocity) {
        Entity_X_Velocity = entity_X_Velocity;
    }

    public int getYVelocity() {
        return Entity_Y_Velocity;
    }

    public void setYVelocity(int entity_Y_Velocity) {
        Entity_Y_Velocity = entity_Y_Velocity;
    }

    public int getXPosition() {
        return Entity_X_Position;
    }

    public void setXPosition(int entity_X_Position) {
        Entity_X_Position = entity_X_Position;
    }

    public int getYPosition() {
        return Entity_Y_Position;
    }

    public void setYPosition(int entity_Y_Position) {
        Entity_Y_Position = entity_Y_Position;
    }

    public String getName() {
        return Entity_Name;
    }

    public void setName(String entity_Name) {
        Entity_Name = entity_Name;
    }

    public abstract void OnCullsion();
    public void SendEntityData(){

    }
    public void RecieveEntityData(){

    }
    public abstract void Draw();
    public abstract void Update();
}
