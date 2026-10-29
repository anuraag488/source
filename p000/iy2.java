package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iy2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21878t;

    /* JADX INFO: renamed from: u */
    public boolean f21879u;

    /* JADX INFO: renamed from: v */
    public float f21880v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f21881w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21882x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy2(Object obj, float f, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f21878t = b;
        this.f21881w = obj;
        this.f21880v = f;
        this.f21882x = obj2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f21878t;
        Object obj2 = this.f21882x;
        switch (b) {
            case 0:
                return new iy2((yz3) this.f21881w, this.f21880v, (wv3) obj2, wm0Var, (byte) 0);
            case 1:
                return new iy2((C1366yf) this.f21881w, this.f21880v, (InterfaceC1407zj) obj2, wm0Var, (byte) 1);
            default:
                iy2 iy2Var = new iy2((dp4) obj2, wm0Var);
                iy2Var.f21881w = obj;
                return iy2Var;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21878t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((iy2) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        float fM10076A;
        zo0 zo0Var;
        byte b = this.f21878t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f21882x;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f21879u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f21879u = true;
                    return ((yz3) this.f21881w).m13273A(this.f21880v, (wv3) obj2, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f21879u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f21879u = true;
                    return C0910mi.m8325a(((C1366yf) this.f21881w).f35183u, new Float(this.f21880v), (InterfaceC1407zj) obj2, null, this, 12) == ap0Var2 ? ap0Var2 : ju4Var;
                }
                if (z2) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f21879u;
                if (!z3) {
                    k43.m7376J(obj);
                    zo0 zo0Var2 = (zo0) this.f21881w;
                    fM10076A = qs5.m10076A(zo0Var2.mo6367f());
                    zo0Var = zo0Var2;
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fM10076A = this.f21880v;
                    zo0Var = (zo0) this.f21881w;
                    k43.m7376J(obj);
                }
                while (zp0.m13653D(zo0Var)) {
                    m10 m10Var = new m10((byte) 5);
                    m10Var.f24531c = (dp4) obj2;
                    m10Var.f24530b = fM10076A;
                    VarHandle.storeStoreFence();
                    this.f21881w = zo0Var;
                    this.f21880v = fM10076A;
                    this.f21879u = true;
                    if (C0006a5.m84v(getContext()).mo9530l(m10Var, this) == ap0Var3) {
                        return ap0Var3;
                    }
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy2(dp4 dp4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21878t = (byte) 2;
        this.f21882x = dp4Var;
    }
}
