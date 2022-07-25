package largescalevalidation.model.mongo;

/**
 *
 * @author Marco Manca
 */
public class TechniqueDescription {
    private String id;
    private int num_occurences_cantTell;
    private int num_occurences_fail;
    private int num_occurences_pass;

    public TechniqueDescription() {
    }

    public TechniqueDescription(String id) {
        this.id = id;        
    }

    public TechniqueDescription(String id, int num_occurences_cantTell, int num_occurences_fail, int num_occurences_pass) {
        this.id = id;
        this.num_occurences_cantTell = num_occurences_cantTell;
        this.num_occurences_fail = num_occurences_fail;
        this.num_occurences_pass = num_occurences_pass;
    }
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
