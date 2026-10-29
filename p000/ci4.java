package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ci4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f16047t;

    /* JADX INFO: renamed from: u */
    public boolean f16048u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ nq1 f16049v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ df3 f16050w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ lc3 f16051x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci4(nq1 nq1Var, df3 df3Var, lc3 lc3Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f16047t = b;
        this.f16049v = nq1Var;
        this.f16050w = df3Var;
        this.f16051x = lc3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f16047t) {
            case 0:
                return new ci4(this.f16049v, this.f16050w, this.f16051x, wm0Var, (byte) 0);
            default:
                return new ci4(this.f16049v, this.f16050w, this.f16051x, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16047t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ci4) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f16047t;
        ju4 ju4Var = ju4.f22634a;
        lc3 lc3Var = this.f16051x;
        df3 df3Var = this.f16050w;
        nq1 nq1Var = this.f16049v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f16048u;
                if (!z) {
                    k43.m7376J(obj);
                    b33 b33VarM3423a = b33.m3423a(lc3Var.f23937c);
                    this.f16048u = true;
                    return nq1Var.invoke(df3Var, b33VarM3423a, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f16048u;
                if (!z2) {
                    k43.m7376J(obj);
                    b33 b33VarM3423a2 = b33.m3423a(lc3Var.f23937c);
                    this.f16048u = true;
                    return nq1Var.invoke(df3Var, b33VarM3423a2, this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
