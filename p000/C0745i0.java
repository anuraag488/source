package p000;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0745i0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20962t;

    /* JADX INFO: renamed from: u */
    public boolean f20963u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ nv2 f20964v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ff3 f20965w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0745i0(ff3 ff3Var, nv2 nv2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20962t = (byte) 0;
        this.f20965w = ff3Var;
        this.f20964v = nv2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f20962t;
        ff3 ff3Var = this.f20965w;
        nv2 nv2Var = this.f20964v;
        switch (b) {
            case 0:
                return new C0745i0(ff3Var, nv2Var, wm0Var);
            case 1:
                return new C0745i0(nv2Var, ff3Var, wm0Var, (byte) 1);
            default:
                return new C0745i0(nv2Var, ff3Var, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20962t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C0745i0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f20962t;
        ju4 ju4Var = ju4.f22634a;
        ff3 ff3Var = this.f20965w;
        nv2 nv2Var = this.f20964v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f20963u;
                if (!z) {
                    k43.m7376J(obj);
                    gf3 gf3Var = new gf3(ff3Var);
                    this.f20963u = true;
                    return nv2Var.m8860a(gf3Var, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f20963u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f20963u = true;
                    return nv2Var.m8860a(ff3Var, this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f20963u;
                if (!z3) {
                    k43.m7376J(obj);
                    this.f20963u = true;
                    return nv2Var.m8860a(ff3Var, this) == ap0Var3 ? ap0Var3 : ju4Var;
                }
                if (z3) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0745i0(nv2 nv2Var, ff3 ff3Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f20962t = b;
        this.f20964v = nv2Var;
        this.f20965w = ff3Var;
    }
}
