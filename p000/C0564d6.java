package p000;

/* JADX INFO: renamed from: d6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0564d6 {

    /* JADX INFO: renamed from: a */
    public final int f16799a;

    /* JADX INFO: renamed from: b */
    public final int f16800b;

    /* JADX INFO: renamed from: c */
    public final String f16801c;

    static {
        int i = 320;
        new C0564d6(i, "320x50_mb", 50);
        String str = null;
        new C0564d6(468, str, 60);
        new C0564d6(i, str, 100);
        new C0564d6(728, str, 90);
        new C0564d6(300, str, 250);
        int i2 = -3;
        new C0564d6(i2, "fluid", -4);
        int i3 = 0;
        new C0564d6(i2, "search_v2", i3);
        new C0564d6(i3, "invalid", i3);
        int i4 = 160;
        new C0564d6(i4, "160x600_as", 600);
    }

    public C0564d6(int i, int i2, String str, boolean z, boolean z2) {
        this.f16799a = i;
        this.f16800b = i2;
        if (str == null) {
            str = i + "x" + i2 + "_as";
        }
        this.f16801c = str;
        if (i < 0 && i != -3) {
            C1077qn.m9988n(c75.m3877i(i, "Invalid width for AdSize: "));
            throw null;
        }
        if (i2 < 0 && i2 != -4) {
            C1077qn.m9988n(c75.m3877i(i2, "Invalid height for AdSize: "));
            throw null;
        }
        if (z && z2) {
            C1077qn.m9987m("AdSize cannot be both inline and anchored adaptive");
            throw null;
        }
        if (!z2 || i2 >= 1) {
            return;
        }
        C1077qn.m9987m("An inline AdSize must have a positive height");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0564d6)) {
            return false;
        }
        C0564d6 c0564d6 = (C0564d6) obj;
        return this.f16799a == c0564d6.f16799a && this.f16800b == c0564d6.f16800b && z62.m13387o(this.f16801c, c0564d6.f16801c);
    }

    public final int hashCode() {
        return this.f16801c.hashCode();
    }

    public final String toString() {
        return this.f16801c;
    }

    public /* synthetic */ C0564d6(int i, String str, int i2) {
        this(i, i2, str, false, false);
    }
}
