package pr1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pr1.entity.Order;

public interface ClientRepository extends PagingAndSortingRepository<Order, Integer> {
        }

