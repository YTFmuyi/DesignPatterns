package com.yangtengfei.applet;

import java.applet.*;
import java.awt.*;

/**
 * @author yangtengfei
 * @version 1.0
 */
public class HelloWorldApplet extends Applet
{
    public void paint (Graphics g)
    {
        g.drawString ("Hello World", 25, 50);
    }
}
