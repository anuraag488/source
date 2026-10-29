package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fj1 implements si1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19022a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ vt0 f19023b;

    public /* synthetic */ fj1(byte b) {
        this.f19022a = b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) throws Throwable {
        jj1 jj1Var;
        Object obj;
        byte b = this.f19022a;
        byte b2 = 1;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ol3 ol3Var = new ol3();
                vt0 vt0Var = this.f19023b;
                fa1 fa1Var = new fa1(b2);
                fa1Var.f18877b = ol3Var;
                fa1Var.f18878c = ti1Var;
                VarHandle.storeStoreFence();
                Object objCollect = vt0Var.collect(fa1Var, wm0Var);
                return objCollect == ap0.f14763a ? objCollect : ju4Var;
            case 1:
                if (wm0Var instanceof jj1) {
                    jj1Var = (jj1) wm0Var;
                    int i = jj1Var.f22327u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jj1Var.f22327u = i - Integer.MIN_VALUE;
                    } else {
                        jj1Var = new jj1(this, wm0Var);
                    }
                } else {
                    jj1Var = new jj1(this, wm0Var);
                }
                Object obj2 = jj1Var.f22326t;
                ap0 ap0Var = ap0.f14763a;
                int i2 = jj1Var.f22327u;
                if (i2 == 0) {
                    k43.m7376J(obj2);
                    Object obj3 = new Object();
                    ol3 ol3Var2 = new ol3();
                    try {
                        vt0 vt0Var2 = this.f19023b;
                        try {
                            lj1 lj1Var = new lj1();
                            lj1Var.f24063a = ol3Var2;
                            lj1Var.f24064b = (byte) 2;
                            lj1Var.f24065c = ti1Var;
                            lj1Var.f24066d = obj3;
                            VarHandle.storeStoreFence();
                            jj1Var.f22329w = obj3;
                            jj1Var.f22327u = 1;
                            return vt0Var2.collect(lj1Var, jj1Var) == ap0Var ? ap0Var : ju4Var;
                        } catch (C0817k e) {
                            e = e;
                            obj = obj3;
                            if (e.f22781a == obj) {
                                return ju4Var;
                            }
                            throw e;
                        }
                    } catch (C0817k e2) {
                        e = e2;
                    }
                } else {
                    if (i2 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = jj1Var.f22329w;
                    try {
                        k43.m7376J(obj2);
                        return ju4Var;
                    } catch (C0817k e3) {
                        e = e3;
                    }
                }
                if (e.f22781a == obj) {
                    return ju4Var;
                }
                throw e;
            default:
                vt0 vt0Var3 = this.f19023b;
                C0806jp c0806jp = new C0806jp((byte) 3);
                c0806jp.f22476b = ti1Var;
                VarHandle.storeStoreFence();
                Object objCollect2 = vt0Var3.collect(c0806jp, wm0Var);
                return objCollect2 == ap0.f14763a ? objCollect2 : ju4Var;
        }
    }
}
