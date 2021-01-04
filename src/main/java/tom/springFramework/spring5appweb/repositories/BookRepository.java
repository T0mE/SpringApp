package tom.springFramework.spring5appweb.repositories;

import org.springframework.data.repository.CrudRepository;
import tom.springFramework.spring5appweb.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
