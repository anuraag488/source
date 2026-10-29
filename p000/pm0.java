package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 {

    /* JADX INFO: renamed from: a */
    public w94 f27742a;

    /* JADX INFO: renamed from: b */
    public static void m9567b(pm0 pm0Var, mq1 mq1Var, pg0 pg0Var, wp1 wp1Var, int i) {
        if ((i & 8) != 0) {
            pg0Var = null;
        }
        w94 w94Var = pm0Var.f27742a;
        nh2 nh2Var = new nh2((byte) 5);
        nh2Var.f25807d = mq1Var;
        nh2Var.f25805b = pm0Var;
        nh2Var.f25808e = pg0Var;
        nh2Var.f25806c = wp1Var;
        VarHandle.storeStoreFence();
        w94Var.add(new pg0(-1789283891, true, nh2Var));
    }

    /* JADX INFO: renamed from: a */
    public final void m9568a(om0 om0Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-798501095);
        int i2 = i | (ir1Var.m6890g(om0Var) ? 4 : 2) | (ir1Var.m6890g(this) ? 32 : 16);
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            w94 w94Var = this.f27742a;
            int size = w94Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((nq1) w94Var.get(i3)).invoke(om0Var, ir1Var, Integer.valueOf(i2 & 14));
            }
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 20);
            ne0Var.f25728b = this;
            ne0Var.f25729c = om0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }
}
