package p000;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cp2 {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f16332a;

    /* JADX INFO: renamed from: a */
    public void m4102a(at2 at2Var) {
        byte b = at2Var.f14858a;
        byte b2 = at2Var.f14859b;
        LinkedHashMap linkedHashMap = this.f16332a;
        Integer numValueOf = Integer.valueOf(b);
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(b2)) + " with " + at2Var);
        }
        treeMap2.put(Integer.valueOf(b2), at2Var);
    }
}
