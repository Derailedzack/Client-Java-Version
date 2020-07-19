package net.client.Entity.Player;

import net.client.Entity.Entity;
import net.client.Entity.EntityData;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLX;

public class Player extends Entity {
    public Player(EntityData entitydata) {
        super(entitydata);
    }

    @Override
    public void OnCullsion() {

    }

    @Override
    public void Draw() {
        GLX.glXGetCurrentContext();
        GL11.glBegin(GL11.GL_POLYGON);
        GL11.glVertex3f(0.0f,0.0f,0.0f);
        GL11.glVertex3f(1.0f,1.0f,1.0f);
        GL11.glVertex3f(-1.0f,-1.0f,-1.0f);
        GL11.glVertex3f(1.0f,0.0f,0.0f);
        GL11.glVertex3f(0.0f,1.0f,0.0f);
        GL11.glVertex3f(0.0f,0.0f,1.0f);
        GL11.glVertex3f(-1.0f,-0.0f,-0.0f);
        GL11.glVertex3f(-0.0f,-1.0f,-0.0f);
        GL11.glVertex3f(-0.0f,-0.0f,-1.0f);
        GL11.glEnd();
    }

    @Override
    public void Update() {
   Draw();
    }
    public void SendPlayerData(){

    }
    public void RecievePlayerData(){

    }
}
