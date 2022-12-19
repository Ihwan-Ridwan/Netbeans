/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author USER
 */
public class chart2D extends JPanel {
     public chart2D(){
//Membuat dimensi layar dengan warna background putih
this.setPreferredSize(new Dimension(500, 320));
this.setBackground(Color.WHITE);
}
protected void paintComponent(Graphics g) {
//Inisialisasi
super.paintComponent(g);
Graphics2D g2 = (Graphics2D) g;

GeneralPath gp = new GeneralPath(GeneralPath.WIND_NON_ZERO);
//Membuat tabel line
gp.moveTo(28,50);
gp.lineTo(379,50);
gp.moveTo(30,50);
gp.lineTo(30,292);
gp.moveTo(28,290);
gp.lineTo(379,290);
gp.moveTo(28,90);
gp.lineTo(379,90);
gp.moveTo(28,130);
gp.lineTo(379,130);
gp.moveTo(28,170);
gp.lineTo(379,170);
gp.moveTo(28,210);
gp.lineTo(379,210);
gp.moveTo(28,250);
gp.lineTo(379,250);

//menutup kurva
gp.closePath();
g2.draw(gp);

//Membuat Label No nya beserta peletakannya
g2.drawString("1",40,310);
g2.drawString("2",75,310);
g2.drawString("3",110,310);
g2.drawString("4",145,310);
g2.drawString("5",180,310);
g2.drawString("6",215,310);
g2.drawString("7",250,310);
g2.drawString("8",285,310);
g2.drawString("9",320,310);
g2.drawString("10",355,310);
g2.drawString("Penjualan",430,190);
//Pembuatan data nya beserta peletakannya
g2.drawString("120",2,55);
g2.drawString("100",2,94);
g2.drawString("80",8,134);
g2.drawString("60",8,174);
g2.drawString("40",8,214);
g2.drawString("20",8,254);
g2.drawString("0",14,294);

//Membuat rect
Shape rect1 = new Rectangle2D.Double(45,230,10,60); //30
Shape rect2 = new Rectangle2D.Double(80,192,10,98); //51
Shape rect3 = new Rectangle2D.Double(115,90,10,200); //100
Shape rect4 = new Rectangle2D.Double(150,130,10,160); //80
Shape rect5 = new Rectangle2D.Double(185,122,10,168); //84
Shape rect6 = new Rectangle2D.Double(220,94,10,196); //98
Shape rect7 = new Rectangle2D.Double(255,144,10,146); //73
Shape rect8 = new Rectangle2D.Double(290,72,10,218); //109
Shape rect9 = new Rectangle2D.Double(325,218,10,72); //36
Shape rect10 = new Rectangle2D.Double(360,218,10,72); //36
Shape series1 = new Rectangle2D.Double(410,180,10,10);
//Pemberian warna pada kotak
g2.setColor(Color.red);
g2.fill(rect1);
g2.fill(rect2);
g2.fill(rect3);
g2.fill(rect4);
g2.fill(rect5);
g2.fill(rect6);
g2.fill(rect7);
g2.fill(rect8);
g2.fill(rect9);
g2.fill(rect10);
g2.fill(series1);
}

public static void main(String[] args) {
// TODO code application logic here
JFrame frame = new JFrame();
frame.setTitle("Column Chart Mochamad Ihwan Ridwan F");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

chart2D canvas = new chart2D();
frame.getContentPane().add(canvas);
frame.pack();
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}
}
