package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ uj2 f17229a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f17230b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yz4 f17231c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ pk4 f17232d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ xk4 f17233e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ vi3 f17234f;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        el4 el4Var;
        cf2 cf2Var;
        cf2 cf2Var2;
        uj2 uj2Var = this.f17229a;
        d83 d83Var = uj2Var.f31926o;
        boolean z = this.f17230b;
        yz4 yz4Var = this.f17231c;
        pk4 pk4Var = this.f17232d;
        xk4 xk4Var = this.f17233e;
        vi3 vi3Var = this.f17234f;
        cf2 cf2Var3 = (cf2) obj;
        uj2Var.f31919h = cf2Var3;
        kl4 kl4VarM11577d = uj2Var.m11577d();
        if (kl4VarM11577d != null) {
            kl4VarM11577d.f23217b = cf2Var3;
        }
        if (z) {
            if (uj2Var.m11574a() == wu1.f33742b) {
                if (((Boolean) uj2Var.f31923l.getValue()).booleanValue() && ((cj2) yz4Var).m4033a()) {
                    pk4Var.m9557s();
                } else {
                    pk4Var.m9551m();
                }
                uj2Var.f31924m.setValue(Boolean.valueOf(y70.m13009J(pk4Var, true)));
                uj2Var.f31925n.setValue(Boolean.valueOf(y70.m13009J(pk4Var, false)));
                d83Var.setValue(Boolean.valueOf(ql4.m9900d(xk4Var.f34342b)));
            } else if (uj2Var.m11574a() == wu1.f33743c) {
                d83Var.setValue(Boolean.valueOf(y70.m13009J(pk4Var, true)));
            }
            oh6.m9119y(uj2Var, xk4Var, vi3Var);
            kl4 kl4VarM11577d2 = uj2Var.m11577d();
            if (kl4VarM11577d2 != null && (el4Var = uj2Var.f31916e) != null && uj2Var.m11575b() && (cf2Var = kl4VarM11577d2.f23217b) != null && cf2Var.mo4000K() && (cf2Var2 = kl4VarM11577d2.f23218c) != null) {
                jl4 jl4Var = kl4VarM11577d2.f23216a;
                C1143sf c1143sf = new C1143sf((byte) 6);
                c1143sf.f30223b = cf2Var;
                VarHandle.storeStoreFence();
                jl3 jl3VarM12845Q = y42.m12845Q(cf2Var, true);
                long jMo4008j = cf2Var.mo4008j(jl3VarM12845Q.m7169e());
                float f = jl3VarM12845Q.f22398c;
                jl3 jl3VarM5671i = AbstractC0647fd.m5671i(jMo4008j, cf2Var.mo4008j((((long) Float.floatToRawIntBits(jl3VarM12845Q.f22399d)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)));
                jl3 jl3VarMo4003Q = cf2Var.mo4003Q(cf2Var2, false);
                if (z62.m13387o((el4) el4Var.f18239a.f15405b.get(), el4Var)) {
                    el4Var.f18240b.mo4546b(xk4Var, vi3Var, jl4Var, c1143sf, jl3VarM5671i, jl3VarMo4003Q);
                }
            }
        }
        return ju4.f22634a;
    }
}
