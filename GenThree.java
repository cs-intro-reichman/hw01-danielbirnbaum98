public class GenThree {
    public static void main(String[] args) {
        

        int num_1 = Integer.parseInt(args[0]);
        int num_2 = Integer.parseInt(args[1]);

        int min = Math.min(num_1 , num_2);
        int max = Math.max(num_1 , num_2);


        int a = (int)(Math.random() * (max - min) + min);
        int b = (int)(Math.random() * (max - min) + min);
        int c = (int)(Math.random() * (max - min) + min);

        int min_1 = Math.min(a , b);
        int min_2 = Math.min(b , c);
        int min_total = Math.min(min_1 , min_2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("The minimal generated number was " + min_total);
        


        


    
        
    

    }
}