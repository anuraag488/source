package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dh2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f17048t;

    /* JADX INFO: renamed from: u */
    public boolean f17049u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ fh2 f17050v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh2(fh2 fh2Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f17048t = b;
        this.f17050v = fh2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f17048t;
        fh2 fh2Var = this.f17050v;
        switch (b) {
            case 0:
                return new dh2(fh2Var, wm0Var, (byte) 0);
            case 1:
                return new dh2(fh2Var, wm0Var, (byte) 1);
            case 2:
                return new dh2(fh2Var, wm0Var, (byte) 2);
            case 3:
                return new dh2(fh2Var, wm0Var, (byte) 3);
            default:
                return new dh2(fh2Var, wm0Var, (byte) 4);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17048t;
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
            case 3:
                break;
        }
        return ((dh2) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f17048t;
        ju4 ju4Var = ju4.f22634a;
        fh2 fh2Var = this.f17050v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f17049u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                C0910mi c0910mi = fh2Var.f18998q;
                Float f = new Float(1.0f);
                this.f17049u = true;
                return c0910mi.m8330f(this, f) == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f17049u;
                if (!z2) {
                    k43.m7376J(obj);
                    C0910mi c0910mi2 = fh2Var.f18997p;
                    o52 o52VarM8954a = o52.m8954a(0L);
                    this.f17049u = true;
                    if (c0910mi2.m8330f(this, o52VarM8954a) == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                fh2Var.f18999r.setValue(o52.m8954a(0L));
                fh2Var.f18989h.setValue(Boolean.FALSE);
                return ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f17049u;
                if (!z3) {
                    k43.m7376J(obj);
                    C0910mi c0910mi3 = fh2Var.f18997p;
                    this.f17049u = true;
                    return c0910mi3.m8331g(this) == ap0Var3 ? ap0Var3 : ju4Var;
                }
                if (z3) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f17049u;
                if (!z4) {
                    k43.m7376J(obj);
                    C0910mi c0910mi4 = fh2Var.f18998q;
                    this.f17049u = true;
                    return c0910mi4.m8331g(this) == ap0Var4 ? ap0Var4 : ju4Var;
                }
                if (z4) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f17049u;
                if (!z5) {
                    k43.m7376J(obj);
                    C0910mi c0910mi5 = fh2Var.f18998q;
                    this.f17049u = true;
                    return c0910mi5.m8331g(this) == ap0Var5 ? ap0Var5 : ju4Var;
                }
                if (z5) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
