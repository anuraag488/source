package p000;

import ads_mobile_sdk.dp2;
import ads_mobile_sdk.l51;
import ads_mobile_sdk.r51;
import ads_mobile_sdk.xo2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lu0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f24372t = 2;

    /* JADX INFO: renamed from: u */
    public boolean f24373u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f24374v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f24375w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f24376x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f24377y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(r51 r51Var, l51 l51Var, l51 l51Var2, boolean z, boolean z2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f24375w = r51Var;
        this.f24376x = l51Var;
        this.f24377y = l51Var2;
        this.f24373u = z;
        this.f24374v = z2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f24372t;
        Object obj2 = this.f24377y;
        Object obj3 = this.f24376x;
        Object obj4 = this.f24375w;
        switch (b) {
            case 0:
                return new lu0((ru0) obj4, (gh3) obj3, this.f24374v, (mq1) obj2, wm0Var);
            case 1:
                return new lu0(this.f24374v, (ql3) obj4, (xo2) obj3, (dp2) obj2, wm0Var);
            default:
                return new lu0((r51) obj4, (l51) obj3, (l51) obj2, this.f24373u, this.f24374v, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.f24372t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((lu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((lu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                ((lu0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Exception {
        ju4 ju4Var;
        boolean z = true;
        switch (this.f24372t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z2 = this.f24373u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ru0 ru0Var = (ru0) this.f24375w;
                gh3 gh3Var = (gh3) this.f24376x;
                ku0 ku0Var = new ku0(this.f24374v, ru0Var, (mq1) this.f24377y, null);
                this.f24373u = true;
                Object objM7917Z = lb5.m7917Z("DataStore.readDataOrHandleCorruption", gh3Var, ku0Var, this);
                return objM7917Z == ap0Var ? ap0Var : objM7917Z;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z3 = this.f24373u;
                if (!z3) {
                    k43.m7376J(obj);
                    if (this.f24374v || ((ql3) this.f24375w).f28555a == null) {
                        xo2 xo2Var = (xo2) this.f24376x;
                        dp2 dp2Var = (dp2) this.f24377y;
                        this.f24373u = true;
                        obj = xo2.m2666b(xo2Var, dp2Var, this);
                        if (obj == ap0Var2) {
                            return ap0Var2;
                        }
                    }
                    return ju4.f22634a;
                }
                if (!z3) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                return ju4.f22634a;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                r51 r51Var = (r51) this.f24375w;
                Object obj2 = r51Var.f10569f;
                l51 l51Var = (l51) this.f24376x;
                l51 l51Var2 = (l51) this.f24377y;
                boolean z4 = this.f24373u;
                boolean z5 = this.f24374v;
                synchronized (obj2) {
                    boolean z6 = l51Var != l51Var2;
                    try {
                        boolean z7 = r51Var.f10572k;
                        boolean z8 = !z7 && l51Var2 == l51.f6709c;
                        boolean z9 = z6 && l51Var2 == l51.f6709c;
                        boolean z10 = z6 && l51Var2 == l51.f6710d;
                        boolean z11 = z6 && l51Var2 == l51.f6711e;
                        boolean z12 = z4 != z5;
                        if (!z7 && !z8) {
                            z = false;
                        }
                        r51Var.f10572k = z;
                        if (z8) {
                            synchronized (r51Var.f10569f) {
                            }
                        }
                        if (z9) {
                            synchronized (r51Var.f10569f) {
                            }
                        }
                        if (z10) {
                            synchronized (r51Var.f10569f) {
                            }
                        }
                        if (z11) {
                            r51Var.getVideoLifecycleCallbacks();
                        }
                        if (z12) {
                            r51Var.getVideoLifecycleCallbacks();
                        }
                        ju4Var = ju4.f22634a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(ru0 ru0Var, gh3 gh3Var, boolean z, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f24375w = ru0Var;
        this.f24376x = gh3Var;
        this.f24374v = z;
        this.f24377y = mq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(boolean z, ql3 ql3Var, xo2 xo2Var, dp2 dp2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f24374v = z;
        this.f24375w = ql3Var;
        this.f24376x = xo2Var;
        this.f24377y = dp2Var;
    }
}
