package Collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class WeakHashMapExmpl {
    public static void main(String[] args) {
        final Map<Key,String> map = new WeakHashMap<>();
        Key key1 = new Key("Test");
        Key key2 = new Key("test2");
        map.put(key1,"Working");
        map.put(key2, "Working on test2");
        for(Entry<Key,String> entry:map.entrySet()){
            System.err.println(entry.getKey().getKey()+" "+entry.getValue());
        }
        key2 = null;
        System.gc();
        for(Entry<Key,String> entry:map.entrySet()){
            System.err.println(entry.getKey().getKey()+" "+entry.getValue());
        }

    }
}
class Key{
    private String key;
    public Key(final String key){
        super();
        this.key = key;
    }

    public String getKey(){
        return key;
    }

    public void setKey(final String key){
        this.key = key;
    }
}
