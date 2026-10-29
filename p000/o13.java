package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class o13 {

    /* JADX INFO: renamed from: a */
    public final vy3 f26284a;

    /* JADX INFO: renamed from: b */
    public final mq1 f26285b;

    /* JADX INFO: renamed from: c */
    public ky0 f26286c;

    /* JADX INFO: renamed from: d */
    public boolean f26287d;

    /* JADX INFO: renamed from: e */
    public final nh3 f26288e;

    public o13(vy3 vy3Var, mq1 mq1Var, ky0 ky0Var) {
        this.f26284a = vy3Var;
        this.f26285b = mq1Var;
        this.f26286c = ky0Var;
        nh3 nh3Var = new nh3((byte) 11, false);
        nh3Var.f25810b = new lx4(true);
        nh3Var.f25811c = new lx4(true);
        VarHandle.storeStoreFence();
        this.f26288e = nh3Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m8918a(ec3 ec3Var) {
        List list = ec3Var.f18000a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((lc3) list.get(i)).m7952a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m8919b(mq1 mq1Var, ym0 ym0Var) {
        n13 n13Var;
        if (ym0Var instanceof n13) {
            n13Var = (n13) ym0Var;
            int i = n13Var.f25387v;
            if ((i & Integer.MIN_VALUE) != 0) {
                n13Var.f25387v = i - Integer.MIN_VALUE;
            } else {
                n13Var = new n13(this, ym0Var);
            }
        } else {
            n13Var = new n13(this, ym0Var);
        }
        Object obj = n13Var.f25385t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = n13Var.f25387v;
        wm0 wm0Var = null;
        if (i2 == 0) {
            k43.m7376J(obj);
            this.f26287d = true;
            it1 it1Var = new it1((Object) this, (Object) mq1Var, wm0Var, (byte) 14);
            n13Var.f25387v = 1;
            oe4 oe4Var = new oe4(n13Var, n13Var.getContext());
            if (as4.m3235N(oe4Var, true, oe4Var, it1Var) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        this.f26287d = false;
        return ju4.f22634a;
    }
}
