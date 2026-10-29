package p000;

import ads_mobile_sdk.AbstractC0241mu;
import ads_mobile_sdk.C0052br;
import ads_mobile_sdk.EnumC0263nu;
import ads_mobile_sdk.zf2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ik4 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21519t;

    /* JADX INFO: renamed from: u */
    public byte f21520u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f21521v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik4(Object obj, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f21519t = b;
        this.f21521v = obj;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f21519t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f21521v;
        switch (b) {
            case 0:
                return new ik4((pk4) obj2, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            default:
                return new ik4((zf2) obj2, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (p000.lb5.m7921b0(r14, r2, r13) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r13 == r0) goto L46;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.f21519t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f21521v;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                pk4 pk4Var = (pk4) obj2;
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f21520u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    this.f21520u = (byte) 1;
                    if (pk4Var.m9558t(this) != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                pk4Var.f27692A = true;
                return ju4Var;
                l73 l73VarM9544f = pk4Var.m9544f();
                if (l73VarM9544f != null) {
                    String str = (String) l73VarM9544f.f23833a;
                    long j = ((ql4) l73VarM9544f.f23834b).f28558a;
                    tb3 tb3Var = pk4Var.f27701i;
                    if (tb3Var != null) {
                        this.f21520u = (byte) 2;
                        Object objM7921b0 = (str.length() == 0 || ql4.m9900d(j)) ? ju4Var : lb5.m7921b0(tb3Var.f31053a, new C1312wz(tb3Var, new rb3(j, (wm0) null, tb3Var, str), (wm0) null), this);
                        if (objM7921b0 != ap0Var) {
                            objM7921b0 = ju4Var;
                        }
                    }
                    break;
                }
                pk4Var.f27692A = true;
                return ju4Var;
            default:
                zf2 zf2Var = (zf2) obj2;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f21520u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    if (AbstractC0241mu.f7403a == EnumC0263nu.f7863d) {
                        return ju4Var;
                    }
                    this.f21520u = (byte) 1;
                    if (zt5.m13768N(this) != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                zf2Var.f14203i.m11767h0();
                return ju4Var;
                ro0 ro0Var = zf2Var.f14198d;
                C0052br c0052br = new C0052br(zf2Var, wm0Var, (byte) 14);
                this.f21520u = (byte) 2;
                break;
        }
    }
}
