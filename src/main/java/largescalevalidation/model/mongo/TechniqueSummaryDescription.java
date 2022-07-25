package largescalevalidation.model.mongo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Marco Manca
 */
public class TechniqueSummaryDescription {
    private int numPages;
    private List<String> pagesUrl;
    private String technique_id;
    private int num_occurences_cantTell;
    private int num_occurences_fail;
    private int num_occurences_pass;

    public TechniqueSummaryDescription(String technique_id) {
        this.technique_id = technique_id;
        this.pagesUrl = new LinkedList<>();
    }

    
    public TechniqueSummaryDescription() {
        this.pagesUrl = new LinkedList<>();
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public List<String> getPagesUrl() {
        return pagesUrl;
    }

    public void setPagesUrl(List<String> pagesUrl) {
        this.pagesUrl = pagesUrl;        
    }

    public void addPage(String url) {
        this.pagesUrl.add(url);
        this.numPages = this.pagesUrl.size();
    }
    
    public String getTechnique_id() {
        return technique_id;
    }

    public void setTechnique_id(String technique_id) {
        this.technique_id = technique_id;
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
        
    public void incrementOccurrencesPass() {
        this.num_occurences_pass++;
    }
    
    public void incrementOccurrencesPass(int newOcc) {
        this.num_occurences_pass += newOcc;
    }
    
    public void incrementOccurrencesCannot() {
        this.num_occurences_cantTell++;
    }
    
    public void incrementOccurrencesCannot(int newOcc) {
        this.num_occurences_cantTell += newOcc;
    }
    
    public void incrementOccurrencesFail() {
        this.num_occurences_fail++;
    }
    
    public void incrementOccurrencesFail(int newOcc) {
        this.num_occurences_fail += newOcc;
    }
}
