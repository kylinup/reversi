/*
ID: lazydom1
LANG: JAVA
TASK: ChessMan.java
Created on: 2012-2-20-����5:30:09
Author: lazydomino@163.com(pisces)
*/

package core;

/*
 * �������ӵ��࣬��Ϊ������ 8*8 �ģ�����Ϊ�˷���ֱ���� i��j���꣬���궼�Ǵ�[1,1]��ʼ[8,8]������
 */
public class ChessMan implements Cloneable
{	
	public ChessMan(int x,int y, boolean black)
	{
		this.x = x;
		this.y = y;
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
	public void setColor()
	{
		this.black = !this.black;
	}
	public ChessMan clone() throws CloneNotSupportedException
	{
		ChessMan cloned = (ChessMan) super.clone();
		cloned.black = (boolean) black;
		cloned.x = (int) x;
		cloned.y = (int) y;
		return cloned;
	}
	//var
	private int x, y;
	private boolean black;//��¼������ɫ
}
