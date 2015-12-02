package dcs.wordnet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.MongoClient;

import dcs.wordnet.bean.Word;

public class MongoService {

	private static MongoClient mongo;
	private String MONGO_HOST ="127.0.0.1";
	private int MONGO_PORT =27017;
	private String DB_NAME ="WordNet";
	private String COLLECTION_NAME ="MalayalamWordNet";
	
	public String setup()
	{
		try
		{
		 mongo = new MongoClient(
                MONGO_HOST, MONGO_PORT);
		 
        MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
        Word p = new Word();
        p.setSynsetId(1);
        p.setExample("ഭഗവാന് ജന്മം എടുക്കാത്തതാകുന്നു");
        p.setMeaning("ഏതൊരുവനാണൊ ജന്മം എടുത്തത്");
        p.setPos("noun");
        List<String> list= new ArrayList<String>();
        list.add("ജന്മം_എടുക്കാത്ത");
        list.add("ജനിക്കാത്ത");
        list.add("അവതരിക്കാത്ത");
        list.add("ആഗതമാകാത്ത");
        p.setSynsetList(list);
        mongoOps.insert(p, COLLECTION_NAME);

        Word p1 = mongoOps.findOne(
                new Query(Criteria.where("synsetList").is("ജനിക്കാത്ത")),
                Word.class, COLLECTION_NAME);

        System.out.println(p1);
         
     //   mongoOps.dropCollection(COLLECTION_NAME);
        mongo.close();
		}
		catch(Exception exception)
		{
			return exception.getMessage();
		}
		return "inserted successfully";
	}
}
