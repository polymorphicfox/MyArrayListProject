package com.akos.queue;

/**
 * Очередь для 2 обьектов
 *
 * @param <K> тип элемента "Ключ"
 * @param <V> тип элемента "Значение"
 */
public interface DoubleQueue<K, V> {
    /**
     * Возвращает количество элементов в очереди
     *
     * @return количество элементов
     */
    int size();

    /**
     * Добавляет в очередь новую запись, состоящую из ключа и значения
     *
     * @param key   ключ
     * @param value значение
     */
    void push(K key, V value);

    /**
     * Возвращает обьект типа <tt>Pair</tt>, содержащий ключ и значение лежащие по данному индексу
     *
     * @param index индекс элемента
     * @return обьект содержащий ключ и значение
     */
    Pair getPair(int index);

    /**
     * Возвращает значение, соответствующее ключу
     *
     * @param key клююч
     * @return значение
     */
    V get(K key);

    /**
     * "Достает" элемент из начала очереди
     *
     * @return обьект типа <tt>Pair</tt>, содержащий ключ и значение
     */
    Pair pull();
}
