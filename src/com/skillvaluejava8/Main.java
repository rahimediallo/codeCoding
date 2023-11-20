package com.skillvaluejava8;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {


    // affiche tous le meme resultat

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String > completableFuture =  CompletableFuture
                .supplyAsync(()->"helllo");

        CompletableFuture<Void> c1 = completableFuture
                .thenAccept(s -> System.out.println(s+" world"));
        c1.get();
        //
        CompletableFuture<String> c2 = completableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            return "A B C";

        });
        c2.complete("hello world");
        System.out.println(c2.get());


        //
        CompletableFuture <String> f1 = CompletableFuture.supplyAsync(()->{
            return "hello";
        });
        CompletableFuture <String> f2 = CompletableFuture.supplyAsync(()->{
            return "world";
        });
        CompletableFuture <String> c3 = f1.thenCombine(f2, (str1,str2) ->str1+str2);
        System.out.println(c3.get());

    }




}
