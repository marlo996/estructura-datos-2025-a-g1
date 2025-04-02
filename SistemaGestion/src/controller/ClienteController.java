package controller;
import model.Cliente;
import service.ClienteService;

public class ClienteController {
    private ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }

    public void ejecutar() {
        // Agregar clientes
        clienteService.agregarCliente(new Cliente(1, "Marlon", "marlon@email.com"));
        clienteService.agregarCliente(new Cliente(2, "Ana", "ana@email.com"));

        // Mostrar clientes
        System.out.println("Lista de clientes:");
        clienteService.mostrarClientes();

        // Buscar un cliente
        System.out.println("Buscando cliente con ID 1:");
        System.out.println(clienteService.buscarCliente(1));

        // Eliminar un cliente
        clienteService.eliminarCliente(2);
        System.out.println("Lista después de eliminar cliente ID 2:");
        clienteService.mostrarClientes();
    }
}
