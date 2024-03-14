public interface ClienteServices {

    Cliente guardarCliente(Cliente cliente);
    Cliente buscarClientePorId(Long id);
    List<Cliente> listarClientes();
    Cliente actualizarCliente(Long id, Cliente clienteActualizado);
    void eliminarCliente(Long id);
}
