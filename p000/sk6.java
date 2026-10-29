package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sk6 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f30357a;

    /* JADX INFO: renamed from: b */
    public Object f30358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lk6 f30359c;

    public sk6(lk6 lk6Var, Comparable comparable, Object obj) {
        this.f30359c = lk6Var;
        this.f30357a = comparable;
        this.f30358b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f30357a.compareTo(((sk6) obj).f30357a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f30357a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f30358b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f30357a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f30358b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f30357a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f30358b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f30359c.m8007f();
        Object obj2 = this.f30358b;
        this.f30358b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f30357a);
        String strValueOf2 = String.valueOf(this.f30358b);
        return c75.m3881m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
