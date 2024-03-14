@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String referencia;
    private String nombre;
    private Categoria categoria;
    private int inventario;


    enum Categoria {aseo, belleza, comestibles, salud, hogar}
}
