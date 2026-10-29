package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qn3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ni2 f28622a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ d63 f28623b;

    /* JADX INFO: renamed from: a */
    public final long m9991a() {
        d63 d63Var = this.f28623b;
        int i = this.f28622a.f25859n;
        int iOrdinal = d63Var.ordinal();
        if (iOrdinal == 0) {
            return y42.m12830H(0, i);
        }
        if (iOrdinal == 1) {
            return y42.m12830H(i, 0);
        }
        C0670g.m5864c();
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final long m9992b() {
        d63 d63Var = this.f28623b;
        int i = this.f28622a.f25860o;
        int iOrdinal = d63Var.ordinal();
        if (iOrdinal == 0) {
            return ((long) i) & 4294967295L;
        }
        if (iOrdinal == 1) {
            return ((long) i) << 32;
        }
        C0670g.m5864c();
        return 0L;
    }
}
