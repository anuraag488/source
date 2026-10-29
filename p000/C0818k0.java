package p000;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0818k0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22782t;

    /* JADX INFO: renamed from: u */
    public boolean f22783u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ AbstractC0892m0 f22784v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ff3 f22785w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0818k0(AbstractC0892m0 abstractC0892m0, ff3 ff3Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f22782t = b;
        this.f22784v = abstractC0892m0;
        this.f22785w = ff3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22782t;
        ff3 ff3Var = this.f22785w;
        AbstractC0892m0 abstractC0892m0 = this.f22784v;
        switch (b) {
            case 0:
                return new C0818k0(abstractC0892m0, ff3Var, wm0Var, (byte) 0);
            case 1:
                return new C0818k0(abstractC0892m0, ff3Var, wm0Var, (byte) 1);
            case 2:
                return new C0818k0(abstractC0892m0, ff3Var, wm0Var, (byte) 2);
            default:
                return new C0818k0(abstractC0892m0, ff3Var, wm0Var, (byte) 3);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22782t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C0818k0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f22782t;
        ju4 ju4Var = ju4.f22634a;
        ff3 ff3Var = this.f22785w;
        AbstractC0892m0 abstractC0892m0 = this.f22784v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f22783u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                nv2 nv2Var = abstractC0892m0.f24500q;
                if (nv2Var == null) {
                    return ju4Var;
                }
                ef3 ef3Var = new ef3(ff3Var);
                this.f22783u = true;
                return nv2Var.m8860a(ef3Var, this) == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f22783u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                nv2 nv2Var2 = abstractC0892m0.f24500q;
                if (nv2Var2 == null) {
                    return ju4Var;
                }
                ef3 ef3Var2 = new ef3(ff3Var);
                this.f22783u = true;
                return nv2Var2.m8860a(ef3Var2, this) == ap0Var2 ? ap0Var2 : ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f22783u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                nv2 nv2Var3 = abstractC0892m0.f24500q;
                if (nv2Var3 == null) {
                    return ju4Var;
                }
                this.f22783u = true;
                return nv2Var3.m8860a(ff3Var, this) == ap0Var3 ? ap0Var3 : ju4Var;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f22783u;
                if (z4) {
                    if (z4) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                nv2 nv2Var4 = abstractC0892m0.f24500q;
                if (nv2Var4 == null) {
                    return ju4Var;
                }
                gf3 gf3Var = new gf3(ff3Var);
                this.f22783u = true;
                return nv2Var4.m8860a(gf3Var, this) == ap0Var4 ? ap0Var4 : ju4Var;
        }
    }
}
