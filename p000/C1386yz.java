package p000;

/* JADX INFO: renamed from: yz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1386yz extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f35637t = 2;

    /* JADX INFO: renamed from: u */
    public boolean f35638u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1349xz f35639v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ og3 f35640w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ d00 f35641x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ xn2 f35642y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386yz(C1349xz c1349xz, d00 d00Var, og3 og3Var, xn2 xn2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35639v = c1349xz;
        this.f35641x = d00Var;
        this.f35640w = og3Var;
        this.f35642y = xn2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f35637t) {
            case 0:
                return new C1386yz(this.f35639v, this.f35641x, this.f35640w, this.f35642y, wm0Var);
            case 1:
                return new C1386yz(this.f35639v, this.f35640w, this.f35641x, this.f35642y, wm0Var);
            default:
                return new C1386yz(this.f35642y, this.f35639v, this.f35640w, this.f35641x, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35637t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C1386yz) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f35637t;
        ju4 ju4Var = ju4.f22634a;
        C1349xz c1349xz = this.f35639v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f35638u;
                if (!z) {
                    k43.m7376J(obj);
                    C0980oe c0980oe = new C0980oe((Object) this.f35641x, (Object) this.f35640w, (Object) this.f35642y, (wm0) null, (byte) 2);
                    this.f35638u = true;
                    return c1349xz.m12796a(c0980oe, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f35638u;
                if (!z2) {
                    k43.m7376J(obj);
                    C1160sw c1160sw = new C1160sw(this.f35640w, this.f35641x, this.f35642y, null, (byte) 1);
                    this.f35638u = true;
                    return c1349xz.m12796a(c1160sw, this) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f35638u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                wm0 wm0Var = null;
                og3 og3Var = this.f35640w;
                xn2 xn2Var = this.f35642y;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, og3Var.f26681a.concat(" consume purchase"), null);
                    }
                }
                a00 a00Var = new a00(og3Var, this.f35641x, xn2Var, wm0Var, (byte) 0);
                this.f35638u = true;
                Object objM12796a = c1349xz.m12796a(a00Var, this);
                return objM12796a == ap0Var3 ? ap0Var3 : objM12796a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386yz(C1349xz c1349xz, og3 og3Var, d00 d00Var, xn2 xn2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35639v = c1349xz;
        this.f35640w = og3Var;
        this.f35641x = d00Var;
        this.f35642y = xn2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386yz(xn2 xn2Var, C1349xz c1349xz, og3 og3Var, d00 d00Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35642y = xn2Var;
        this.f35639v = c1349xz;
        this.f35640w = og3Var;
        this.f35641x = d00Var;
    }
}
