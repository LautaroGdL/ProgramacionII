package Tp4;

public class Main {

    public static void main(String[] args) {
        // Ejercicio 2 – Farmacia
        System.out.println("== Ejercicio 2: Farmacia ==");
        Ejercicio_2.Farmacia farmacia = new Ejercicio_2.Farmacia();
        farmacia.nuevoCliente("Ana");
        farmacia.nuevoCliente("Luis");
        farmacia.mostrarEspera();
        farmacia.atenderCliente();
        farmacia.mostrarEspera();

        // Ejercicio 3 – Impresora
        System.out.println("\n== Ejercicio 3: Impresora ==");
        Ejercicio_3.Impresora impresora = new Ejercicio_3.Impresora();
        impresora.agregarTarea("Doc1", 5);
        impresora.agregarTarea("Doc2", 3);
        impresora.mostrarTareas();
        impresora.procesarTarea();
        System.out.println("Total páginas impresas: " + impresora.getTotalPaginas());

        // Ejercicio 4 – Buffer circular
        System.out.println("\n== Ejercicio 4: Buffer circular ==");
        Ejercicio_4.BufferCircular buffer = new Ejercicio_4.BufferCircular(3);
        buffer.registrarTemperatura(20);
        buffer.registrarTemperatura(21);
        buffer.registrarTemperatura(22);
        buffer.mostrarBuffer();
        buffer.registrarTemperatura(23); // Debería eliminar 20
        buffer.mostrarBuffer();

        // Ejercicio 5 – Ventanilla bancaria
        System.out.println("\n== Ejercicio 5: Ventanilla bancaria ==");
        Ejercicio_5.BancoRapido banco = new Ejercicio_5.BancoRapido();
        banco.nuevoCliente("Carlos");
        banco.nuevoCliente("Elena");
        banco.mostrarCola();
        banco.atenderCliente();
        banco.mostrarCola();

        // Ejercicio 6 – Triage de hospital
        System.out.println("\n== Ejercicio 6: Triage de hospital ==");
        Ejercicio_6.Triage triage = new Ejercicio_6.Triage();
        triage.ingresarPaciente("Mario", 2);
        triage.ingresarPaciente("Laura", 5);
        triage.ingresarPaciente("Juan", 3);
        triage.mostrarEspera();
        triage.atenderPaciente();

        // Ejercicio 7 – Planificador de procesos
        System.out.println("\n== Ejercicio 7: Planificador de procesos ==");
        Ejercicio_7.Planificador planificador = new Ejercicio_7.Planificador();
        planificador.cargarProceso(1, "Compilación", 3);
        planificador.cargarProceso(2, "Backup", 1);
        planificador.cargarProceso(3, "Actualización", 5);
        planificador.mostrarProcesos();
        planificador.ejecutarProceso();

        // Ejercicio 8 – Carrito de supermercado
        System.out.println("\n== Ejercicio 8: Carrito de supermercado ==");
        Ejercicio_8.Carrito carrito = new Ejercicio_8.Carrito();
        carrito.agregarProducto("Pan", 1.5);
        carrito.agregarProducto("Leche", 2.0);
        carrito.agregarProducto("Queso", 3.8);
        carrito.pagar();

        // Ejercicio 9 – Turnos de restaurante
        System.out.println("\n== Ejercicio 9: Turnos de restaurante ==");
        Ejercicio_9.Restaurante restaurante = new Ejercicio_9.Restaurante();
        restaurante.nuevoCliente("Sofía");
        restaurante.nuevoCliente("Pedro");
        restaurante.mostrarEspera();
        restaurante.asignarMesa();
        restaurante.mostrarEspera();

        // Ejercicio 10 – Historial de navegación
        System.out.println("\n== Ejercicio 10: Historial de navegación ==");
        Ejercicio_10.Navegador navegador = new Ejercicio_10.Navegador();
        navegador.visitar("https://google.com");
        navegador.visitar("https://openai.com");
        navegador.visitar("https://github.com");
        navegador.mostrarHistorial();
    }

}
