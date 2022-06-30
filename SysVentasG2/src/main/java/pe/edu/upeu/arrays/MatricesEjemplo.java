package pe.edu.upeu.arrays;

public class MatricesEjemplo {
    
public void matricesBasicos() {
    Object[][] prod;
    prod=new Object[2][4];
    prod[0][0]="P001";
    prod[0][1]="Manzana";
    prod[0][2]=3;
    prod[0][3]="Kilo";

    prod[1][0]="P002";
    prod[1][1]="Mandarina";
    prod[1][2]=2.5;
    prod[1][3]="Unid%";    

    System.out.println("codigo\tnombre\tPre.Unit\tUnidMed");
    for (int i = 0; i < prod.length; i++) {
       System.out.println(prod[i][0]+"\t"+prod[i][1]+"\t"
       +prod[i][2]+"\t"+prod[i][3]); 
    }
}

public void sumaMatrices() {
    int[][] mA={{3,-8},{5,9}};
    int[][] mB={{-9,11},{1,-5}};
    int[][] mR=new int[mA.length][mA[0].length];
    for (int i = 0; i < mA.length; i++) {
        for (int j = 0; j < mA[0].length; j++) {
            mR[i][j]=mA[i][j]+mB[i][j];
        }
    }
    imprimirMatrix(mR);
}

public void imprimirMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j]+"\t");
        }
        System.out.println("");
    }
}
public void imprimirMatrix(Object[][] m) {
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[0].length; j++) {
            System.out.print(m[i][j]+"\t");
        }
        System.out.println("");
    }
}
public static void main(String[] args) {
    //new MatricesEjemplo().matricesBasicos();
    new MatricesEjemplo().sumaMatrices();
}

}
