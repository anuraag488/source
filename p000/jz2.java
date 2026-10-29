package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jz2 {

    /* JADX INFO: renamed from: a */
    public ac4 f22753a;

    /* JADX INFO: renamed from: b */
    public ac4 f22754b;

    /* JADX INFO: renamed from: c */
    public xj3 f22755c;

    /* JADX INFO: renamed from: d */
    public C0461ao f22756d;

    /* JADX INFO: renamed from: e */
    public C0461ao f22757e;

    /* JADX INFO: renamed from: f */
    public dz2 f22758f;

    /* JADX INFO: renamed from: g */
    public int f22759g;

    /* JADX INFO: renamed from: h */
    public iz2 f22760h;

    /* JADX INFO: renamed from: i */
    public dw2 f22761i;

    /* JADX INFO: renamed from: j */
    public dw2 f22762j;

    /* JADX INFO: renamed from: k */
    public dw2 f22763k;

    /* JADX INFO: renamed from: l */
    public boolean f22764l;

    /* JADX INFO: renamed from: m */
    public boolean f22765m;

    /* JADX INFO: renamed from: n */
    public boolean f22766n;

    /* JADX INFO: renamed from: a */
    public final void m7347a(C1283w7 c1283w7, iz2 iz2Var, int i) {
        dw2 dw2Var;
        boolean z;
        if (iz2Var.f21899a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(iz2Var);
            C1283w7 c1283w8 = iz2Var.f21899a;
            sb.append("' is already added to dispatcher ");
            sb.append(c1283w8);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            dw2Var = i != 1 ? this.f22761i : this.f22762j;
        } else {
            dw2Var = this.f22763k;
        }
        dw2Var.m4779g(iz2Var);
        iz2Var.f21899a = c1283w7;
        if (i != 0) {
            z = i != 1 ? this.f22766n : this.f22764l;
        } else {
            z = this.f22765m;
        }
        iz2Var.mo6972b(z);
    }

    /* JADX INFO: renamed from: b */
    public final void m7348b() {
        boolean z;
        boolean z2;
        C0461ao c0461ao = this.f22756d;
        if (c0461ao == null || !c0461ao.isEmpty()) {
            Iterator it = c0461ao.iterator();
            while (true) {
                if (it.hasNext()) {
                    dz2 dz2Var = (dz2) it.next();
                    if (dz2Var.f17531e || dz2Var.f17532f) {
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        C0461ao c0461ao2 = this.f22757e;
        if (c0461ao2 == null || !c0461ao2.isEmpty()) {
            Iterator it2 = c0461ao2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    dz2 dz2Var2 = (dz2) it2.next();
                    if (dz2Var2.f17531e || dz2Var2.f17532f) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.f22765m != z;
        boolean z5 = this.f22764l != z2;
        boolean z6 = this.f22766n != z3;
        if (z4) {
            dw2 dw2Var = this.f22763k;
            Object[] objArr = dw2Var.f17456b;
            long[] jArr = dw2Var.f17457c;
            int i = dw2Var.f17459e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
                ((iz2) objArr[i]).mo6972b(z);
                i = i2;
            }
        }
        if (z5) {
            dw2 dw2Var2 = this.f22762j;
            Object[] objArr2 = dw2Var2.f17456b;
            long[] jArr2 = dw2Var2.f17457c;
            int i3 = dw2Var2.f17459e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((iz2) objArr2[i3]).mo6972b(z2);
                i3 = i4;
            }
        }
        if (z6) {
            dw2 dw2Var3 = this.f22761i;
            Object[] objArr3 = dw2Var3.f17456b;
            long[] jArr3 = dw2Var3.f17457c;
            int i5 = dw2Var3.f17459e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((iz2) objArr3[i5]).mo6972b(z3);
                i5 = i6;
            }
        }
        this.f22765m = z;
        this.f22764l = z2;
        this.f22766n = z3;
        dz2 dz2VarM7349c = this.f22758f;
        if (dz2VarM7349c == null) {
            dz2VarM7349c = m7349c(0);
        }
        m7350d(dz2VarM7349c);
    }

    /* JADX INFO: renamed from: c */
    public final dz2 m7349c(int i) {
        Object next;
        Object next2;
        dz2 dz2Var;
        Object next3;
        C0461ao c0461ao = this.f22757e;
        C0461ao c0461ao2 = this.f22756d;
        Object obj = null;
        if (i == -1) {
            Iterator it = c0461ao2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((dz2) next).f17531e);
            dz2 dz2Var2 = (dz2) next;
            if (dz2Var2 != null) {
                return dz2Var2;
            }
            for (Object obj2 : c0461ao) {
                if (((dz2) obj2).f17531e) {
                    obj = obj2;
                    break;
                }
            }
            return (dz2) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = c0461ao2.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!((dz2) next3).f17532f);
            dz2 dz2Var3 = (dz2) next3;
            if (dz2Var3 != null) {
                return dz2Var3;
            }
            for (Object obj3 : c0461ao) {
                if (((dz2) obj3).f17532f) {
                    obj = obj3;
                    break;
                }
            }
            return (dz2) obj;
        }
        Iterator it3 = c0461ao2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            dz2Var = (dz2) next2;
            if (dz2Var.f17531e) {
                break;
            }
        } while (!dz2Var.f17532f);
        dz2 dz2Var4 = (dz2) next2;
        if (dz2Var4 != null) {
            return dz2Var4;
        }
        for (Object obj4 : c0461ao) {
            dz2 dz2Var5 = (dz2) obj4;
            if (dz2Var5.f17531e || dz2Var5.f17532f) {
                obj = obj4;
                break;
            }
        }
        return (dz2) obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m7350d(dz2 dz2Var) {
        gz2 gz2Var;
        ac4 ac4Var = this.f22754b;
        dz2 dz2VarM7349c = this.f22758f;
        if (dz2VarM7349c == null) {
            dz2VarM7349c = m7349c(0);
        }
        if (z62.m13387o(dz2VarM7349c, dz2Var)) {
            if (dz2VarM7349c == null) {
                gz2Var = new gz2();
            } else {
                ArrayList arrayList = new ArrayList();
                for (dz2 dz2Var2 : this.f22756d) {
                    if (dz2Var2.f17531e && !dz2Var2.f17528b.isEmpty()) {
                        arrayList.addAll(dz2Var2.f17528b);
                    }
                }
                for (dz2 dz2Var3 : this.f22757e) {
                    if (dz2Var3.f17531e && !dz2Var3.f17528b.isEmpty()) {
                        arrayList.addAll(dz2Var3.f17528b);
                    }
                }
                gz2Var = new gz2(dz2VarM7349c.f17527a, arrayList, dz2VarM7349c.f17529c, arrayList.size());
            }
            if (z62.m13387o((gz2) ac4Var.getValue(), gz2Var)) {
                return;
            }
            ac4Var.m200k(null, gz2Var);
            dw2 dw2Var = this.f22763k;
            Object[] objArr = dw2Var.f17456b;
            long[] jArr = dw2Var.f17457c;
            int i = dw2Var.f17459e;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) (2147483647L & (jArr[i] >> 31));
                ((iz2) objArr[i]).getClass();
                i = i2;
            }
            dw2 dw2Var2 = this.f22762j;
            Object[] objArr2 = dw2Var2.f17456b;
            long[] jArr2 = dw2Var2.f17457c;
            int i3 = dw2Var2.f17459e;
            while (i3 != Integer.MAX_VALUE) {
                int i4 = (int) ((jArr2[i3] >> 31) & 2147483647L);
                ((iz2) objArr2[i3]).getClass();
                i3 = i4;
            }
            dw2 dw2Var3 = this.f22761i;
            Object[] objArr3 = dw2Var3.f17456b;
            long[] jArr3 = dw2Var3.f17457c;
            int i5 = dw2Var3.f17459e;
            while (i5 != Integer.MAX_VALUE) {
                int i6 = (int) ((jArr3[i5] >> 31) & 2147483647L);
                ((iz2) objArr3[i5]).getClass();
                i5 = i6;
            }
        }
    }
}
