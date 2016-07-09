package com.jun.chu.java.book.rule2.builder_pattern;

/**
 * Created by chujun on 16/7/9.
 */
public class Client {
    public static void main(String[] args){
        NutritionFact cocaCola=new NutritionFact.Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);
    }
}
