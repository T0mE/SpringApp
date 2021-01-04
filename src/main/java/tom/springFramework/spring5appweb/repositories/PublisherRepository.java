package tom.springFramework.spring5appweb.repositories;

import org.springframework.data.repository.CrudRepository;
import tom.springFramework.spring5appweb.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
