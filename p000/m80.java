package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m80 extends n80 {

    /* JADX INFO: renamed from: a */
    public Throwable f24722a;

    public final boolean equals(Object obj) {
        return (obj instanceof m80) && z62.m13387o(this.f24722a, ((m80) obj).f24722a);
    }

    public final int hashCode() {
        Throwable th = this.f24722a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.n80
    public final String toString() {
        return "Closed(" + this.f24722a + ')';
    }
}
