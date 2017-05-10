package com.lab;

/**
 * Created by Vasyl_Voloshyn on 5/8/2017.
 */
public class SystemOfLinearEquations extends Matrix {

    public SystemOfLinearEquations(double[][] sourceMatrix, double[][] matrixOfConstantTerms){
        super(sourceMatrix);
        setConstantTerms(matrixOfConstantTerms);
    }

    private double[][] constantTerms;
    public double[][] getConstantTerms(){
        return constantTerms;
    }
    public void setConstantTerms(double[][] value) throws IllegalArgumentException{
        if(value.length != 0)
            constantTerms = value;
        else
            throw new IllegalArgumentException("Matrix of unknowns is empty");
    }

    private double findDetByIndex(int index, SystemOfLinearEquations system) throws CloneNotSupportedException{
        Matrix tmp = system.clone();
        for(int j = 0; j < tmp.getMtrx().length;j++){
            tmp.getMtrx()[j][index] = system.getConstantTerms()[j][0];
        }
        double det = determinant(tmp);
        return det;
    }

    @MyAnnotation(name = "undefined")
    public double[] undefined() throws CloneNotSupportedException{
        double[] undefinedEl = new double[this.getMtrx().length];

        for(int i = 0; i < undefinedEl.length; i++){
            undefinedEl[i] = (findDetByIndex(i, this))/(determinant(this));
        }

        return undefinedEl;
    }
}
