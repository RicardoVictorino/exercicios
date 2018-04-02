package br.sisnet.univali.calculadora;

/**
 * Created by 5723167 on 26/03/2018.
 */

public class Calculator {
    private double n1, n2;

    //Constr
    public Calculator(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;

    }

    public double sum(){
        if(n1 >= 0 ) {
            return n1 + n2;
        }
        else{
            return n1;
        }
    }

    public double subtract(){
        return n1 - n2;
    }

    public double divide(){
        if ( n1 != 0 && n2 != 0 && n1 >= 1 && n2 >= 1){
            return n1 / n2;
        }
        else {
            return n1;
        }

    }

    public double multiply(){
        return n1 * n2;
    }

}