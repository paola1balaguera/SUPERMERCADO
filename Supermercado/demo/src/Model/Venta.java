import java.lang.annotation.Inherited;

@Entity
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double numeroVenta;
    private List<String> ventas;
    private Date fecha;
    private int cantidadProducto;
}
