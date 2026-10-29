package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oy4 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f27238a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m9336a() {
        LinkedHashMap linkedHashMap = this.f27238a;
        Map mapM5278Q = eq2.m5278Q(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapM5278Q.values().iterator();
        while (it.hasNext()) {
            ((jy4) it.next()).m7339a();
        }
    }

    public final String toString() {
        String strM10249b = rl3.m10361a(oy4.class).m10249b();
        if (strM10249b == null) {
            strM10249b = "ViewModelStore";
        }
        int iHashCode = hashCode();
        y62.m12992v(16);
        return strM10249b + "@" + Integer.toString(iHashCode, 16) + "(keys=" + hb0.m6322h1(this.f27238a.keySet()) + ")";
    }
}
