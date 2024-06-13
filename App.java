public class App
{
    public static void main(String[] args)
    {
        //------------------------------------------------
        System.out.println("------- while ------ ");
        int i = 0;        
        while(i != 10)
        {
            i++;
            
            if(i == 5)
                break; // To stop boucle
                //continue; // To continue iteration
            System.out.println(i);
        }

        //------------------------------------------------
        System.out.println("------- do{...}while ------ ");
        int j = 0;
        do 
        {
            j++;
            
            if(j == 5)
                //break; // To stop boucle
                continue; // To continue iteration
            System.out.println(j);
        }
        while(j != 10);

        //------------------------------------------------
        System.out.println("------- for ------ ");
        //int i;
        for(i = 0; i!= 10; i++)
        {
            System.out.println(i);
        }
    }
}
