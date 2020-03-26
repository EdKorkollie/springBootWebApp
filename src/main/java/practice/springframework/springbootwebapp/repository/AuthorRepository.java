package practice.springframework.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.springbootwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
