package practice.springframework.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.springbootwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
