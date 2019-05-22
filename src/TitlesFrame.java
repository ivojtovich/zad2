import javax.swing.JFrame;

public class TitlesFrame extends JFrame
{
  public TitlesFrame()
  {
    initUI();
  }
  
  private void initUI()
  {
    setTitle("������ ������");
    setDefaultCloseOperation(3);
    add(new TitlesPanel(91));
    setSize(350, 350);
    setLocationRelativeTo(null);
  }
  
  public static void main(String[] args)
  {
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        TitlesFrame ps = new TitlesFrame();
        ps.setVisible(true);
      }
    });
  }
}
