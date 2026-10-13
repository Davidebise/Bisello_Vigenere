import static java.lang.IO.println;
import static java.lang.IO.readln;

void main(){
    println("Algoritmo di Vigenere");
    String mode;

    do{
        mode=readln("Inserire modalità cifratura(c/d):");
    }while(!mode.equalsIgnoreCase("c") && !mode.equalsIgnoreCase("d"));

            try{
                String key;
                do{
                    key=readln("Inserire parola chiave:");
                }while(key.isEmpty());
                String message=readln("Inserire messaggio da cifrare/decifrare:");
                if(mode.equalsIgnoreCase("c"))
                    println(Vigenere.Cifra(message,key));
                else
                    println(Vigenere.Decifra(message,key));
            }
            catch(Exception e){
                println("Errore:"+e.getMessage());
            }
}

