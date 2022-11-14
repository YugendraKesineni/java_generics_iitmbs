import java.util.*;

public class book {
    private String name;
    private String author;
    private double weight;

    public book(String name,String author,double weight){
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;

    }
    public double getWeight(){
        return weight;
    }

    public String toString(){
        return "Book" + " " + name + " " + author + " " + weight;
    }
}
