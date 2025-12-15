
public class TypePromotion {
    public static void main(String args[]) {

        //while executing another type question comment another type question

        //Type 1(a): java automatically promotes each byte, short, or char operand to int when evaluating an expression

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(b-a);//type promotion only done with expression
        // System.out.println(a); // it simply print a because java doesnot do type_promotion without expression

        //Type 1(b)

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a + b + c); // it automatically convert to int
        // System.out.println(bt);

        //Type 2 : if one operand is long float or double the whole expression is promoted to long, float, or double respectively
        
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // int ans = (int) (a + b + c + d); // automatically convert to double because in these case largest value is 30_and 30 is double datatypes
        // System.out.println(ans);

        // question based on Type_promtion in Exprsssion

        // byte b = 5;
        // byte a = (byte)(b * 2); // autoamtically convert entire into integer
        // System.out.println(a);
    }
}
