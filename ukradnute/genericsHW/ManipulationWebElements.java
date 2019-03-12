package genericsHW;

public interface ManipulationWebElements<K,V> {

    /**
     * nastavenie kolekcie do ktorej sa budu vkladat elementy
     * @param key poradova hodnota
     * @param element
     */
    public void setMapElements(K key,V element);

    /**
     * naplnenie elementu
     * @param key
     * @param element
     */
    public void setElement(K key,V element);

    /**
     *  vrat element podla klucu
     * @param key
     * @return
     */
    public V getElement(K key);


    /**
     * vrati kluc podla elementu
     * @param element
     * @return
     */
    public K getKey(V element);

    /**
     * vlozenie rozneho druhu elementov
     * @param key poradova hodnota
     * @param element tlacitko ,fomular, menu
     */
    public void addElement(K key,V element);

    /**
     *  odstranenie elementu
     * @param key
     * @param element
     */
    public void removeElement(K key,V element);
}
