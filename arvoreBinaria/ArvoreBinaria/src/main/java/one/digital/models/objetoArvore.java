package one.digital.models;

public abstract class objetoArvore<T> implements Comparable<T> {

   public abstract boolean equals(Object o1);
   public abstract int hashCode();
   public abstract int compareTo(T outro);
   public abstract String toString();
}
