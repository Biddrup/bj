package b7;

class B7{
    public static void main(String args[]){
        int twoD[][] = new int[5][6];
        int a, b, c = 0;
        
        
        for(a=0; a<5; a++)
            for(b=0; b<6; b++){
                twoD[a][b] = c;
                c++;
            }
        for(a = 0; a<5; a++){
            for(b = 0; b<6; b++){
                System.out.print(twoD[a][b] + " ");
               System.out.println();
            }
        }
    }  
}