package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.j3d.*;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.vecmath.*;

public class BallAnimation implements ActionListener {
    private Button go;
    private TransformGroup wholeBall;
    private Transform3D translateTransform;

    private JFrame mainFrame;

    private float xloc=0.3f;
    private float yloc=0.3f;
    private float zloc=0.0f;
    private int moveType = 0;
    private Timer timer;
    private boolean turn = true;
    private float angle = 0;
    private float dx = 0;
    private float dy = 0;

    public BallAnimation(TransformGroup wholeBall, Transform3D trans, JFrame frame){
        go = new Button("Go");
        this.wholeBall = wholeBall;
        this.translateTransform = trans;
        this.mainFrame = frame;

        timer = new Timer(50, this);

        Panel p = new Panel();
        p.add(go);
        mainFrame.add("North", p);
        go.addActionListener(this);
    }

    private void initialPlaneState(){
        xloc = -2.3f;
        yloc = .7f;
        dx = dy = 0;
        angle = (float) ( 5 * Math.PI/ 8);
        turn = true;
        moveType = 0;
//        if(timer.isRunning()) {
//            timer.stop();
//        }
//        go.setLabel("Go");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == go){
            if (!timer.isRunning()) {
                initialPlaneState();
                timer.start();
                go.setLabel("Stop");
            }
            else {
                timer.stop();
                go.setLabel("Go");
            }
        } else {
            move();
            translateTransform.setTranslation(new Vector3f(xloc, yloc, zloc));
            wholeBall.setTransform(translateTransform);
        }
    }

    private void move(){
        xloc += 0.08;
        if (moveType == 0 && xloc > -1.6)
            moveType++;
        if (moveType == 1) {
            angle += 0.6f;
            yloc -= 0.024 - 0.027 * Math.sin(angle);
        }
        if (xloc > 2)
            initialPlaneState();
    }
}
