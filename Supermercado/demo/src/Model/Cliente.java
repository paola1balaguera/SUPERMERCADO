@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double numeroIdentificacion;
    private String nombre;
    private String apellidos;
    private date fecha_nacimiento;
    private int puntos;
}

