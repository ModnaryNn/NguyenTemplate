package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;

public class ML extends MouseAdapter implements MouseMotionListener {
    public boolean isPressed = false;
    public double x,y;

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        isPressed = true;
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        isPressed = false;
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public boolean isPressed(){
        return isPressed;
    }

}
