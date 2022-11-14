import java.util.*;
public class nonGenericCode {
    public static void main(String[] args){
        List languages = new ArrayList();
        languages.add("English");

        Object value = new String("Swedish");
        languages.add(value);

        System.out.println(languages);
        processLanguages(languages);
    }
    private static void processLanguages(List data){
        String language = (String)data.get(0);
        System.out.println(language);
    }
}