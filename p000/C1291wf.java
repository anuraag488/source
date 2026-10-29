package p000;

/* JADX INFO: renamed from: wf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1291wf {

    /* JADX INFO: renamed from: a */
    public boolean f33283a;

    /* JADX INFO: renamed from: b */
    public long f33284b;

    /* JADX INFO: renamed from: a */
    public final long m12242a() {
        if (this.f33283a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f33284b - System.nanoTime());
    }
}
