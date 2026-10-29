package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u73 implements Iterable, cc2 {

    /* JADX INFO: renamed from: b */
    public static final u73 f31697b = new u73(w71.f33134a);

    /* JADX INFO: renamed from: a */
    public final Map f31698a;

    public u73(Map map) {
        this.f31698a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u73) {
            return z62.m13387o(this.f31698a, ((u73) obj).f31698a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31698a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f31698a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                xy4.m12778e();
                return null;
            }
            arrayList.add(new l73(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f31698a + ')';
    }
}
