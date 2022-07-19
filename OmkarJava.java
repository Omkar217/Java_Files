
import java.applet.*;
//import java.awt.Component;
import java.awt.Button;//super classes
import java.awt.TextField;
public class OmkarJava extends Applet{
	Button b1,b2;
	TextField t1;
	public void init()//in applet variables are always initialized inside init method.
	{
		Button b1=new Button("clear");//b1,b2,t1 are subclasses of superclasses and they are refered ascomponents 
		Button b2=new Button("click");
		TextField t1=new TextField(15);
		add(b1);//add method is derived from Applet class, that is why it doesn't need instance.
		add(b2);
		add(t1);
	}
	

}//b1 is not object but component, which is dreived from awt superclass.
