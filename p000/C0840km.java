package p000;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: km */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0840km extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23222t;

    /* JADX INFO: renamed from: u */
    public byte f23223u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ u93 f23224v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f23225w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f23226x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ sw2 f23227y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0840km(u93 u93Var, Object obj, Object obj2, sw2 sw2Var, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f23222t = b;
        this.f23224v = u93Var;
        this.f23225w = obj;
        this.f23226x = obj2;
        this.f23227y = sw2Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f23222t;
        ju4 ju4Var = ju4.f22634a;
        sw2 sw2Var = this.f23227y;
        Object obj2 = this.f23226x;
        Object obj3 = this.f23225w;
        switch (b) {
            case 0:
                Context context = (Context) obj3;
                mq1 mq1Var = (mq1) obj2;
                g44 g44Var = (g44) sw2Var;
                return new C0840km(this.f23224v, context, mq1Var, g44Var, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            default:
                yp1 yp1Var = (yp1) obj3;
                C1354y3 c1354y3 = (C1354y3) obj2;
                a83 a83Var = (a83) sw2Var;
                return new C0840km(this.f23224v, yp1Var, c1354y3, a83Var, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        long jM3238Q;
        byte b = this.f23222t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f23225w;
        u93 u93Var = this.f23224v;
        sw2 sw2Var = this.f23227y;
        Object obj3 = this.f23226x;
        switch (b) {
            case 0:
                g44 g44Var = (g44) sw2Var;
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f23223u;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    this.f23223u = (byte) 1;
                    obj = u93Var.mo11771c(this);
                    if (obj != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return ju4Var;
                }
                Intent launchIntentForPackage = ((Context) obj2).getPackageManager().getLaunchIntentForPackage((String) g44Var.getValue());
                if (launchIntentForPackage == null) {
                    g44Var.setValue(null);
                    return ju4Var;
                }
                this.f23223u = (byte) 2;
                if (((mq1) obj3).invoke(launchIntentForPackage, this) != ap0Var) {
                    return ju4Var;
                }
                return ap0Var;
            default:
                C1354y3 c1354y3 = (C1354y3) obj3;
                a83 a83Var = (a83) sw2Var;
                ap0 ap0Var2 = ap0.f14763a;
                byte b3 = this.f23223u;
                if (b3 == 0) {
                    k43.m7376J(obj);
                    this.f23223u = (byte) 1;
                    obj = u93Var.mo11771c(this);
                    if (obj != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b3 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b3 == 2) {
                        k43.m7376J(obj);
                        this.f23223u = (byte) 3;
                        if (c1354y3.m12816b(3) != ap0Var2) {
                            r50 r50Var = i41.f21117b;
                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                            this.f23223u = (byte) 4;
                            if (d24.m4318s(jM3238Q, this) != ap0Var2) {
                            }
                        }
                        return ap0Var2;
                    }
                    if (b3 == 3) {
                        k43.m7376J(obj);
                        Object obj4 = ((ep3) obj).f18355a;
                        r50 r50Var2 = i41.f21117b;
                        jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                        this.f23223u = (byte) 4;
                        if (d24.m4318s(jM3238Q, this) != ap0Var2) {
                        }
                        return ap0Var2;
                    }
                    if (b3 != 4) {
                        if (b3 != 5) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                        Object obj5 = ((ep3) obj).f18355a;
                        return ju4Var;
                    }
                    k43.m7376J(obj);
                }
                this.f23223u = (byte) 5;
                if (c1354y3.m12816b(3) != ap0Var2) {
                    return ju4Var;
                }
                return ap0Var2;
                if (!((Boolean) obj).booleanValue()) {
                    return ju4Var;
                }
                a83Var.m133i(a83Var.m132h() + 1);
                this.f23223u = (byte) 2;
                if (((yp1) obj2).invoke(this) != ap0Var2) {
                    this.f23223u = (byte) 3;
                    if (c1354y3.m12816b(3) != ap0Var2) {
                        r50 r50Var3 = i41.f21117b;
                        jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                        this.f23223u = (byte) 4;
                        if (d24.m4318s(jM3238Q, this) != ap0Var2) {
                            this.f23223u = (byte) 5;
                            if (c1354y3.m12816b(3) != ap0Var2) {
                                return ju4Var;
                            }
                        }
                    }
                }
                return ap0Var2;
        }
    }
}
