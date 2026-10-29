package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wy0 extends ic4 implements xb4 {

    /* JADX INFO: renamed from: b */
    public final wp1 f33846b;

    /* JADX INFO: renamed from: c */
    public final r94 f33847c;

    /* JADX INFO: renamed from: d */
    public vy0 f33848d = new vy0(k94.m7451h().mo5015g());

    public wy0(wp1 wp1Var, r94 r94Var) {
        this.f33846b = wp1Var;
        this.f33847c = r94Var;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f33848d;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        this.f33848d = (vy0) jc4Var;
    }

    @Override // p000.xb4
    public final Object getValue() {
        yp1 yp1VarMo3783e = k94.m7451h().mo3783e();
        if (yp1VarMo3783e != null) {
            yp1VarMo3783e.invoke(this);
        }
        e94 e94VarM7451h = k94.m7451h();
        return m12438h((vy0) k94.m7450g(this.f33848d, e94VarM7451h), e94VarM7451h, true, this.f33846b).f32930f;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x009c A[EDGE_INSN: B:108:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:102:0x0023 }] */
    /* JADX INFO: renamed from: h */
    public final vy0 m12438h(vy0 vy0Var, e94 e94Var, boolean z, wp1 wp1Var) throws Throwable {
        byte b;
        r94 r94Var;
        int i;
        vy0 vy0Var2 = vy0Var;
        if (vy0Var2.m12017c(this, e94Var)) {
            if (z) {
                uw2 uw2VarM10565a = s94.m10565a();
                Object[] objArr = uw2VarM10565a.f32211a;
                int i2 = uw2VarM10565a.f32213c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((hr1) objArr[i3]).m6476b();
                }
                try {
                    yv2 yv2Var = vy0Var2.f32929e;
                    tt2 tt2Var = s94.f30014a;
                    t52 t52Var = (t52) tt2Var.get();
                    if (t52Var == null) {
                        t52Var = new t52();
                        tt2Var.m11143B(t52Var);
                    }
                    int i4 = t52Var.f30789a;
                    Object[] objArr2 = yv2Var.f35548b;
                    int[] iArr = yv2Var.f35549c;
                    long[] jArr = yv2Var.f35547a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        hc4 hc4Var = (hc4) objArr2[i9];
                                        i = i6;
                                        t52Var.f30789a = i4 + iArr[i9];
                                        yp1 yp1VarMo3783e = e94Var.mo3783e();
                                        if (yp1VarMo3783e != null) {
                                            yp1VarMo3783e.invoke(hc4Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    t52Var.f30789a = i4;
                } finally {
                    Object[] objArr3 = uw2VarM10565a.f32211a;
                    int i10 = uw2VarM10565a.f32213c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((hr1) objArr3[i11]).m6475a();
                    }
                }
            }
            return vy0Var2;
        }
        yv2 yv2Var2 = new yv2();
        tt2 tt2Var2 = s94.f30014a;
        t52 t52Var2 = (t52) tt2Var2.get();
        if (t52Var2 == null) {
            t52Var2 = new t52();
            tt2Var2.m11143B(t52Var2);
        }
        int i12 = t52Var2.f30789a;
        uw2 uw2VarM10565a2 = s94.m10565a();
        Object[] objArr4 = uw2VarM10565a2.f32211a;
        int i13 = uw2VarM10565a2.f32213c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((hr1) objArr4[i14]).m6476b();
        }
        try {
            t52Var2.f30789a = i12 + 1;
            b = 0;
            try {
                uy0 uy0Var = new uy0(b);
                uy0Var.f32249c = this;
                uy0Var.f32250d = t52Var2;
                uy0Var.f32251e = yv2Var2;
                uy0Var.f32248b = i12;
                VarHandle.storeStoreFence();
                Object objM5362l0 = ev0.m5362l0(uy0Var, wp1Var);
                t52Var2.f30789a = i12;
                Object[] objArr5 = uw2VarM10565a2.f32211a;
                int i15 = uw2VarM10565a2.f32213c;
                for (int i16 = 0; i16 < i15; i16++) {
                    ((hr1) objArr5[i16]).m6475a();
                }
                Object obj = k94.f23012c;
                synchronized (obj) {
                    try {
                        e94 e94VarM7451h = k94.m7451h();
                        Object obj2 = vy0Var2.f32930f;
                        if (obj2 == vy0.f32926h || (r94Var = this.f33847c) == null || !r94Var.mo6713d(objM5362l0, obj2)) {
                            vy0 vy0Var3 = this.f33848d;
                            synchronized (obj) {
                                jc4 jc4VarM7454k = k94.m7454k(vy0Var3, this);
                                jc4VarM7454k.mo4439a(vy0Var3);
                                jc4VarM7454k.f22164a = e94VarM7451h.mo5015g();
                                vy0Var2 = (vy0) jc4VarM7454k;
                                vy0Var2.f32929e = yv2Var2;
                                vy0Var2.f32931g = vy0Var2.m12018d(this, e94VarM7451h);
                                vy0Var2.f32930f = objM5362l0;
                            }
                            return vy0Var2;
                        }
                        vy0Var2.f32929e = yv2Var2;
                        vy0Var2.f32931g = vy0Var2.m12018d(this, e94VarM7451h);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                t52 t52Var3 = (t52) s94.f30014a.get();
                if (t52Var3 == null || t52Var3.f30789a != 0) {
                    return vy0Var2;
                }
                k94.m7451h().mo5021m();
                synchronized (obj) {
                    e94 e94VarM7451h2 = k94.m7451h();
                    vy0Var2.f32927c = e94VarM7451h2.mo5015g();
                    vy0Var2.f32928d = e94VarM7451h2.mo5016h();
                    return vy0Var2;
                }
            } catch (Throwable th2) {
                th = th2;
                Object[] objArr6 = uw2VarM10565a2.f32211a;
                int i17 = uw2VarM10565a2.f32213c;
                for (int i18 = b; i18 < i17; i18++) {
                    ((hr1) objArr6[i18]).m6475a();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b = 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public final vy0 m12439i() {
        e94 e94VarM7451h = k94.m7451h();
        return m12438h((vy0) k94.m7450g(this.f33848d, e94VarM7451h), e94VarM7451h, false, this.f33846b);
    }

    public final String toString() {
        vy0 vy0Var = (vy0) k94.m7449f(this.f33848d);
        return "DerivedState(value=" + (vy0Var.m12017c(this, k94.m7451h()) ? String.valueOf(vy0Var.f32930f) : "<Not calculated>") + ")@" + hashCode();
    }
}
