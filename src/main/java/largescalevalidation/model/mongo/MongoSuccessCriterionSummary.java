package largescalevalidation.model.mongo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marco Manca
 */
public class MongoSuccessCriterionSummary {

    private String success_criterion;
    private String level;
    private int num_occurences_cantTell;
    private int num_occurences_fail;
    private int num_occurences_pass;
    private List<TechniqueSummaryDescription> techniques;

    public MongoSuccessCriterionSummary() {
        this.techniques = new ArrayList<>(10);
    }

    public MongoSuccessCriterionSummary(String success_criterion, String level) {
        this.success_criterion = success_criterion;
        this.level = level;
        this.techniques = new ArrayList<>(10);
    }

    public String getSuccess_criterion() {
        return success_criterion;
    }

    public void setSuccess_criterion(String success_criterion) {
        this.success_criterion = success_criterion;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getNum_occurences_cantTell() {
        return num_occurences_cantTell;
    }

    public void setNum_occurences_cantTell(int num_occurences_cantTell) {
        this.num_occurences_cantTell = num_occurences_cantTell;
    }

    public int getNum_occurences_fail() {
        return num_occurences_fail;
    }

    public void setNum_occurences_fail(int num_occurences_fail) {
        this.num_occurences_fail = num_occurences_fail;
    }

    public int getNum_occurences_pass() {
        return num_occurences_pass;
    }

    public void setNum_occurences_pass(int num_occurences_pass) {
        this.num_occurences_pass = num_occurences_pass;
    }

    public List<TechniqueSummaryDescription> getTechniques() {
        return techniques;
    }

    public void setTechniques(List<TechniqueSummaryDescription> techniques) {
        this.techniques = techniques;
    }

    public void incrementNumOccurrencesPass(int num_occurences_pass) {
        this.num_occurences_pass += num_occurences_pass;
    }

    public void incrementNumOccurrencesFail(int num_occurences_pass) {
        this.num_occurences_fail += num_occurences_pass;
    }

    public void incrementNumOccurrencesCannotTell(int num_occurences_pass) {
        this.num_occurences_cantTell += num_occurences_pass;
    }
}
