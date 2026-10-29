package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.EnumC0350tz;
import ads_mobile_sdk.b40;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.t84;
import ads_mobile_sdk.ux0;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f19285t;

    /* JADX INFO: renamed from: u */
    public byte f19286u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ boolean f19287v;

    /* JADX INFO: renamed from: w */
    public Object f19288w;

    /* JADX INFO: renamed from: x */
    public Object f19289x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f19290y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu0(byte b, wm0 wm0Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, wm0Var);
        this.f19285t = b;
        this.f19288w = obj;
        this.f19289x = obj2;
        this.f19287v = z;
        this.f19290y = obj3;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f19285t;
        Object obj2 = this.f19290y;
        switch (b) {
            case 0:
                fu0 fu0Var = new fu0((ru0) this.f19289x, (gu0) obj2, wm0Var);
                fu0Var.f19287v = ((Boolean) obj).booleanValue();
                return fu0Var;
            case 1:
                return new fu0((byte) 1, wm0Var, (xz4) this.f19288w, (u93) this.f19289x, (C0950nl) obj2, this.f19287v);
            case 2:
                return new fu0(this.f19287v, (fh2) this.f19288w, (ag1) this.f19289x, (bu1) obj2, wm0Var);
            case 3:
                return new fu0((byte) 3, wm0Var, (s41) this.f19288w, (wa2) this.f19289x, (t84) obj2, this.f19287v);
            default:
                return new fu0((ff3) obj2, this.f19287v, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19285t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fu0) create((wm0) obj2, bool)).invokeSuspend(ju4Var);
            case 1:
                return ((fu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((fu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((fu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return new fu0((ff3) this.f19290y, this.f19287v, (wm0) obj2).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0229  */
    /* JADX WARN: Code duplicated, block: B:111:0x022f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (ads_mobile_sdk.ux0.m2494a(r4, r2, (p000.wa2) r14, r5, r13) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (r0.m2209a(r14, r13) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0180, code lost:
    
        if (r14 == r3) goto L81;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        wb4 tj3Var;
        ux0 ux0Var;
        ff3 ff3Var;
        b40 b40Var;
        Object objM422d;
        ff3 ff3Var2;
        byte b = 0;
        byte b2 = 4;
        int i = 2;
        wm0 wm0Var = null;
        switch (this.f19285t) {
            case 0:
                gu0 gu0Var = (gu0) this.f19290y;
                boolean z = this.f19287v;
                ap0 ap0Var = ap0.f14763a;
                byte b3 = this.f19286u;
                try {
                    if (b3 == 0) {
                        k43.m7376J(obj);
                        ru0 ru0Var = (ru0) this.f19289x;
                        this.f19287v = z;
                        this.f19286u = (byte) 1;
                        obj = ru0Var.m10435h(z, gu0Var, this);
                        if (obj == ap0Var) {
                            return ap0Var;
                        }
                    } else {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) this.f19288w;
                            k43.m7376J(obj);
                            tj3Var = new tj3(th, ((Number) obj).intValue());
                            return new l73(tj3Var, Boolean.valueOf(z));
                        }
                        k43.m7376J(obj);
                    }
                    tj3Var = (wb4) obj;
                    break;
                } catch (Throwable th2) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.f19288w = th2;
                    this.f19287v = z;
                    this.f19286u = (byte) 2;
                    Object objInvoke = gu0Var.invoke(boolValueOf, this);
                    if (objInvoke != ap0Var) {
                        obj = objInvoke;
                        th = th2;
                    }
                    return ap0Var;
                }
                return new l73(tj3Var, Boolean.valueOf(z));
            case 1:
                xz4 xz4Var = (xz4) this.f19288w;
                ap0 ap0Var2 = ap0.f14763a;
                byte b4 = this.f19286u;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    if (xz4Var.m12798a() != null) {
                        C1071qh c1071qh = new C1071qh(b2);
                        c1071qh.f28461b = xz4Var;
                        VarHandle.storeStoreFence();
                        vt0 vt0VarM10013H = qq2.m10013H(c1071qh);
                        C0969o3 c0969o3 = new C0969o3(i, wm0Var, (byte) 5);
                        this.f19286u = (byte) 1;
                        if (lb5.m7902J(vt0VarM10013H, c0969o3, this) != ap0Var2) {
                        }
                    } else {
                        r50 r50Var = i41.f21117b;
                        long jM3238Q = as4.m3238Q(250, m41.MILLISECONDS);
                        this.f19286u = (byte) 2;
                        if (d24.m4318s(jM3238Q, this) != ap0Var2) {
                        }
                    }
                    return ap0Var2;
                }
                if (b4 == 1 || b4 == 2) {
                    k43.m7376J(obj);
                } else {
                    if (b4 != 3) {
                        if (b4 != 4) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                        xy4.m12794w();
                        return null;
                    }
                    k43.m7376J(obj);
                }
                if (z62.m13387o((Boolean) obj, Boolean.TRUE)) {
                    return ju4.f22634a;
                }
                this.f19286u = (byte) 4;
                d24.m4306g(this);
                return ap0Var2;
                u93 u93Var = (u93) this.f19289x;
                boolean z2 = this.f19287v;
                C0950nl c0950nl = (C0950nl) this.f19290y;
                y52 y52Var = new y52(b);
                y52Var.f34911b = u93Var;
                y52Var.f34912c = z2;
                y52Var.f34913d = c0950nl;
                VarHandle.storeStoreFence();
                pg0 pg0Var = new pg0(1561644977, true, y52Var);
                this.f19286u = (byte) 3;
                obj = la1.m7886b(xz4Var, pg0Var, this);
                if (obj != ap0Var2) {
                    if (z62.m13387o((Boolean) obj, Boolean.TRUE)) {
                        return ju4.f22634a;
                    }
                    this.f19286u = (byte) 4;
                    d24.m4306g(this);
                }
                return ap0Var2;
            case 2:
                fh2 fh2Var = (fh2) this.f19288w;
                d83 d83Var = fh2Var.f18990i;
                ap0 ap0Var3 = ap0.f14763a;
                byte b5 = this.f19286u;
                try {
                    if (b5 == 0) {
                        k43.m7376J(obj);
                        if (this.f19287v) {
                            C0910mi c0910mi = fh2Var.f18998q;
                            Float f = new Float(0.0f);
                            this.f19286u = (byte) 1;
                            if (c0910mi.m8330f(this, f) == ap0Var3) {
                            }
                        }
                        return ap0Var3;
                    }
                    if (b5 == 1) {
                        k43.m7376J(obj);
                    } else {
                        if (b5 != 2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    d83Var.setValue(Boolean.FALSE);
                    return ju4.f22634a;
                    C0910mi c0910mi2 = fh2Var.f18998q;
                    Float f2 = new Float(1.0f);
                    ag1 ag1Var = (ag1) this.f19289x;
                    bu1 bu1Var = (bu1) this.f19290y;
                    eh2 eh2Var = new eh2(b);
                    eh2Var.f18090b = bu1Var;
                    eh2Var.f18091c = fh2Var;
                    VarHandle.storeStoreFence();
                    this.f19286u = (byte) 2;
                    obj = C0910mi.m8325a(c0910mi2, f2, ag1Var, eh2Var, this, 4);
                } catch (Throwable th3) {
                    d83Var.setValue(Boolean.FALSE);
                    throw th3;
                }
                break;
            case 3:
                s41 s41Var = (s41) this.f19288w;
                ap0 ap0Var4 = ap0.f14763a;
                byte b6 = this.f19286u;
                if (b6 == 0) {
                    k43.m7376J(obj);
                    wa2 wa2Var = (wa2) this.f19289x;
                    this.f19286u = (byte) 1;
                    if (s41Var.m2210a(wa2Var, "onAdVisibilityChanged", this) != ap0Var4) {
                    }
                    return ap0Var4;
                }
                if (b6 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b6 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
                if (this.f19287v) {
                    t84 t84Var = (t84) this.f19290y;
                    if (t84Var.f11908c.f12532v == EnumC0350tz.ON_VISIBLE) {
                        String str = t84Var.f11909d;
                        this.f19286u = (byte) 2;
                    }
                    break;
                }
                return ju4.f22634a;
            default:
                ju4 ju4Var = ju4.f22634a;
                ap0 ap0Var5 = ap0.f14763a;
                byte b7 = this.f19286u;
                if (b7 == 0) {
                    k43.m7376J(obj);
                    ff5 ff5Var = ((ff3) this.f19290y).f3476d.f3221s;
                    ff5Var.getClass();
                    r50 r50Var2 = i41.f21117b;
                    long j = ((i41) ff5Var.m13553a("gads:flag_update_delay_sec", zy5.m13887v(60, m41.SECONDS), C0033as.a$10)).f21121a;
                    this.f19286u = (byte) 1;
                    if (d24.m4318s(j, this) != ap0Var5) {
                    }
                    return ap0Var5;
                }
                if (b7 != 1) {
                    if (b7 == 2) {
                        k43.m7376J(obj);
                        ux0Var = (ux0) ((ff3) this.f19290y).f3488p.get();
                        ff3Var = (ff3) this.f19290y;
                        b40Var = ff3Var.f3461A;
                        if (b40Var != null) {
                            z62.m13366Y("consentStringsProvider");
                            throw null;
                        }
                        this.f19288w = ux0Var;
                        this.f19289x = ff3Var;
                        this.f19286u = (byte) 3;
                        objM422d = b40.m422d(b40Var, this);
                        if (objM422d != ap0Var5) {
                            ff3Var2 = ff3Var;
                            obj = objM422d;
                            boolean z3 = this.f19287v;
                            this.f19288w = null;
                            this.f19289x = null;
                            this.f19286u = (byte) 4;
                            ux0Var.getClass();
                            break;
                        }
                        return ap0Var5;
                    }
                    if (b7 == 3) {
                        ff3Var2 = (ff3) this.f19289x;
                        ux0Var = (ux0) this.f19288w;
                        k43.m7376J(obj);
                        boolean z4 = this.f19287v;
                        this.f19288w = null;
                        this.f19289x = null;
                        this.f19286u = (byte) 4;
                        ux0Var.getClass();
                    } else {
                        if (b7 != 4) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    break;
                } else {
                    k43.m7376J(obj);
                }
                return ju4Var;
                if (!((ff3) this.f19290y).f3497y.get() && !((ff3) this.f19290y).f3498z) {
                    b40 b40Var2 = ((ff3) this.f19290y).f3461A;
                    if (b40Var2 == null) {
                        z62.m13366Y("consentStringsProvider");
                        throw null;
                    }
                    v82 v82Var = b40Var2.f956C;
                    this.f19286u = (byte) 2;
                    if (v82Var.mo5005t(this) != ap0Var5) {
                        ux0Var = (ux0) ((ff3) this.f19290y).f3488p.get();
                        ff3Var = (ff3) this.f19290y;
                        b40Var = ff3Var.f3461A;
                        if (b40Var != null) {
                            z62.m13366Y("consentStringsProvider");
                            throw null;
                        }
                        this.f19288w = ux0Var;
                        this.f19289x = ff3Var;
                        this.f19286u = (byte) 3;
                        objM422d = b40.m422d(b40Var, this);
                        if (objM422d != ap0Var5) {
                            ff3Var2 = ff3Var;
                            obj = objM422d;
                            boolean z5 = this.f19287v;
                            this.f19288w = null;
                            this.f19289x = null;
                            this.f19286u = (byte) 4;
                            ux0Var.getClass();
                        }
                        break;
                    }
                    return ap0Var5;
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(ru0 ru0Var, gu0 gu0Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19285t = (byte) 0;
        this.f19289x = ru0Var;
        this.f19290y = gu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(boolean z, fh2 fh2Var, ag1 ag1Var, bu1 bu1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19285t = (byte) 2;
        this.f19287v = z;
        this.f19288w = fh2Var;
        this.f19289x = ag1Var;
        this.f19290y = bu1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(ff3 ff3Var, boolean z, wm0 wm0Var) {
        super(2, wm0Var);
        this.f19285t = (byte) 4;
        this.f19290y = ff3Var;
        this.f19287v = z;
    }
}
