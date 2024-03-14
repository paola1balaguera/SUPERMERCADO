@AllArgsConstructor
public class ClienteServicesImpl implements ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository;

    public void añadiçrCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public void editarCliente(Long id, Cliente clienteActualizar){
        Cliente busquedaCliente = clienteRepository.findById(id).orElse(null);

        if(busquedaCliente!= null){
            cliente.setNombre(clienteActualizar.getNombre());
            cliente.setApellidos(clienteActualizar.getApellidos());
            cliente.setFecha_nacimiento(clienteActualizar.getFecha_nacimiento());
            cliente.setPuntos(clienteActualizar.getPuntos());

            return clienteRepository.save(cliente);
        }
        return;
    }

    public void eliminarCliente(Long id){
        clienteRepository.deleteById(id);
    }
}
