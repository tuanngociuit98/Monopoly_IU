import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CameraShowComputer extends JPanel{
	private static int changeimage;
	private static BuyHouse buyhouse;
	public CameraShowComputer() {
		repaint();
	}
	public void change(int changeimage) {
		
		this.changeimage=changeimage;
	}
	private void paint1(Graphics g,String path,int x,int y,int width,int height) {
		g.drawImage(new ImageIcon(path).getImage(),x, y,width,height,null);
	}
	public void paint(Graphics g)
    {
		paint1(g,changeimage+".jpg",0,0,340,310);
		if(buyhouse.buy[1][changeimage]==1) {
			paint1(g,"house.png",120, 120,60,60);
			
		}
		else if(buyhouse.buy[1][changeimage]==2) {
			paint1(g,"house.png",90, 120,60,60);
			paint1(g,"house.png",150, 120,60,60);
		}
		else if(buyhouse.buy[1][changeimage]==3) {
			paint1(g,"house.png",90, 120,60,60);
			paint1(g,"house.png",150, 120,60,60);
			paint1(g,"house.png",210, 120,60,60);
		}
		else if(buyhouse.buy[1][changeimage]==4) {
			paint1(g,"hotel.png",120, 120,60,60);
		}
		else if(buyhouse.buy[2][changeimage]==1) {
			paint1(g,"housecomputer.png",120, 120,60,60);
		}
		else if(buyhouse.buy[2][changeimage]==2) {
			paint1(g,"housecomputer.png",90, 120,60,60);
			paint1(g,"housecomputer.png",150, 120,60,60);
		}
		else if(buyhouse.buy[2][changeimage]==3) {
			paint1(g,"housecomputer.png",90, 120,60,60);
			paint1(g,"housecomputer.png",150, 120,60,60);
			paint1(g,"housecomputer.png",210, 120,60,60);
		}
		else if(buyhouse.buy[2][changeimage]==4) {
			paint1(g,"hotelcomputer.png",120, 120,60,60);
		}
    }
}