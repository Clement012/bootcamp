public class Password {

  public int vowelStrings(String[] words, int left, int right) {
    char[] vowels = new char[]{'a','e','i','o','u'};
    int count = 0;

    for ( int i = left ; i <= right ; i++){
        String word = words[i];
        if (isVowelString(word, vowels)){
            count++;
        }
    }
    return count;
}
private static boolean isVowelString(String word, char[] vowels) {
char firstChar = Character.toLowerCase(word.charAt(0));
char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
return isVowel(firstChar, vowels) && isVowel(lastChar, vowels);
}
private static boolean isVowel(char c, char[] vowels){
for (char vowel : vowels){
    if (c == vowel){
        return true;
    }
}
return false;
}
}