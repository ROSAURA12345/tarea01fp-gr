public static void pregunta2() {
    double igv, precio, descuento, importetotal;

    Scanner st = new Scanner(System.in);
    System.out.println("ingrese el monto base: ");
    precio = st.nextDouble();
    igv = precio+0.18 ;

    if (precio<2000){
        igv = precio*0.18;
        descuento = precio*0.10;
        importetotal = precio - descuento + igv ;

    }else  if (precio>1000){
            igv = precio*0.18;
            descuento = precio*0.05;
            importetotal = precio - descuento + igv ;
        }else if (precio>500){
            igv = precio*0.18;
            descuento = precio*0.02;
            importetotal = precio - descuento + igv ;
        }else{ 
                descuento = 0;
                importetotal =0;

        }

        System.out.println("el descuento aplicado es: "+ descuento);
        System.out.println("el igv es: "+ igv);
        System.out.println("el importe total es de : "+ importetotal);


}