package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23309t;

    /* JADX INFO: renamed from: u */
    public byte f23310u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ pp1 f23311v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ xz4 f23312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp1(pp1 pp1Var, xz4 xz4Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f23309t = b;
        this.f23311v = pp1Var;
        this.f23312w = xz4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f23309t) {
            case 0:
                return new kp1(this.f23311v, this.f23312w, wm0Var, (byte) 0);
            default:
                return new kp1(this.f23311v, this.f23312w, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23309t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((kp1) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (p000.d24.m4318s(r3, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (p000.d24.m4318s(r3, r10) == r0) goto L34;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte b = this.f23309t;
        ju4 ju4Var = ju4.f22634a;
        pp1 pp1Var = this.f23311v;
        xz4 xz4Var = this.f23312w;
        byte b2 = 1;
        byte b3 = 2;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b4 = this.f23310u;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    C1071qh c1071qh = new C1071qh(b2);
                    c1071qh.f28461b = xz4Var;
                    VarHandle.storeStoreFence();
                    vt0 vt0VarM10013H = qq2.m10013H(c1071qh);
                    C1108rh c1108rh = new C1108rh(b3, wm0Var, b3);
                    this.f23310u = (byte) 1;
                    if (lb5.m7902J(vt0VarM10013H, c1108rh, this) != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b4 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b4 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                b70 b70Var = pp1Var.f27881c;
                if (b70Var != null) {
                    b70Var.resumeWith(Boolean.valueOf(pp1Var.f27883e));
                }
                pp1Var.f27881c = null;
                return ju4Var;
                r50 r50Var = i41.f21117b;
                long jM3238Q = as4.m3238Q(250, m41.MILLISECONDS);
                this.f23310u = (byte) 2;
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                byte b5 = this.f23310u;
                if (b5 == 0) {
                    k43.m7376J(obj);
                    C1071qh c1071qh2 = new C1071qh(b3);
                    c1071qh2.f28461b = xz4Var;
                    VarHandle.storeStoreFence();
                    vt0 vt0VarM10013H2 = qq2.m10013H(c1071qh2);
                    C1108rh c1108rh2 = new C1108rh(b3, wm0Var, (byte) 3);
                    this.f23310u = (byte) 1;
                    if (lb5.m7902J(vt0VarM10013H2, c1108rh2, this) != ap0Var2) {
                    }
                    return ap0Var2;
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
                b70 b70Var2 = pp1Var.f27881c;
                if (b70Var2 != null) {
                    b70Var2.resumeWith(Boolean.FALSE);
                }
                pp1Var.f27881c = null;
                return ju4Var;
                r50 r50Var2 = i41.f21117b;
                long jM3238Q2 = as4.m3238Q(250, m41.MILLISECONDS);
                this.f23310u = (byte) 2;
                break;
        }
    }
}
