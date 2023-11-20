package com.skillvaluejava8;

import java.lang.reflect.Method;
class Article {

    private String title;
    private String prefixTitle(String prefix){
        StringBuilder builder= new StringBuilder();
        builder.append(prefix).append(title);
        return builder.toString();

    }
    public static void main(String args[]){
        System.out.println("----");
    }
}
 class Book{
    public static void main (String ags[]){
        Article article = new Article();
        Method[] methods = article.getClass().getMethods();
        for(Method method: methods){
            System.out.println(method.getName());
        }



    }

}



