public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(a+" + "+b+" = "+c);
        System.out.println(++c);
        System.out.println(--c);

        boolean d=true;
        boolean h=false;
        boolean g=false;
        System.out.println(d && h);
        System.out.println(d || h);
        System.out.println(g || h);

        int aa = 4;
        if (aa>7){
            System.out.println("Liczba jest wieksza od 7 i jest nią: "+aa);
        }
        else{
            System.out.println("Liczba jest mniejsza od 7");
        }
    }
}
