package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class eq2 extends fq2 {
    /* JADX INFO: renamed from: L */
    public static Object m5273L(Object obj, Map map) {
        if (map instanceof cq2) {
            return ((cq2) map).m4104g();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* JADX INFO: renamed from: M */
    public static Map m5274M(l73... l73VarArr) {
        if (l73VarArr.length <= 0) {
            return w71.f33134a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fq2.m5779K(l73VarArr.length));
        m5275N(linkedHashMap, l73VarArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: N */
    public static final void m5275N(AbstractMap abstractMap, l73[] l73VarArr) {
        for (l73 l73Var : l73VarArr) {
            abstractMap.put(l73Var.f23833a, l73Var.f23834b);
        }
    }

    /* JADX INFO: renamed from: O */
    public static List m5276O(Map map) {
        int size = map.size();
        v71 v71Var = v71.f32439a;
        if (size == 0) {
            return v71Var;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return v71Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(new l73(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new l73(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new l73(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static Map m5277P(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        w71 w71Var = w71.f33134a;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                l73 l73Var = (l73) it.next();
                linkedHashMap.put(l73Var.f23833a, l73Var.f23834b);
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                return w71Var;
            }
            if (size != 1) {
                return linkedHashMap;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return w71Var;
        }
        if (size2 == 1) {
            l73 l73Var2 = (l73) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            return Collections.singletonMap(l73Var2.f23833a, l73Var2.f23834b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fq2.m5779K(collection.size()));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            l73 l73Var3 = (l73) it2.next();
            linkedHashMap2.put(l73Var3.f23833a, l73Var3.f23834b);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: Q */
    public static Map m5278Q(Map map) {
        int size = map.size();
        if (size == 0) {
            return w71.f33134a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
