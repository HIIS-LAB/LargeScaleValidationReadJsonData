package it.cnr.isti.hiis.largescalevalidationreadjsondata;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import largescalevalidation.model.mongo.MongoEvalData;
import largescalevalidation.model.mongo.MongoEvalPageResult;

/**
 *
 * @author Marco Manca
 */
public class LargeScaleValidationReadJsonData {

    public static void main(String[] args) {
        try {
            File summaryFile = new File("docs\\eval_summary_2022-07-25-12-02.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);            
            List<MongoEvalData> evalDataList = mapper.readValue(summaryFile, 
                    mapper.getTypeFactory().constructCollectionType(List.class, MongoEvalData.class));
            for(MongoEvalData _evalData : evalDataList) {
                System.out.println("IpaCode ".concat(_evalData.getIpaCode()));                                
            }
            File pageEvalFile = new File("docs\\page_eval_2022-07-25-12-48.json");
            List<MongoEvalPageResult> pageEvalList = mapper.readValue(pageEvalFile, 
                    mapper.getTypeFactory().constructCollectionType(List.class, MongoEvalPageResult.class));
            for(MongoEvalPageResult res : pageEvalList) {
                System.out.println("URL ".concat(res.getUrl()));
            }
        } catch (IOException ex) {
            Logger.getLogger(LargeScaleValidationReadJsonData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
