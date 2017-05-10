package com.lab;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
/**
 * Created by Vasyl_Voloshyn on 5/5/2017.
 */
public class Program {
    public static void main(String[] args) throws CloneNotSupportedException{
        double[][] matrix = new double[][]{
                {1, 0, 3},
                {5, 6, 7},
                {9, 10, 0}};

        double[][] constV = new double[][]{
                {1},
                {2},
                {3}};

        SystemOfLinearEquations SOLE = new SystemOfLinearEquations(matrix, constV);

        double[] tmp = SOLE.undefined();

        for(int i = 0; i < tmp.length; i++){
            System.out.println(tmp[i]);
        }

        //=================REFLECTION===================
        try {
            Matrix ob = new Matrix(matrix);
            Class c = ob.getClass();

            Method[] methods = c.getMethods();
            for( Method method : methods ) {
                Annotation[] annotations  = method.getAnnotations();
                for( Annotation annot : annotations ) {
                    if( annot.annotationType() == MyAnnotation.class ) {
                        method.invoke(ob, ob);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }


        Matrix ob = new Matrix(matrix);
        Class clazz = ob.getClass();
        System.out.println("Class name: "+clazz.getName());
        Class<?>[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println("Interface: "+c.getName());
        }
        Field[] fields = clazz.getDeclaredFields();
        for(Field f : fields){
            System.out.println("Field: "+f.getName());
            Annotation[] annotations  = f.getAnnotations();
            for(Annotation c : annotations){
                System.out.println("Annotations: "+c.annotationType().getName());
            }
            System.out.println(f.getType().getName());
        }
    }
}
