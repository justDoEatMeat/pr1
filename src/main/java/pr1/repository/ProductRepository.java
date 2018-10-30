package pr1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pr1.entity.OrderPos;

public interface ProductRepository extends PagingAndSortingRepository<OrderPos, Integer> {
}
