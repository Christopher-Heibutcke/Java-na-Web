package Christopher.Heibutcke.exemplo2mysql.repository;

import Christopher.Heibutcke.exemplo2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
