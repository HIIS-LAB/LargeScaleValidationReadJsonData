package largescalevalidation.model.mongo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco Manca
 */
public class SuccessCriterion {
    private String success_criterion;
    private int num_occurrences_fail;
    private int num_occurrences_cantTell;
    private int num_occurrences_pass;
    private String level;
    private List<TechniqueDescription> techniques;

    public SuccessCriterion() {
        this.techniques = new ArrayList<>(66);
    }

    public SuccessCriterion(String success_criterion, String level) {
        this.success_criterion = success_criterion;
        this.level = level;
        this.techniques = new ArrayList<>(66);
    }

        
    public SuccessCriterion(String success_criterion, String level, TechniqueDescription technique) {
        this.success_criterion = success_criterion;
        this.level = level;        
        this.techniques = new ArrayList<>(66);
        this.techniques.add(technique);
    }
       
    public String getSuccess_criterion() {
        return success_criterion;
    }

    public List<TechniqueDescription> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<TechniqueDescription> techniques) {
        this.techniques = techniques;
    }
    
    public String getLevel() {
        return level;
    }

    public void setSuccess_criterion(String success_criterion) {
        this.success_criterion = success_criterion;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getNum_occurrences_fail() {
        return num_occurrences_fail;
    }

    public void setNum_occurrences_fail(int num_occurrences_fail) {
        this.num_occurrences_fail = num_occurrences_fail;
    }

    public int getNum_occurrences_cantTell() {
        return num_occurrences_cantTell;
    }

    public void setNum_occurrences_cantTell(int num_occurrences_cantTell) {
        this.num_occurrences_cantTell = num_occurrences_cantTell;
    }

    public int getNum_occurrences_pass() {
        return num_occurrences_pass;
    }

    public void setNum_occurrences_pass(int num_occurrences_pass) {
        this.num_occurrences_pass = num_occurrences_pass;
    }
    
    
    
}
