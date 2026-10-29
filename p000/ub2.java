package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ub2 extends kb2 {

    /* JADX INFO: renamed from: t */
    public static final qb2 f31770t = new qb2();

    /* JADX INFO: renamed from: u */
    public static final Object f31771u = new Object();

    /* JADX INFO: renamed from: p */
    public Object[] f31772p;

    /* JADX INFO: renamed from: q */
    public int f31773q;

    /* JADX INFO: renamed from: r */
    public String[] f31774r;

    /* JADX INFO: renamed from: s */
    public int[] f31775s;

    @Override // p000.kb2
    /* JADX INFO: renamed from: C */
    public final boolean mo7471C() {
        m11523b0(8);
        boolean zMo3523b = ((gb2) m11528g0()).mo3523b();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zMo3523b;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: D */
    public final double mo7472D() throws op2 {
        int iMo7481R = mo7481R();
        if (iMo7481R != 7 && iMo7481R != 6) {
            wb1.m12193l("Expected ", d55.m4377v(7), " but was ", d55.m4377v(iMo7481R), m11525d0());
            return 0.0d;
        }
        double dMo3524c = ((gb2) m11527f0()).mo3524c();
        if (this.f23055o != 1 && (Double.isNaN(dMo3524c) || Double.isInfinite(dMo3524c))) {
            throw new op2("JSON forbids NaN and infinities: " + dMo3524c);
        }
        m11528g0();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dMo3524c;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: J */
    public final int mo7473J() {
        int iMo7481R = mo7481R();
        if (iMo7481R != 7 && iMo7481R != 6) {
            wb1.m12193l("Expected ", d55.m4377v(7), " but was ", d55.m4377v(iMo7481R), m11525d0());
            return 0;
        }
        int iMo3526e = ((gb2) m11527f0()).mo3526e();
        m11528g0();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iMo3526e;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: K */
    public final long mo7474K() {
        int iMo7481R = mo7481R();
        if (iMo7481R != 7 && iMo7481R != 6) {
            wb1.m12193l("Expected ", d55.m4377v(7), " but was ", d55.m4377v(iMo7481R), m11525d0());
            return 0L;
        }
        long jMo3530q = ((gb2) m11527f0()).mo3530q();
        m11528g0();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jMo3530q;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: L */
    public final String mo7475L() {
        return m11526e0(false);
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: N */
    public final void mo7477N() {
        m11523b0(9);
        m11528g0();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: P */
    public final String mo7479P() {
        int iMo7481R = mo7481R();
        if (iMo7481R != 6 && iMo7481R != 7) {
            wb1.m12193l("Expected ", d55.m4377v(6), " but was ", d55.m4377v(iMo7481R), m11525d0());
            return null;
        }
        String strMo3532s = ((gb2) m11528g0()).mo3532s();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strMo3532s;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: R */
    public final int mo7481R() {
        if (this.f31773q == 0) {
            return 10;
        }
        Object objM11527f0 = m11527f0();
        if (objM11527f0 instanceof Iterator) {
            boolean z = this.f31772p[this.f31773q - 2] instanceof wa2;
            Iterator it = (Iterator) objM11527f0;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            m11529h0(it.next());
            return mo7481R();
        }
        if (objM11527f0 instanceof wa2) {
            return 3;
        }
        if (objM11527f0 instanceof o92) {
            return 1;
        }
        if (objM11527f0 instanceof gb2) {
            Serializable serializable = ((gb2) objM11527f0).f19705a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objM11527f0 instanceof sa2) {
            return 9;
        }
        if (objM11527f0 == f31771u) {
            C1077qn.m9989o("JsonReader is closed");
            return 0;
        }
        throw new op2("Custom JsonElement subclass " + objM11527f0.getClass().getName() + " is not supported");
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: Y */
    public final void mo7488Y() {
        int iM4376u = d55.m4376u(mo7481R());
        if (iM4376u == 1) {
            mo7495j();
            return;
        }
        if (iM4376u != 9) {
            if (iM4376u == 3) {
                mo7496k();
                return;
            }
            if (iM4376u == 4) {
                m11526e0(true);
                return;
            }
            m11528g0();
            int i = this.f31773q;
            if (i > 0) {
                int[] iArr = this.f31775s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: a */
    public final void mo7490a() {
        m11523b0(1);
        m11529h0(((o92) m11527f0()).f26491a.iterator());
        this.f31775s[this.f31773q - 1] = 0;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: b */
    public final void mo7492b() {
        m11523b0(3);
        m11529h0(((nl2) ((wa2) m11527f0()).f33192a.entrySet()).iterator());
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11523b0(int i) {
        if (mo7481R() == i) {
            return;
        }
        wb1.m12193l("Expected ", d55.m4377v(i), " but was ", d55.m4377v(mo7481R()), m11525d0());
    }

    /* JADX INFO: renamed from: c0 */
    public final String m11524c0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f31773q;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.f31772p;
            Object obj = objArr[i];
            if (obj instanceof o92) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.f31775s[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof wa2) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.f31774r[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // p000.kb2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31772p = new Object[]{f31771u};
        this.f31773q = 1;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m11525d0() {
        return " at path ".concat(m11524c0(false));
    }

    /* JADX INFO: renamed from: e0 */
    public final String m11526e0(boolean z) {
        m11523b0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m11527f0()).next();
        String str = (String) entry.getKey();
        this.f31774r[this.f31773q - 1] = z ? "<skipped>" : str;
        m11529h0(entry.getValue());
        return str;
    }

    /* JADX INFO: renamed from: f0 */
    public final Object m11527f0() {
        return this.f31772p[this.f31773q - 1];
    }

    /* JADX INFO: renamed from: g0 */
    public final Object m11528g0() {
        Object[] objArr = this.f31772p;
        int i = this.f31773q - 1;
        this.f31773q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11529h0(Object obj) {
        int i = this.f31773q;
        Object[] objArr = this.f31772p;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f31772p = Arrays.copyOf(objArr, i2);
            this.f31775s = Arrays.copyOf(this.f31775s, i2);
            this.f31774r = (String[]) Arrays.copyOf(this.f31774r, i2);
        }
        Object[] objArr2 = this.f31772p;
        int i3 = this.f31773q;
        this.f31773q = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: j */
    public final void mo7495j() {
        m11523b0(2);
        m11528g0();
        m11528g0();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: k */
    public final void mo7496k() {
        m11523b0(4);
        this.f31774r[this.f31773q - 1] = null;
        m11528g0();
        m11528g0();
        int i = this.f31773q;
        if (i > 0) {
            int[] iArr = this.f31775s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: q */
    public final String mo7498q() {
        return m11524c0(false);
    }

    @Override // p000.kb2
    public final String toString() {
        return ub2.class.getSimpleName().concat(m11525d0());
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: u */
    public final String mo7500u() {
        return m11524c0(true);
    }

    @Override // p000.kb2
    /* JADX INFO: renamed from: v */
    public final boolean mo7501v() {
        int iMo7481R = mo7481R();
        return (iMo7481R == 4 || iMo7481R == 2 || iMo7481R == 10) ? false : true;
    }
}
