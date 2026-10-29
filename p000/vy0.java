package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 extends jc4 {

    /* JADX INFO: renamed from: h */
    public static final Object f32926h = new Object();

    /* JADX INFO: renamed from: c */
    public long f32927c;

    /* JADX INFO: renamed from: d */
    public int f32928d;

    /* JADX INFO: renamed from: e */
    public yv2 f32929e;

    /* JADX INFO: renamed from: f */
    public Object f32930f;

    /* JADX INFO: renamed from: g */
    public int f32931g;

    public vy0(long j) {
        super(j);
        this.f32929e = p23.f27324a;
        this.f32930f = f32926h;
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: a */
    public final void mo4439a(jc4 jc4Var) {
        vy0 vy0Var = (vy0) jc4Var;
        this.f32929e = vy0Var.f32929e;
        this.f32930f = vy0Var.f32930f;
        this.f32931g = vy0Var.f32931g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12017c(wy0 wy0Var, e94 e94Var) {
        boolean z;
        boolean z2;
        Object obj = k94.f23012c;
        synchronized (obj) {
            z = true;
            z2 = (this.f32927c == e94Var.mo5015g() && this.f32928d == e94Var.mo5016h()) ? false : true;
        }
        if (this.f32930f == f32926h || (z2 && this.f32931g != m12018d(wy0Var, e94Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.f32927c = e94Var.mo5015g();
            this.f32928d = e94Var.mo5016h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[LOOP:5: B:62:0x014a->B:63:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [vy0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [jc4] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, jc4] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX INFO: renamed from: d */
    public final int m12018d(wy0 wy0Var, e94 e94Var) {
        yv2 yv2Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j;
        long j2;
        int i4;
        ?? r26;
        ?? M7450g;
        synchronized (k94.f23012c) {
            yv2Var = this.f32929e;
        }
        int i5 = 7;
        if (yv2Var.f35551e == 0) {
            return 7;
        }
        uw2 uw2VarM10565a = s94.m10565a();
        Object[] objArr4 = uw2VarM10565a.f32211a;
        int i6 = uw2VarM10565a.f32213c;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((hr1) objArr4[i7]).m6476b();
        }
        try {
            Object[] objArr5 = yv2Var.f35548b;
            int[] iArr = yv2Var.f35549c;
            long[] jArr3 = yv2Var.f35547a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i3 = i5;
                        ?? r3 = z;
                        while (r3 < i10) {
                            if ((j3 & 255) < 128) {
                                ?? r18 = (i8 << 3) + r3;
                                j2 = j4;
                                hc4 hc4Var = (hc4) objArr5[r18];
                                int i11 = i9;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr3 = objArr5;
                                    j = j3;
                                } else {
                                    if (hc4Var instanceof wy0) {
                                        wy0 wy0Var2 = (wy0) hc4Var;
                                        M7450g = wy0Var2.m12438h((vy0) k94.m7450g(wy0Var2.f33848d, e94Var), e94Var, z, wy0Var2.f33846b);
                                        yv2 yv2Var2 = M7450g.f32929e;
                                        Object[] objArr6 = yv2Var2.f35548b;
                                        long[] jArr4 = yv2Var2.f35547a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j5 = jArr4[i12];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i3) & j5 & j2) == j2) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                } else {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((hc4) objArr6[(i12 << 3) + i14]);
                                                        }
                                                        j5 >>= i11;
                                                    }
                                                    if (i13 != i11) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        j = j3;
                                        M7450g = k94.m7450g(hc4Var.mo128a(), e94Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(M7450g)) * 31) + Long.hashCode(M7450g.f22164a);
                                    r25 = r26;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr3 = objArr5;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr5 = objArr3;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = i5;
                        objArr2 = objArr5;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z = false;
                    } else {
                        i5 = iIdentityHashCode;
                    }
                }
                objArr = uw2VarM10565a.f32211a;
                i = uw2VarM10565a.f32213c;
                for (i2 = 0; i2 < i; i2++) {
                    ((hr1) objArr[i2]).m6475a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i5;
            objArr = uw2VarM10565a.f32211a;
            i = uw2VarM10565a.f32213c;
            while (i2 < i) {
                ((hr1) objArr[i2]).m6475a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = uw2VarM10565a.f32211a;
            int i15 = uw2VarM10565a.f32213c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((hr1) objArr7[i16]).m6475a();
            }
            throw th;
        }
    }
}
