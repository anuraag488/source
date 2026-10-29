package p000;

/* JADX INFO: renamed from: al */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0458al {

    /* JADX INFO: renamed from: a */
    public int f14604a;

    /* JADX INFO: renamed from: b */
    public nh3 f14605b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1037pk f14606c;

    /* JADX INFO: renamed from: d */
    public String f14607d;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0458al)) {
            return false;
        }
        C0458al c0458al = (C0458al) obj;
        return AbstractC1356y5.m12927u(this.f14605b, c0458al.f14605b) && AbstractC1356y5.m12927u(this.f14606c, c0458al.f14606c) && AbstractC1356y5.m12927u(this.f14607d, c0458al.f14607d);
    }

    public final int hashCode() {
        return this.f14604a;
    }
}
