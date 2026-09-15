    import java.util.Scanner;

    public class mainproject
    {
        public static void main (){
            
            int uid [] = {123,234,345,456};
            
            System.out.println("ENTER UID: ");
            Scanner foruid = new Scanner (System.in);
            int x = foruid.nextInt();
            int i;
            boolean found = false ;
            boolean yea = false ;
            for(i=0;i<uid.length;i++)
            { 
                if ( uid[i]==x){
                    found = true ;}
            }
                if (found){ 
                        {System.out.println("Authentcation successful.");}
                        {System.out.println("Enter query : ");}
                        {System.out.println("1 for level.");}
                        {System.out.println("2 for age of account.");}  
                        {System.out.println("3 for more info..");} 
                        } ///// to be redirected a1 
            else{
        System.out.println("Authentcation unsuccessful , please reenter correct UID.");
            while(!found ){  x = foruid.nextInt();// if matches goes to redirection a2
                for ( int z = 0 ; z < uid.length ; z++ ){
                    if(x==uid[z])  {found = true ;yea=true ;
                        {System.out.println("Authentcation successful.");}
                        {System.out.println("Enter query : ");}
                        {System.out.println("1 for level.");}
                        {System.out.println("2 for age of account.");}  
                        {System.out.println("3 for more info..");}  
                                    break ;
                        }
                    }if(!yea)
        {System.out.println("Authentcation unsuccessful , please reenter correct UID.");}
                }
            }
            int query = foruid.nextInt();

            
                if ( query == 1 && x==123){
                    System.out.println("Your level is 45");}
                else if (( query==2 && x==123)){
                    System.out.println("6 years old");}
                else if ( query==3 && x==123){
                    System.out.print ("For further info , contact customer care ");}
                //1
                else if ( query==1 && x==234){
                    System.out.println("Your level is 54");}
                else if ( query==2 && x==234){
                    System.out.println("4 years old");}
                else if (query==3 && x==234){
                    System.out.print ("For further info , contact customer care ");}
            ////2
                
                else if (query==1 && x==345){
                    System.out.println("Your level is 76");}
                else if (query==2 && x==345){
                    System.out.println("7 years old");}
                else if (query==3 && x==345){
                    System.out.print ("For further info , contact customer care ");}
            ////3
                else if ( query==1 && x==456){
                    System.out.println("Your level is 23");}
                else if  (query==2 && x==456){
                    System.out.println("1years old");}
                else if ( query==3 && x==456){
                    System.out.print ("For further info , contact customer care ");}
                ///4   
            else {System.out.print("invalid input");}
                
        }
    }

