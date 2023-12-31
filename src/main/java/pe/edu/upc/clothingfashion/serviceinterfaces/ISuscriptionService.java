package pe.edu.upc.clothingfashion.serviceinterfaces;
import pe.edu.upc.clothingfashion.entities.Suscription;

import java.util.List;

public interface ISuscriptionService {
    public void insert(Suscription suscription);
    public void delete(int idSuscription);
    List<String[]> getCountUserIdByPaymentDate();
}
