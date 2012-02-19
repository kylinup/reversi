/*
ID: lazydom1
LANG: JAVA
TASK: ChessMan.java
Created on: 2012-2-19-����11:34:11
Author: lazydomino@163.com(pisces)
*/

package gui;

import java.util.ArrayList;

/*
 * �����������̵��ࡣÿ�����Ӷ�����һ��ArrayList���棬����ArrayList�Ϳ����ҵ���������λ�á�
 */
public class ChessManList {
	
	public ChessManList()
	{
		
	}
	//var
	
	private ArrayList<ChessMan> list = new ArrayList<ChessMan>();
	private boolean[][] black_white = new boolean[8][8];
	private boolean[][] have_ChessMan = new boolean[8][8];
	
	public void add(int x,int y, boolean black)
	{
		x -= 1;
		y -= 1;
		list.add(new ChessMan(x, y, black));
		black_white[x][y] = black;
		have_ChessMan[x][y] = true; 
	}
	
	public int getNum()
	{
		return list.size();
	}
	
	public ChessMan getChessMan(int index)
	{
		return list.get(index);
	}
	
	public boolean havaChessman(int x, int y)
	{
		return have_ChessMan[x - 1][y -1];
	}
	

}

/*
 * �������ӵ��࣬��Ϊ������ 8*8 �ģ�����Ϊ�˷���ֱ���� i��j���꣬���� [1,2]����C2�ϵ����ӡ� 
 */
class ChessMan
{	
	public ChessMan(int x,int y, boolean black)
	{
		this.x = x ;
		this.y = y ;
		this.black = black;
	}
	
	public boolean isBlack()
	{
		return black;
	}
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	
	//var
	private int x, y;
	private boolean black;//��¼������ɫ
}
