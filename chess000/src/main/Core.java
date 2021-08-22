package main;

import java.util.Stack;

/**
 * @author GodofOrange
 *    �������ݽṹ
 */
public class Core {
    //���̴�С
    private int[][] core;
    private int x;
    private int y;
    //��¼�������
    class Chess{
        int x;
        int y;
        public Chess(int x,int y) {
            this.x=x;
            this.y=y;
        }
    }
    //ջ
    Stack<Chess> stack;
    //���췽��
    public Core(int x,int y) {
        stack = new Stack<>();
        core = new int[x][y];
        this.x=x;
        this.y=y;
    }
    /**���õ��Ƿ��п�λ��*/
    private boolean __CanInput(int x,int y) {
        if(core[x][y]==0) return true;
        else return false;
    }
    /**�ж���Ӯ*/
    private int checkVictory(int x,int y,int var) {
        //�����ж�
        int trans = 0;
        for(int i=x-4;i<x+5;i++) {
            if(i<0||i>=this.x) continue;
            if(core[i][y]==var) {
                trans++;
            }
            else {
                trans=0;
            }
            if(trans==5) return var;
        }
        //�����ж�
        int longitudinal = 0;
        for(int i=y-4;i<y+5;i++) {
            if(i<0||i>=this.y) continue;
            if(core[x][i]==var) {
                longitudinal++;
            }
            else {
                longitudinal=0;
            }
            if(longitudinal==5) return var;
        }
        //�����ϵ�����
        int leftUPToDown = 0;
        for(int i=x-4,j=y+4;i<x+5&&j>y-5;i++,j--) {
            if(i<0||i>=this.x||j<0||j>=this.y) continue;
            if(core[i][j]==var) {
                leftUPToDown++;
            }else {
                leftUPToDown=0;
            }
            if(leftUPToDown==5) return var;
        }
        //�����µ�����
        int leftDownToUP = 0;
        for(int i=x+4,j=y+4;i>x-5&&j>y-5;i--,j--) {
            if(i<0||i>=this.x||j<0||j>=this.y) continue;
            if(core[i][j]==var) {
                leftDownToUP++;
            }else {
                leftDownToUP=0;
            }
            if(leftDownToUP==5) return var;
        }
        return 0;
    }
    /**
     * �ڸ�λ������  1:white 2:black 
     * @param x ������
     * @param y ������
     * @param var ��������
     * @return 1:white Ӯ   2:blackӮ
     */
    public int ChessIt(int x,int y,int var) {
        if(__CanInput(x,y)) {
            core[x][y] =var;
            Chess chess = new Chess(x,y);
            stack.push(chess);
            return checkVictory(x, y, var);
        }
        else return -1;
    }
    /**����*/
    public boolean RetChess() {
        if(stack.isEmpty()) return false;
        Chess chess = stack.pop();
        core[chess.x][chess.y]= 0;
        return true;
    }
    /**�������״̬*/
    public int[][] getCore(){
        return this.core;
    }
    /**���¿�ʼ*/
    public void Restart() {
        for(int i=0;i<this.x;i++) {
            for(int j=0;j<this.y;j++) {
                this.core[i][j]=0;
            }
        }
        this.stack.clear();
    }
}