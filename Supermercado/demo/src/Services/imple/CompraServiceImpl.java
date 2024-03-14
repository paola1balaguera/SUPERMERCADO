public class CompraServiceImpl implements CompraServices {
    @Autowired
    private CompraRepository compraRepository;

    public void añadiçrCompra(Compra compra){
        return compraRepository.save(compra);
    }
    public void editarCompra(Long id, Compra compraActulizar){
        Cliente busquedaCompra = compraRepository.findById(id).orElse(null);

        if(busquedaCompra!= null){
            compra.setProducto(compraActulizar.getProducto());
            compra.setCosto(compraActulizar.getCosto());


            return compraRepository.save(compraActulizar);
        }
        return;
    }

    public void eliminarCompra(Long id){
        compraRepository.deleteById(id);
    }
}
