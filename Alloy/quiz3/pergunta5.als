sig Elem{}
sig Bag{
  --stores the number of occurrences (0 or more) of each element in the Bag  
  count: Elem -> one {n: Int | n >= 0}
}
pred insert[e: Elem, b', b: Bag] {
   b.count = b'.count ++ e -> plus[b'.count[e], 1] 
} 
