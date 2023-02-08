 /**
 * <p>
 * Materialien zu den zentralen NRW-Abiturpruefungen im Fach Informatik ab 2018
 * </p>
 * <p>
 * Generisches Interface (Schnittstelle) ComparableContent<ContentType>
 * </p>
 * <p>
 * <p>Das generische Interface ComparableContent<ContentType> legt die Methoden
 * fest, ueber die Objekte verfuegen muessen, die in einen binaeren Suchbaum
 * (BinarySearchTree) eingefuegt werden sollen. Die Ordnungsrelation wird in
 * Klassen, die ComparableContent implementieren durch Ueberschreiben der drei
 * implizit abstrakten Methoden isGreater, isEqual und isLess festgelegt. 
 * </p>
 * </p>
 * @author Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule
 * @version Generisch_02 2014-03-01
 */ 
public interface ComparableContent<ContentType> {

  public boolean isGreater(ContentType pContent);


  public boolean isEqual(ContentType pContent);

  public boolean isLess(ContentType pContent);

}
