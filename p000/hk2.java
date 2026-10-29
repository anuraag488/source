package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk2 implements jk2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20638a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ql3 f20639b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f20640c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ lk2 f20641d;

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        switch (this.f20638a) {
            case 0:
                tk2 tk2Var = (tk2) this.f20641d;
                ql3 ql3Var = this.f20639b;
                yp1 yp1Var = this.f20640c;
                int i = ik2.f21517a[ek2Var.ordinal()];
                if (i == 1) {
                    ql3Var.f28555a = yp1Var.invoke(tk2Var);
                    break;
                } else if (i == 2) {
                    C0469aw c0469aw = (C0469aw) ql3Var.f28555a;
                    if (c0469aw != null) {
                        c0469aw.m3326a();
                    }
                    ql3Var.f28555a = null;
                    break;
                }
                break;
            default:
                pk2 pk2Var = (pk2) this.f20641d;
                ql3 ql3Var2 = this.f20639b;
                yp1 yp1Var2 = this.f20640c;
                int i2 = ik2.f21517a[ek2Var.ordinal()];
                if (i2 == 3) {
                    ql3Var2.f28555a = yp1Var2.invoke(pk2Var);
                    break;
                } else if (i2 == 4) {
                    ql3Var2.f28555a = null;
                    break;
                }
                break;
        }
    }
}
