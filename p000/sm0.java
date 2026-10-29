package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sm0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30390a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f30391b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30392c;

    public /* synthetic */ sm0(byte b) {
        this.f30390a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        qw2 qw2VarM9863i;
        byte b = this.f30390a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                boolean z = this.f30391b;
                wp1 wp1Var = (wp1) this.f30392c;
                if (z) {
                    wp1Var.invoke();
                }
                break;
            default:
                boolean z2 = this.f30391b;
                C1068qe c1068qe = (C1068qe) this.f30392c;
                if (z2 && (qw2VarM9863i = c1068qe.m9863i()) != null) {
                    ((y44) qw2VarM9863i).mo197f(ju4Var);
                }
                break;
        }
        return ju4Var;
    }
}
