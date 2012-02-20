/*
ID: lazydom1
LANG: JAVA
TASK: ImageJPanel.java
Created on: 2012-2-19-����10:17:59
Author: lazydomino@163.com(pisces)
*/

package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import core.ChessMan;
import core.ChessManList;

/*
 * ������JPanel �� paint �������ѱ���ͼƬ���ϡ�
 * ���ƺ�ɫ�ָ������̡�
 * @see javax.swing.JComponent#paint(java.awt.Graphics)
 */
public class ImageChessBoard extends JPanel{
	
	public ImageChessBoard(ChessManList list, ChessManList canPlace)
	{
		super();
		this.list = list;
		this.canPlace = canPlace;
		this.setLayout(null);
		
		
		
		
	}
	public void paintComponent(Graphics g)
	{
		ImageIcon img = new ImageIcon("res\\chess_background.png"); 
		g.drawImage(img.getImage(), 0, 0, img.getIconWidth(), img.getIconHeight(), this);
		
		ImageIcon chessBoard = new ImageIcon("res\\chess_board.png");
		g.drawImage(chessBoard.getImage(), 160, 120, chessBoard.getIconWidth(), chessBoard.getIconHeight(), this);
		
		for(int i = 0; i<8;i++)
			for(int j = 0; j<8;j++)
			{
				g.drawRect(startx + i * 56, starty + j * 56, 56, 56);
			}
		
		ImageIcon blackimg = new ImageIcon("res\\black_ball.png");
		ImageIcon whiteimg = new ImageIcon("res\\white_ball.png");
		for(int i = 0; i< list.getSize();i++)
		{
			ChessMan chessMan = list.getChessMan(i);
			if(chessMan.isBlack())
				g.drawImage(blackimg.getImage(), startx + (chessMan.getX()-1)*56 + 5, starty + (chessMan.getY()-1)*56+5, 46, 46, this);
			else
				g.drawImage(whiteimg.getImage(), startx + (chessMan.getX()-1)*56 + 5, starty + (chessMan.getY()-1)*56+5, 46, 46, this);
		}
		for(int i = 0; i< canPlace.getSize();i++)
		{
			ChessMan chessMan = canPlace.getChessMan(i);
			g.drawRect(startx + (chessMan.getX()-1)*56 + 5, starty + (chessMan.getY()-1) *56 + 5, 10, 10);
		}
		
	}
	
	
	//var
	int startx = 178, starty = 140;
	private ChessManList list, canPlace;
}

