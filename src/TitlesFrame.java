/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.SwingUtilities;
/*    */ 
/*    */ public class TitlesFrame
/*    */   extends JFrame
/*    */ {
/*  7 */   public TitlesFrame() { initUI(); }
/*    */ 
/*    */ 
/*    */   
/*    */   private void initUI() {
/* 12 */     setTitle("Кривые фигуры");
/* 13 */     setDefaultCloseOperation(3);
/* 14 */     add(new TitlesPanel(78));
/* 15 */     setSize(350, 350);
/* 16 */     setLocationRelativeTo(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/* 21 */     SwingUtilities.invokeLater(new Runnable()
/*    */         {
/*    */           public void run()
/*    */           {
/* 25 */             TitlesFrame ps = new TitlesFrame();
/* 26 */             ps.setVisible(true);
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              D:\2_zad\src\lab3.jar!\TitlesFrame.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.1
 */