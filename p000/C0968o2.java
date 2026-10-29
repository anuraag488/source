package p000;

/* JADX INFO: renamed from: o2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0968o2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f26291t;

    /* JADX INFO: renamed from: u */
    public boolean f26292u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ iy3 f26293v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ long f26294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0968o2(iy3 iy3Var, long j, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f26291t = b;
        this.f26293v = iy3Var;
        this.f26294w = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f26291t) {
            case 0:
                C0968o2 c0968o2 = new C0968o2(this.f26293v, wm0Var);
                c0968o2.f26294w = ((b33) obj).f15059a;
                return c0968o2;
            case 1:
                return new C0968o2(this.f26293v, this.f26294w, wm0Var, (byte) 1);
            case 2:
                return new C0968o2(this.f26293v, this.f26294w, wm0Var, (byte) 2);
            default:
                return new C0968o2(this.f26293v, this.f26294w, wm0Var, (byte) 3);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26291t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0968o2) create((wm0) obj2, b33.m3423a(((b33) obj).f15059a))).invokeSuspend(ju4Var);
            case 1:
                return ((C0968o2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0968o2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C0968o2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f26291t;
        ju4 ju4Var = ju4.f22634a;
        iy3 iy3Var = this.f26293v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f26292u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                long j = this.f26294w;
                this.f26292u = true;
                Object objM4798b = dy3.m4798b(iy3Var.f21891R, j, this);
                return objM4798b == ap0Var ? ap0Var : objM4798b;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f26292u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                vy3 vy3Var = iy3Var.f21891R;
                xw2 xw2Var = xw2.f34666b;
                hy3 hy3Var = new hy3(this.f26294w, null);
                this.f26292u = true;
                return vy3Var.m12034g(xw2Var, hy3Var, this) == ap0Var2 ? ap0Var2 : ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f26292u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                vy3 vy3Var2 = iy3Var.f21891R;
                long j2 = this.f26294w;
                this.f26292u = true;
                return vy3Var2.m12030c(j2, true, this) == ap0Var3 ? ap0Var3 : ju4Var;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f26292u;
                if (z4) {
                    if (z4) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                vy3 vy3Var3 = iy3Var.f21891R;
                long j3 = this.f26294w;
                this.f26292u = true;
                return vy3Var3.m12030c(j3, false, this) == ap0Var4 ? ap0Var4 : ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0968o2(iy3 iy3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f26291t = (byte) 0;
        this.f26293v = iy3Var;
    }
}
