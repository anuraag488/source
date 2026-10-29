package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b20 {

    /* JADX INFO: renamed from: b */
    public static final bs0 f15031b = new bs0(0.05f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: c */
    public static final bs0 f15032c = new bs0(1.0f, 0.0f, 0.95f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final C0910mi f15033a = new C0910mi(p11.m9350a(0.0f), sw4.f30614c, null, 12);

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m3409a(ym0 ym0Var) {
        a20 a20Var;
        if (ym0Var instanceof a20) {
            a20Var = (a20) ym0Var;
            int i = a20Var.f60v;
            if ((i & Integer.MIN_VALUE) != 0) {
                a20Var.f60v = i - Integer.MIN_VALUE;
            } else {
                a20Var = new a20(this, ym0Var);
            }
        } else {
            a20Var = new a20(this, ym0Var);
        }
        a20 a20Var2 = a20Var;
        Object obj = a20Var2.f58t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = a20Var2.f60v;
        ju4 ju4Var = ju4.f22634a;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
                return ju4Var;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        p11 p11VarM9350a = p11.m9350a(0.0f);
        qd2 qd2Var = new qd2();
        qd2Var.f28397a = (short) 300;
        lv2 lv2Var = n52.f25469a;
        qd2Var.f28398b = new lv2();
        qd2Var.f28397a = (short) 334;
        qd2Var.m9862a(p11.m9350a(8.0f), 167).f27534b = f15031b;
        qd2Var.m9862a(p11.m9350a(0.0f), 334).f27534b = f15032c;
        rd2 rd2Var = new rd2();
        rd2Var.f29184a = qd2Var;
        VarHandle.storeStoreFence();
        a20Var2.f60v = 1;
        return C0910mi.m8325a(this.f15033a, p11VarM9350a, rd2Var, null, a20Var2, 12) == ap0Var ? ap0Var : ju4Var;
    }
}
