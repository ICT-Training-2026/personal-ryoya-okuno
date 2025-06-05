class test {
    public static void main(String[] args) {
        int floor = new java.util.Scanner(System.in).nextInt();
        int width = floor*2-1;
            for(int i=0; i<floor; i++){
                
                for(int j=0; j<width/2-i; j++){
                    System.out.print(" ");
                }
                for(int k=0; k<(i+1)*2-1; k++){
                    System.out.print("*");
                }
                for(int l=width/2+i+1; l<width; l++){
                    System.out.print(" ");
                }
                System.out.println("");
            }
         //nya-n
    }
}

