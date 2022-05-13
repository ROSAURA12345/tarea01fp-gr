
public static void pregunta3() {
    int v1, v2;
    double R;
    System.out.print("ingrese el primer valor: ");
    v1 = st.nextInt();
    System.out.print("ingrese el segundo valor: ");
    v2 = st.nextInt();
    char operador=st.next().charAt(0);
    R = Math.sqrt(v1);

    switch (operador){

        case '+': System.out.println(v1+v2); break;
        case '-': System.out.println(v1-v2); break;
        case '/': System.out.println(v1/v2); break;
        case 'x': System.out.println(v1*v2); break;
        case '%': System.out.println(v1%2); break;
        case '^': System.out.println(v1^v2); break;
        case 'R': System.out.println(+R); break;

        default: break;
    }