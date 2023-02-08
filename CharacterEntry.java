
/**
 * Beschreiben Sie hier die Klasse CharacterEntry.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CharacterEntry implements ComparableContent<CharacterEntry> {
String wert;
// diverse weitere Attribute

public CharacterEntry(String pWert){
   wert = pWert;   
}

public boolean isLess(CharacterEntry pContent) {
return this.getWert().compareTo(pContent.getWert()) < 0;
}
public boolean isEqual(CharacterEntry pContent) {
return this.getWert().compareTo(pContent.getWert()) == 0;
}
public boolean isGreater(CharacterEntry pContent) {
return this.getWert().compareTo(pContent.getWert()) > 0;
}
public String getWert() {
return this.wert;
}
}