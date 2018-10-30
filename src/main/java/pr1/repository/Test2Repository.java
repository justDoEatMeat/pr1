package pr1.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pr1.entity.Test;

public interface Test2Repository extends PagingAndSortingRepository<Test, Integer> {

}
