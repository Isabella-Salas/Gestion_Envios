import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int op;

        do{
            System.out.println("Ingrese una opcion");
            System.out.println("1.Paquete");
            System.out.println("2.Reporte final");
            System.out.println("3.Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:

                    EmpresaMensajeria empresa = new EmpresaMensajeria();
                    System.out.println(empresa.imprimirListaPaquete());
                    System.out.println(empresa.calcularTotalGanancias());
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
            System.out.println("Desea continuar?");
            System.out.println("1.Si");
            System.out.println("2.No");
            op = sc.nextInt();
        }while(op == 1);
    }
}
