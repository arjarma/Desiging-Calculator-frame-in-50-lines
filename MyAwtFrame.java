import java.awt.*;
import java.awt.event.*;
class MyAwtFrame extends Frame
{
MyAwtFrame()
{ super("Calculator");
TextField tf=new TextField("",20);
add(tf);
Button b[]=new Button[15];
setLayout(new FlowLayout());
for(int i=0;i<10;i++)
{
Integer x=i;
b[i]=new Button(x.toString());
add(b[i]);
b[i].setPreferredSize(new Dimension(40,30));
}
b[10]=new Button("+");
add(b[10]);
b[10].setPreferredSize(new Dimension(40,30));
b[11]=new Button("-");
add(b[11]);
b[11].setPreferredSize(new Dimension(40,30));
b[12]=new Button("*");
add(b[12]);
b[12].setPreferredSize(new Dimension(40,30));
b[13]=new Button("/");
add(b[13]);
b[13].setPreferredSize(new Dimension(40,30));
b[14]=new Button("=");
add(b[14]);
b[14].setPreferredSize(new Dimension(40,30));
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
});
}
public static void main(String args[])
{
MyAwtFrame maf=new MyAwtFrame();
maf.setVisible(true);
maf.setSize(190,280);
}
}