package in.olaelectric.dp.spring.rules.repositories;

import in.olaelectric.dp.spring.rules.models.Rule;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleRepository extends CassandraRepository<Rule, Integer> {

}
