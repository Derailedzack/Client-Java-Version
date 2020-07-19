package net.client.Main;

import net.client.Entity.LuaEntity;
import net.client.Entity.Player.Player;
import net.client.Window.GLFWwindow;

public class Main {
    public static void main(String[] args){
        LuaEntity luaEntity = new LuaEntity(null);
        GLFWwindow window = new GLFWwindow(640,480);
        Player player = new Player(null);
        window.CreateWindow();
        player.Draw();
    }
}
