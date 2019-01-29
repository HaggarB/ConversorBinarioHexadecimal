public class Binario {
    
     public long Conversiones(int num){
        if(num<2)
            return num;
        else 
            return num%2 + Conversiones(num/2) * 10;
    }
}
