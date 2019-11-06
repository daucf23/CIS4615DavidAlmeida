//EXP01-J. Do not use a null in a case where an object is required



public static int cardinality(Object obj, final Collection<?> col) {
  int count = 0;
  if (col == null) {
    return count;
  }
  Iterator<?> it = col.iterator();
  while (it.hasNext()) {
    Object elt = it.next();
    if ((null == obj && null == elt) || obj.equals(elt)) {  // Null pointer dereference
      count++;
    }
  }
  return count;
}


public static int cardinality(Object obj, final Collection col) {
  int count = 0;
  if (col == null) {
    return count;
  }
  Iterator it = col.iterator();
  while (it.hasNext()) {
    Object elt = it.next();
    if ((null == obj && null == elt) ||
        (null != obj && obj.equals(elt))) {
      count++;
    }
  }
  return count;
}