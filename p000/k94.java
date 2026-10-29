package p000;

import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k94 {

    /* JADX INFO: renamed from: a */
    public static final r54 f23010a = new r54(3);

    /* JADX INFO: renamed from: b */
    public static final tt2 f23011b = new tt2((byte) 13);

    /* JADX INFO: renamed from: c */
    public static final Object f23012c = new Object();

    /* JADX INFO: renamed from: d */
    public static i94 f23013d;

    /* JADX INFO: renamed from: e */
    public static long f23014e;

    /* JADX INFO: renamed from: f */
    public static final C1145sh f23015f;

    /* JADX INFO: renamed from: g */
    public static final C0795je f23016g;

    /* JADX INFO: renamed from: h */
    public static List f23017h;

    /* JADX INFO: renamed from: i */
    public static List f23018i;

    /* JADX INFO: renamed from: j */
    public static final rs1 f23019j;

    /* JADX INFO: renamed from: k */
    public static final C1339xp f23020k;

    static {
        i94 i94Var = i94.f21191e;
        f23013d = i94Var;
        f23014e = 2L;
        C1145sh c1145sh = new C1145sh();
        c1145sh.f30264c = new long[16];
        c1145sh.f30265d = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        c1145sh.f30266e = iArr;
        f23015f = c1145sh;
        C0795je c0795je = new C0795je((byte) 6);
        c0795je.f22194c = new int[16];
        c0795je.f22195d = new fz4[16];
        f23016g = c0795je;
        v71 v71Var = v71.f32439a;
        f23017h = v71Var;
        f23018i = v71Var;
        long j = f23014e;
        f23014e = 1 + j;
        rs1 rs1Var = new rs1(j, i94Var, null, new el1((byte) 2));
        f23013d = f23013d.m6704e(rs1Var.f17913b);
        f23019j = rs1Var;
        f23020k = new C1339xp(0);
    }

    /* JADX INFO: renamed from: a */
    public static final i94 m7444a(i94 i94Var, long j, long j2) {
        while (z62.m13394v(j, j2) < 0) {
            i94Var = i94Var.m6704e(j);
            j++;
        }
        return i94Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[LOOP:1: B:30:0x0058->B:43:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0095 A[EDGE_INSN: B:58:0x0095->B:44:0x0095 BREAK  A[LOOP:1: B:30:0x0058->B:43:0x0092], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final Object m7445b(yp1 yp1Var) {
        mw2 mw2Var;
        Object objM7464u;
        rs1 rs1Var = f23019j;
        synchronized (f23012c) {
            try {
                mw2Var = rs1Var.f29681h;
                if (mw2Var != null) {
                    f23020k.addAndGet(1);
                }
                objM7464u = m7464u(rs1Var, yp1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mw2Var != null) {
            try {
                List list = f23017h;
                vv3 vv3VarM6574I = i20.m6574I(mw2Var);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((mq1) list.get(i)).invoke(vv3VarM6574I, rs1Var);
                }
                f23020k.addAndGet(-1);
            } catch (Throwable th2) {
                f23020k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f23012c) {
            m7447d();
            if (mw2Var != null) {
                Object[] objArr = mw2Var.f25258b;
                long[] jArr = mw2Var.f25257a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m7459p((hc4) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objM7464u;
    }

    /* JADX INFO: renamed from: c */
    public static final void m7446c() {
        m7445b(f23010a);
    }

    /* JADX INFO: renamed from: d */
    public static final void m7447d() {
        C0795je c0795je = f23016g;
        int i = c0795je.f22193b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            fz4 fz4Var = ((fz4[]) c0795je.f22195d)[i2];
            Object obj = fz4Var != null ? fz4Var.get() : null;
            if (obj != null && m7458o((hc4) obj)) {
                if (i3 != i2) {
                    ((fz4[]) c0795je.f22195d)[i3] = fz4Var;
                    int[] iArr = (int[]) c0795je.f22194c;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((fz4[]) c0795je.f22195d)[i4] = null;
            ((int[]) c0795je.f22194c)[i4] = 0;
        }
        if (i3 != i) {
            c0795je.f22193b = i3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final e94 m7448e(e94 e94Var, yp1 yp1Var, boolean z) {
        boolean z2 = e94Var instanceof rw2;
        if (z2 || e94Var == null) {
            return new gp4(z2 ? (rw2) e94Var : null, yp1Var, null, false, z);
        }
        return new hp4(e94Var, yp1Var, false, z);
    }

    /* JADX INFO: renamed from: f */
    public static final jc4 m7449f(jc4 jc4Var) {
        jc4 jc4VarM7461r;
        e94 e94VarM7451h = m7451h();
        jc4 jc4VarM7461r2 = m7461r(jc4Var, e94VarM7451h.mo5015g(), e94VarM7451h.mo5014d());
        if (jc4VarM7461r2 != null) {
            return jc4VarM7461r2;
        }
        synchronized (f23012c) {
            e94 e94VarM7451h2 = m7451h();
            jc4VarM7461r = m7461r(jc4Var, e94VarM7451h2.mo5015g(), e94VarM7451h2.mo5014d());
        }
        if (jc4VarM7461r != null) {
            return jc4VarM7461r;
        }
        m7460q();
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final jc4 m7450g(jc4 jc4Var, e94 e94Var) {
        jc4 jc4VarM7461r;
        jc4 jc4VarM7461r2 = m7461r(jc4Var, e94Var.mo5015g(), e94Var.mo5014d());
        if (jc4VarM7461r2 != null) {
            return jc4VarM7461r2;
        }
        synchronized (f23012c) {
            jc4VarM7461r = m7461r(jc4Var, e94Var.mo5015g(), e94Var.mo5014d());
        }
        if (jc4VarM7461r != null) {
            return jc4VarM7461r;
        }
        m7460q();
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static final e94 m7451h() {
        e94 e94Var = (e94) f23011b.get();
        return e94Var == null ? f23019j : e94Var;
    }

    /* JADX INFO: renamed from: i */
    public static final yp1 m7452i(yp1 yp1Var, yp1 yp1Var2, boolean z) {
        if (!z) {
            yp1Var2 = null;
        }
        if (yp1Var == null || yp1Var2 == null || yp1Var == yp1Var2) {
            return yp1Var == null ? yp1Var2 : yp1Var;
        }
        j94 j94Var = new j94((byte) 0);
        j94Var.f22113b = yp1Var;
        j94Var.f22114c = yp1Var2;
        VarHandle.storeStoreFence();
        return j94Var;
    }

    /* JADX INFO: renamed from: j */
    public static final yp1 m7453j(yp1 yp1Var, yp1 yp1Var2) {
        if (yp1Var == null || yp1Var2 == null || yp1Var == yp1Var2) {
            return yp1Var == null ? yp1Var2 : yp1Var;
        }
        j94 j94Var = new j94((byte) 1);
        j94Var.f22113b = yp1Var;
        j94Var.f22114c = yp1Var2;
        VarHandle.storeStoreFence();
        return j94Var;
    }

    /* JADX INFO: renamed from: k */
    public static final jc4 m7454k(jc4 jc4Var, hc4 hc4Var) {
        long j = f23014e;
        C1145sh c1145sh = f23015f;
        if (c1145sh.f30262a > 0) {
            j = ((long[]) c1145sh.f30264c)[0];
        }
        long j2 = j - 1;
        jc4 jc4Var2 = null;
        jc4 jc4Var3 = null;
        for (jc4 jc4VarMo128a = hc4Var.mo128a(); jc4VarMo128a != null; jc4VarMo128a = jc4VarMo128a.f22165b) {
            long j3 = jc4VarMo128a.f22164a;
            if (j3 != 0) {
                if (j3 != 0 && z62.m13394v(j3, j2) <= 0 && !i94.f21191e.m6702c(j3)) {
                    if (jc4Var3 != null) {
                        if (z62.m13394v(jc4VarMo128a.f22164a, jc4Var3.f22164a) >= 0) {
                            jc4Var2 = jc4Var3;
                            break;
                        }
                        break;
                    }
                    jc4Var3 = jc4VarMo128a;
                }
            }
            jc4Var2 = jc4VarMo128a;
            break;
        }
        if (jc4Var2 != null) {
            jc4Var2.f22164a = Long.MAX_VALUE;
            return jc4Var2;
        }
        jc4 jc4VarMo4440b = jc4Var.mo4440b(Long.MAX_VALUE);
        jc4VarMo4440b.f22165b = hc4Var.mo128a();
        hc4Var.mo130d(jc4VarMo4440b);
        return jc4VarMo4440b;
    }

    /* JADX INFO: renamed from: l */
    public static final void m7455l(e94 e94Var, hc4 hc4Var) {
        e94Var.mo5027t(e94Var.mo5016h() + 1);
        yp1 yp1VarMo5017i = e94Var.mo5017i();
        if (yp1VarMo5017i != null) {
            yp1VarMo5017i.invoke(hc4Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final HashMap m7456m(long j, rw2 rw2Var, i94 i94Var) {
        long[] jArr;
        i94 i94Var2;
        long[] jArr2;
        int i;
        int i2;
        jc4 jc4VarM7461r;
        mw2 mw2VarMo6059x = rw2Var.mo6059x();
        if (mw2VarMo6059x != null) {
            long jMo5015g = rw2Var.mo5015g();
            i94 i94VarM6703d = rw2Var.mo5014d().m6704e(jMo5015g).m6703d(rw2Var.f29683j);
            Object[] objArr = mw2VarMo6059x.f25258b;
            long[] jArr3 = mw2VarMo6059x.f25257a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                hc4 hc4Var = (hc4) objArr[(i3 << 3) + i6];
                                jc4 jc4VarMo128a = hc4Var.mo128a();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                jc4 jc4VarM7461r2 = m7461r(jc4VarMo128a, j, i94Var);
                                if (jc4VarM7461r2 != null && (jc4VarM7461r = m7461r(jc4VarMo128a, jMo5015g, i94VarM6703d)) != null && !jc4VarM7461r2.equals(jc4VarM7461r)) {
                                    jc4 jc4VarM7461r3 = m7461r(jc4VarMo128a, jMo5015g, rw2Var.mo5014d());
                                    if (jc4VarM7461r3 == null) {
                                        m7460q();
                                        throw null;
                                    }
                                    jc4 jc4VarMo129b = hc4Var.mo129b(jc4VarM7461r, jc4VarM7461r2, jc4VarM7461r3);
                                    if (jc4VarMo129b == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(jc4VarM7461r2, jc4VarMo129b);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            i94VarM6703d = i94VarM6703d;
                        }
                        jArr = jArr3;
                        i94Var2 = i94VarM6703d;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        i94Var2 = i94VarM6703d;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    i94VarM6703d = i94Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final jc4 m7457n(jc4 jc4Var, ic4 ic4Var, e94 e94Var, jc4 jc4Var2) {
        jc4 jc4VarM7454k;
        if (e94Var.mo3784f()) {
            e94Var.mo5022n(ic4Var);
        }
        long jMo5015g = e94Var.mo5015g();
        if (jc4Var2.f22164a == jMo5015g) {
            return jc4Var2;
        }
        synchronized (f23012c) {
            jc4VarM7454k = m7454k(jc4Var, ic4Var);
        }
        jc4VarM7454k.f22164a = jMo5015g;
        e94Var.mo5022n(ic4Var);
        return jc4VarM7454k;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m7458o(hc4 hc4Var) {
        jc4 jc4Var;
        long j = f23014e;
        C1145sh c1145sh = f23015f;
        if (c1145sh.f30262a > 0) {
            j = ((long[]) c1145sh.f30264c)[0];
        }
        jc4 jc4Var2 = null;
        jc4 jc4VarMo128a = null;
        int i = 0;
        for (jc4 jc4VarMo128a2 = hc4Var.mo128a(); jc4VarMo128a2 != null; jc4VarMo128a2 = jc4VarMo128a2.f22165b) {
            long j2 = jc4VarMo128a2.f22164a;
            if (j2 != 0) {
                if (z62.m13394v(j2, j) >= 0) {
                    i++;
                } else if (jc4Var2 == null) {
                    i++;
                    jc4Var2 = jc4VarMo128a2;
                } else {
                    if (z62.m13394v(jc4VarMo128a2.f22164a, jc4Var2.f22164a) < 0) {
                        jc4Var = jc4Var2;
                        jc4Var2 = jc4VarMo128a2;
                    } else {
                        jc4Var = jc4VarMo128a2;
                    }
                    if (jc4VarMo128a == null) {
                        jc4VarMo128a = hc4Var.mo128a();
                        jc4 jc4Var3 = jc4VarMo128a;
                        while (true) {
                            if (jc4VarMo128a == null) {
                                jc4VarMo128a = jc4Var3;
                                break;
                            }
                            if (z62.m13394v(jc4VarMo128a.f22164a, j) >= 0) {
                                break;
                            }
                            if (z62.m13394v(jc4Var3.f22164a, jc4VarMo128a.f22164a) < 0) {
                                jc4Var3 = jc4VarMo128a;
                            }
                            jc4VarMo128a = jc4VarMo128a.f22165b;
                        }
                    }
                    jc4Var2.f22164a = 0L;
                    jc4Var2.mo4439a(jc4VarMo128a);
                    jc4Var2 = jc4Var;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: p */
    public static final void m7459p(hc4 hc4Var) {
        if (m7458o(hc4Var)) {
            C0795je c0795je = f23016g;
            int i = c0795je.f22193b;
            int iIdentityHashCode = System.identityHashCode(hc4Var);
            int i2 = -1;
            if (i > 0) {
                int i3 = c0795je.f22193b - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) c0795je.f22194c)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        fz4 fz4Var = ((fz4[]) c0795je.f22195d)[i5];
                        if (hc4Var == (fz4Var != null ? fz4Var.get() : null)) {
                            i2 = i5;
                            break;
                        }
                        int i7 = i5 - 1;
                        while (true) {
                            if (-1 >= i7 || ((int[]) c0795je.f22194c)[i7] != iIdentityHashCode) {
                                i5++;
                                int i8 = c0795je.f22193b;
                                while (true) {
                                    if (i5 >= i8) {
                                        i2 = -(c0795je.f22193b + 1);
                                        break;
                                    }
                                    if (((int[]) c0795je.f22194c)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    fz4 fz4Var2 = ((fz4[]) c0795je.f22195d)[i5];
                                    if ((fz4Var2 != null ? fz4Var2.get() : null) == hc4Var) {
                                        i2 = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                fz4 fz4Var3 = ((fz4[]) c0795je.f22195d)[i7];
                                if ((fz4Var3 != null ? fz4Var3.get() : null) == hc4Var) {
                                    i2 = i7;
                                    break;
                                }
                                i7--;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            fz4[] fz4VarArr = (fz4[]) c0795je.f22195d;
            int length = fz4VarArr.length;
            if (i == length) {
                int i10 = length * 2;
                fz4[] fz4VarArr2 = new fz4[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(fz4VarArr, i9, fz4VarArr2, i11, i - i9);
                System.arraycopy((fz4[]) c0795je.f22195d, 0, fz4VarArr2, 0, i9);
                AbstractC0990oo.m9199T((int[]) c0795je.f22194c, iArr, i11, i9, i);
                AbstractC0990oo.m9204Y((int[]) c0795je.f22194c, iArr, 0, i9, 6);
                c0795je.f22195d = fz4VarArr2;
                c0795je.f22194c = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(fz4VarArr, i9, fz4VarArr, i12, i - i9);
                int[] iArr2 = (int[]) c0795je.f22194c;
                AbstractC0990oo.m9199T(iArr2, iArr2, i12, i9, i);
            }
            ((fz4[]) c0795je.f22195d)[i9] = new fz4(hc4Var);
            ((int[]) c0795je.f22194c)[i9] = iIdentityHashCode;
            c0795je.f22193b++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m7460q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: r */
    public static final jc4 m7461r(jc4 jc4Var, long j, i94 i94Var) {
        jc4 jc4Var2 = null;
        while (jc4Var != null) {
            long j2 = jc4Var.f22164a;
            if (j2 != 0 && z62.m13394v(j2, j) <= 0 && !i94Var.m6702c(j2) && (jc4Var2 == null || z62.m13394v(jc4Var2.f22164a, jc4Var.f22164a) < 0)) {
                jc4Var2 = jc4Var;
            }
            jc4Var = jc4Var.f22165b;
        }
        if (jc4Var2 != null) {
            return jc4Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final jc4 m7462s(jc4 jc4Var, hc4 hc4Var) {
        jc4 jc4VarM7461r;
        e94 e94VarM7451h = m7451h();
        yp1 yp1VarMo3783e = e94VarM7451h.mo3783e();
        if (yp1VarMo3783e != null) {
            yp1VarMo3783e.invoke(hc4Var);
        }
        jc4 jc4VarM7461r2 = m7461r(jc4Var, e94VarM7451h.mo5015g(), e94VarM7451h.mo5014d());
        if (jc4VarM7461r2 != null) {
            return jc4VarM7461r2;
        }
        synchronized (f23012c) {
            e94 e94VarM7451h2 = m7451h();
            jc4VarM7461r = m7461r(hc4Var.mo128a(), e94VarM7451h2.mo5015g(), e94VarM7451h2.mo5014d());
            if (jc4VarM7461r == null) {
                m7460q();
                throw null;
            }
        }
        return jc4VarM7461r;
    }

    /* JADX INFO: renamed from: t */
    public static final void m7463t(int i) {
        C1145sh c1145sh = f23015f;
        int i2 = ((int[]) c1145sh.f30266e)[i];
        c1145sh.m10774o(i2, c1145sh.f30262a - 1);
        c1145sh.f30262a--;
        long[] jArr = (long[]) c1145sh.f30264c;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (z62.m13394v(jArr[i4], j) <= 0) {
                break;
            }
            c1145sh.m10774o(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c1145sh.f30264c;
        int i5 = c1145sh.f30262a >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c1145sh.f30262a && z62.m13394v(jArr2[i6], jArr2[i7]) < 0) {
                if (z62.m13394v(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c1145sh.m10774o(i6, i2);
                i2 = i6;
            } else {
                if (z62.m13394v(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c1145sh.m10774o(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c1145sh.f30266e)[i] = c1145sh.f30263b;
        c1145sh.f30263b = i;
    }

    /* JADX INFO: renamed from: u */
    public static final Object m7464u(rs1 rs1Var, yp1 yp1Var) {
        long j = rs1Var.f17913b;
        Object objInvoke = yp1Var.invoke(f23013d.m6701b(j));
        long j2 = f23014e;
        f23014e = 1 + j2;
        i94 i94VarM6701b = f23013d.m6701b(j);
        f23013d = i94VarM6701b;
        rs1Var.f17913b = j2;
        rs1Var.f17912a = i94VarM6701b;
        rs1Var.f29680g = 0;
        rs1Var.f29681h = null;
        rs1Var.m5023o();
        f23013d = f23013d.m6704e(j2);
        return objInvoke;
    }

    /* JADX INFO: renamed from: v */
    public static final void m7465v(e94 e94Var) {
        Long lValueOf;
        if (f23013d.m6702c(e94Var.mo5015g())) {
            return;
        }
        long jMo5015g = e94Var.mo5015g();
        boolean z = e94Var.f17914c;
        rw2 rw2Var = e94Var instanceof rw2 ? (rw2) e94Var : null;
        Object objValueOf = rw2Var != null ? Boolean.valueOf(rw2Var.f29686m) : "read-only";
        synchronized (f23012c) {
            C1145sh c1145sh = f23015f;
            lValueOf = Long.valueOf(c1145sh.f30262a > 0 ? ((long[]) c1145sh.f30264c)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jMo5015g + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    /* JADX INFO: renamed from: w */
    public static final jc4 m7466w(jc4 jc4Var, hc4 hc4Var, e94 e94Var) {
        jc4 jc4VarM7461r;
        jc4 jc4VarM7461r2;
        if (e94Var.mo3784f()) {
            e94Var.mo5022n(hc4Var);
        }
        long jMo5015g = e94Var.mo5015g();
        jc4 jc4VarM7461r3 = m7461r(jc4Var, jMo5015g, e94Var.mo5014d());
        if (jc4VarM7461r3 == null) {
            synchronized (f23012c) {
                e94 e94VarM7451h = m7451h();
                jc4VarM7461r2 = m7461r(hc4Var.mo128a(), e94VarM7451h.mo5015g(), e94VarM7451h.mo5014d());
                if (jc4VarM7461r2 == null) {
                    m7460q();
                    throw null;
                }
            }
            jc4VarM7461r3 = jc4VarM7461r2;
        }
        if (jc4VarM7461r3.f22164a == e94Var.mo5015g()) {
            return jc4VarM7461r3;
        }
        synchronized (f23012c) {
            jc4VarM7461r = m7461r(hc4Var.mo128a(), jMo5015g, e94Var.mo5014d());
            if (jc4VarM7461r == null) {
                m7460q();
                throw null;
            }
            if (jc4VarM7461r.f22164a != jMo5015g) {
                jc4 jc4VarM7454k = m7454k(jc4VarM7461r, hc4Var);
                jc4VarM7454k.mo4439a(jc4VarM7461r);
                jc4VarM7454k.f22164a = e94Var.mo5015g();
                jc4VarM7461r = jc4VarM7454k;
            }
        }
        e94Var.mo5022n(hc4Var);
        return jc4VarM7461r;
    }
}
