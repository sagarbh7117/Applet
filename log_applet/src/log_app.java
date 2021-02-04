/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Lenovo
 */
public class log_app extends Applet implements ActionListener {

    TextField name,pass;
    Label n,p,w;
    Button s,c;
    public void init() {
        n= new Label ("NAME:");
    name = new TextField(20);
    add (n);
    add(name);
    p= new Label ("PASSWORD:");
    pass = new TextField(20);
    add (p);
    add(pass);
    s = new Button ("SUBMIT");
    add (s);
    s.addActionListener(this);
    w= new Label ("Please Login");
    add (w);
    
    
        n.setBounds(350, 100, 100, 20);
        name.setBounds(450, 100, 200, 20);
        p.setBounds(350, 130, 100, 20);
        pass.setBounds(450, 130, 200, 20);
        add(n);
        add(name);
        add(p);
        add(pass);
        add(s);
        c = new Button("CANCEL");
    add(c);
        s.addActionListener(this);
        add(w);
        setVisible(true);
        setSize(200, 200);
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   public void actionPerformed(ActionEvent event){
    if(event.getSource()==s) {
        if(name.getText().equals("Scards") && pass.getText().equals("123"))
        {
            w.setText("SUCCESS");
        } else {
            w.setText("FAILED");
        }
    }
   }
}
    
    // TODO overwrite start(), stop() and destroy() methods

  