package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic4 implements hc4 {

    /* JADX INFO: renamed from: a */
    public final C1339xp f21257a = new C1339xp(0);

    /* JADX INFO: renamed from: f */
    public final boolean m6749f(int i) {
        return (this.f21257a.get() & i) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m6750g(int i) {
        C1339xp c1339xp;
        int i2;
        do {
            c1339xp = this.f21257a;
            i2 = c1339xp.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c1339xp.compareAndSet(i2, i2 | i));
    }
}
