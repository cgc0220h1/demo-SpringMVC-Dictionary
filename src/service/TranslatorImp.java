package service;

import java.util.HashMap;

public class TranslatorImp implements Translator {
    private HashMap<String, String> dictionary;

    public TranslatorImp() {
        dictionary = new HashMap<>();
        dictionary.put("car", "xe hoi");
        dictionary.put("bike", "xe may");
        dictionary.put("people", "con nguoi");
    }

    public TranslatorImp(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String translateToVN(String input) {
        return dictionary.get(input);
    }

    @Override
    public String translateToUS(String input) {
        return dictionary.get(input);
    }
}
