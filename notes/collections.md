## Collections

- Common methods - .size, isEmpty, clear, col.removeIf (n -> n % 2 == 0)

### List

- for Collections.sort - comparable interface to override compareTo method.
- **ArrayList** - for accessing , looping.
- **LinkedList** - for insertion and deletion - use Iterator to remove elements in-between loop.
- **Vector** - legacy - for thread safety

### Set

- add,remove,contains
- **HashSet** - do not allow duplicates
- **TreeSet** - lower, higher, ceiling, floor, headset, tailSet, subset
- **LinkedHashSet** - follows insertion order

### Priority queue

- offer, poll, peek and for Collections.sort - comparator interface to override compare method

### Map - {key,value}

- put (k,v),get (k),remove (k), containsKey (map), containsValue (map), putAll, .keyset (), .values (), .entrySet ()
  will get {k=p}

- **HashMap** - key can be null
- **HashTable** - legacy -for thread safety - key cannot be null
- **LinkedHashMap** - follows insertion order
- **TreeMap** - follows sorted order - lowerKey, higherKey, ceilingKey, floorKey, firstEntry, lastEntry, subMap(ele_1,true,ele_2,true)








