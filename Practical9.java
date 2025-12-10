// Write a program to create an application which shows the menu.  

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

 class MyMenu extends Frame {
    MenuBar bar;
    Menu menu1, menu2, menu3;
    MenuItem MenuItem1, MenuItem2, MenuItem3, MenuItem4;
    MyMenu(String s)
    {
        super(s);
        setSize(400, 400);
        bar= new MenuBar();
        menu1 = new Menu("FILE");
        menu1 = new Menu("EDIT");
        menu1 = new Menu("VIEW");
   
        MenuItem1= new MenuItem("NEW");
        MenuItem2= new MenuItem("OPEN");
        MenuItem3= new MenuItem("SAVE");
        MenuItem4= new MenuItem("EXIT");
        
        menu1.add(MenuItem1);
        menu1.add(MenuItem2);
        menu1.add(MenuItem3);
        menu1.add(MenuItem4);
        
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
      
        setMenuBar(bar);
    }
    public static void main(String args[])
    {
        MyMenu m = new MyMenu("MyMenu");
        m.setVisible(true);

    }  
    }
