
public class Hexadecimal {
   
   char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; //Arreglo con digitos hexadecimales
   int num, aux, decimal; 
   String hexaDecimal = "";
   
   String hexadec(int num){ 
      if(num != 0)
      {
         aux = num % 16;
         hexaDecimal = hexa[aux] + hexaDecimal;
         num = num / 16;
         hexadec(num);
      }
      return hexaDecimal;
   } 
 
}
