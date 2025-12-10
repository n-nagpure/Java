//Write a Java Program to create Lamp using applet.
//LampApplet.java File:
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class LampApplet extends Applet implements ActionListener {
 boolean isOn = false;
 Button onBtn, offBtn;
 public void init() {
 onBtn = new Button("Turn ON");
 offBtn = new Button("Turn OFF");
 add(onBtn);
 add(offBtn);
 onBtn.addActionListener(this);
 offBtn.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == onBtn) {
 isOn = true;
 } else if (e.getSource() == offBtn) {
 isOn = false;
 }
 repaint();
 }
 public void paint(Graphics g) {
 g.setColor(Color.BLACK);
 g.drawOval(80, 80, 100, 150);
 if (isOn)
 g.setColor(Color.YELLOW);
 else
 g.setColor(Color.GRAY);
 g.fillOval(100, 120, 60, 80);
 }
}

//LampApplet.html File:

<!DOCTYPE html>
<html>
<head>
 <title>Lamp Applet</title>
</head>
<body>
 <h2>Interactive Lamp Applet</h2>
 <applet code="LampApplet.class" width="300" height="200">
 Your browser does not support Java Applets.
 </applet>
</body>
</html>
