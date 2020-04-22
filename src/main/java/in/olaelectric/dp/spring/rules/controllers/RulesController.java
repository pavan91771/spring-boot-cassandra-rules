package in.olaelectric.dp.spring.rules.controllers;

import in.olaelectric.dp.spring.rules.models.Rule;
import in.olaelectric.dp.spring.rules.services.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RulesController {

    @Autowired
    private RuleService ruleService;

    @PostMapping("/v1/alert/rules")
    public void saveRule(@RequestBody Rule rule){
        ruleService.addRule(rule);
    }

    @GetMapping("/v1/alert/rules/{rule_id}")
    public Rule getRuleById(@PathVariable("rule_id") Integer rule_id){
        return ruleService.getRuleById(rule_id);
    }

}
