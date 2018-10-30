package pr1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pr1.entity.OrderPos;

public interface OrderPosRepository extends PagingAndSortingRepository<OrderPos, Integer> {
}
