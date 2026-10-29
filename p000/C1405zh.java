package p000;

import ads_mobile_sdk.dw2;

/* JADX INFO: renamed from: zh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1405zh extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f36079t;

    /* JADX INFO: renamed from: u */
    public byte f36080u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ boolean f36081v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f36082w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36083x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1405zh(boolean z, Object obj, long j, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f36079t = b;
        this.f36081v = z;
        this.f36083x = obj;
        this.f36082w = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f36079t;
        Object obj2 = this.f36083x;
        switch (b) {
            case 0:
                return new C1405zh(this.f36081v, (AbstractC0492bi) obj2, this.f36082w, wm0Var, (byte) 0);
            case 1:
                C1405zh c1405zh = new C1405zh(this.f36082w, wm0Var, (sw2) obj2);
                c1405zh.f36081v = ((Boolean) obj).booleanValue();
                return c1405zh;
            case 2:
                return new C1405zh(this.f36081v, (fe5) obj2, this.f36082w, wm0Var, (byte) 2);
            default:
                return new C1405zh(this.f36081v, (dw2) obj2, this.f36082w, wm0Var, (byte) 3);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36079t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1405zh) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C1405zh) create((wm0) obj2, bool)).invokeSuspend(ju4Var);
            case 2:
                return ((C1405zh) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C1405zh) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        if (p000.d24.m4318s(r1, r13) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
    
        if (p000.d24.m4318s(r1, r13) == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        if (r0 == r10) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
    
        if (r0 == r10) goto L71;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM5870a;
        Object objM5870a2;
        byte b = this.f36079t;
        long j = this.f36082w;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f36083x;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f36080u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    boolean z = this.f36081v;
                    g03 g03Var = ((AbstractC0492bi) obj2).f15284a;
                    if (!z) {
                        this.f36080u = (byte) 1;
                        objM5870a2 = g03Var.m5870a(0L, this.f36082w, this);
                        break;
                    } else {
                        this.f36080u = (byte) 2;
                        objM5870a = g03Var.m5870a(this.f36082w, 0L, this);
                        break;
                    }
                    return ap0Var;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                    objM5870a2 = obj;
                    long j2 = ((jx4) objM5870a2).f22730a;
                    return ju4Var;
                }
                if (b2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                objM5870a = obj;
                long j3 = ((jx4) objM5870a).f22730a;
                return ju4Var;
            case 1:
                sw2 sw2Var = (sw2) obj2;
                boolean z2 = this.f36081v;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f36080u;
                if (b3 != 0) {
                    if (b3 == 1) {
                        k43.m7376J(obj);
                        sw2Var.setValue(Boolean.TRUE);
                        return ju4Var;
                    }
                    if (b3 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    sw2Var.setValue(Boolean.FALSE);
                    return ju4Var;
                }
                k43.m7376J(obj);
                if (!z2) {
                    if (((Boolean) sw2Var.getValue()).booleanValue()) {
                        r50 r50Var = i41.f21117b;
                        long jM3238Q = as4.m3238Q(320, m41.MILLISECONDS);
                        this.f36081v = z2;
                        this.f36080u = (byte) 2;
                        break;
                    }
                    sw2Var.setValue(Boolean.FALSE);
                    return ju4Var;
                }
                long jM6654m = i41.m6654m(j, 0.8d);
                this.f36081v = z2;
                this.f36080u = (byte) 1;
                break;
                return ap0Var2;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                byte b4 = this.f36080u;
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                fe5 fe5Var = (fe5) obj2;
                if (this.f36081v) {
                    this.f36080u = (byte) 1;
                    if (fe5Var.mo602d(j, this) != ap0Var3) {
                        return ju4Var;
                    }
                } else {
                    this.f36080u = (byte) 2;
                    if (fe5Var.mo601b(j, this) != ap0Var3) {
                        return ju4Var;
                    }
                }
                return ap0Var3;
            default:
                ap0 ap0Var4 = ap0.f14763a;
                byte b5 = this.f36080u;
                if (b5 != 0) {
                    if (b5 == 1 || b5 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                dw2 dw2Var = (dw2) obj2;
                if (this.f36081v) {
                    this.f36080u = (byte) 1;
                    dw2Var.getClass();
                    if (dw2.m712c(dw2Var, j, this) != ap0Var4) {
                        return ju4Var;
                    }
                } else {
                    this.f36080u = (byte) 2;
                    dw2Var.getClass();
                    if (dw2.m713d(dw2Var, j, this) != ap0Var4) {
                        return ju4Var;
                    }
                }
                return ap0Var4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1405zh(long j, wm0 wm0Var, sw2 sw2Var) {
        super(2, wm0Var);
        this.f36079t = (byte) 1;
        this.f36082w = j;
        this.f36083x = sw2Var;
    }
}
