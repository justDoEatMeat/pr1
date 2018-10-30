package pr1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pr1.entity.ProductGroup;

public interface ProductGroupRepository extends PagingAndSortingRepository<ProductGroup, Integer> {
}
