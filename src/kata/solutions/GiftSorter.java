package kata.solutions;

/**
 *
 * Ordina alfabeticamente i caratteri di una stringa 
 */
public class GiftSorter
{
    public String sortGiftCode(String code)
    {
        StringBuilder returnValue = new StringBuilder();
        code.chars().sorted().forEach(ch -> returnValue.append((char)ch + ""));
        return returnValue.toString();
    }
}