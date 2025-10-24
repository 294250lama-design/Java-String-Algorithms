public class MyProgram
{
    public static String upperCase(String para){
        String upperCase ="";
        for(int i=0;i<para.length();i++){
           char character = para.charAt(i);
           if(character>='a'&&character<='z'){
               upperCase+= (char) (character-32);
           }
           else{
               upperCase+=character;
           }
        }
        return upperCase;
    }
    public static String lowerCase(String para){
        String lowerCase="";
        for(int i=0;i<para.length();i++){
            char character = para.charAt(i);
            if(character>='A'&&character<='Z'){
                lowerCase+=(char) (character+32);
            }
            else{
                lowerCase+=character;
            }
        }
        return lowerCase;
    }
    public static String toggleCase(String para){
        String toggleCase="";
        for(int i=0;i<para.length();i++){
            char character = para.charAt(i);
            if(character>='A'&&character<='Z'){
                toggleCase+=(char) (character+32);
            }
            else if(character>='a'&&character<='z'){
                toggleCase+=(char) (character-32);
            }
            else{
                toggleCase+=character;
            }
        }
        return toggleCase;
    }
    public static String capitalizeWord(String para){
        for(int i=0;i<para.length();i++){
            
        }
    }
    public static void main(String[] args)
    {
        System.out.println(upperCase("Hello World"));
        System.out.println(lowerCase("Hello World"));
        System.out.println(toggleCase("Hello World"));        
    }
}
