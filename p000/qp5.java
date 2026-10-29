package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qp5 {

    /* JADX INFO: renamed from: a */
    public nw5 f28676a;

    /* JADX INFO: renamed from: b */
    public boolean f28677b;

    static {
        nw5 nw5Var = new nw5();
        qp5 qp5Var = new qp5();
        qp5Var.f28676a = nw5Var;
        qp5Var.m10005b();
        qp5Var.m10005b();
        VarHandle.storeStoreFence();
    }

    /* JADX INFO: renamed from: a */
    public static int m10003a(dz5 dz5Var, int i, Object obj) {
        int iNumberOfLeadingZeros;
        int iM7341b;
        int iM3875g;
        int iM3875g2;
        int iM3875g3 = c75.m3875g(i << 3, 9, 352) >>> 6;
        if (dz5Var == dz5.f17538d) {
            iM3875g3 += iM3875g3;
        }
        gz5 gz5Var = gz5.f20221a;
        Object obj2 = null;
        int iMo6948b = 4;
        switch (dz5Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iMo6948b = 8;
                return iMo6948b + iM3875g3;
            case 1:
                ((Float) obj).getClass();
                return iMo6948b + iM3875g3;
            case 2:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                iM3875g2 = 640 - (iNumberOfLeadingZeros * 9);
                iMo6948b = iM3875g2 >>> 6;
                return iMo6948b + iM3875g3;
            case 3:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                iM3875g2 = 640 - (iNumberOfLeadingZeros * 9);
                iMo6948b = iM3875g2 >>> 6;
                return iMo6948b + iM3875g3;
            case 4:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Integer) obj).intValue());
                iM3875g2 = 640 - (iNumberOfLeadingZeros * 9);
                iMo6948b = iM3875g2 >>> 6;
                return iMo6948b + iM3875g3;
            case 5:
                ((Long) obj).getClass();
                iMo6948b = 8;
                return iMo6948b + iM3875g3;
            case 6:
                ((Integer) obj).getClass();
                return iMo6948b + iM3875g3;
            case 7:
                ((Boolean) obj).getClass();
                iMo6948b = 1;
                return iMo6948b + iM3875g3;
            case 8:
                if (obj instanceof aj6) {
                    iM7341b = ((aj6) obj).mo3015d();
                    iM3875g = c75.m3875g(iM7341b, 9, 352);
                } else {
                    iM7341b = jy5.m7341b((String) obj);
                    iM3875g = c75.m3875g(iM7341b, 9, 352);
                }
                iMo6948b = (iM3875g >>> 6) + iM7341b;
                return iMo6948b + iM3875g3;
            case 9:
                iMo6948b = ((ur1) ((iv5) obj)).mo6948b(null);
                return iMo6948b + iM3875g3;
            case 10:
                if (obj instanceof hs5) {
                    obj2.getClass();
                    throw null;
                }
                iM7341b = ((ur1) ((iv5) obj)).mo6948b(null);
                iM3875g = c75.m3875g(iM7341b, 9, 352);
                iMo6948b = (iM3875g >>> 6) + iM7341b;
                return iMo6948b + iM3875g3;
            case 11:
                if (obj instanceof aj6) {
                    iM7341b = ((aj6) obj).mo3015d();
                    iM3875g = c75.m3875g(iM7341b, 9, 352);
                } else {
                    iM7341b = ((byte[]) obj).length;
                    iM3875g = c75.m3875g(iM7341b, 9, 352);
                }
                iMo6948b = (iM3875g >>> 6) + iM7341b;
                return iMo6948b + iM3875g3;
            case 12:
                iMo6948b = (352 - (Integer.numberOfLeadingZeros(((Integer) obj).intValue()) * 9)) >>> 6;
                return iMo6948b + iM3875g3;
            case 13:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Integer) obj).intValue());
                iM3875g2 = 640 - (iNumberOfLeadingZeros * 9);
                iMo6948b = iM3875g2 >>> 6;
                return iMo6948b + iM3875g3;
            case 14:
                ((Integer) obj).getClass();
                return iMo6948b + iM3875g3;
            case 15:
                ((Long) obj).getClass();
                iMo6948b = 8;
                return iMo6948b + iM3875g3;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM3875g2 = c75.m3875g((iIntValue >> 31) ^ (iIntValue + iIntValue), 9, 352);
                iMo6948b = iM3875g2 >>> 6;
                return iMo6948b + iM3875g3;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros((jLongValue >> 63) ^ (jLongValue + jLongValue));
                iM3875g2 = 640 - (iNumberOfLeadingZeros * 9);
                iMo6948b = iM3875g2 >>> 6;
                return iMo6948b + iM3875g3;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10004c(n83 n83Var, dz5 dz5Var, int i, Object obj) {
        if (dz5Var == dz5.f17538d) {
            n83Var.m8619w(i, 3);
            ((iv5) obj).mo6947a(n83Var);
            n83Var.m8619w(i, 4);
            return;
        }
        n83Var.m8619w(i, dz5Var.f17542b);
        gz5 gz5Var = gz5.f20221a;
        switch (dz5Var.ordinal()) {
            case 0:
                n83Var.m8615s(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                n83Var.m8613q(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                n83Var.m8595A(((Long) obj).longValue());
                break;
            case 3:
                n83Var.m8595A(((Long) obj).longValue());
                break;
            case 4:
                n83Var.m8617u(((Integer) obj).intValue());
                break;
            case 5:
                n83Var.m8615s(((Long) obj).longValue());
                break;
            case 6:
                n83Var.m8613q(((Integer) obj).intValue());
                break;
            case 7:
                n83Var.m8608l(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof aj6)) {
                    n83Var.m8618v((String) obj);
                } else {
                    aj6 aj6Var = (aj6) obj;
                    n83Var.m8621y(aj6Var.mo3015d());
                    aj6Var.mo3018l(n83Var);
                }
                break;
            case 9:
                ((iv5) obj).mo6947a(n83Var);
                break;
            case 10:
                iv5 iv5Var = (iv5) obj;
                n83Var.m8621y(((ur1) iv5Var).mo6948b(null));
                iv5Var.mo6947a(n83Var);
                break;
            case 11:
                if (!(obj instanceof aj6)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    n83Var.m8621y(length);
                    n83Var.m8609m(bArr, 0, length);
                } else {
                    aj6 aj6Var2 = (aj6) obj;
                    n83Var.m8621y(aj6Var2.mo3015d());
                    aj6Var2.mo3018l(n83Var);
                }
                break;
            case 12:
                n83Var.m8621y(((Integer) obj).intValue());
                break;
            case 13:
                n83Var.m8617u(((Integer) obj).intValue());
                break;
            case 14:
                n83Var.m8613q(((Integer) obj).intValue());
                break;
            case 15:
                n83Var.m8615s(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                n83Var.m8621y((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                n83Var.m8595A((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10005b() {
        if (this.f28677b) {
            return;
        }
        nw5 nw5Var = this.f28676a;
        nw5Var.getClass();
        int i = nw5Var.f26156b;
        if (i > 0) {
            nw5Var.m8877a();
            throw null;
        }
        if (!nw5Var.f26157c) {
            Object[] objArr = nw5Var.f26155a;
            if (objArr != null && i > 0) {
                throw zi4.m13616p(objArr[0]);
            }
            nw5Var.f26157c = true;
        }
        this.f28677b = true;
    }

    public final Object clone() {
        qp5 qp5Var = new qp5();
        qp5Var.f28676a = new nw5();
        nw5 nw5Var = this.f28676a;
        nw5Var.getClass();
        if (nw5Var.f26156b <= 0) {
            return qp5Var;
        }
        nw5Var.m8877a();
        throw null;
    }

    public final boolean equals(Object obj) {
        Object value;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp5)) {
            return false;
        }
        nw5 nw5Var = this.f28676a;
        nw5 nw5Var2 = ((qp5) obj).f28676a;
        nw5Var.getClass();
        int i = nw5Var.f26156b;
        nw5Var2.getClass();
        if (i != nw5Var2.f26156b || !nw5Var.keySet().equals(nw5Var2.keySet())) {
            return false;
        }
        Iterator it = ((C0619eo) nw5Var.entrySet()).iterator();
        do {
            s84 s84Var = (s84) it;
            if (!s84Var.hasNext()) {
                return true;
            }
            Map.Entry entry = (Map.Entry) s84Var.next();
            Object key = entry.getKey();
            value = entry.getValue();
            nw5Var2.get(key);
        } while (value == null);
        return false;
    }

    public final int hashCode() {
        return this.f28676a.hashCode();
    }
}
