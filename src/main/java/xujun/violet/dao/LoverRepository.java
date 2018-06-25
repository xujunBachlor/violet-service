package xujun.violet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import xujun.violet.bean.Lover;

@Repository
public interface LoverRepository extends JpaRepository<Lover, Integer>{

	@Query(value="select * from lover",nativeQuery=true)
	List<Lover> getLovers();
}
