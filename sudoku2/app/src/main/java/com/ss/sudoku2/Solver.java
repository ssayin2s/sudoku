package com.ss.sudoku2;

import java.util.ArrayList;

public class Solver {
    int selected_row;
    int selected_column;
    int[][] board;
    ArrayList<ArrayList<Object>> emptyBoxIndex;

    Solver(){
        selected_row =-1;
        selected_column =-1;

        board=new int[9][9];

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                board[r][c]=0;

            }
        }
        emptyBoxIndex=new ArrayList<>();
    }
    private void getEmptyBoxIndexs(){
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(this.board[r][c]==0){
                    this.emptyBoxIndex.add(new ArrayList<>());
                    this.emptyBoxIndex.get(this.emptyBoxIndex.size()-1).add(r);
                    this.emptyBoxIndex.get(this.emptyBoxIndex.size()-1).add(c);
                }

            }
        }

    }

    public void setNumberPos(int num){
        if(this.selected_row!=-1 && this.selected_column!=-1){
            if(this.board[this.selected_row-1][this.selected_column-1]==num){
                this.board[this.selected_row-1][this.selected_column-1]=0;
            }
            else{
                this.board[this.selected_row-1][this.selected_column-1]=num;
            }
        }
    }
    public ArrayList<ArrayList<Object>> getEmptyBoxIndex(){
        return this.emptyBoxIndex;
    }


    public int[][] getBoard() {
        return this.board;

    }

    public int getSelected_row() {
        return selected_row;
    }

    public void setSelected_row(int r) {
        selected_row = r;
    }

    public int getSelected_column() {
        return selected_column;
    }

    public void setSelected_column(int c) {
        selected_column = c;
    }

}