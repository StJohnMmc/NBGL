/*
* JGameArena.java                                                                                       *
*                                                                                                       *
*(c)Copyright - 2015                                                                                    *
*Written by Baldvicio,Jonathan Eldy I.                                                                  *
*                                                                                                       *
*This class creates an window that is graphics painted on it but the problem is this window can't be    *
*seen on Windows taskbar.                                                                               *
*/
package com.github.nbgl.gui;

import javax.swing.JWindow;
import java.awt.Toolkit;
import java.awt.Graphics;

public abstract class JGameArena extends JWindow{
 public JGameArena(){
  this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
 }
 @Override public void paint(Graphics g){
 }
}
