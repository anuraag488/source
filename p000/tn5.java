package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tn5 {

    /* JADX INFO: renamed from: a */
    public Object f31275a;

    public tn5(Serializable serializable) {
        this.f31275a = serializable;
    }

    /* JADX INFO: renamed from: a */
    public final int m11070a() {
        Object obj = this.f31275a;
        if (obj instanceof Boolean) {
            return 0;
        }
        if (obj instanceof Long) {
            return 1;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof String) {
            return 3;
        }
        if (obj instanceof aj6) {
            return 4;
        }
        C1077qn.m9989o("Unexpected flag value type: ".concat(obj.getClass().getName()));
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final String m11071b() {
        m11073d(3);
        return (String) this.f31275a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11072c() {
        m11073d(0);
        return ((Boolean) this.f31275a).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m11073d(int i) {
        int iM11070a = m11070a();
        if (i == iM11070a) {
            return;
        }
        C1077qn.m9989o(zi4.m13618r(i, iM11070a, "Attempted to access flag value as ", ", but actual type is "));
    }

    public final String toString() {
        return this.f31275a.toString();
    }
}
