# LinkedList vs LinkedHashSet vs LinkedHashMap: Performance

> "LinkedSet" is assumed to mean `LinkedHashSet`, since there is no `LinkedSet` class in Java's standard library.

## Comparison Table

| Operation | LinkedList | LinkedHashSet | LinkedHashMap |
|---|---|---|---|
| Add at end | O(1) | O(1) avg | O(1) avg (`put`) |
| Add/remove at head | O(1) | n/a (no head insert before Java 21) | n/a |
| Lookup by value/key | O(n) (`contains`) | O(1) avg | O(1) avg (`get`, `containsKey`) |
| Get by index | O(n) | not supported | not supported |
| Remove by value/key | O(n) | O(1) avg | O(1) avg |
| Remove via iterator | O(1) | O(1) | O(1) |
| Iteration | O(n), in insertion order | O(n), in insertion order | O(n), in insertion order |
| Duplicates | allowed | no | keys unique, values can repeat |

## What Each One Is

- **LinkedList** is a doubly linked list of nodes, and it implements both `List` and `Deque`. It has no hashing, so any search is a linear scan.
- **LinkedHashSet** is backed internally by a `LinkedHashMap`. It's a hash set that also threads a doubly linked list through its entries to remember insertion order.
- **LinkedHashMap** is a `HashMap` with the same linked list running through its entries. It can also be put in access order (`new LinkedHashMap<>(16, 0.75f, true)`), which is the classic way to build an LRU cache by overriding `removeEldestEntry`.

## Performance Notes

- The big divide is **hashing vs. no hashing**. If you call `contains` or `get` often on a large collection, `LinkedList` is the wrong choice: it's O(n) per lookup, where the other two are O(1).
- `LinkedHashSet` and `LinkedHashMap` cost slightly more than `HashSet` and `HashMap`. Each entry carries two extra pointers (`before` and `after`), and every insert or remove also updates the linked list.
- Iteration over the linked variants is often faster than over `HashSet` or `HashMap` when the table is sparse. They walk the entry chain directly instead of scanning every bucket, so iteration time depends on size rather than capacity.
- Hash collisions can degrade lookups. Since Java 8, heavily collided buckets are converted to trees, so the worst case is O(log n) rather than O(n), assuming decent keys and a sensible `hashCode`.
- `LinkedList` has the highest memory overhead per element (a node plus two pointers), and its pointer chasing is poor for CPU cache locality. For stack or queue use, `ArrayDeque` is usually faster.

## When to Pick Which

- **LinkedList**: you need duplicates, index-style list semantics, or heavy add/remove through an iterator or at both ends.
- **LinkedHashSet**: you need uniqueness, fast `contains`, and predictable iteration order, such as de-duplicating while preserving order.
- **LinkedHashMap**: you need key-value lookup with insertion-ordered iteration, or an LRU cache.

## Java 21+ Note

On Java 21+, all three implement the `Sequenced*` interfaces, so you get `getFirst()`, `getLast()`, and `reversed()` on each, which closes some of the convenience gap between them.