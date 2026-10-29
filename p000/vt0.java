package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vt0 implements si1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32850a;

    /* JADX INFO: renamed from: b */
    public Object f32851b;

    public /* synthetic */ vt0(byte b) {
        this.f32850a = b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) throws Throwable {
        tt0 tt0Var;
        C1276w0 c1276w0;
        Throwable th;
        rt3 rt3Var;
        rb4 rb4Var;
        byte b = this.f32850a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        wm0 wm0Var2 = null;
        switch (b) {
            case 0:
                if (wm0Var instanceof tt0) {
                    tt0Var = (tt0) wm0Var;
                    int i = tt0Var.f31405u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tt0Var.f31405u = i - Integer.MIN_VALUE;
                    } else {
                        tt0Var = new tt0(this, wm0Var);
                    }
                } else {
                    tt0Var = new tt0(this, wm0Var);
                }
                Object obj = tt0Var.f31404t;
                ap0 ap0Var = ap0.f14763a;
                int i2 = tt0Var.f31405u;
                if (i2 != 0) {
                    if (i2 == 1) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                aj1 aj1Var = (aj1) this.f32851b;
                C0806jp c0806jp = new C0806jp((byte) 2);
                c0806jp.f22476b = ti1Var;
                VarHandle.storeStoreFence();
                tt0Var.f31405u = 1;
                return aj1Var.collect(c0806jp, tt0Var) == ap0Var ? ap0Var : ju4Var;
            case 1:
                Object objEmit = ti1Var.emit(this.f32851b, wm0Var);
                return objEmit == ap0.f14763a ? objEmit : ju4Var;
            case 2:
                if (wm0Var instanceof C1276w0) {
                    c1276w0 = (C1276w0) wm0Var;
                    int i3 = c1276w0.f33001w;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c1276w0.f33001w = i3 - Integer.MIN_VALUE;
                    } else {
                        c1276w0 = new C1276w0(this, wm0Var);
                    }
                } else {
                    c1276w0 = new C1276w0(this, wm0Var);
                }
                Object obj2 = c1276w0.f32999u;
                ap0 ap0Var2 = ap0.f14763a;
                int i4 = c1276w0.f33001w;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rt3Var = c1276w0.f32998t;
                    try {
                        k43.m7376J(obj2);
                        rt3Var.releaseIntercepted();
                        return ju4Var;
                    } catch (Throwable th2) {
                        th = th2;
                        rt3Var.releaseIntercepted();
                        throw th;
                    }
                }
                k43.m7376J(obj2);
                rt3 rt3Var2 = new rt3(ti1Var, c1276w0.getContext());
                try {
                    c1276w0.f32998t = rt3Var2;
                    c1276w0.f33001w = 1;
                    try {
                        Object objInvoke = ((mq1) this.f32851b).invoke(rt3Var2, c1276w0);
                        if (objInvoke != ap0Var2) {
                            objInvoke = ju4Var;
                        }
                        if (objInvoke == ap0Var2) {
                            return ap0Var2;
                        }
                        rt3Var = rt3Var2;
                        rt3Var.releaseIntercepted();
                        return ju4Var;
                    } catch (Throwable th3) {
                        th = th3;
                        rt3Var = rt3Var2;
                        rt3Var.releaseIntercepted();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 3:
                if (wm0Var instanceof rb4) {
                    rb4Var = (rb4) wm0Var;
                    int i5 = rb4Var.f29138u;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rb4Var.f29138u = i5 - Integer.MIN_VALUE;
                    } else {
                        rb4Var = new rb4(this, wm0Var);
                    }
                } else {
                    rb4Var = new rb4(this, wm0Var);
                }
                Object obj3 = rb4Var.f29137t;
                ap0 ap0Var3 = ap0.f14763a;
                int i6 = rb4Var.f29138u;
                if (i6 != 0) {
                    if (i6 != 1) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj3);
                    xy4.m12794w();
                    return null;
                }
                k43.m7376J(obj3);
                ml3 ml3Var = new ml3();
                je4 je4Var = (je4) this.f32851b;
                fa1 fa1Var = new fa1((byte) 6);
                fa1Var.f18877b = ml3Var;
                fa1Var.f18878c = ti1Var;
                VarHandle.storeStoreFence();
                rb4Var.f29138u = 1;
                je4Var.collect(fa1Var, rb4Var);
                return ap0Var3;
            default:
                si1[] si1VarArr = (si1[]) this.f32851b;
                C0898m6 c0898m6 = new C0898m6((byte) 5);
                c0898m6.f24677b = si1VarArr;
                VarHandle.storeStoreFence();
                nd0 nd0Var = new nd0(si1VarArr, c0898m6, new y24(3, wm0Var2, b2), ti1Var, null);
                ui1 ui1Var = new ui1(wm0Var, wm0Var.getContext());
                Object objM3235N = as4.m3235N(ui1Var, true, ui1Var, nd0Var);
                ap0 ap0Var4 = ap0.f14763a;
                if (objM3235N != ap0Var4) {
                    objM3235N = ju4Var;
                }
                return objM3235N == ap0Var4 ? objM3235N : ju4Var;
        }
    }
}
