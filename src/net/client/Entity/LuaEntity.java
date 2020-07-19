package net.client.Entity;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.JsePlatform;

public class LuaEntity extends Entity{
    public LuaEntity(EntityData entitydata) {
        super(entitydata);
      Globals globals = JsePlatform.standardGlobals();
      LuaValue value = CoerceJavaToLua.coerce(this);
      globals.set("Entity",value);
      LuaValue code = globals.load("Entity.Draw()");
    }

    @Override
    public void OnCullsion() {

    }

    @Override
    public void Draw() {
          System.out.println("Test");
    }

    @Override
    public void Update() {

    }
}
