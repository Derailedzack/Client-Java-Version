package net.client.Window;

import java.lang.reflect.Method;
import java.util.function.Function;

public abstract class Window{
    protected int width;
    protected int height;

    public void SetResolution(int window_width,int window_height){
        this.width = window_width;
        this.height = window_height;

    }
    public Window(int windowWidth,int windowHeight){
        this.width = windowWidth;
        this.height = windowHeight;
    }
    public abstract void CreateWindow();
    enum WINDOW_TYPE{
        GL(null),
        SDL(null),
        GDI(null),
        DIRECTX(null),
        NONE(null),
        CUSTOM(null);

        WINDOW_TYPE(Object function) {
        }
    }
}
