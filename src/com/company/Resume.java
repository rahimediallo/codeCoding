package com.company;

import com.connection.Connection;
import com.connection.Service;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.*;
import java.util.stream.Collectors;

public class Resume {
/*

    public static boolean ab(int b, int c) {
        return (b + c == 1 || b == 1 || c == 1);
    }

    static boolean isFoo(String param) {

        if (param == null) {
            return false;
        } else {
            return param.equals("foo");
        }
    }

    public static int calc(int[] array, int n1, int n2) {
        int sum = 0;
        // if(n1==0){
        //     return  array[n2];
        //  }
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }

        //return array[n2] - array[n1-1];
        return sum;
    }

    public static int calculateTotalPrice1(int[] prices,int discount) {
        int total1=0;
        int len=prices.length;
        Arrays.sort(prices);
        for(int i=0;i<len-1;i++) {
            total1=total1+prices[i];
        }
        return (int) ( (total1+(float) ((prices[len-1])-((prices[len-1])*discount/100f))));

    }

    public static int computeDayGains(int nbSeats, int[] payingGuests, int[] guestMovements) {
        Map<Integer, Integer> guestPayouts = new HashMap<>(); // stocke les montants payés par chaque touriste
        int totalGains = 0; // gains totaux du restaurant

        for (int i = 0; i < guestMovements.length; i++){
            int guestId = guestMovements[i];

            if (i % 2 == 0) {
                // Arrivée du touriste
                if (nbSeats > 0) {
                    // S'il y a des places disponibles, le touriste est placé
                    nbSeats--;
                    guestPayouts.put(guestId, payingGuests[guestId]);
                } else {
                    // S'il n'y a pas de places disponibles, le touriste attend
                    guestPayouts.put(guestId, 0);
                }
            } else {
                // Départ du touriste
                if (guestPayouts.containsKey(guestId)) {
                    totalGains += guestPayouts.remove(guestId);
                    nbSeats++;
                }
            }
        }

        return totalGains;
    }

    public static int getClosestToZero(int[] a) {
        int currentValue = 0;
        int closestVal = a[0];
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            currentValue = a[i] * a[i];
            if (currentValue <= (closestVal * closestVal)) {
                closestVal = a[i];
            }
            if(a==null){
                return 0;
            }
        }
        return closestVal;
    }
    static int numberOfWays(int x)
    {
        // Base condition
        if (x==0 || x==1)
            return 1;

            // A participant can choose to consider
            // (1) Remains single. Number of people
            //     reduce to (x-1)
            // (2) Pairs with one of the (x-1) others.
            //     For every pairing, number of people
            //     reduce to (x-2).
        else
            return numberOfWays(x-1) +
                    (x-1)*numberOfWays(x-2);
    }
    public static String translate(String text) {
        final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'))
                ;
        StringBuilder result = new StringBuilder();

        boolean previousCharWasVowel = false;
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            if(VOWELS.contains(c)){
                if(!previousCharWasVowel){
                    result.append("av");
                }
                previousCharWasVowel = true;
            }else{previousCharWasVowel = false;
            }result.append(c);
        }
        return result.toString();


    }

    static String locateUniverseFormula() {
        String path = "/tmp/documents/";
        String fName = "universe-formula";
        File file = find(path, fName);
        return file.getAbsolutePath();
    }
    public static File find(String path, String fName) {
        File f = new File(path);
        if (fName.equalsIgnoreCase(f.getName()))
            return f;
        if (f.isDirectory()) {
            for (String aChild : f.list()) {
                File ff = find(path + File.separator + aChild, fName);
                if (ff != null)
                    return ff;
            }
        }
        return null;
    }

    public static int Solution(int[] tab){

        List<Integer> list = Arrays.stream(tab).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int i = 0;
        while( i < list.size()-1){
            if(list.get(i)==list.get(i+1)){
                list.remove(i+1);

                int a = list.remove(i);

                list.add(a+1);
                Collections.sort(list);
                i=0;
            }else{
                i++;}
        }

        return list.size();
    }
    Node left, right;
    int value;
    public Node find(int v) {
        Node current = this;
        while (current != null) {
            if (current.value == v) {
                return current;
            }
            // This will drop out of the loop naturally if there's no appropriate subnode
            current = v < current.value ? current.left : current.right;
        }
        return null;
    }

    public final class Person {
        private  final String name;
        private  final Date birthDate;

        public Person(String name, Date birthDate) {
            this.name = name;
            this.birthDate = new Date(birthDate.getTime());
        }

        public String getName() {
            return name;
        }

        public Date getBirthDate() {
            return new Date(birthDate.getTime()) ;
        }

    }

    static int count(int n){
        return (n*(n-1)/2);
    }

    void print(Reader reader) throws IOException {
        try{
            int code = reader.read();
            while (code != -1) {
                System.out.print((char) code);
                code = reader.read();
            }
        } finally{
            try{
                reader.close();
            } catch(IOException e){}
        }

    }
    static String concat(String[] strings) {
        String le = String.join("",strings);
        return le;
    }
// javascript

   /* function solution(s) {
  const words = s.split(' ');
        words.forEach(word => {
                console.log(word);
  });
    }

    solution('Hello you !');



    *//*
}

*//*
function nextWeek(date) {
  const nextWeekDate = new Date(date.getTime() + 7 * 24 * 60 * 60 * 1000); // Ajoute 7 jours en millisecondes

  return nextWeekDate;
}

// Exemple d'utilisation
const currentDate = new Date();
const nextWeekDate = nextWeek(currentDate);
console.log(nextWeekDate);
* *//*

*//*
unction average(table) {
  if (table.length === 0) {
    return 0; // Retourne 0 si le tableau est vide
  }

  var sum = 0;
  for (var i = 0; i < table.length; i++) {
    sum += table[i];
  }

  var avg = sum / table.length;
  return avg;
}
* *//*

*//*
function solve(width, height, nbBlocks, grid) {
  // Trouver le bloc avec le numéro le plus à droite
  let maxRightBlock = -1;
  let maxRightColumn = -1;

  for (let row = 0; row < height; row++) {
    for (let col = width - 1; col >= 0; col--) {
      const cell = grid[row][col];
      if (cell !== '.' && cell !== 'X') {
        const blockNum = parseInt(cell);
        if (col > maxRightColumn) {
          maxRightColumn = col;
          maxRightBlock = blockNum;
        }
      }
    }
  }

  return maxRightBlock;
}
* *//*

// computer size of disque
*//*
function computeSizeOnDisk(clusterSize, fileSize) {
  const clusters = Math.ceil(fileSize / clusterSize);
  return clusters * clusterSize;
}

Ignorez et ne modifiez pas le code ci-dessous

  function trySolution(fileSizeOnDisk) {
   console.log('' + JSON.stringify(fileSizeOnDisk));
  }

  trySolution(computeSizeOnDisk(
          JSON.parse(readline()),
        JSON.parse(readline())
        ));
* *//*

    void a(Service s, Connection c) throws Exception {
        // update this code
        try{
            s.setConnection(c);
            try {
                s.execute();
            }catch(Exception e){
                c.rollback();
                throw e;
            }
            c.commit();

        }finally {
            try{
                c.close();
            }catch(Exception e){ }

        }

    }


    static char scanChar(String s) {
        for (char c = 'A'; c <= 'Z'; c++) {
            if (AsciiArt.printChar(c).equals(s)) {
                return c;
            }
        }
        return '?';
    }


    static double approx(double [][] pts){
        double x,y;
        double in=0;
        double total=1;
        double pi;
        while(true){
            x=Math.random();
            y=Math.random();
            if(x*x +y*y <=1)
                in++;
            total++;
            pi =4*(in/total);
            return pi;
        }
        function computeDayGains(nbSeats, payingGuests, guestMovements) {
  const seatedGuests = new Set(); // Set pour suivre les invités actuellement assis
            let totalGains = 0;

            for (const movement of guestMovements) {
                if (seatedGuests.has(movement)) {
                    seatedGuests.delete(movement); // Départ de l'invité
                } else if (seatedGuests.size < nbSeats) {
                    seatedGuests.add(movement); // Arrivée de l'invité et placement à une place libre
                    totalGains += payingGuests[movement]; // Ajout du montant payé par l'invité
                }
            }

            return totalGains;
        }
        public static int computeMultiplesSum(int n) {
            8 // Write your code here
            9 // To debug: System.err.println("Debug messages...");
            10 int sum=0;
            11 for(int i=0; i<n;i++){
                12 if(i%3==0|| i%5==0|| i%7==0){
                    13 sum+=i;
                    14 }
                15 }
            16
            17 return sum;
            18 }



import React, { useState } from 'react';
        2
        3 // Modify this component so that it behaves properly
        4
        5 function ResultDisplayer({ getNewResult }){
            6 const [result, setResult] = useState(null);
            7
            8 function handleClick(){
                9 setResult(getNewResult());
                10 }
            11
            12 return (<div>
                    13 <button id="button" onClick={handleClick}>Click</button>
                    14 {result != null && <span id="result">{result}</span>}
            15 </div>);
            16 }
        17
        18 // Modify this function if you want to change the preview
        19 // It will not be evaluated as part of the assessment
        20 export function Preview() {
            21 return <ResultDisplayer getNewResult={() => 'test'} />;
            22 }
        23
        24 // Do not change
        25 export default ResultDisplayer;

        import React from 'react';
        2
        3 // Create the WelcomeTitle React component here
        4
        5 function WelcomeTitle({user, primary}){
            6
            7 if(user){
                8 return primary ? <h1>Welcome {user}!</h1> : <h2>Welcome {user}!</h2>;
                9 }
            10 return primary ? <h1>Welcome!</h1> : <h2>Welcome!</h2>;
            11 }
        12 // Modify this function if you want to change the preview
        13 // It will not be evaluated as part of the assessment
        14 export function Preview() {
            15 return <WelcomeTitle user='Peter' primary />;
            16 }
        17
        18 // Do not change
        19 export default WelcomeTitle;




        static int findLargest(int[] numbers) {
             // Your code goes here
             int max = Arrays.stream(numbers).max().getAsInt();
             return max;
             }*/

}