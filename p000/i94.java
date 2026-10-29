package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i94 implements Iterable, cc2 {

    /* JADX INFO: renamed from: e */
    public static final i94 f21191e = new i94(0, 0, 0, null);

    /* JADX INFO: renamed from: a */
    public final long f21192a;

    /* JADX INFO: renamed from: b */
    public final long f21193b;

    /* JADX INFO: renamed from: c */
    public final long f21194c;

    /* JADX INFO: renamed from: d */
    public final long[] f21195d;

    public i94(long j, long j2, long j3, long[] jArr) {
        this.f21192a = j;
        this.f21193b = j2;
        this.f21194c = j3;
        this.f21195d = jArr;
    }

    /* JADX INFO: renamed from: a */
    public final i94 m6700a(i94 i94Var) {
        long[] jArr;
        i94 i94VarM6701b = this;
        i94 i94Var2 = f21191e;
        if (i94Var == i94Var2) {
            return i94VarM6701b;
        }
        if (i94VarM6701b == i94Var2) {
            return i94Var2;
        }
        long j = i94Var.f21194c;
        long j2 = i94Var.f21194c;
        long[] jArr2 = i94Var.f21195d;
        long j3 = i94Var.f21193b;
        long j4 = i94Var.f21192a;
        long j5 = i94VarM6701b.f21194c;
        if (j == j5 && jArr2 == (jArr = i94VarM6701b.f21195d)) {
            return new i94(i94VarM6701b.f21192a & (~j4), i94VarM6701b.f21193b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                i94VarM6701b = i94VarM6701b.m6701b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    i94VarM6701b = i94VarM6701b.m6701b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    i94VarM6701b = i94VarM6701b.m6701b(((long) i2) + j2 + 64);
                }
            }
        }
        return i94VarM6701b;
    }

    /* JADX INFO: renamed from: b */
    public final i94 m6701b(long j) {
        long[] jArr;
        int iM12987p;
        long[] jArr2;
        long j2 = j - this.f21194c;
        if (z62.m13394v(j2, 0L) >= 0 && z62.m13394v(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f21193b;
            if ((j4 & j3) != 0) {
                return new i94(this.f21192a, j4 & (~j3), this.f21194c, this.f21195d);
            }
        } else if (z62.m13394v(j2, 64L) >= 0 && z62.m13394v(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f21192a;
            if ((j6 & j5) != 0) {
                return new i94(j6 & (~j5), this.f21193b, this.f21194c, this.f21195d);
            }
        } else if (z62.m13394v(j2, 0L) < 0 && (jArr = this.f21195d) != null && (iM12987p = y62.m12987p(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM12987p > 0) {
                    AbstractC0990oo.m9200U(jArr, jArr3, 0, 0, iM12987p);
                }
                if (iM12987p < i) {
                    AbstractC0990oo.m9200U(jArr, jArr3, iM12987p, iM12987p + 1, length);
                }
                jArr2 = jArr3;
            }
            return new i94(this.f21192a, this.f21193b, this.f21194c, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6702c(long j) {
        long[] jArr;
        long j2 = j - this.f21194c;
        if (z62.m13394v(j2, 0L) >= 0 && z62.m13394v(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.f21193b) != 0;
        }
        if (z62.m13394v(j2, 64L) < 0 || z62.m13394v(j2, 128L) >= 0) {
            return z62.m13394v(j2, 0L) <= 0 && (jArr = this.f21195d) != null && y62.m12987p(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.f21192a) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final i94 m6703d(i94 i94Var) {
        i94 i94VarM6704e;
        long[] jArr;
        i94 i94VarM6704e2 = this;
        i94 i94Var2 = f21191e;
        if (i94Var == i94Var2) {
            return i94VarM6704e2;
        }
        if (i94VarM6704e2 == i94Var2) {
            return i94Var;
        }
        long j = i94Var.f21194c;
        long j2 = i94Var.f21194c;
        long[] jArr2 = i94Var.f21195d;
        long j3 = i94Var.f21193b;
        long j4 = i94Var.f21192a;
        long j5 = i94VarM6704e2.f21194c;
        long j6 = i94VarM6704e2.f21193b;
        long j7 = i94VarM6704e2.f21192a;
        if (j == j5 && jArr2 == (jArr = i94VarM6704e2.f21195d)) {
            return new i94(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = i94VarM6704e2.f21195d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    i94VarM6704e2 = i94VarM6704e2.m6704e(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        i94VarM6704e2 = i94VarM6704e2.m6704e(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        i94VarM6704e2 = i94VarM6704e2.m6704e(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return i94VarM6704e2;
        }
        if (jArr3 != null) {
            i94VarM6704e = i94Var;
            for (long j9 : jArr3) {
                i94VarM6704e = i94VarM6704e.m6704e(j9);
            }
        } else {
            i94VarM6704e = i94Var;
        }
        long j10 = i94VarM6704e2.f21194c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    i94VarM6704e = i94VarM6704e.m6704e(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    i94VarM6704e = i94VarM6704e.m6704e(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return i94VarM6704e;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0154  */
    /* JADX INFO: renamed from: e */
    public final i94 m6704e(long j) {
        long[] jArr;
        long j2;
        long j3;
        long[] jArr2;
        long[] jArr3;
        int i;
        rv2 rv2Var;
        long j4 = this.f21194c;
        long j5 = j - j4;
        long j6 = 0;
        int iM13394v = z62.m13394v(j5, 0L);
        long j7 = this.f21193b;
        if (iM13394v < 0 || z62.m13394v(j5, 64L) >= 0) {
            int iM13394v2 = z62.m13394v(j5, 64L);
            long j8 = this.f21192a;
            int i2 = 64;
            if (iM13394v2 < 0 || z62.m13394v(j5, 128L) >= 0) {
                int iM13394v3 = z62.m13394v(j5, 128L);
                long[] jArr4 = this.f21195d;
                if (iM13394v3 < 0) {
                    if (jArr4 == null) {
                        return new i94(this.f21192a, this.f21193b, this.f21194c, new long[]{j});
                    }
                    int iM12987p = y62.m12987p(jArr4, j);
                    if (iM12987p < 0) {
                        int i3 = -(iM12987p + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        AbstractC0990oo.m9200U(jArr4, jArr5, 0, 0, i3);
                        AbstractC0990oo.m9200U(jArr4, jArr5, i3 + 1, i3, length);
                        jArr5[i3] = j;
                        return new i94(this.f21192a, this.f21193b, this.f21194c, jArr5);
                    }
                } else if (!m6702c(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (z62.m13394v(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    wd3 wd3Var = null;
                    while (true) {
                        if (z62.m13394v(j4, j9) >= 0) {
                            jArr = null;
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (wd3Var == null) {
                                wd3Var = new wd3((byte) 10);
                                if (jArr4 != null) {
                                    long[] jArrCopyOf = Arrays.copyOf(jArr4, jArr4.length);
                                    jArr = null;
                                    rv2Var = new rv2(jArrCopyOf.length);
                                    int i4 = rv2Var.f29665b;
                                    if (i4 < 0) {
                                        kx5.m7733s0("");
                                        throw null;
                                    }
                                    j3 = j6;
                                    if (jArrCopyOf.length != 0) {
                                        int length2 = jArrCopyOf.length + i4;
                                        long[] jArrCopyOf2 = rv2Var.f29664a;
                                        if (jArrCopyOf2.length < length2) {
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length2, (jArrCopyOf2.length * 3) / 2));
                                            rv2Var.f29664a = jArrCopyOf2;
                                        }
                                        int i5 = rv2Var.f29665b;
                                        if (i4 != i5) {
                                            AbstractC0990oo.m9200U(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i4, i4, i5);
                                        }
                                        System.arraycopy(jArrCopyOf, 0, jArrCopyOf2, i4, jArrCopyOf.length);
                                        rv2Var.f29665b += jArrCopyOf.length;
                                    }
                                } else {
                                    j3 = j6;
                                    jArr = null;
                                    rv2Var = new rv2();
                                }
                                wd3Var.f33259b = rv2Var;
                                VarHandle.storeStoreFence();
                            } else {
                                j3 = j6;
                                jArr = null;
                            }
                            i = i2;
                            for (int i6 = 0; i6 < i; i6++) {
                                if (((1 << i6) & j7) != j3) {
                                    ((rv2) wd3Var.f33259b).m10470a(((long) i6) + j4);
                                }
                            }
                        } else {
                            j3 = j6;
                            i = i2;
                            jArr = null;
                        }
                        if (j10 == j3) {
                            j2 = j9;
                            break;
                        }
                        j4 += 64;
                        i2 = i;
                        j7 = j10;
                        j6 = j3;
                        j10 = j6;
                    }
                    if (wd3Var == null) {
                        jArr2 = jArr4;
                    } else {
                        rv2 rv2Var2 = (rv2) wd3Var.f33259b;
                        int i7 = rv2Var2.f29665b;
                        if (i7 == 0) {
                            jArr3 = jArr;
                        } else {
                            long[] jArr6 = new long[i7];
                            long[] jArr7 = rv2Var2.f29664a;
                            for (int i8 = 0; i8 < i7; i8++) {
                                jArr6[i8] = jArr7[i8];
                            }
                            jArr3 = jArr6;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr4;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new i94(j10, j3, j2, jArr2).m6704e(j);
                }
            } else {
                long j11 = 1 << (((int) j5) - 64);
                if ((j8 & j11) == 0) {
                    return new i94(j8 | j11, this.f21193b, this.f21194c, this.f21195d);
                }
            }
        } else {
            long j12 = 1 << ((int) j5);
            if ((j7 & j12) == 0) {
                return new i94(this.f21192a, j7 | j12, this.f21194c, this.f21195d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return d24.m4325z(new h94(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(ib0.m6717y0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
