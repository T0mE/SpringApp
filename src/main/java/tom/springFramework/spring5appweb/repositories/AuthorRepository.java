package tom.springFramework.spring5appweb.repositories;

import org.springframework.data.repository.CrudRepository;
import tom.springFramework.spring5appweb.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
