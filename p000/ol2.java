package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ol2 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public ol2 f26842a;

    /* JADX INFO: renamed from: b */
    public ol2 f26843b;

    /* JADX INFO: renamed from: c */
    public ol2 f26844c;

    /* JADX INFO: renamed from: d */
    public ol2 f26845d;

    /* JADX INFO: renamed from: e */
    public ol2 f26846e;

    /* JADX INFO: renamed from: f */
    public Object f26847f;

    /* JADX INFO: renamed from: g */
    public boolean f26848g;

    /* JADX INFO: renamed from: h */
    public Object f26849h;

    /* JADX INFO: renamed from: i */
    public int f26850i = 1;

    public ol2(boolean z, ol2 ol2Var, Object obj, ol2 ol2Var2, ol2 ol2Var3) {
        this.f26842a = ol2Var;
        this.f26847f = obj;
        this.f26848g = z;
        this.f26845d = ol2Var2;
        this.f26846e = ol2Var3;
        ol2Var3.f26845d = this;
        ol2Var2.f26846e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f26847f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f26849h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f26847f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26849h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f26847f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f26849h;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f26848g) {
            xy4.m12782k("value == null");
            return null;
        }
        Object obj2 = this.f26849h;
        this.f26849h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f26847f + "=" + this.f26849h;
    }
}
