import java.util.*;
class javaGeneric {
    public static void main(String[] args){
        List<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Sweden");
        processLanguages(languages);
    }

    private static void processLanguages(List<String> data){  //Generic argument
        String language = data.get(0);      
        System.out.println(language);
    }
}