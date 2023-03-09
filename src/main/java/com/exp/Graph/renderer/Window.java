package com.exp.Graph.renderer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;

public class Window {

    public long windowID;
    public void createWindow (int width, int height, String title){
        boolean initState = GLFW.glfwInit();

        if(!initState){
            throw new IllegalStateException("could not create GLFW");
        }

        windowID = GLFW.glfwCreateWindow(width, height, title, MemoryUtil.NULL, MemoryUtil.NULL);

        if (windowID == MemoryUtil.NULL){
            throw new IllegalStateException("Can't make window");
        }

        GLFW.glfwMakeContextCurrent(windowID);
        GLFW.glfwSwapInterval(1);
        GLFW.glfwShowWindow(windowID);
        GL.createCapabilities();

    }

    public void updateWindow(){
        GLFW.glfwSwapBuffers(windowID);
        GLFW.glfwPollEvents();
        GLFW.glfwSwapInterval(1);
    }

    public void closeWindow(){
        GLFW.glfwSwapBuffers(windowID);
        GLFW.glfwTerminate();
    }

    public boolean shouldClose(){
        return GLFW.glfwWindowShouldClose(windowID);
    }
}
