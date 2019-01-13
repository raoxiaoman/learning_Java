package com.raohui.mementomode;

import java.util.ArrayList;

/**
 * MementoModeTest
 */
public class MementoModeTest {

    private static int index = -1;
    private static MementoCaretakerList mcl = new MementoCaretakerList();

    public static void main(String args[]) {
        test1();
        System.out.println("-----------------------------------");
        test2();
    }

    public static void test1() {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chess = new Chessman("车", 1, 1);
        display(chess);
        mc.setChessmanMemento(chess.save()); // 保存状态
        chess.setY(4);
        display(chess);
        mc.setChessmanMemento(chess.save()); // 保存状态
        display(chess);
        chess.setX(5);
        display(chess);
        System.out.println("******悔棋******");
        chess.restore(mc.getChessmanMemento()); // 恢复状态
        display(chess);


    }

    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    public static void test2() {
        Chessman chess = new Chessman("车", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);

    }

    // 下棋
    public static void play(Chessman chess) {
        mcl.setChessmanMemento(chess.save()); // 保存备忘录
        index++;
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    // 悔棋
    public static void undo(Chessman chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(mcl.getChessmanMemento(i - 1)); // 撤销到上一个备忘录
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    // 撤销悔棋
    public static void redo(Chessman chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chess.restore(mcl.getChessmanMemento(i + 1)); // 恢复到下一个备忘录
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}

class Chessman {
    private String Label;
    private int x;
    private int y;

    public Chessman(String Label, int x, int y) {
        this.Label = Label;
        this.x = x;
        this.y = y;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return Label;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.Label = label;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    public ChessmanMemento save() {
        return new ChessmanMemento(this.Label, this.x, this.y);
    }

    public void restore(ChessmanMemento chessmanMemento) {

        this.Label = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }

}

class ChessmanMemento {
    private String Label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.Label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.Label = label;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return Label;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

}

class MementoCaretaker {
    private ChessmanMemento chessmanMemento;

    /**
     * @param chessmanMemento the chessmanMemento to set
     */
    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento = chessmanMemento;
    }

    /**
     * @return the chessmanMemento
     */
    public ChessmanMemento getChessmanMemento() {
        return chessmanMemento;
    }
}

class MementoCaretakerList {
    private ArrayList<ChessmanMemento> chessmanMementos = new ArrayList<>();

    public ChessmanMemento getChessmanMemento(int i) {
        return chessmanMementos.get(i);
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        chessmanMementos.add(chessmanMemento);
    }

}