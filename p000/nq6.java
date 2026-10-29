package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nq6 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f26041a;

    /* JADX INFO: renamed from: b */
    public Object f26042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mq6 f26043c;

    public nq6(mq6 mq6Var, Comparable comparable, Object obj) {
        this.f26043c = mq6Var;
        this.f26041a = comparable;
        this.f26042b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f26041a.compareTo(((nq6) obj).f26041a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f26041a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f26042b;
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
        return this.f26041a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26042b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f26041a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f26042b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f26043c.m8384h();
        Object obj2 = this.f26042b;
        this.f26042b = obj;
        return obj2;
    }

    public final String toString() {
        return zi4.m13621u(String.valueOf(this.f26041a), "=", String.valueOf(this.f26042b));
    }
}
