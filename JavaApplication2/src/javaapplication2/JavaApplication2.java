
package javaapplication2;

import java.util.Stack;

public class JavaApplication2 {
    
    public static void main(String[] args) {
                System.out.print("Jeihad baleegh Saad \n 20-01786 \n");

        String [] x= { "<div>" , "<h1>" , "444" ,"</h1>" , "</div>" };
                String [] y = { "<div>" , "<span>" , "</div>", "</span>" };
        String [] z = { "<html>" , "</head>" , "<head>" , "</html>" };
        String [] k = { "<html>" , "<head>" , "</head>" ,"<body>" , "</body>" };
        System.out.println(test(x));
                System.out.println(test(y));
        System.out.println(test(z));
        System.out.println(test(k));


        
    }

    public static boolean test(String[] arr) {
    Stack <String > x = new Stack <String> ();
    if (arr [0].charAt(1) == '/' )
        return false ;
    for (int i =0;i < arr.length;i++){
        if (arr[i].subSequence(0,2). equals ("</"))
        {
        String tail1 = arr[i].charAt(0) + ""+arr[i].substring(2);
        String tail2 = x.pop();
        if (!tail1.equals(tail2))
            return false ;
        }
        else if ( arr[i].charAt(0)== '<')
        { x.push(arr[i]); }
        
    }
if (x.isEmpty())
return true ;
else 
return false;
    
}}
