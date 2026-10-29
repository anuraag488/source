package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pp2 implements ls2 {

    /* JADX INFO: renamed from: a */
    public ls2[] f27885a;

    @Override // p000.ls2
    /* JADX INFO: renamed from: a */
    public final qj3 mo8101a(Class cls) {
        for (ls2 ls2Var : this.f27885a) {
            if (ls2Var.mo8102b(cls)) {
                return ls2Var.mo8101a(cls);
            }
        }
        qm5.m9919j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p000.ls2
    /* JADX INFO: renamed from: b */
    public final boolean mo8102b(Class cls) {
        for (ls2 ls2Var : this.f27885a) {
            if (ls2Var.mo8102b(cls)) {
                return true;
            }
        }
        return false;
    }
}
