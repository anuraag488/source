package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18286a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pk4 f18287b;

    public /* synthetic */ eo0(byte b) {
        this.f18286a = b;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0125  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        jl3 jl3Var;
        cf2 cf2VarM11576c;
        char c;
        long j;
        float fIntBitsToFloat;
        cf2 cf2VarM11576c2;
        cf2 cf2VarM11576c3;
        cf2 cf2VarM11576c4;
        cf2 cf2VarM11576c5;
        byte b = this.f18286a;
        pk4 pk4Var = this.f18287b;
        switch (b) {
            case 0:
                C1032pf c1032pf = new C1032pf((byte) 4);
                c1032pf.f27570b = pk4Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 1:
                pk4Var.m9557s();
                return ju4.f22634a;
            default:
                cf2 cf2Var = (cf2) obj;
                uj2 uj2Var = pk4Var.f27696d;
                jl3 jl3Var2 = jl3.f22395e;
                if (uj2Var == null) {
                    jl3Var = jl3Var2;
                } else {
                    if (uj2Var.f31927p) {
                        uj2Var = null;
                    }
                    if (uj2Var != null) {
                        vi3 vi3Var = pk4Var.f27694b;
                        long j2 = pk4Var.m9550l().f34342b;
                        int i = ql4.f28557c;
                        int i2 = (int) (j2 >> 32);
                        vi3Var.m11898a(i2);
                        vi3 vi3Var2 = pk4Var.f27694b;
                        int i3 = (int) (pk4Var.m9550l().f34342b & 4294967295L);
                        vi3Var2.m11898a(i3);
                        uj2 uj2Var2 = pk4Var.f27696d;
                        long jMo4005S = 0;
                        long jMo4005S2 = (uj2Var2 == null || (cf2VarM11576c5 = uj2Var2.m11576c()) == null) ? 0L : cf2VarM11576c5.mo4005S(pk4Var.m9548j(true));
                        uj2 uj2Var3 = pk4Var.f27696d;
                        if (uj2Var3 != null && (cf2VarM11576c4 = uj2Var3.m11576c()) != null) {
                            jMo4005S = cf2VarM11576c4.mo4005S(pk4Var.m9548j(false));
                        }
                        uj2 uj2Var4 = pk4Var.f27696d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (uj2Var4 == null || (cf2VarM11576c3 = uj2Var4.m11576c()) == null) {
                            c = ' ';
                            j = 4294967295L;
                            fIntBitsToFloat = 0.0f;
                        } else {
                            kl4 kl4VarM11577d = uj2Var.m11577d();
                            c = ' ';
                            j = 4294967295L;
                            fIntBitsToFloat = Float.intBitsToFloat((int) (cf2VarM11576c3.mo4005S((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(kl4VarM11577d != null ? kl4VarM11577d.f23216a.m7177c(i2).f22397b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        uj2 uj2Var5 = pk4Var.f27696d;
                        if (uj2Var5 != null && (cf2VarM11576c2 = uj2Var5.m11576c()) != null) {
                            kl4 kl4VarM11577d2 = uj2Var.m11577d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (cf2VarM11576c2.mo4005S((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(kl4VarM11577d2 != null ? kl4VarM11577d2.f23216a.m7177c(i3).f22397b : 0.0f)) & j)) & j));
                        }
                        int i4 = (int) (jMo4005S2 >> c);
                        int i5 = (int) (jMo4005S >> c);
                        jl3Var = new jl3(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (uj2Var.f31912a.f33434d.mo3580c() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jMo4005S2 & j)), Float.intBitsToFloat((int) (jMo4005S & j))));
                    } else {
                        jl3Var = jl3Var2;
                    }
                }
                uj2 uj2Var6 = pk4Var.f27696d;
                if (uj2Var6 == null || (cf2VarM11576c = uj2Var6.m11576c()) == null) {
                    return null;
                }
                return (cf2VarM11576c.mo4000K() && cf2Var.mo4000K()) ? AbstractC0647fd.m5672j(cf2Var.mo3999I(y42.m12861j0(cf2VarM11576c).mo4007b(jl3Var.m7169e())), jl3Var.m7168d()) : jl3Var2;
        }
    }
}
