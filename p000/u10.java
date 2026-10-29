package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u10 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f31587t;

    /* JADX INFO: renamed from: u */
    public boolean f31588u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0910mi f31589v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u10(C0910mi c0910mi, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31587t = b;
        this.f31589v = c0910mi;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f31587t) {
            case 0:
                return new u10(this.f31589v, wm0Var, (byte) 0);
            default:
                return new u10(this.f31589v, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31587t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((u10) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f31587t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f31588u;
                if (!z) {
                    k43.m7376J(obj);
                    Float f = new Float(0.0f);
                    this.f31588u = true;
                    return C0910mi.m8325a(this.f31589v, f, null, null, this, 14) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f31588u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                Float f2 = new Float(20.0f);
                db4 db4VarM10014I = qq2.m10014I(1.0f, 50.0f, null, 4);
                this.f31588u = true;
                return C0910mi.m8325a(this.f31589v, f2, db4VarM10014I, null, this, 12) == ap0Var2 ? ap0Var2 : ju4Var;
        }
    }
}
