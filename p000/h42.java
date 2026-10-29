package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h42 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20379a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i42 f20380b;

    public /* synthetic */ h42(byte b) {
        this.f20379a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20379a;
        i42 i42Var = this.f20380b;
        pp4 pp4Var = (pp4) obj;
        switch (b) {
            case 0:
                i42 i42Var2 = (i42) pp4Var;
                a05 a05Var = i42Var.f21123p;
                if (!z62.m13387o(i42Var2.f21122o, a05Var)) {
                    i42Var2.f21122o = a05Var;
                    i42Var2.mo6659P0();
                }
                return op4.f26939b;
            default:
                i42Var.f21122o = ((i42) pp4Var).f21123p;
                return Boolean.FALSE;
        }
    }
}
