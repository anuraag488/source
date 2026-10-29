package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class y44 extends AbstractC1056q2 implements qw2, si1, yq1 {

    /* JADX INFO: renamed from: e */
    public final int f34870e;

    /* JADX INFO: renamed from: f */
    public final int f34871f;

    /* JADX INFO: renamed from: g */
    public final y30 f34872g;

    /* JADX INFO: renamed from: h */
    public Object[] f34873h;

    /* JADX INFO: renamed from: i */
    public long f34874i;

    /* JADX INFO: renamed from: j */
    public long f34875j;

    /* JADX INFO: renamed from: k */
    public int f34876k;

    /* JADX INFO: renamed from: l */
    public int f34877l;

    public y44(int i, int i2, y30 y30Var) {
        this.f34870e = i;
        this.f34871f = i2;
        this.f34872g = y30Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:15:0x0033, B:32:0x007b, B:34:0x0083, B:38:0x0099, B:41:0x00a0, B:42:0x00a4, B:43:0x00a5, B:22:0x004d), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:15:0x0033, B:32:0x007b, B:34:0x0083, B:38:0x0099, B:41:0x00a0, B:42:0x00a4, B:43:0x00a5, B:22:0x004d), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ti1] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [q2] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [y44] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ti1] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [r2] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [a54] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [a54] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b6 -> B:16:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0097
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: k */
    public static void m12879k(p000.y44 r8, p000.ti1 r9, p000.wm0 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p000.x44
            if (r0 == 0) goto L13
            r0 = r10
            x44 r0 = (p000.x44) r0
            int r1 = r0.f33988z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33988z = r1
            goto L18
        L13:
            x44 r0 = new x44
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f33986x
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f33988z
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L60
            r8 = 1
            if (r2 == r8) goto L51
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3d
            t82 r8 = r0.f33985w
            t82 r8 = (p000.t82) r8
            a54 r9 = r0.f33984v
            ti1 r2 = r0.f33983u
            y44 r5 = r0.f33982t
            p000.k43.m7376J(r10)     // Catch: java.lang.Throwable -> L3a
        L36:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L78
        L3a:
            r8 = move-exception
            goto Lbc
        L3d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r8)
            return
        L43:
            t82 r8 = r0.f33985w
            t82 r8 = (p000.t82) r8
            a54 r9 = r0.f33984v
            ti1 r2 = r0.f33983u
            y44 r5 = r0.f33982t
            p000.k43.m7376J(r10)     // Catch: java.lang.Throwable -> L3a
            goto L7b
        L51:
            a54 r9 = r0.f33984v
            ti1 r8 = r0.f33983u
            y44 r2 = r0.f33982t
            p000.k43.m7376J(r10)     // Catch: java.lang.Throwable -> L5d
            r10 = r8
            r8 = r2
            goto L6c
        L5d:
            r8 = move-exception
            r5 = r2
            goto Lbc
        L60:
            p000.k43.m7376J(r10)
            r2 r10 = r8.m9699b()
            a54 r10 = (p000.a54) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6c:
            ro0 r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb9
            o85 r5 = p000.o85.f26448h     // Catch: java.lang.Throwable -> Lb9
            po0 r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb9
            t82 r2 = (p000.t82) r2     // Catch: java.lang.Throwable -> Lb9
        L78:
            r5 = r8
            r8 = r2
            r2 = r10
        L7b:
            java.lang.Object r10 = r5.m12889s(r9)     // Catch: java.lang.Throwable -> L3a
            f8 r6 = p000.z44.f35748a     // Catch: java.lang.Throwable -> L3a
            if (r10 != r6) goto L97
            r0.f33982t = r5     // Catch: java.lang.Throwable -> L3a
            r0.f33983u = r2     // Catch: java.lang.Throwable -> L3a
            r0.f33984v = r9     // Catch: java.lang.Throwable -> L3a
            r10 = r8
            t82 r10 = (p000.t82) r10     // Catch: java.lang.Throwable -> L3a
            r0.f33985w = r10     // Catch: java.lang.Throwable -> L3a
            r0.f33988z = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r5.m12880i(r9, r0)     // Catch: java.lang.Throwable -> L3a
            if (r10 != r1) goto L7b
            goto Lb8
        L97:
            if (r8 == 0) goto La5
            boolean r6 = r8.mo4995b()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto La0
            goto La5
        La0:
            java.util.concurrent.CancellationException r8 = r8.mo5006u()     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        La5:
            r0.f33982t = r5     // Catch: java.lang.Throwable -> L3a
            r0.f33983u = r2     // Catch: java.lang.Throwable -> L3a
            r0.f33984v = r9     // Catch: java.lang.Throwable -> L3a
            r6 = r8
            t82 r6 = (p000.t82) r6     // Catch: java.lang.Throwable -> L3a
            r0.f33985w = r6     // Catch: java.lang.Throwable -> L3a
            r0.f33988z = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L3a
            if (r10 != r1) goto L36
        Lb8:
            return
        Lb9:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lbc:
            r5.m9700g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y44.m12879k(y44, ti1, wm0):void");
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: a */
    public final si1 mo193a(ro0 ro0Var, int i, y30 y30Var) {
        return z44.m13333c(this, ro0Var, i, y30Var);
    }

    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) throws Throwable {
        m12879k(this, ti1Var, wm0Var);
        return ap0.f14763a;
    }

    @Override // p000.qw2
    /* JADX INFO: renamed from: e */
    public final void mo196e() throws Throwable {
        y44 y44Var;
        synchronized (this) {
            try {
                y44Var = this;
                try {
                    y44Var.m12890t(m12885o() + ((long) this.f34876k), this.f34875j, m12885o() + ((long) this.f34876k), m12885o() + ((long) this.f34876k) + ((long) this.f34877l));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                y44Var = this;
            }
        }
    }

    @Override // p000.qw2, p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        wm0[] wm0VarArrM12884n;
        w44 w44Var;
        if (mo197f(obj)) {
            return ju4.f22634a;
        }
        b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
        b70Var.m3497u();
        wm0[] wm0VarArrM12884n2 = AbstractC1356y5.f34878a;
        synchronized (this) {
            try {
                if (m12887q(obj)) {
                    b70Var.resumeWith(ju4.f22634a);
                    wm0VarArrM12884n = m12884n(wm0VarArrM12884n2);
                    w44Var = null;
                } else {
                    long jM12885o = m12885o() + ((long) (this.f34876k + this.f34877l));
                    w44 w44Var2 = new w44();
                    w44Var2.f33092a = this;
                    w44Var2.f33093b = jM12885o;
                    w44Var2.f33094c = obj;
                    w44Var2.f33095d = b70Var;
                    VarHandle.storeStoreFence();
                    m12883m(w44Var2);
                    this.f34877l++;
                    if (this.f34871f == 0) {
                        wm0VarArrM12884n2 = m12884n(wm0VarArrM12884n2);
                    }
                    wm0VarArrM12884n = wm0VarArrM12884n2;
                    w44Var = w44Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (w44Var != null) {
            c20.m3817l(b70Var, w44Var);
        }
        for (wm0 wm0Var2 : wm0VarArrM12884n) {
            if (wm0Var2 != null) {
                wm0Var2.resumeWith(ju4.f22634a);
            }
        }
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        if (objM3495r != ap0Var) {
            objM3495r = ju4.f22634a;
        }
        return objM3495r == ap0Var ? objM3495r : ju4.f22634a;
    }

    @Override // p000.qw2
    /* JADX INFO: renamed from: f */
    public final boolean mo197f(Object obj) {
        int i;
        boolean z;
        wm0[] wm0VarArrM12884n = AbstractC1356y5.f34878a;
        synchronized (this) {
            if (m12887q(obj)) {
                wm0VarArrM12884n = m12884n(wm0VarArrM12884n);
                z = true;
            } else {
                z = false;
            }
        }
        for (wm0 wm0Var : wm0VarArrM12884n) {
            if (wm0Var != null) {
                wm0Var.resumeWith(ju4.f22634a);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final Object m12880i(a54 a54Var, x44 x44Var) {
        b70 b70Var = new b70(1, C0006a5.m86x(x44Var));
        b70Var.m3497u();
        synchronized (this) {
            try {
                if (m12888r(a54Var) < 0) {
                    a54Var.f117b = b70Var;
                } else {
                    b70Var.resumeWith(ju4.f22634a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM3495r = b70Var.m3495r();
        return objM3495r == ap0.f14763a ? objM3495r : ju4.f22634a;
    }

    /* JADX INFO: renamed from: j */
    public final void m12881j() {
        if (this.f34871f != 0 || this.f34877l > 1) {
            Object[] objArr = this.f34873h;
            while (this.f34877l > 0) {
                long jM12885o = m12885o();
                int i = this.f34876k;
                int i2 = this.f34877l;
                if (objArr[((int) ((jM12885o + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != z44.f35748a) {
                    return;
                }
                this.f34877l = i2 - 1;
                z44.m13334d(objArr, m12885o() + ((long) (this.f34876k + this.f34877l)), null);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m12882l() {
        AbstractC1093r2[] abstractC1093r2Arr;
        z44.m13334d(this.f34873h, m12885o(), null);
        this.f34876k--;
        long jM12885o = m12885o() + 1;
        if (this.f34874i < jM12885o) {
            this.f34874i = jM12885o;
        }
        if (this.f34875j < jM12885o) {
            if (this.f28151b != 0 && (abstractC1093r2Arr = this.f28150a) != null) {
                for (AbstractC1093r2 abstractC1093r2 : abstractC1093r2Arr) {
                    if (abstractC1093r2 != null) {
                        a54 a54Var = (a54) abstractC1093r2;
                        long j = a54Var.f116a;
                        if (0 <= j && j < jM12885o) {
                            a54Var.f116a = jM12885o;
                        }
                    }
                }
            }
            this.f34875j = jM12885o;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12883m(Object obj) {
        int i = this.f34876k + this.f34877l;
        Object[] objArrM12886p = this.f34873h;
        if (objArrM12886p == null) {
            objArrM12886p = m12886p(null, 0, 2);
        } else if (i >= objArrM12886p.length) {
            objArrM12886p = m12886p(objArrM12886p, i, objArrM12886p.length * 2);
        }
        z44.m13334d(objArrM12886p, m12885o() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [wm0[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: n */
    public final wm0[] m12884n(wm0[] wm0VarArr) {
        AbstractC1093r2[] abstractC1093r2Arr;
        a54 a54Var;
        b70 b70Var;
        int length = wm0VarArr.length;
        if (this.f28151b != 0 && (abstractC1093r2Arr = this.f28150a) != null) {
            int length2 = abstractC1093r2Arr.length;
            int i = 0;
            while (i < length2) {
                AbstractC1093r2 abstractC1093r2 = abstractC1093r2Arr[i];
                if (abstractC1093r2 == null || (b70Var = (a54Var = (a54) abstractC1093r2).f117b) == null || m12888r(a54Var) < 0) {
                    wm0VarArr = wm0VarArr;
                } else {
                    if (length >= wm0VarArr.length) {
                        wm0VarArr = wm0VarArr;
                        wm0VarArr = wm0VarArr;
                        wm0VarArr = Arrays.copyOf((Object[]) wm0VarArr, Math.max(2, wm0VarArr.length * 2));
                    }
                    wm0VarArr = wm0VarArr;
                    wm0VarArr = wm0VarArr;
                    ((wm0[]) wm0VarArr)[length] = b70Var;
                    a54Var.f117b = null;
                    length++;
                }
                i++;
                wm0VarArr = wm0VarArr;
            }
            wm0VarArr = wm0VarArr;
        }
        return (wm0[]) wm0VarArr;
    }

    /* JADX INFO: renamed from: o */
    public final long m12885o() {
        return Math.min(this.f34875j, this.f34874i);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m12886p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            C1077qn.m9989o("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.f34873h = objArr2;
        if (objArr != null) {
            long jM12885o = m12885o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jM12885o;
                z44.m13334d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX INFO: renamed from: q */
    public final boolean m12887q(Object obj) {
        int i;
        long jM12885o;
        long j;
        int i2 = this.f28151b;
        int i3 = this.f34870e;
        if (i2 != 0) {
            int i4 = this.f34876k;
            int i5 = this.f34871f;
            if (i4 < i5 || this.f34875j > this.f34874i) {
                m12883m(obj);
                i = this.f34876k + 1;
                this.f34876k = i;
                if (i > i5) {
                    m12882l();
                }
                jM12885o = m12885o() + ((long) this.f34876k);
                j = this.f34874i;
                if (((int) (jM12885o - j)) > i3) {
                    m12890t(1 + j, this.f34875j, m12885o() + ((long) this.f34876k), m12885o() + ((long) this.f34876k) + ((long) this.f34877l));
                }
            } else {
                int iOrdinal = this.f34872g.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    m12883m(obj);
                    i = this.f34876k + 1;
                    this.f34876k = i;
                    if (i > i5) {
                        m12882l();
                    }
                    jM12885o = m12885o() + ((long) this.f34876k);
                    j = this.f34874i;
                    if (((int) (jM12885o - j)) > i3) {
                        m12890t(1 + j, this.f34875j, m12885o() + ((long) this.f34876k), m12885o() + ((long) this.f34876k) + ((long) this.f34877l));
                    }
                } else if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return false;
                }
            }
        } else if (i3 != 0) {
            m12883m(obj);
            int i6 = this.f34876k + 1;
            this.f34876k = i6;
            if (i6 > i3) {
                m12882l();
            }
            this.f34875j = m12885o() + ((long) this.f34876k);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final long m12888r(a54 a54Var) {
        long j = a54Var.f116a;
        if (j >= m12885o() + ((long) this.f34876k) && (this.f34871f > 0 || j > m12885o() || this.f34877l == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: s */
    public final Object m12889s(a54 a54Var) {
        Object obj;
        wm0[] wm0VarArrM12891u = AbstractC1356y5.f34878a;
        synchronized (this) {
            try {
                long jM12888r = m12888r(a54Var);
                if (jM12888r < 0) {
                    obj = z44.f35748a;
                } else {
                    long j = a54Var.f116a;
                    Object[] objArr = this.f34873h;
                    Object obj2 = objArr[((int) jM12888r) & (objArr.length - 1)];
                    if (obj2 instanceof w44) {
                        obj2 = ((w44) obj2).f33094c;
                    }
                    a54Var.f116a = jM12888r + 1;
                    Object obj3 = obj2;
                    wm0VarArrM12891u = m12891u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (wm0 wm0Var : wm0VarArrM12891u) {
            if (wm0Var != null) {
                wm0Var.resumeWith(ju4.f22634a);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: t */
    public final void m12890t(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM12885o = m12885o(); jM12885o < jMin; jM12885o++) {
            z44.m13334d(this.f34873h, jM12885o, null);
        }
        this.f34874i = j;
        this.f34875j = j2;
        this.f34876k = (int) (j3 - jMin);
        this.f34877l = (int) (j4 - j3);
    }

    /* JADX INFO: renamed from: u */
    public final wm0[] m12891u(long j) {
        int i;
        long j2;
        wm0[] wm0VarArr;
        wm0[] wm0VarArr2;
        AbstractC1093r2[] abstractC1093r2Arr;
        wm0[] wm0VarArr3 = AbstractC1356y5.f34878a;
        if (j <= this.f34875j) {
            long jM12885o = m12885o();
            long j3 = ((long) this.f34876k) + jM12885o;
            int i2 = this.f34871f;
            if (i2 == 0 && this.f34877l > 0) {
                j3++;
            }
            int i3 = 0;
            if (this.f28151b != 0 && (abstractC1093r2Arr = this.f28150a) != null) {
                for (AbstractC1093r2 abstractC1093r2 : abstractC1093r2Arr) {
                    if (abstractC1093r2 != null) {
                        long j4 = ((a54) abstractC1093r2).f116a;
                        if (0 <= j4 && j4 < j3) {
                            j3 = j4;
                        }
                    }
                }
            }
            if (j3 > this.f34875j) {
                long jM12885o2 = m12885o() + ((long) this.f34876k);
                int i4 = this.f28151b;
                int iMin = this.f34877l;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jM12885o2 - j3)));
                }
                long j5 = ((long) this.f34877l) + jM12885o2;
                C0641f8 c0641f8 = z44.f35748a;
                if (iMin > 0) {
                    wm0[] wm0VarArr4 = new wm0[iMin];
                    j2 = 1;
                    Object[] objArr = this.f34873h;
                    long j6 = jM12885o2;
                    while (true) {
                        if (jM12885o2 >= j5) {
                            wm0VarArr2 = wm0VarArr4;
                            i = i2;
                            break;
                        }
                        wm0VarArr2 = wm0VarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jM12885o2)];
                        if (obj != c0641f8) {
                            w44 w44Var = (w44) obj;
                            int i5 = i3 + 1;
                            i = i2;
                            wm0VarArr2[i3] = w44Var.f33095d;
                            z44.m13334d(objArr, jM12885o2, c0641f8);
                            z44.m13334d(objArr, j6, w44Var.f33094c);
                            j6++;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                        }
                        jM12885o2++;
                        wm0VarArr4 = wm0VarArr2;
                        i2 = i;
                    }
                    jM12885o2 = j6;
                    wm0VarArr = wm0VarArr2;
                } else {
                    i = i2;
                    j2 = 1;
                    wm0VarArr = wm0VarArr3;
                }
                long jMax = Math.max(this.f34874i, Math.max(jM12885o, jM12885o2 - ((long) this.f34870e)));
                if (i == 0 && jMax < j5) {
                    Object[] objArr2 = this.f34873h;
                    if (z62.m13387o(objArr2[((int) jMax) & (objArr2.length - 1)], c0641f8)) {
                        jM12885o2 += j2;
                        jMax += j2;
                    }
                }
                long j7 = jM12885o2;
                m12890t(jMax, this.f28151b == 0 ? j7 : j3, j7, j5);
                m12881j();
                return wm0VarArr.length == 0 ? wm0VarArr : m12884n(wm0VarArr);
            }
        }
        return wm0VarArr3;
    }
}
