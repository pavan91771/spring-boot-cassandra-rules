package in.olaelectric.dp.spring.rules.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.HashMap;
import java.util.Map;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rule {

    @PrimaryKey
    private Integer rule_id;
    private String name;
    private String rule;
    private Map<String,String> notification = new HashMap<>();
}
