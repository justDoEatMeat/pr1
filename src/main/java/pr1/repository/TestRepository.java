package pr1.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import pr1.entity.TestEntity;

import java.util.List;

public interface TestRepository extends PagingAndSortingRepository<TestEntity, Integer> {

    @Query("SELECT T FROM TestEntity T WHERE T.name LIKE CONCAT('%',:text,'%')")
    List<TestEntity> findByNameNotLikeAnything (@Param("text") String text);


}
