package com.lab;

/**
 * Created by Vasyl_Voloshyn on 5/5/2017.
 */
public class Matrix implements Cloneable {

    public Matrix(double[][] sourceMatrix){
        setMtrx(sourceMatrix);
    }

    private double[][] mtrx;
    public double[][] getMtrx(){
        return mtrx;
    }
    public void setMtrx(double[][] value) throws IllegalArgumentException{
        if(value.length != 0)
            mtrx = value;
        else
            throw new IllegalArgumentException("Matrix is empty");
    }

    private double det;
    public double getDet(){
        det = determinant(this);
        return det;
    }
    private void setDet(){}

    @Override
    public Matrix clone() throws CloneNotSupportedException{
        double[][] thisMatrix = this.getMtrx();
        int thisMatrixSize = this.getMtrx().length;
        double[][] newMatrix = new double[thisMatrixSize][thisMatrixSize];

        for(int i = 0; i<thisMatrixSize;i++){
            for(int j = 0; j<thisMatrixSize; j++){
                newMatrix[i][j] = thisMatrix[i][j];
            }
        }
        Matrix matrix = new Matrix(newMatrix);

        return matrix;
    }

    @Override
    public String toString(){
        String mtrxInString = "";
        int thisMatrixSize = this.getMtrx().length;
        double[][] thisMatrix = this.getMtrx();

        for(int i = 0; i<thisMatrixSize;i++){
            for(int j = 0; j<thisMatrixSize; j++){
                mtrxInString += thisMatrix[i][j] + " ";
            }
            mtrxInString += "\n";
        }

        return mtrxInString;
    }

    @MyAnnotation(name = "determinant")
    public double determinant(Matrix matrix){
        if(matrix.mtrx.length == 1){
            return matrix.mtrx[0][0];
        }
        if(matrix.mtrx.length == 2){
            return ((matrix.mtrx[0][0])*(matrix.mtrx[1][1]))-((matrix.mtrx[1][0])*(matrix.mtrx[0][1]));
        }
        int tmp = 0;
        for(int i = 0; i < matrix.mtrx.length; i++){
            double multiplicationOfDetAndEl = (matrix.mtrx[0][i]) * determinant(subMatrix(matrix,0,i));
            if(i%2==0) {
                tmp += multiplicationOfDetAndEl;
            }
            else{
                tmp -= multiplicationOfDetAndEl;
            }
        }
        return tmp;
    }

    private Matrix subMatrix(Matrix matrix, int row, int column){
        int subMatrixLength = matrix.mtrx.length-1;
        int matrixLength = matrix.mtrx.length;
        double[][] tmp = new double[subMatrixLength][subMatrixLength];
        int iSub = 0;
        int jSub = 0;
        for(int i = 0; i < matrixLength; i++){
            for(int j = 0; j < matrixLength; j++){
                if(row != i && column != j){
                    tmp[iSub][jSub] = matrix.mtrx[i][j];
                    jSub++;
                    if(jSub == subMatrixLength)
                    {
                        jSub = 0;
                        iSub++;
                    }
                }
            }
        }
        Matrix tmpMatrix = new Matrix(tmp);
        return tmpMatrix;
    }
}
