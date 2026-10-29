package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gy3 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20192a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ iy3 f20193b;

    public /* synthetic */ gy3(byte b) {
        this.f20192a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f20192a;
        iy3 iy3Var = this.f20193b;
        switch (b) {
            case 0:
                return Boolean.valueOf(iy3Var.f25208n);
            default:
                sl1 sl1Var = iy3Var.f21893T;
                if (!sl1Var.f25195a.f25208n) {
                    return null;
                }
                nl1 nl1VarM10858T0 = sl1Var.m10858T0();
                int iOrdinal = nl1VarM10858T0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    C0670g.m5864c();
                    return null;
                }
                if (nl1VarM10858T0.m8794a()) {
                    return sl1Var.m10856R0(null);
                }
                sl1 sl1VarM3620f = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).m3620f();
                if (sl1VarM3620f != null) {
                    return sl1VarM3620f.m10856R0(sc6.m10651W(sl1Var));
                }
                return null;
        }
    }
}
