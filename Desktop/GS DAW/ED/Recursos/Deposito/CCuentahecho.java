package cuentas;
    public class CCuenta {


        private String nombre;
        private String cuenta;
        private double saldo;
        private double tipoInterés;

        public CCuenta()
        {
        }

        public CCuenta(String nom, String cue, double sal, double tipo)
        {
            nombre =nom;
            cuenta=cue;
            saldo=sal;
        }

        public double estado()
        {
            return saldo;
        }

        public void ingresar(double cantidad) throws Exception
        {
            if (cantidad<0)
                throw new Exception("No se puede ingresar una cantidad negativa");
            saldo = saldo + cantidad;
        }

        public void retirar(double cantidad) throws Exception
        {
            if (cantidad <= 0)
                throw new Exception ("No se puede retirar una cantidad negativa");
            if (estado()< cantidad)
                throw new Exception ("No se hay suficiente saldo");
            saldo = saldo - cantidad;
        }
    }
    public class Main {

        public static void main(String[] args) {
            CCuenta cuenta1;
            double saldoActual;

            cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
            saldoActual = cuenta1.estado();
            System.out.println("El saldo actual es"+ saldoActual );
        }    

        public static void operativa_cuenta (CCuenta cuenta, float cantidad) {
            try {
                cuenta.retirar(2300);
                System.out.println("se retiró:" + cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
            try {
                System.out.println("Ingreso en cuenta");
                cuenta.ingresar(695);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
