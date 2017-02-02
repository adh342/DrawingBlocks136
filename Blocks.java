import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class Blocks extends JComponent
{
  @Override
  protected void paintcomponent (Graphics g){
    Graphics2D g2= (Graphics2D) g;
    Rectangle cross_block_stamp1 =new Rectangle(20,0,20,80);
    Rectangle cross_block_stamp2 = new Rectangle(0,20,60,20);
    Color cross_block_color = Color.MAGENTA;

    g2.translate(20,40);
    g2.setPaint(cross_block_color);
    g2.fill(cross_block_stamp1);
    g2.fill(cross_block_stamp2);

  }
}
