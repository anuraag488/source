package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ot0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f27073t;

    /* JADX INFO: renamed from: u */
    public boolean f27074u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ru0 f27075v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ot0(ru0 ru0Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f27073t = b;
        this.f27075v = ru0Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f27073t;
        ru0 ru0Var = this.f27075v;
        switch (b) {
            case 0:
                return new ot0(ru0Var, wm0Var, (byte) 0);
            case 1:
                return new ot0(ru0Var, wm0Var, (byte) 1);
            default:
                return new ot0(ru0Var, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27073t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ot0) create((wm0) obj2, bool)).invokeSuspend(ju4Var);
            case 1:
                return ((ot0) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((ot0) create((wm0) obj2, bool2)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f27073t;
        ru0 ru0Var = this.f27075v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f27074u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                c74 c74VarM10430c = ru0Var.m10430c();
                this.f27074u = true;
                Integer numM3865a = c74VarM10430c.m3865a();
                return numM3865a == ap0Var ? ap0Var : numM3865a;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f27074u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f27074u = true;
                    if (ru0Var.m10432e(this) == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f27074u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                c74 c74VarM10430c2 = ru0Var.m10430c();
                this.f27074u = true;
                Integer numM3865a2 = c74VarM10430c2.m3865a();
                return numM3865a2 == ap0Var3 ? ap0Var3 : numM3865a2;
        }
    }
}
