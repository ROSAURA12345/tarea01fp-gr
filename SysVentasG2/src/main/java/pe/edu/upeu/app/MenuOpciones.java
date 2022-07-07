package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ClienteDao;
import pe.edu.upeu.dao.MarcaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT = new LeerTeclado();
    UsuarioTO uTo = new UsuarioTO();
    Console cons = System.console();

    public void login() {
        System.out.println("************Bienvenidos al Sistema de Ventas*************");
        System.out.println("****************Valide sus credenciales***************");
        uTo.usuario = leerT.leer("", "Ingrese su usuario");
        System.out.println("Ingrese su clave:");
        char[] clavex = cons.readPassword();
        uTo.clave = String.valueOf(clavex);
        if (new UsuarioDao().login(uTo.getUsuario(), uTo.getClave())) {
            menuPrincipal();
        } else {
            System.out.println("Intente Nuevamente!! sus credenciales son invalidos!");
            login();
        }
    }
    
    public void menuPrincipal() {
        System.out.println("------------------------------------Sistema de Ventas------------------------------");
        int opciones = 7;
        String menu = "";
        menu += "1=Registro de Usuario\n";
        menu += "2=Listar Usuarios\n";
        menu += "3=Crear Categoria\n";
        menu += "4=Crear Marca\n";
        menu += "5=Crear Cliente\n6=Crear Producto\n7=Listar Productos\n";
        menu+="8=Registro Ventas";
        System.out.println(menu);
        do {
            switch (opciones) {
                case 1: new UsuarioDao().crearUsuarios();   break;
                case 2: new UsuarioDao().listarUsuarios();   break;
                case 3: new CategoriaDao().crearCategoria();  break;
                case 4: new MarcaDao().crearMarca(); break;
                case 5: new ClienteDao().crearCliente(); break;
                case 6: new ProductoDao().crearProducto(); break;
                case 7: new ProductoDao().reportarProductos(); break;
                case 8: new VentaDao().registroVentaGeneral();break;
                default: System.out.println("Opcion Invalida!"); break;
            }
            String continuar=leerT.leer("",
             "Desea Continuar? S=Si/N=No").charAt(0)=='S'?"S":"N";
            if (continuar.charAt(0)=='S') {
                opciones=leerT.leer(0, "Eliga una operacion:\n"+menu);
            }else{opciones=0;}
        } while (opciones != 0);
    }

}
