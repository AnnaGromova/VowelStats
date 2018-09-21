import java.util.Arrays;
import java.util.HashMap;

class SymbolsStats
{
	Character[] chars;
	HashMap<Character, Integer> charsStats;
   
   public SymbolsStats(Character[] charsForStats) {
	   this.chars = charsForStats;
	   this.charsStats = new HashMap<Character, Integer>();
	   for (Character findSymbol : this.chars) {
		   this.charsStats.put(findSymbol, 0);
	   }
   };

   public void calculate(String string) {
	   char[] stringToCharArray = string.toCharArray();
	   for (Character symbol : stringToCharArray) { 
		   for (Character findSymbol : Arrays.asList(this.chars)) {
			   if (findSymbol == symbol) {
				   this.charsStats.put(symbol, charsStats.get(symbol) + 1);
				   break;
			   }
		   }
	   };
   };

   public int countChar(char c) {
	   return this.charsStats.get(c);
   };

   public int countTotal() {
	   return this.chars.length;
   };

   public void writeStats() {
	   for (char symbol : this.chars){
		   for(int i = 0; i < countChar(symbol); i++)
			   System.out.print(symbol);
	   }
   };
}
