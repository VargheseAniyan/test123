package dcs.wordnet.bean;
import java.util.List;

import org.springframework.data.annotation.Id;
public class Word {

	 @Id
	 private int synsetId;
	 private String meaning;
	 private String example;
	 private String pos;
	 private List<String> synsetList;
	 private List<String> hyponymy;
	 private List<String> hypernymy;
	 private List<String> holonymy;
	 private List<String> meronymy;
	 private List<String> antonymy;
	public int getSynsetId() {
		return synsetId;
	}
	public void setSynsetId(int synsetId) {
		this.synsetId = synsetId;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public List<String> getSynsetList() {
		return synsetList;
	}
	public void setSynsetList(List<String> synsetList) {
		this.synsetList = synsetList;
	}
	public List<String> getHyponymy() {
		return hyponymy;
	}
	public void setHyponymy(List<String> hyponymy) {
		this.hyponymy = hyponymy;
	}
	public List<String> getHypernymy() {
		return hypernymy;
	}
	public void setHypernymy(List<String> hypernymy) {
		this.hypernymy = hypernymy;
	}
	public List<String> getHolonymy() {
		return holonymy;
	}
	public void setHolonymy(List<String> holonymy) {
		this.holonymy = holonymy;
	}
	public List<String> getMeronymy() {
		return meronymy;
	}
	public void setMeronymy(List<String> meronymy) {
		this.meronymy = meronymy;
	}
	public List<String> getAntonymy() {
		return antonymy;
	}
	public void setAntonymy(List<String> antonymy) {
		this.antonymy = antonymy;
	}
	 

}
