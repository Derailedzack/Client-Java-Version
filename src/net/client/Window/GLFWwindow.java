package net.client.Window;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.opengl.GLXARBCreateContext;

import java.nio.ByteBuffer;

public class GLFWwindow extends Window {
    private long GLFWwin;
    public GLFWwindow(int windowWidth, int windowHeight) {
        super(windowWidth, windowHeight);
    }

    @Override
    public void CreateWindow() {

      if(!GLFW.glfwInit()){
          throw new RuntimeException("Failed to initialize GLFW!");
      }

      GLFWwin = GLFW.glfwCreateWindow(width,height,"Test",0L,0L);
      if(GLFWwin == 0L){
          throw new RuntimeException("Failed to create GLFW Window!");
      }
      while (GLFW.glfwWindowShouldClose(GLFWwin)){

      }

    }
}
