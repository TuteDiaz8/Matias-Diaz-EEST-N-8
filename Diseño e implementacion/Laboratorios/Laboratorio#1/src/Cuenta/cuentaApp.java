package cuenta;

public class cuentaApp {
    
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("Pedro", "17124", 7.0, 1000);
        Cuenta c2 = new Cuenta ();
        c2.setNombre("Lionel");
        c2.setNroCuenta("42841");
        c2.setInteres(25);
        c2.setSaldo(8500);
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
        
        System.out.println("INGRESO");
        
        c1.ingreso(2000);
        c2.ingreso(5000);
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
        
        c1.extraccion(500);
        c2.extraccion(9000);
        
        System.out.println("EXTRACCION");
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
        
        c1.transferencia(c2, 500);
        
        System.out.println("TRANSFERENCIA DE C1 A C2");
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
    }   
}
