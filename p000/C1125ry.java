package p000;

/* JADX INFO: renamed from: ry */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1125ry extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29722t;

    /* JADX INFO: renamed from: u */
    public boolean f29723u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ co4 f29724v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1125ry(co4 co4Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f29722t = b;
        this.f29724v = co4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f29722t;
        co4 co4Var = this.f29724v;
        switch (b) {
            case 0:
                return new C1125ry(co4Var, wm0Var, (byte) 0);
            case 1:
                C1125ry c1125ry = new C1125ry(co4Var, wm0Var, (byte) 1);
                c1125ry.f29723u = ((Boolean) obj).booleanValue();
                return c1125ry;
            default:
                return new C1125ry(co4Var, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29722t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1125ry) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((C1125ry) create((wm0) obj2, bool)).invokeSuspend(ju4Var);
                return ju4Var;
            default:
                return ((C1125ry) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f29722t;
        ju4 ju4Var = ju4.f22634a;
        co4 co4Var = this.f29724v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f29723u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f29723u = true;
                    if (co4Var.m4055c(xw2.f34665a, this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
            case 1:
                boolean z2 = this.f29723u;
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                if (!z2) {
                    co4Var.m4053a();
                }
                return ju4Var;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f29723u;
                if (!z3) {
                    k43.m7376J(obj);
                    xw2 xw2Var = xw2.f34666b;
                    this.f29723u = true;
                    if (co4Var.m4055c(xw2Var, this) == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
        }
    }
}
