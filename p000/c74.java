package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c74 {

    /* JADX INFO: renamed from: a */
    public gx2 f15860a;

    /* JADX INFO: renamed from: b */
    public js1 f15861b;

    /* JADX INFO: renamed from: c */
    public vt0 f15862c;

    /* JADX INFO: renamed from: a */
    public final Integer m3865a() {
        return new Integer(((AtomicInteger) this.f15861b.f22555a).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [gx2] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3866b(yp1 yp1Var, ym0 ym0Var) {
        a74 a74Var;
        gx2 gx2Var;
        yp1 yp1Var2;
        gx2 gx2Var2;
        if (ym0Var instanceof a74) {
            a74Var = (a74) ym0Var;
            int i = a74Var.f158x;
            if ((i & Integer.MIN_VALUE) != 0) {
                a74Var.f158x = i - Integer.MIN_VALUE;
            } else {
                a74Var = new a74(this, ym0Var);
            }
        } else {
            a74Var = new a74(this, ym0Var);
        }
        Object objInvoke = a74Var.f156v;
        Object obj = ap0.f14763a;
        int i2 = a74Var.f158x;
        try {
            if (i2 == 0) {
                k43.m7376J(objInvoke);
                gx2Var = this.f15860a;
                a74Var.f154t = (of4) yp1Var;
                a74Var.f155u = gx2Var;
                a74Var.f158x = 1;
                if (gx2Var.m6191e(a74Var) != obj) {
                }
                gx2Var2 = gx2Var;
                yp1Var2 = yp1Var;
                return obj;
            }
            if (i2 == 1) {
                gx2 gx2Var3 = a74Var.f155u;
                yp1 yp1Var3 = (yp1) a74Var.f154t;
                k43.m7376J(objInvoke);
                gx2Var2 = gx2Var3;
                yp1Var2 = yp1Var3;
            } else {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gx2 gx2Var4 = a74Var.f155u;
                k43.m7376J(objInvoke);
                this = gx2Var4;
            }
            this.m6193g(null);
            return objInvoke;
            gx2Var2 = gx2Var;
            yp1Var2 = yp1Var;
            a74Var.f154t = null;
            a74Var.f155u = gx2Var2;
            a74Var.f158x = 2;
            objInvoke = yp1Var2.invoke(a74Var);
            this = gx2Var2;
        } catch (Throwable th) {
            this.m6193g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m3867c(mq1 mq1Var, ym0 ym0Var) {
        b74 b74Var;
        gx2 gx2Var;
        boolean z;
        Throwable th;
        if (ym0Var instanceof b74) {
            b74Var = (b74) ym0Var;
            int i = b74Var.f15151x;
            if ((i & Integer.MIN_VALUE) != 0) {
                b74Var.f15151x = i - Integer.MIN_VALUE;
            } else {
                b74Var = new b74(this, ym0Var);
            }
        } else {
            b74Var = new b74(this, ym0Var);
        }
        Object obj = b74Var.f15149v;
        Object obj2 = ap0.f14763a;
        int i2 = b74Var.f15151x;
        if (i2 != 0) {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = b74Var.f15148u;
            gx2Var = b74Var.f15147t;
            try {
                k43.m7376J(obj);
                if (z) {
                    gx2Var.m6193g(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    gx2Var.m6193g(null);
                }
                throw th;
            }
        }
        k43.m7376J(obj);
        gx2 gx2Var2 = this.f15860a;
        boolean zM6192f = gx2Var2.m6192f();
        try {
            Object objValueOf = Boolean.valueOf(zM6192f);
            b74Var.f15147t = gx2Var2;
            b74Var.f15148u = zM6192f;
            b74Var.f15151x = 1;
            Object objInvoke = mq1Var.invoke(objValueOf, b74Var);
            if (objInvoke == obj2) {
                return obj2;
            }
            gx2Var = gx2Var2;
            z = zM6192f;
            obj = objInvoke;
            if (z) {
                gx2Var.m6193g(null);
            }
            return obj;
        } catch (Throwable th3) {
            gx2Var = gx2Var2;
            z = zM6192f;
            th = th3;
            if (z) {
                gx2Var.m6193g(null);
            }
            throw th;
        }
    }
}
