package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lo4 {

    /* JADX INFO: renamed from: a */
    public final long f24231a;

    /* JADX INFO: renamed from: b */
    public final long f24232b;

    /* JADX INFO: renamed from: c */
    public final boolean f24233c;

    public lo4(long j, long j2, boolean z) {
        this.f24231a = j;
        this.f24232b = j2;
        this.f24233c = z;
    }

    /* JADX INFO: renamed from: a */
    public final lo4 m8062a(lo4 lo4Var) {
        return new lo4(b33.m3430h(this.f24231a, lo4Var.f24231a), Math.max(this.f24232b, lo4Var.f24232b), this.f24233c || lo4Var.f24233c);
    }
}
