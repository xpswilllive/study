package containers;
// A simple Map.Entry for sample Map implementations.
import java.util.*;

public class MapEntry<K,V> implements Map.Entry<K,V> {
  private K key;
  private V value;
  public MapEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }
  public K getKey() { return key; }
  public V getValue() { return value; }
  public V setValue(V v) {
    V result = value;
    value = v;
    return result;
  }
  public int hashCode() {
	  int keyHashCode = key.hashCode();
	  String keyBinaryString = Integer.toBinaryString(keyHashCode);//1000111
	  int valueHashCode = value.hashCode();
	  String valueBinaryString = Integer.toBinaryString(valueHashCode);//101111000001100111011111001
	  //异或运算，相同取0，相反取1。101111000001100111010111110
	  int hashCode = (key==null ? 0 : key.hashCode()) ^ (value==null ? 0 : value.hashCode());
    return (key==null ? 0 : key.hashCode()) ^
      (value==null ? 0 : value.hashCode());
  }
  public boolean equals(Object o) {
    if(!(o instanceof MapEntry)) return false;
    MapEntry me = (MapEntry)o;
    return
      (key == null ?
       me.getKey() == null : key.equals(me.getKey())) &&
      (value == null ?
       me.getValue()== null : value.equals(me.getValue()));
  }
  public String toString() { return key + "=" + value; }
  public static void main(String[] args) {
	MapEntry<String, String> mapEntry = new MapEntry<String, String>("G", "greed");
	int hashCode = mapEntry.hashCode();
  }
} ///:~
