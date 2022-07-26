package com.tnsif.applet;
import java.applet.Applet;
import java.awt.Button; 
import java.awt.TextField;
import java.awt.Event;
import java.awt.Label;

public class Addition extends Applet {
	Button b1;
	TextField t1, t2, t3;
	Label l1;
	int a,b,c;
	public void init() {
		
		b1 = new Button();
		
		b1.setLabel("=");
		
		l1 = new Label("+");
		t1 = new TextField(6);
		t2 = new TextField(6);
		t3 = new TextField(6);
		
		add (t1);
		add (l1);
		add (t2);
		add (b1);
		add (t3);
		 
	}
	
	public boolean action (Event e, Object o)
	{
	 if(e.target.equals(b1))
	 a = Integer.parseInt(t1.getText());
	 b = Integer.parseInt(t2.getText());
	 c = a+b;
	 t3.setText(String.valueOf(c));
	 return false;
	}
	
	
	  
	

}
