package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class af3 extends y53 {

    /* JADX INFO: renamed from: a */
    public Object f14440a;

    @Override // p000.y53
    /* JADX INFO: renamed from: a */
    public final Object mo2966a() {
        return this.f14440a;
    }

    @Override // p000.y53
    /* JADX INFO: renamed from: b */
    public final boolean mo2967b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof af3) {
            return this.f14440a.equals(((af3) obj).f14440a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14440a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f14440a + ")";
    }
}
