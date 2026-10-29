package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f28412c = 0;

    /* JADX INFO: renamed from: a */
    public t84 f28413a;

    /* JADX INFO: renamed from: b */
    public boolean f28414b;

    static {
        t84 t84Var = new t84();
        qe1 qe1Var = new qe1();
        qe1Var.f28413a = t84Var;
        qe1Var.m9867a();
        qe1Var.m9867a();
        VarHandle.storeStoreFence();
    }

    /* JADX INFO: renamed from: b */
    public static void m9866b(C1145sh c1145sh, u15 u15Var, int i, Object obj) throws IOException {
        if (u15Var == u15.f31601d) {
            c1145sh.m10759E(i, 3);
            ((vr1) ((AbstractC1277w1) obj)).m11984l(c1145sh);
            c1145sh.m10759E(i, 4);
        }
        c1145sh.m10759E(i, u15Var.f31605b);
        switch (u15Var.ordinal()) {
            case 0:
                c1145sh.m10784y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c1145sh.m10782w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c1145sh.m10763I(((Long) obj).longValue());
                break;
            case 3:
                c1145sh.m10763I(((Long) obj).longValue());
                break;
            case 4:
                c1145sh.m10755A(((Integer) obj).intValue());
                break;
            case 5:
                c1145sh.m10784y(((Long) obj).longValue());
                break;
            case 6:
                c1145sh.m10782w(((Integer) obj).intValue());
                break;
            case 7:
                c1145sh.m10776q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof n50)) {
                    c1145sh.m10758D((String) obj);
                } else {
                    c1145sh.m10780u((n50) obj);
                }
                break;
            case 9:
                ((vr1) ((AbstractC1277w1) obj)).m11984l(c1145sh);
                break;
            case 10:
                AbstractC1277w1 abstractC1277w1 = (AbstractC1277w1) obj;
                c1145sh.m10761G(((vr1) abstractC1277w1).mo11979a(null));
                ((vr1) abstractC1277w1).m11984l(c1145sh);
                break;
            case 11:
                if (!(obj instanceof n50)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1145sh.m10761G(length);
                    c1145sh.m10777r(bArr, 0, length);
                } else {
                    c1145sh.m10780u((n50) obj);
                }
                break;
            case 12:
                c1145sh.m10761G(((Integer) obj).intValue());
                break;
            case 13:
                c1145sh.m10755A(((Integer) obj).intValue());
                break;
            case 14:
                c1145sh.m10782w(((Integer) obj).intValue());
                break;
            case 15:
                c1145sh.m10784y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1145sh.m10761G((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c1145sh.m10763I((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9867a() {
        t84 t84Var = this.f28413a;
        if (this.f28414b) {
            return;
        }
        t84Var.getClass();
        int i = t84Var.f30999b;
        if (i > 0) {
            t84Var.m10991d();
            throw null;
        }
        if (!t84Var.f31000c) {
            Object[] objArr = t84Var.f30998a;
            if (objArr != null && i > 0) {
                throw zi4.m13616p(objArr[0]);
            }
            t84Var.f31000c = true;
        }
        this.f28414b = true;
    }

    public final Object clone() {
        qe1 qe1Var = new qe1();
        qe1Var.f28413a = new t84();
        t84 t84Var = this.f28413a;
        t84Var.getClass();
        if (t84Var.f30999b <= 0) {
            return qe1Var;
        }
        t84Var.m10991d();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe1)) {
            return false;
        }
        t84 t84Var = this.f28413a;
        t84 t84Var2 = ((qe1) obj).f28413a;
        t84Var.getClass();
        int i = t84Var.f30999b;
        t84Var2.getClass();
        if (i != t84Var2.f30999b || !t84Var.keySet().equals(t84Var2.keySet())) {
            return false;
        }
        s84 s84Var = (s84) ((C0619eo) t84Var.entrySet()).iterator();
        if (!s84Var.hasNext()) {
            return true;
        }
        s84Var.next();
        throw null;
    }

    public final int hashCode() {
        return this.f28413a.hashCode();
    }
}
