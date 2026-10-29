package p000;

import android.graphics.BlendModeColorFilter;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class l02 {

    /* JADX INFO: renamed from: a */
    public static final nt2 f23665a = n74.m8579g(kt2.f23428a, 24.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m7759a(g12 g12Var, nt2 nt2Var, long j, mi0 mi0Var, int i, int i2) {
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-126890956);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(g12Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(null) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && ir1Var.m6888f(j)) ? 2048 : 1024;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                if (i4 != 0) {
                    nt2Var = kt2.f23428a;
                }
                if ((i2 & 8) != 0) {
                    j = ((pb0) ir1Var.m6898k(zl0.f36166a)).f27503a;
                    i3 &= -7169;
                }
            } else {
                ir1Var.m6874W();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            }
            nt2 nt2Var2 = nt2Var;
            long j2 = j;
            ir1Var.m6913s();
            m7760b(se0.m10706U(g12Var, ir1Var), nt2Var2, j2, ir1Var, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
            nt2Var = nt2Var2;
            j = j2;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            j02 j02Var = new j02();
            j02Var.f21924a = g12Var;
            j02Var.f21925b = nt2Var;
            j02Var.f21926c = j;
            j02Var.f21927d = i;
            j02Var.f21928e = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = j02Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0102  */
    /* JADX INFO: renamed from: b */
    public static final void m7760b(i73 i73Var, nt2 nt2Var, long j, mi0 mi0Var, int i) {
        int i2;
        nt2 nt2Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-2142239481);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(i73Var) : ir1Var.m6894i(i73Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        o00 o00Var = null;
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6888f(j) ? 2048 : 1024;
        }
        boolean z = true;
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            if ((((i2 & 7168) ^ 3072) <= 2048 || !ir1Var.m6888f(j)) && (i2 & 3072) != 2048) {
                z = false;
            }
            Object objM6869O = ir1Var.m6869O();
            if (z || objM6869O == ki0.f23136a) {
                if (!ws4.m12408a(j, pb0.f27501h)) {
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(j), d24.m4295J(5));
                    o00Var = new o00();
                    o00Var.f26229a = blendModeColorFilter;
                    o00Var.f26230b = j;
                    o00Var.f26231c = 5;
                    VarHandle.storeStoreFence();
                }
                ir1Var.m6905n0(o00Var);
                objM6869O = o00Var;
            }
            o00 o00Var2 = (o00) objM6869O;
            ir1Var.m6885d0(-536844101);
            ir1Var.m6912r(false);
            boolean zM6270b = h74.m6270b(i73Var.mo40g(), 9205357640488583168L);
            kt2 kt2Var = kt2.f23428a;
            if (zM6270b) {
                nt2Var2 = f23665a;
            } else {
                long jMo40g = i73Var.mo40g();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo40g >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jMo40g & 4294967295L)))) {
                    nt2Var2 = f23665a;
                } else {
                    nt2Var2 = kt2Var;
                }
            }
            nt2 nt2VarMo7630d = nt2Var.mo7630d(nt2Var2);
            jm0.f22418cp.getClass();
            q20.m9702a(se0.m10703R(nt2VarMo7630d, i73Var, o00Var2, 22).mo7630d(kt2Var), ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            k02 k02Var = new k02(b);
            k02Var.f22793d = i73Var;
            k02Var.f22794e = nt2Var;
            k02Var.f22791b = j;
            k02Var.f22792c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = k02Var;
        }
    }
}
