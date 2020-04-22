package in.olaelectric.dp.spring.rules.services;

import in.olaelectric.dp.spring.rules.models.Rule;
import in.olaelectric.dp.spring.rules.repositories.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleService {

    @Autowired
    private RuleRepository ruleRepository;

    public void addRule(Rule rule){
        ruleRepository.save(rule);
    }

    public Rule getRuleById(Integer rule_id) {
        return ruleRepository.findById(rule_id).get();
    }

}
