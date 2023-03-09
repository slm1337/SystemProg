package com.exp.Graph;

import com.exp.Graph.models.Vao;
import com.exp.Graph.renderer.SimpleRenderer;
import com.exp.Graph.renderer.Window;

public class MainApp {
    public static void main(String[] args) {
        Window window = new Window();
        window.createWindow(1280, 720, "Window");

        SimpleRenderer renderer = new SimpleRenderer();

        float[] vertices = {
                0, 0.75f, 0,
                -0.75f, -0.5f, 0,
                0.75f, -0.5f, 0,
        };

        int[] indices = { 0, 1, 2};

        Vao vao = new Vao();
        vao.bind();
        vao.createFloatAttribute(0, vertices, 3);
        vao.createIndexBuffer(indices);
        vao.unbind();


        while (!window.shouldClose()){
            renderer.renderVao(vao);

            window.updateWindow();
        }
        window.closeWindow();
    }
}
