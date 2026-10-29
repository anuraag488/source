package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qm4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28576t;

    /* JADX INFO: renamed from: u */
    public boolean f28577u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f28578v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ float f28579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm4(rm4 rm4Var, float f, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f28576t = b;
        this.f28578v = rm4Var;
        this.f28579w = f;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28576t;
        Object obj2 = this.f28578v;
        switch (b) {
            case 0:
                return new qm4((rm4) obj2, this.f28579w, wm0Var, (byte) 0);
            case 1:
                return new qm4((rm4) obj2, this.f28579w, wm0Var, (byte) 1);
            default:
                qm4 qm4Var = new qm4((wh0) obj2, wm0Var);
                qm4Var.f28579w = ((Number) obj).floatValue();
                return qm4Var;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28576t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((qm4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((qm4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((qm4) create((wm0) obj2, Float.valueOf(((Number) obj).floatValue()))).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f28576t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f28578v;
        switch (b) {
            case 0:
                rm4 rm4Var = (rm4) obj2;
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f28577u;
                if (!z) {
                    k43.m7376J(obj);
                    C0910mi c0910mi = rm4Var.f29424t;
                    if (c0910mi == null) {
                        return ju4Var;
                    }
                    Float f = new Float(this.f28579w);
                    InterfaceC1407zj interfaceC1407zj = rm4Var.f29422r ? oh6.f26719M : rm4Var.f29421q;
                    this.f28577u = true;
                    obj = C0910mi.m8325a(c0910mi, f, interfaceC1407zj, null, this, 12);
                    if (obj == ap0Var) {
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
                rm4 rm4Var2 = (rm4) obj2;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f28577u;
                if (!z2) {
                    k43.m7376J(obj);
                    C0910mi c0910mi2 = rm4Var2.f29423s;
                    if (c0910mi2 == null) {
                        return ju4Var;
                    }
                    Float f2 = new Float(this.f28579w);
                    InterfaceC1407zj interfaceC1407zj2 = rm4Var2.f29422r ? oh6.f26719M : rm4Var2.f29421q;
                    this.f28577u = true;
                    obj = C0910mi.m8325a(c0910mi2, f2, interfaceC1407zj2, null, this, 12);
                    if (obj == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
            default:
                i14 i14Var = ((wh0) obj2).f33373a;
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f28577u;
                if (!z3) {
                    k43.m7376J(obj);
                    float f3 = this.f28579w;
                    Object objM8132g = i14Var.f21012d.f17631a.m8132g(d14.f16708e);
                    mq1 mq1Var = (mq1) (objM8132g != null ? objM8132g : null);
                    if (mq1Var == null) {
                        throw d55.m4363h("Required value was null.");
                    }
                    b33 b33VarM3423a = b33.m3423a((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
                    this.f28577u = true;
                    obj = mq1Var.invoke(b33VarM3423a, this);
                    if (obj == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((b33) obj).f15059a & 4294967295L)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm4(wh0 wh0Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28576t = (byte) 2;
        this.f28578v = wh0Var;
    }
}
