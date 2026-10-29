package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yc6 extends s66 {
    private static final yc6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private od6 zzh;
    private int zzi;

    static {
        yc6 yc6Var = new yc6();
        zzb = yc6Var;
        s66.m10531f(yc6.class, yc6Var);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13089q(yc6 yc6Var, if6 if6Var) {
        yc6Var.zzf = if6Var;
        yc6Var.zze = 7;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m13090r(yc6 yc6Var, vg6 vg6Var) {
        yc6Var.zzf = vg6Var;
        yc6Var.zze = 6;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m13091s(yc6 yc6Var, int i) {
        yc6Var.zzg = i - 1;
        yc6Var.zzd |= 1;
    }

    /* JADX INFO: renamed from: t */
    public static uc6 m13092t() {
        return (uc6) zzb.m10542k();
    }

    /* JADX INFO: renamed from: u */
    public static yc6 m13093u(byte[] bArr) throws g86 {
        s66 s66Var = zzb;
        int length = bArr.length;
        w56 w56Var = w56.f33116a;
        int i = a46.f101a;
        w56 w56Var2 = w56.f33116a;
        if (length != 0) {
            s66 s66VarM10544n = s66Var.m10544n();
            try {
                na6 na6VarM4415a = da6.f16886b.m4415a(s66VarM10544n.getClass());
                C1411zn c1411zn = new C1411zn();
                w56Var2.getClass();
                na6VarM4415a.mo8662i(s66VarM10544n, bArr, 0, length, c1411zn);
                na6VarM4415a.mo8656c(s66VarM10544n);
                s66Var = s66VarM10544n;
            } catch (g86 e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof g86) {
                    throw ((g86) e2.getCause());
                }
                throw new g86(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (jb6 e3) {
                qm5.m9917h(e3.getMessage());
                return null;
            }
        }
        if (s66Var == null || s66.m10532i(s66Var, true)) {
            return (yc6) s66Var;
        }
        qm5.m9917h(new jb6().getMessage());
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static void m13094w(yc6 yc6Var, xd6 xd6Var) {
        yc6Var.zzi = xd6Var.f34182a;
        yc6Var.zzd |= 4;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m13095x(yc6 yc6Var, od6 od6Var) {
        yc6Var.zzh = od6Var;
        yc6Var.zzd |= 2;
    }

    @Override // p000.s66
    /* JADX INFO: renamed from: j */
    public final Object mo3836j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return s66.m10535p(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", e36.f17668c, "zzh", ye6.class, "zzi", e36.f17670e, vg6.class, if6.class});
        }
        if (i2 == 3) {
            return new yc6();
        }
        if (i2 == 4) {
            return new uc6(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final if6 m13096v() {
        return this.zze == 7 ? (if6) this.zzf : if6.m6792q();
    }
}
