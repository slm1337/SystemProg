package com.exp.Graph.renderer;

import org.lwjgl.opengl.GL11;
import com.exp.Graph.models.Vao;
public class SimpleRenderer {
    private void prepare(){
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        GL11.glClearColor(0,0,1,1);
    }
    public void renderVao(Vao vao){
        prepare();
        vao.render();
    }
}
