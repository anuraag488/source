package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class rw2 extends e94 {

    /* JADX INFO: renamed from: n */
    public static final int[] f29677n = new int[0];

    /* JADX INFO: renamed from: e */
    public final yp1 f29678e;

    /* JADX INFO: renamed from: f */
    public final yp1 f29679f;

    /* JADX INFO: renamed from: g */
    public int f29680g;

    /* JADX INFO: renamed from: h */
    public mw2 f29681h;

    /* JADX INFO: renamed from: i */
    public ArrayList f29682i;

    /* JADX INFO: renamed from: j */
    public i94 f29683j;

    /* JADX INFO: renamed from: k */
    public int[] f29684k;

    /* JADX INFO: renamed from: l */
    public int f29685l;

    /* JADX INFO: renamed from: m */
    public boolean f29686m;

    public rw2(long j, i94 i94Var, yp1 yp1Var, yp1 yp1Var2) {
        super(j, i94Var);
        this.f29678e = yp1Var;
        this.f29679f = yp1Var2;
        this.f29683j = i94.f21191e;
        this.f29684k = f29677n;
        this.f29685l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m10475A(long j) {
        synchronized (k94.f23012c) {
            this.f29683j = this.f29683j.m6704e(j);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo6056B(mw2 mw2Var) {
        this.f29681h = mw2Var;
    }

    /* JADX INFO: renamed from: C */
    public rw2 mo6057C(yp1 yp1Var, yp1 yp1Var2) {
        b03 b03Var;
        if (this.f17914c) {
            kd3.m7502a("Cannot use a disposed snapshot");
        }
        if (this.f29686m && this.f17915d < 0) {
            kd3.m7503b("Unsupported operation on a disposed or applied snapshot");
        }
        m10475A(mo5015g());
        Object obj = k94.f23012c;
        synchronized (obj) {
            long j = k94.f23014e;
            k94.f23014e = j + 1;
            k94.f23013d = k94.f23013d.m6704e(j);
            i94 i94VarMo5014d = mo5014d();
            mo5025r(i94VarMo5014d.m6704e(j));
            b03Var = new b03(j, k94.m7444a(i94VarMo5014d, mo5015g() + 1, j), k94.m7452i(yp1Var, mo3783e(), true), k94.m7453j(yp1Var2, mo5017i()));
            b03Var.f14981o = this;
            mo5019k();
            VarHandle.storeStoreFence();
        }
        if (this.f29686m || this.f17914c) {
            return b03Var;
        }
        long jMo5015g = mo5015g();
        synchronized (obj) {
            long j2 = k94.f23014e;
            k94.f23014e = j2 + 1;
            mo5026s(j2);
            k94.f23013d = k94.f23013d.m6704e(mo5015g());
        }
        mo5025r(k94.m7444a(mo5014d(), jMo5015g + 1, mo5015g()));
        return b03Var;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: b */
    public final void mo5013b() {
        k94.f23013d = k94.f23013d.m6701b(mo5015g()).m6700a(this.f29683j);
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: c */
    public void mo3384c() {
        if (this.f17914c) {
            return;
        }
        this.f17914c = true;
        synchronized (k94.f23012c) {
            m5023o();
        }
        mo5020l();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: h */
    public int mo5016h() {
        return this.f29680g;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: i */
    public yp1 mo5017i() {
        return this.f29679f;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: k */
    public void mo5019k() {
        this.f29685l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // p000.e94
    /* JADX INFO: renamed from: l */
    public void mo5020l() {
        if (this.f29685l <= 0) {
            kd3.m7502a("no pending nested snapshots");
        }
        int i = this.f29685l - 1;
        this.f29685l = i;
        if (i != 0 || this.f29686m) {
            return;
        }
        mw2 mw2VarMo6059x = mo6059x();
        if (mw2VarMo6059x != null) {
            if (this.f29686m) {
                kd3.m7503b("Unsupported operation on a snapshot that has been applied");
            }
            mo6056B(null);
            long jMo5015g = mo5015g();
            Object[] objArr = mw2VarMo6059x.f25258b;
            long[] jArr = mw2VarMo6059x.f25257a;
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
                                for (jc4 jc4VarMo128a = ((hc4) objArr[(i2 << 3) + i4]).mo128a(); jc4VarMo128a != null; jc4VarMo128a = jc4VarMo128a.f22165b) {
                                    long j2 = jc4VarMo128a.f22164a;
                                    if (j2 == jMo5015g || hb0.m6294F0(this.f29683j, Long.valueOf(j2))) {
                                        r54 r54Var = k94.f23010a;
                                        jc4VarMo128a.f22164a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        m5012a();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: m */
    public void mo5021m() {
        if (this.f29686m || this.f17914c) {
            return;
        }
        m10476v();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: n */
    public void mo5022n(hc4 hc4Var) {
        mw2 mw2VarMo6059x = mo6059x();
        if (mw2VarMo6059x == null) {
            mw2 mw2Var = uv3.f32207a;
            mw2VarMo6059x = new mw2();
            mo6056B(mw2VarMo6059x);
        }
        mw2VarMo6059x.m8409a(hc4Var);
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: p */
    public final void mo5024p() {
        int length = this.f29684k.length;
        for (int i = 0; i < length; i++) {
            k94.m7463t(this.f29684k[i]);
        }
        m5023o();
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: t */
    public void mo5027t(int i) {
        this.f29680g = i;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: u */
    public e94 mo3785u(yp1 yp1Var) {
        c03 c03Var;
        if (this.f17914c) {
            kd3.m7502a("Cannot use a disposed snapshot");
        }
        if (this.f29686m && this.f17915d < 0) {
            kd3.m7503b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo5015g = mo5015g();
        m10475A(mo5015g());
        Object obj = k94.f23012c;
        synchronized (obj) {
            long j = k94.f23014e;
            k94.f23014e = j + 1;
            k94.f23013d = k94.f23013d.m6704e(j);
            c03Var = new c03(j, k94.m7444a(mo5014d(), jMo5015g + 1, j), k94.m7452i(yp1Var, mo3783e(), true), this);
        }
        if (this.f29686m || this.f17914c) {
            return c03Var;
        }
        long jMo5015g2 = mo5015g();
        synchronized (obj) {
            long j2 = k94.f23014e;
            k94.f23014e = j2 + 1;
            mo5026s(j2);
            k94.f23013d = k94.f23013d.m6704e(mo5015g());
        }
        mo5025r(k94.m7444a(mo5014d(), jMo5015g2 + 1, mo5015g()));
        return c03Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m10476v() {
        m10475A(mo5015g());
        if (this.f29686m || this.f17914c) {
            return;
        }
        long jMo5015g = mo5015g();
        synchronized (k94.f23012c) {
            long j = k94.f23014e;
            k94.f23014e = j + 1;
            mo5026s(j);
            k94.f23013d = k94.f23013d.m6704e(mo5015g());
        }
        mo5025r(k94.m7444a(mo5014d(), jMo5015g + 1, mo5015g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150 A[EDGE_INSN: B:101:0x0150->B:77:0x0150 BREAK  A[LOOP:4: B:66:0x0121->B:76:0x014d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x010e A[Catch: all -> 0x0104, LOOP:2: B:48:0x00dc->B:60:0x010e, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:57:0x0106, B:63:0x0117, B:66:0x0121, B:68:0x012b, B:70:0x0135, B:72:0x013b, B:73:0x0145, B:76:0x014d, B:77:0x0150, B:79:0x0154, B:81:0x015b, B:82:0x0167, B:60:0x010e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014d A[Catch: all -> 0x0104, LOOP:4: B:66:0x0121->B:76:0x014d, LOOP_END, TryCatch #0 {all -> 0x0104, blocks: (B:43:0x00c0, B:45:0x00d0, B:48:0x00dc, B:50:0x00e8, B:52:0x00f2, B:54:0x00f8, B:57:0x0106, B:63:0x0117, B:66:0x0121, B:68:0x012b, B:70:0x0135, B:72:0x013b, B:73:0x0145, B:76:0x014d, B:77:0x0150, B:79:0x0154, B:81:0x015b, B:82:0x0167, B:60:0x010e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0115 A[EDGE_INSN: B:96:0x0115->B:62:0x0115 BREAK  A[LOOP:2: B:48:0x00dc->B:60:0x010e], SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public y42 mo3385w() {
        HashMap mapM7456m;
        List list;
        mw2 mw2Var;
        long j;
        long j2;
        mw2 mw2VarMo6059x = mo6059x();
        if (mw2VarMo6059x != null) {
            long j3 = k94.f23019j.f17913b;
            mapM7456m = k94.m7456m(j3, this, k94.f23013d.m6701b(j3));
        } else {
            mapM7456m = null;
        }
        v71 v71Var = v71.f32439a;
        synchronized (k94.f23012c) {
            try {
                k94.m7465v(this);
                if (mw2VarMo6059x == null || mw2VarMo6059x.f25260d == 0) {
                    mo5013b();
                    rs1 rs1Var = k94.f23019j;
                    mw2 mw2Var2 = rs1Var.f29681h;
                    k94.m7464u(rs1Var, k94.f23010a);
                    if (mw2Var2 == null || !mw2Var2.m8416h()) {
                        list = v71Var;
                        mw2Var = null;
                    } else {
                        list = k94.f23017h;
                        mw2Var = mw2Var2;
                    }
                } else {
                    rs1 rs1Var2 = k94.f23019j;
                    y42 y42VarM10477z = m10477z(k94.f23014e, mw2VarMo6059x, mapM7456m, k94.f23013d.m6701b(rs1Var2.f17913b));
                    if (!y42VarM10477z.equals(g94.f19676k)) {
                        return y42VarM10477z;
                    }
                    mo5013b();
                    mw2Var = rs1Var2.f29681h;
                    k94.m7464u(rs1Var2, k94.f23010a);
                    mo6056B(null);
                    rs1Var2.f29681h = null;
                    list = k94.f23017h;
                }
                this.f29686m = true;
                if (mw2Var != null) {
                    vv3 vv3VarM6574I = i20.m6574I(mw2Var);
                    if (!vv3VarM6574I.f32888a.m8415g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((mq1) list.get(i)).invoke(vv3VarM6574I, this);
                        }
                    }
                }
                if (mw2VarMo6059x != null && mw2VarMo6059x.m8416h()) {
                    vv3 vv3VarM6574I2 = i20.m6574I(mw2VarMo6059x);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((mq1) list.get(i2)).invoke(vv3VarM6574I2, this);
                    }
                }
                synchronized (k94.f23012c) {
                    try {
                        mo5024p();
                        k94.m7447d();
                        if (mw2Var != null) {
                            Object[] objArr = mw2Var.f25258b;
                            long[] jArr = mw2Var.f25257a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                k94.m7459p((hc4) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (mw2VarMo6059x != null) {
                            Object[] objArr2 = mw2VarMo6059x.f25258b;
                            long[] jArr2 = mw2VarMo6059x.f25257a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                k94.m7459p((hc4) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f29682i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                k94.m7459p((hc4) arrayList.get(i9));
                            }
                        }
                        this.f29682i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return g94.f19676k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public mw2 mo6059x() {
        return this.f29681h;
    }

    @Override // p000.e94
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public yp1 mo3783e() {
        return this.f29678e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final y42 m10477z(long j, mw2 mw2Var, HashMap map, i94 i94Var) {
        ArrayList arrayList;
        ArrayList arrayListM6310V0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        hc4 hc4Var;
        jc4 jc4Var;
        i94 i94Var2;
        Object[] objArr;
        long[] jArr;
        i94 i94Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        jc4 jc4VarMo129b;
        i94 i94VarM6703d = mo5014d().m6704e(mo5015g()).m6703d(this.f29683j);
        Object[] objArr3 = mw2Var.f25258b;
        long[] jArr3 = mw2Var.f25257a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListM6310V0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            hc4 hc4Var2 = (hc4) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            jc4 jc4VarMo128a = hc4Var2.mo128a();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            jc4 jc4VarM7461r = k94.m7461r(jc4VarMo128a, j, i94Var);
                            if (jc4VarM7461r == null) {
                                arrayList4 = arrayListM6310V0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListM6310V0;
                                j2 = j3;
                                jc4 jc4VarM7461r2 = k94.m7461r(jc4VarMo128a, mo5015g(), i94VarM6703d);
                                if (jc4VarM7461r2 != null && jc4VarM7461r2.f22164a != 1 && !jc4VarM7461r.equals(jc4VarM7461r2)) {
                                    i94Var3 = i94VarM6703d;
                                    jc4 jc4VarM7461r3 = k94.m7461r(jc4VarMo128a, mo5015g(), mo5014d());
                                    if (jc4VarM7461r3 == null) {
                                        k94.m7460q();
                                        throw null;
                                    }
                                    if (map == null || (jc4VarMo129b = (jc4) map.get(jc4VarM7461r)) == null) {
                                        jc4VarMo129b = hc4Var2.mo129b(jc4VarM7461r2, jc4VarM7461r, jc4VarM7461r3);
                                    }
                                    if (jc4VarMo129b == null) {
                                        return new f94(this);
                                    }
                                    if (!jc4VarMo129b.equals(jc4VarM7461r3)) {
                                        if (jc4VarMo129b.equals(jc4VarM7461r)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new l73(hc4Var2, jc4VarM7461r.mo4440b(mo5015g())));
                                            arrayListM6310V0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListM6310V0.add(hc4Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!jc4VarMo129b.equals(jc4VarM7461r2) ? new l73(hc4Var2, jc4VarMo129b) : new l73(hc4Var2, jc4VarM7461r2.mo4440b(mo5015g())));
                                        }
                                    }
                                    arrayListM6310V0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListM6310V0 = arrayList4;
                            }
                            i94Var3 = i94VarM6703d;
                            arrayList2 = arrayList5;
                            arrayListM6310V0 = arrayList4;
                        } else {
                            i94Var3 = i94VarM6703d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        i94VarM6703d = i94Var3;
                    }
                    i94Var2 = i94VarM6703d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    i94Var2 = i94VarM6703d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    i94VarM6703d = i94Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                m10476v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    l73 l73Var = (l73) arrayList2.get(i2);
                    hc4Var = (hc4) l73Var.f23833a;
                    jc4Var = (jc4) l73Var.f23834b;
                    jc4Var.f22164a = j;
                    synchronized (k94.f23012c) {
                        jc4Var.f22165b = hc4Var.mo128a();
                        hc4Var.mo130d(jc4Var);
                    }
                }
            }
            if (arrayListM6310V0 != null) {
                size = arrayListM6310V0.size();
                for (i = 0; i < size; i++) {
                    mw2Var.m8420l((hc4) arrayListM6310V0.get(i));
                }
                arrayList3 = this.f29682i;
                if (arrayList3 != null) {
                    arrayListM6310V0 = hb0.m6310V0(arrayList3, arrayListM6310V0);
                }
                this.f29682i = arrayListM6310V0;
            }
            return g94.f19676k;
        }
        arrayList = null;
        arrayListM6310V0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m10476v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                l73 l73Var2 = (l73) arrayList2.get(i2);
                hc4Var = (hc4) l73Var2.f23833a;
                jc4Var = (jc4) l73Var2.f23834b;
                jc4Var.f22164a = j;
                synchronized (k94.f23012c) {
                    jc4Var.f22165b = hc4Var.mo128a();
                    hc4Var.mo130d(jc4Var);
                }
            }
        }
        if (arrayListM6310V0 != null) {
            size = arrayListM6310V0.size();
            while (i < size) {
                mw2Var.m8420l((hc4) arrayListM6310V0.get(i));
            }
            arrayList3 = this.f29682i;
            if (arrayList3 != null) {
                arrayListM6310V0 = hb0.m6310V0(arrayList3, arrayListM6310V0);
            }
            this.f29682i = arrayListM6310V0;
        }
        return g94.f19676k;
    }
}
