package p000;

/* JADX INFO: renamed from: ro */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class C1115ro extends st2 {

    /* JADX INFO: renamed from: a */
    public float f29469a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f29469a;
        C1152so c1152so = new C1152so();
        c1152so.f30418o = f;
        return c1152so;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1115ro c1115ro = obj instanceof C1115ro ? (C1115ro) obj : null;
        if (c1115ro == null || this.f29469a != c1115ro.f29469a) {
            return false;
        }
        ((C1115ro) obj).getClass();
        return true;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((C1152so) mt2Var).f30418o = this.f29469a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f29469a) * 31);
    }
}
