package largescalevalidation.model.mongo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import largescalevalidation.model.mongo.converter.MongoDateConverter;
//import org.bson.types.ObjectId;

/**
 *
 * @author Marco Manca
 */
public class MongoEvalData {
//    @JsonProperty("_id")    
//    private ObjectId _id;
    private String status;
    private String msg;
    private String evalId;
    private String ipaCode;
    private String root_url;
    private List<String> evaluated_pages;
    private int num_evaluated_pages;
    private int num_occurrences_fail;
    private int num_occurrences_cantTell;
    private int num_occurrences_pass;
    private int num_evaluated_elem;
    private int avg_fail_per_page;
    private int avg_pass_per_page;
    private int avg_cantTell_per_page;
    private int accessibilityPercentage;
    private int completnessPercentage;
    private List<MongoSuccessCriterionSummary> success_criteria;    
    @JsonDeserialize(using = MongoDateConverter.class)
    private Date when;
    private int when_millisec;
    private int evaluation_time_elapsed;
    private String dataVersion;

    public MongoEvalData() {
    }

    
    public MongoEvalData(String status, String evalId, String ipaCode, String root_url) {
        this.status = status;
        this.evalId = evalId;
        this.ipaCode = ipaCode;
        this.root_url = root_url;
    }

//    public ObjectId getId() {
//        return _id;
//    }
//
//    public void setId(ObjectId _id) {
//        this._id = _id;
//    }
    
    
        
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEvalId() {
        return evalId;
    }

    public void setEvalId(String evalId) {
        this.evalId = evalId;
    }

    public String getIpaCode() {
        return ipaCode;
    }

    public void setIpaCode(String ipaCode) {
        this.ipaCode = ipaCode;
    }
    
    public String getRoot_url() {
        return root_url;
    }

    public void setRoot_url(String root_url) {
        this.root_url = root_url;
    }

    public List<String> getEvaluated_pages() {
        return evaluated_pages;
    }

    public void setEvaluated_pages(List<String> evaluated_pages) {
        this.evaluated_pages = evaluated_pages;
    }

    public int getNum_evaluated_pages() {
        return num_evaluated_pages;
    }

    public void setNum_evaluated_pages(int num_evaluated_pages) {
        this.num_evaluated_pages = num_evaluated_pages;
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

    public int getNum_evaluated_elem() {
        return num_evaluated_elem;
    }

    public void setNum_evaluated_elem(int num_evaluated_elem) {
        this.num_evaluated_elem = num_evaluated_elem;
    }

    public int getAvg_fail_per_page() {
        return avg_fail_per_page;
    }

    public void setAvg_fail_per_page(int avg_fail_per_page) {
        this.avg_fail_per_page = avg_fail_per_page;
    }

    public int getAvg_pass_per_page() {
        return avg_pass_per_page;
    }

    public void setAvg_pass_per_page(int avg_pass_per_page) {
        this.avg_pass_per_page = avg_pass_per_page;
    }

    public int getAvg_cantTell_per_page() {
        return avg_cantTell_per_page;
    }

    public void setAvg_cantTell_per_page(int avg_cantTell_per_page) {
        this.avg_cantTell_per_page = avg_cantTell_per_page;
    }

    public int getAccessibilityPercentage() {
        return accessibilityPercentage;
    }

    public void setAccessibilityPercentage(int accessibilityPercentage) {
        this.accessibilityPercentage = accessibilityPercentage;
    }

    public int getCompletnessPercentage() {
        return completnessPercentage;
    }

    public void setCompletnessPercentage(int completnessPercentage) {
        this.completnessPercentage = completnessPercentage;
    }

    public List<MongoSuccessCriterionSummary> getSuccess_criteria() {
        return success_criteria;
    }

    public void setSuccess_criteria(List<MongoSuccessCriterionSummary> success_criteria) {
        this.success_criteria = success_criteria;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public int getWhen_millisec() {
        return when_millisec;
    }

    public void setWhen_millisec(int when_millisec) {
        this.when_millisec = when_millisec;
    }

    public int getEvaluation_time_elapsed() {
        return evaluation_time_elapsed;
    }

    public void setEvaluation_time_elapsed(int evaluation_time_elapsed) {
        this.evaluation_time_elapsed = evaluation_time_elapsed;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }
    
    
    
}
