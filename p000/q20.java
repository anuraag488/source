package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class q20 {

    /* JADX INFO: renamed from: a */
    public static final lw2 f28154a = m9703b(true);

    /* JADX INFO: renamed from: b */
    public static final lw2 f28155b = m9703b(false);

    /* JADX INFO: renamed from: c */
    public static final C1180tf f28156c;

    static {
        new s20(ig1.f21378b, false);
        f28156c = C1180tf.f31102d;
    }

    /* JADX INFO: renamed from: a */
    public static final void m9702a(nt2 nt2Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-211209833);
        int i2 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, f28156c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1017p0 c1017p0 = new C1017p0((byte) 6);
            c1017p0.f27254b = nt2Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1017p0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final lw2 m9703b(boolean z) {
        lw2 lw2Var = new lw2(9);
        C0853kz c0853kz = ig1.f21378b;
        lw2Var.m8138m(c0853kz, new s20(c0853kz, z));
        C0853kz c0853kz2 = ig1.f21379c;
        lw2Var.m8138m(c0853kz2, new s20(c0853kz2, z));
        C0853kz c0853kz3 = ig1.f21380d;
        lw2Var.m8138m(c0853kz3, new s20(c0853kz3, z));
        C0853kz c0853kz4 = ig1.f21381e;
        lw2Var.m8138m(c0853kz4, new s20(c0853kz4, z));
        C0853kz c0853kz5 = ig1.f21382f;
        lw2Var.m8138m(c0853kz5, new s20(c0853kz5, z));
        C0853kz c0853kz6 = ig1.f21383g;
        lw2Var.m8138m(c0853kz6, new s20(c0853kz6, z));
        C0853kz c0853kz7 = ig1.f21384h;
        lw2Var.m8138m(c0853kz7, new s20(c0853kz7, z));
        C0853kz c0853kz8 = ig1.f21385i;
        lw2Var.m8138m(c0853kz8, new s20(c0853kz8, z));
        C0853kz c0853kz9 = ig1.f21386j;
        lw2Var.m8138m(c0853kz9, new s20(c0853kz9, z));
        return lw2Var;
    }

    /* JADX INFO: renamed from: c */
    public static final xq2 m9704c(InterfaceC0520ca interfaceC0520ca, boolean z) {
        xq2 xq2Var = (xq2) (z ? f28154a : f28155b).m8132g(interfaceC0520ca);
        return xq2Var == null ? new s20(interfaceC0520ca, z) : xq2Var;
    }

    /* JADX INFO: renamed from: d */
    public static final void m9705d(cb3 cb3Var, db3 db3Var, sq2 sq2Var, df2 df2Var, int i, int i2, InterfaceC0520ca interfaceC0520ca) {
        C0853kz c0853kz;
        Object objMo4423m = sq2Var.mo4423m();
        p20 p20Var = objMo4423m instanceof p20 ? (p20) objMo4423m : null;
        cb3.m3943m(cb3Var, db3Var, ((p20Var == null || (c0853kz = p20Var.f27306o) == null) ? interfaceC0520ca : c0853kz).mo3927a((((long) db3Var.f16899a) << 32) | (((long) db3Var.f16900b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), df2Var));
    }
}
