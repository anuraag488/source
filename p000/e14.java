package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e14 implements q14, Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public final lw2 f17631a;

    /* JADX INFO: renamed from: b */
    public dq2 f17632b;

    /* JADX INFO: renamed from: c */
    public boolean f17633c;

    /* JADX INFO: renamed from: d */
    public boolean f17634d;

    public e14() {
        long[] jArr = tv3.f31472a;
        this.f17631a = new lw2();
    }

    @Override // p000.q14
    /* JADX INFO: renamed from: a */
    public final void mo4898a(p14 p14Var, Object obj) {
        boolean z = obj instanceof C1353y2;
        lw2 lw2Var = this.f17631a;
        if (z && lw2Var.m8128c(p14Var)) {
            C1353y2 c1353y2 = (C1353y2) lw2Var.m8132g(p14Var);
            C1353y2 c1353y3 = (C1353y2) obj;
            String str = c1353y3.f34817a;
            if (str == null) {
                str = c1353y2.f34817a;
            }
            iq1 iq1Var = c1353y3.f34818b;
            if (iq1Var == null) {
                iq1Var = c1353y2.f34818b;
            }
            lw2Var.m8138m(p14Var, new C1353y2(str, iq1Var));
        } else {
            lw2Var.m8138m(p14Var, obj);
        }
        p14Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final e14 m4899b() {
        e14 e14Var = new e14();
        e14Var.f17633c = this.f17633c;
        e14Var.f17634d = this.f17634d;
        lw2 lw2Var = this.f17631a;
        Object[] objArr = lw2Var.f24419b;
        Object[] objArr2 = lw2Var.f24420c;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            e14Var.f17631a.m8138m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return e14Var;
    }

    /* JADX INFO: renamed from: c */
    public final Object m4900c(p14 p14Var) {
        Object objM8132g = this.f17631a.m8132g(p14Var);
        if (objM8132g != null) {
            return objM8132g;
        }
        wb1.m12192k("Key not present: ", p14Var, " - consider getOrElse or getOrNull");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m4901d(e14 e14Var) {
        lw2 lw2Var = e14Var.f17631a;
        Object[] objArr = lw2Var.f24419b;
        Object[] objArr2 = lw2Var.f24420c;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        p14 p14Var = (p14) obj;
                        lw2 lw2Var2 = this.f17631a;
                        Object objInvoke = p14Var.f27293b.invoke(lw2Var2.m8132g(p14Var), obj2);
                        if (objInvoke != null) {
                            lw2Var2.m8138m(p14Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e14)) {
            return false;
        }
        e14 e14Var = (e14) obj;
        return this.f17631a.equals(e14Var.f17631a) && this.f17633c == e14Var.f17633c && this.f17634d == e14Var.f17634d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17634d) + zi4.m13611k(this.f17631a.hashCode() * 31, 31, this.f17633c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        dq2 dq2Var = this.f17632b;
        if (dq2Var == null) {
            lw2 lw2Var = this.f17631a;
            dq2 dq2Var2 = lw2Var.f24423f;
            if (dq2Var2 == null) {
                dq2Var2 = new dq2();
                dq2Var2.f17278a = lw2Var;
                VarHandle.storeStoreFence();
                lw2Var.f24423f = dq2Var2;
            }
            dq2Var = dq2Var2;
            this.f17632b = dq2Var;
        }
        return ((r91) dq2Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f17633c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f17634d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        lw2 lw2Var = this.f17631a;
        Object[] objArr = lw2Var.f24419b;
        Object[] objArr2 = lw2Var.f24420c;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((p14) obj).f27292a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return vd6.m11835S(this) + "{ " + ((Object) sb) + " }";
    }
}
