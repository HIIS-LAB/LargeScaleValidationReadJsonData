package largescalevalidation.model.mongo;

import java.util.List;
//import org.bson.types.ObjectId;

/**
 *
 * @author Marco Manca
 */
public class MongoEvalPageResult {
//    private ObjectId id;
    private String url;
    private String evalId;
    private String ipaCode;
    private int num_techniques_failed;
    private int num_occurrences_fail;
    private int num_techniques_cantTell;
    private int num_occurrences_cantTell;
    private int num_techniques_passed;
    private int num_occurrences_pass;
    private int num_techniques_notApplicable;
    private int num_evaluated_elem;
    private List<SuccessCriterion> success_criteria;
    private String vd_pageLocalCopy;
    private String report_path;
    //private EvalReport evalReport;

    public MongoEvalPageResult() {
    }
    
    
    public MongoEvalPageResult(String url, String evalId, String ipaCode, int num_techniques_failed, int num_occurrences_fail, int num_techniques_cantTell, int num_occurrences_cantTell, int num_techniques_passed, int num_occurrences_pass, int num_techniques_notApplicable, int num_evaluated_elem, List<SuccessCriterion> success_criteria, String vd_pageLocalCopy) {
        this.url = url;
        this.evalId = evalId;
        this.ipaCode = ipaCode;
        this.num_techniques_failed = num_techniques_failed;
        this.num_occurrences_fail = num_occurrences_fail;
        this.num_techniques_cantTell = num_techniques_cantTell;
        this.num_occurrences_cantTell = num_occurrences_cantTell;
        this.num_techniques_passed = num_techniques_passed;
        this.num_occurrences_pass = num_occurrences_pass;
        this.num_techniques_notApplicable = num_techniques_notApplicable;
        this.num_evaluated_elem = num_evaluated_elem;
        this.success_criteria = success_criteria;
        this.vd_pageLocalCopy = vd_pageLocalCopy;
    }

//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }
    
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getNum_techniques_failed() {
        return num_techniques_failed;
    }

    public void setNum_techniques_failed(int num_techniques_failed) {
        this.num_techniques_failed = num_techniques_failed;
    }

    public int getNum_occurrences_fail() {
        return num_occurrences_fail;
    }

    public void setNum_occurrences_fail(int num_occurrences_fail) {
        this.num_occurrences_fail = num_occurrences_fail;
    }

    public int getNum_techniques_cantTell() {
        return num_techniques_cantTell;
    }

    public void setNum_techniques_cantTell(int num_techniques_cantTell) {
        this.num_techniques_cantTell = num_techniques_cantTell;
    }

    public int getNum_occurrences_cantTell() {
        return num_occurrences_cantTell;
    }

    public void setNum_occurrences_cantTell(int num_occurrences_cantTell) {
        this.num_occurrences_cantTell = num_occurrences_cantTell;
    }

    public int getNum_techniques_passed() {
        return num_techniques_passed;
    }

    public void setNum_techniques_passed(int num_techniques_passed) {
        this.num_techniques_passed = num_techniques_passed;
    }

    public int getNum_occurrences_pass() {
        return num_occurrences_pass;
    }

    public void setNum_occurrences_pass(int num_occurrences_pass) {
        this.num_occurrences_pass = num_occurrences_pass;
    }

    public int getNum_techniques_notApplicable() {
        return num_techniques_notApplicable;
    }

    public void setNum_techniques_notApplicable(int num_techniques_notApplicable) {
        this.num_techniques_notApplicable = num_techniques_notApplicable;
    }

    public int getNum_evaluated_elem() {
        return num_evaluated_elem;
    }

    public void setNum_evaluated_elem(int num_evaluated_elem) {
        this.num_evaluated_elem = num_evaluated_elem;
    }

    public List<SuccessCriterion> getSuccess_criteria() {
        return success_criteria;
    }

    public void setSuccess_criteria(List<SuccessCriterion> success_criteria) {
        this.success_criteria = success_criteria;
    }
    
    public String getVd_pageLocalCopy() {
        return vd_pageLocalCopy;
    }

    public void setVd_pageLocalCopy(String vd_pageLocalCopy) {
        this.vd_pageLocalCopy = vd_pageLocalCopy;
    }

    public String getReport_path() {
        return report_path;
    }

    public void setReport_path(String report_path) {
        this.report_path = report_path;
    }
    /*
    public EvalReport getEvalReport() {
        return evalReport;
    }

    public void setEvalReport(EvalReport evalReport) {
        this.evalReport = evalReport;
    }
    */
    
    
}
