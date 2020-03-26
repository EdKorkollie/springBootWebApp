package practice.springframework.springbootwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import practice.springframework.springbootwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
