package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aa4 {

    /* JADX INFO: renamed from: a */
    public final yp1 f210a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f211b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public boolean f212c;

    /* JADX INFO: renamed from: d */
    public final u04 f213d;

    /* JADX INFO: renamed from: e */
    public final o04 f214e;

    /* JADX INFO: renamed from: f */
    public final uw2 f215f;

    /* JADX INFO: renamed from: g */
    public final Object f216g;

    /* JADX INFO: renamed from: h */
    public C1040pn f217h;

    /* JADX INFO: renamed from: i */
    public z94 f218i;

    /* JADX INFO: renamed from: j */
    public long f219j;

    public aa4(yp1 yp1Var) {
        this.f210a = yp1Var;
        u04 u04Var = new u04((byte) 5);
        u04Var.f31581b = this;
        VarHandle.storeStoreFence();
        this.f213d = u04Var;
        o04 o04Var = new o04((byte) 8);
        o04Var.f26271b = this;
        VarHandle.storeStoreFence();
        this.f214e = o04Var;
        this.f215f = new uw2(new z94[16]);
        this.f216g = new Object();
        this.f219j = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final void m155a() {
        synchronized (this.f216g) {
            uw2 uw2Var = this.f215f;
            Object[] objArr = uw2Var.f32211a;
            int i = uw2Var.f32213c;
            for (int i2 = 0; i2 < i; i2++) {
                z94 z94Var = (z94) objArr[i2];
                z94Var.f35892e.m8126a();
                z94Var.f35893f.m8126a();
                z94Var.f35899l.m8126a();
                z94Var.f35900m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x008e, LOOP:1: B:14:0x002d->B:26:0x0074, LOOP_END, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:27:0x0078, B:29:0x0080, B:34:0x0090, B:31:0x0085, B:11:0x0021, B:14:0x002d, B:16:0x0041, B:18:0x004f, B:20:0x0059, B:22:0x0069, B:26:0x0074, B:35:0x0094), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:14:0x002d->B:26:0x0074], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m156b(Object obj) {
        int i;
        synchronized (this.f216g) {
            try {
                uw2 uw2Var = this.f215f;
                int i2 = uw2Var.f32213c;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    Object[] objArr = uw2Var.f32211a;
                    if (i3 < i2) {
                        z94 z94Var = (z94) objArr[i3];
                        yv2 yv2Var = (yv2) z94Var.f35893f.m8136k(obj);
                        if (yv2Var == null) {
                            i = i3;
                        } else {
                            Object[] objArr2 = yv2Var.f35548b;
                            int[] iArr = yv2Var.f35549c;
                            long[] jArr = yv2Var.f35547a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    i = i3;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j & 255) < 128) {
                                                int i8 = (i5 << 3) + i7;
                                                Object obj2 = objArr2[i8];
                                                int i9 = iArr[i8];
                                                z94Var.m13460c(obj, obj2);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                        if (i5 != length) {
                                            break;
                                        }
                                        i5++;
                                        i3 = i;
                                    } else if (i5 != length) {
                                        break;
                                        break;
                                    } else {
                                        i5++;
                                        i3 = i;
                                    }
                                }
                            } else {
                                i = i3;
                            }
                        }
                        if (!z94Var.f35893f.m8135j()) {
                            i4++;
                        } else if (i4 > 0) {
                            Object[] objArr3 = uw2Var.f32211a;
                            objArr3[i - i4] = objArr3[i];
                        }
                        i3 = i + 1;
                    } else {
                        int i10 = i2 - i4;
                        Arrays.fill(objArr, i10, i2, (Object) null);
                        uw2Var.f32213c = i10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m157c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f216g) {
            z = this.f212c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f211b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        qi0.m9890b("Unexpected notification");
                        xy4.m12794w();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                if (atomicReference.compareAndSet(obj, obj2)) {
                    set = set2;
                    break;
                }
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.f216g) {
                uw2 uw2Var = this.f215f;
                Object[] objArr = uw2Var.f32211a;
                int i = uw2Var.f32213c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((z94) objArr[i2]).m13458a(set) || z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final z94 m158d(yp1 yp1Var) {
        Object obj;
        uw2 uw2Var = this.f215f;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (((z94) obj).f35888a == yp1Var) {
                break;
            }
            i2++;
        }
        z94 z94Var = (z94) obj;
        if (z94Var != null) {
            return z94Var;
        }
        as4.m3259r(1, yp1Var);
        z94 z94Var2 = new z94();
        z94Var2.f35888a = yp1Var;
        z94Var2.f35891d = -1;
        z94Var2.f35892e = dt0.m4723y();
        z94Var2.f35893f = new lw2();
        z94Var2.f35894g = new mw2();
        z94Var2.f35895h = new uw2(new wy0[16]);
        hr1 hr1Var = new hr1((byte) 1);
        hr1Var.f20805b = z94Var2;
        VarHandle.storeStoreFence();
        z94Var2.f35896i = hr1Var;
        z94Var2.f35899l = dt0.m4723y();
        z94Var2.f35900m = new HashMap();
        VarHandle.storeStoreFence();
        uw2Var.m11663b(z94Var2);
        return z94Var2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01a7 A[EDGE_INSN: B:149:0x01a7->B:91:0x01a7 BREAK  A[LOOP:0: B:64:0x0130->B:87:0x0197], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x01a7 A[EDGE_INSN: B:150:0x01a7->B:91:0x01a7 BREAK  A[LOOP:0: B:64:0x0130->B:87:0x0197], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0170  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173 A[Catch: all -> 0x01bb, TryCatch #9 {all -> 0x01bb, blocks: (B:72:0x0161, B:77:0x0173, B:79:0x0178, B:81:0x0182, B:87:0x0197, B:91:0x01a7), top: B:143:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0178 A[Catch: all -> 0x01bb, TryCatch #9 {all -> 0x01bb, blocks: (B:72:0x0161, B:77:0x0173, B:79:0x0178, B:81:0x0182, B:87:0x0197, B:91:0x01a7), top: B:143:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:87:0x0197 A[Catch: all -> 0x01bb, LOOP:0: B:64:0x0130->B:87:0x0197, LOOP_END, TryCatch #9 {all -> 0x01bb, blocks: (B:72:0x0161, B:77:0x0173, B:79:0x0178, B:81:0x0182, B:87:0x0197, B:91:0x01a7), top: B:143:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX INFO: renamed from: e */
    public final void m159e(Object obj, yp1 yp1Var, wp1 wp1Var) {
        z94 z94VarM158d;
        z94 z94Var;
        long j;
        e94 gp4Var;
        boolean z;
        Object obj2;
        int i;
        yv2 yv2Var;
        long j2;
        long[] jArr;
        int length;
        int i2;
        long j3;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long[] jArr3;
        long j4;
        int i8;
        Object obj3;
        boolean z2;
        long jM9110p = oh6.m9110p();
        synchronized (this.f216g) {
            z94VarM158d = m158d(yp1Var);
            z94Var = this.f218i;
            j = this.f219j;
        }
        if (j != -1 && j != jM9110p) {
            kd3.m7502a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jM9110p + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            synchronized (this.f216g) {
                this.f218i = z94VarM158d;
                this.f219j = jM9110p;
            }
            o04 o04Var = this.f214e;
            Object obj4 = z94VarM158d.f35889b;
            yv2 yv2Var2 = z94VarM158d.f35890c;
            int i9 = z94VarM158d.f35891d;
            z94VarM158d.f35889b = obj;
            z94VarM158d.f35890c = (yv2) z94VarM158d.f35893f.m8132g(obj);
            if (z94VarM158d.f35891d == -1) {
                z94VarM158d.f35891d = Long.hashCode(k94.m7451h().mo5015g());
            }
            hr1 hr1Var = z94VarM158d.f35896i;
            uw2 uw2VarM10565a = s94.m10565a();
            try {
                uw2VarM10565a.m11663b(hr1Var);
                if (o04Var != null) {
                    e94 e94Var = (e94) k94.f23011b.get();
                    if ((e94Var instanceof gp4) && ((gp4) e94Var).f20012t == oh6.m9110p()) {
                        yp1 yp1Var2 = ((gp4) e94Var).f20010r;
                        yp1 yp1Var3 = ((gp4) e94Var).f20011s;
                        try {
                            ((gp4) e94Var).f20010r = k94.m7452i(o04Var, yp1Var2, true);
                            ((gp4) e94Var).f20011s = yp1Var3;
                            wp1Var.invoke();
                            ((gp4) e94Var).f20010r = yp1Var2;
                            ((gp4) e94Var).f20011s = yp1Var3;
                        } catch (Throwable th) {
                            ((gp4) e94Var).f20010r = yp1Var2;
                            ((gp4) e94Var).f20011s = yp1Var3;
                            throw th;
                        }
                    } else {
                        if (e94Var == null || (e94Var instanceof rw2)) {
                            try {
                                z = true;
                                try {
                                    gp4Var = new gp4(e94Var instanceof rw2 ? (rw2) e94Var : null, o04Var, null, true, false);
                                } catch (Throwable th2) {
                                    th = th2;
                                    uw2VarM10565a.m11672l(uw2VarM10565a.f32213c - 1);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                uw2VarM10565a.m11672l(uw2VarM10565a.f32213c - 1);
                                throw th;
                            }
                        } else {
                            z = true;
                            gp4Var = e94Var.mo3785u(o04Var);
                        }
                        try {
                            e94 e94VarM5018j = gp4Var.m5018j();
                            try {
                                wp1Var.invoke();
                                e94.m5011q(e94VarM5018j);
                                gp4Var.mo3384c();
                            } catch (Throwable th4) {
                                e94.m5011q(e94VarM5018j);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            gp4Var.mo3384c();
                            throw th5;
                        }
                    }
                    uw2VarM10565a.m11672l(uw2VarM10565a.f32213c - 1);
                    obj2 = z94VarM158d.f35889b;
                    i = z94VarM158d.f35891d;
                    yv2Var = z94VarM158d.f35890c;
                    if (yv2Var != null) {
                        try {
                            jArr = yv2Var.f35547a;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i2 = 0;
                                while (true) {
                                    j3 = jArr[i2];
                                    j2 = j;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i4 = 8;
                                        i5 = 8 - ((~(i2 - length)) >>> 31);
                                        i6 = 0;
                                        while (i6 < i5) {
                                            if ((j3 & 255) < 128) {
                                                i7 = i4;
                                                i8 = (i2 << 3) + i6;
                                                jArr3 = jArr;
                                                try {
                                                    obj3 = yv2Var.f35548b[i8];
                                                    j4 = j3;
                                                    if (yv2Var.f35549c[i8] != i) {
                                                        z2 = z;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (z2) {
                                                        z94VarM158d.m13460c(obj2, obj3);
                                                    }
                                                    if (z2) {
                                                        yv2Var.m13262f(i8);
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    j = j2;
                                                    synchronized (this.f216g) {
                                                        this.f218i = z94Var;
                                                        this.f219j = j;
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                i7 = i4;
                                                jArr3 = jArr;
                                                j4 = j3;
                                            }
                                            j3 = j4 >> i7;
                                            i6++;
                                            i4 = i7;
                                            jArr = jArr3;
                                        }
                                        jArr2 = jArr;
                                        if (i5 == i4) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr;
                                    }
                                    i3 = i2;
                                    if (i3 != length) {
                                        break;
                                    }
                                    i2 = i3 + 1;
                                    jArr = jArr2;
                                    j = j2;
                                }
                            } else {
                                j2 = j;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j2 = j;
                            j = j2;
                            synchronized (this.f216g) {
                                this.f218i = z94Var;
                                this.f219j = j;
                            }
                            throw th;
                        }
                    } else {
                        j2 = j;
                    }
                    z94VarM158d.f35889b = obj4;
                    z94VarM158d.f35890c = yv2Var2;
                    z94VarM158d.f35891d = i9;
                    synchronized (this.f216g) {
                        this.f218i = z94Var;
                        this.f219j = j2;
                    }
                }
                wp1Var.invoke();
                z = true;
                uw2VarM10565a.m11672l(uw2VarM10565a.f32213c - 1);
                obj2 = z94VarM158d.f35889b;
                i = z94VarM158d.f35891d;
                yv2Var = z94VarM158d.f35890c;
                if (yv2Var != null) {
                    jArr = yv2Var.f35547a;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i2 = 0;
                        while (true) {
                            j3 = jArr[i2];
                            j2 = j;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                i4 = 8;
                                i5 = 8 - ((~(i2 - length)) >>> 31);
                                i6 = 0;
                                while (i6 < i5) {
                                    if ((j3 & 255) < 128) {
                                        i7 = i4;
                                        i8 = (i2 << 3) + i6;
                                        jArr3 = jArr;
                                        obj3 = yv2Var.f35548b[i8];
                                        j4 = j3;
                                        if (yv2Var.f35549c[i8] != i) {
                                            z2 = z;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            z94VarM158d.m13460c(obj2, obj3);
                                        }
                                        if (z2) {
                                            yv2Var.m13262f(i8);
                                        }
                                    } else {
                                        i7 = i4;
                                        jArr3 = jArr;
                                        j4 = j3;
                                    }
                                    j3 = j4 >> i7;
                                    i6++;
                                    i4 = i7;
                                    jArr = jArr3;
                                }
                                jArr2 = jArr;
                                if (i5 == i4) {
                                    break;
                                    break;
                                }
                            } else {
                                jArr2 = jArr;
                            }
                            i3 = i2;
                            if (i3 != length) {
                                break;
                                break;
                            } else {
                                i2 = i3 + 1;
                                jArr = jArr2;
                                j = j2;
                            }
                        }
                    } else {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                z94VarM158d.f35889b = obj4;
                z94VarM158d.f35890c = yv2Var2;
                z94VarM158d.f35891d = i9;
                synchronized (this.f216g) {
                    this.f218i = z94Var;
                    this.f219j = j2;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m160f() {
        u04 u04Var = this.f213d;
        k94.m7445b(k94.f23010a);
        synchronized (k94.f23012c) {
            k94.f23017h = hb0.m6311W0(k94.f23017h, u04Var);
        }
        C1040pn c1040pn = new C1040pn((byte) 17);
        c1040pn.f27754b = u04Var;
        VarHandle.storeStoreFence();
        this.f217h = c1040pn;
    }
}
