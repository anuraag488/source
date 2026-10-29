package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 implements zk3, ti0 {

    /* JADX INFO: renamed from: a */
    public final ui0 f36111a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0618en f36112b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f36113c = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final Object f36114d = new Object();

    /* JADX INFO: renamed from: e */
    public final pw2 f36115e;

    /* JADX INFO: renamed from: f */
    public final m84 f36116f;

    /* JADX INFO: renamed from: g */
    public final lw2 f36117g;

    /* JADX INFO: renamed from: h */
    public final mw2 f36118h;

    /* JADX INFO: renamed from: i */
    public final mw2 f36119i;

    /* JADX INFO: renamed from: j */
    public final lw2 f36120j;

    /* JADX INFO: renamed from: k */
    public final y70 f36121k;

    /* JADX INFO: renamed from: l */
    public final y70 f36122l;

    /* JADX INFO: renamed from: m */
    public final lw2 f36123m;

    /* JADX INFO: renamed from: n */
    public lw2 f36124n;

    /* JADX INFO: renamed from: o */
    public boolean f36125o;

    /* JADX INFO: renamed from: p */
    public o64 f36126p;

    /* JADX INFO: renamed from: q */
    public n93 f36127q;

    /* JADX INFO: renamed from: r */
    public zi0 f36128r;

    /* JADX INFO: renamed from: s */
    public int f36129s;

    /* JADX INFO: renamed from: t */
    public final ar3 f36130t;

    /* JADX INFO: renamed from: u */
    public final om3 f36131u;

    /* JADX INFO: renamed from: v */
    public final ir1 f36132v;

    /* JADX INFO: renamed from: w */
    public byte f36133w;

    public zi0(ui0 ui0Var, InterfaceC0618en interfaceC0618en) {
        this.f36111a = ui0Var;
        this.f36112b = interfaceC0618en;
        mw2 mw2Var = new mw2();
        pw2 pw2Var = mw2Var.f25261e;
        if (pw2Var == null) {
            pw2Var = new pw2();
            pw2Var.f28048a = mw2Var;
            pw2Var.f28049b = mw2Var;
            VarHandle.storeStoreFence();
            mw2Var.f25261e = pw2Var;
        }
        this.f36115e = pw2Var;
        m84 m84Var = new m84();
        if (ui0Var.mo6109e()) {
            m84Var.f24743k = new lv2();
        }
        if (ui0Var.mo6111g()) {
            m84Var.m8228b();
        }
        this.f36116f = m84Var;
        this.f36117g = dt0.m4723y();
        this.f36118h = new mw2();
        this.f36119i = new mw2();
        this.f36120j = dt0.m4723y();
        y70 y70Var = new y70();
        this.f36121k = y70Var;
        y70 y70Var2 = new y70();
        this.f36122l = y70Var2;
        this.f36123m = dt0.m4723y();
        this.f36124n = dt0.m4723y();
        ar3 ar3Var = new ar3((byte) 15);
        ar3Var.f14813b = ui0Var;
        VarHandle.storeStoreFence();
        this.f36130t = ar3Var;
        this.f36131u = new om3();
        m84 m84VarM8980a = o84.m8980a(m84Var);
        ir1 ir1Var = new ir1();
        ir1Var.f21685a = interfaceC0618en;
        ir1Var.f21686b = ui0Var;
        ir1Var.f21687c = m84VarM8980a;
        ir1Var.f21688d = pw2Var;
        ir1Var.f21689e = y70Var;
        ir1Var.f21690f = y70Var2;
        ir1Var.f21691g = ar3Var;
        ir1Var.f21692h = this;
        ir1Var.f21693i = new ArrayList();
        ir1Var.f21698n = new x52();
        ir1Var.f21703s = new ArrayList();
        ir1Var.f21704t = new x52();
        ir1Var.f21705u = ga3.f19690d;
        ir1Var.f21708x = new x52();
        ir1Var.f21710z = -1;
        byte b = 0;
        ir1Var.f21666C = ui0Var.mo6111g() || ui0Var.mo6109e();
        hr1 hr1Var = new hr1(b);
        hr1Var.f20805b = ir1Var;
        VarHandle.storeStoreFence();
        ir1Var.f21667D = hr1Var;
        ir1Var.f21668E = new ArrayList();
        l84 l84VarM8230e = m84VarM8980a.m8230e();
        l84VarM8230e.m7847c();
        ir1Var.f21670G = l84VarM8230e;
        m84 m84Var2 = new m84();
        if (ui0Var.mo6111g()) {
            m84Var2.m8228b();
        }
        if (ui0Var.mo6109e()) {
            m84Var2.f24743k = new lv2();
        }
        ir1Var.f21671H = m84Var2;
        p84 p84VarM8231l = m84Var2.m8231l();
        p84VarM8231l.m9417e(true);
        ir1Var.f21672I = p84VarM8231l;
        ni0 ni0Var = new ni0();
        ni0Var.f25830a = ir1Var;
        ni0Var.f25831b = y70Var;
        ni0Var.f25833d = new x52();
        ni0Var.f25834e = true;
        ni0Var.f25837h = new ArrayList();
        ni0Var.f25838i = -1;
        ni0Var.f25839j = -1;
        ni0Var.f25840k = -1;
        VarHandle.storeStoreFence();
        ir1Var.f21676M = ni0Var;
        l84 l84VarM8230e2 = ir1Var.f21671H.m8230e();
        try {
            cr1 cr1VarM7845a = l84VarM8230e2.m7845a(0);
            l84VarM8230e2.m7847c();
            ir1Var.f21677N = cr1VarM7845a;
            ir1Var.f21678O = new rh1();
            xi0 xi0Var = new xi0();
            xi0Var.f34299a = ir1Var;
            VarHandle.storeStoreFence();
            ir1Var.f21680Q = xi0Var;
            ro0 ro0VarMo5182k = ui0Var.mo5182k();
            ro0 ro0VarM6857C = ir1Var.m6857C();
            ir1Var.f21681R = ro0VarMo5182k.plus(ro0VarM6857C == null ? r71.f29063a : ro0VarM6857C);
            VarHandle.storeStoreFence();
            ui0Var.mo6117s(ir1Var);
            this.f36132v = ir1Var;
        } catch (Throwable th) {
            l84VarM8230e2.m7847c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    public final void m13572A(Object obj) {
        synchronized (this.f36114d) {
            try {
                m13592w(obj);
                Object objM8132g = this.f36120j.m8132g(obj);
                if (objM8132g != null) {
                    if (objM8132g instanceof mw2) {
                        mw2 mw2Var = (mw2) objM8132g;
                        Object[] objArr = mw2Var.f25258b;
                        long[] jArr = mw2Var.f25257a;
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
                                            m13592w((wy0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        m13592w((wy0) objM8132g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m13573B(mq1 mq1Var) {
        boolean zM13582m = m13582m();
        m13589t();
        ui0 ui0Var = this.f36111a;
        if (!zM13582m) {
            ui0Var.mo5179a(this, mq1Var);
            return;
        }
        ir1 ir1Var = this.f36132v;
        ir1Var.f21710z = 0;
        ir1Var.f21709y = true;
        ui0Var.mo5179a(this, mq1Var);
        if (ir1Var.f21669F || ir1Var.f21710z != 0) {
            kd3.m7502a("Cannot disable reuse from root if it was caused by other groups");
        }
        ir1Var.f21710z = -1;
        ir1Var.f21709y = false;
    }

    @Override // p000.ti0
    /* JADX INFO: renamed from: a */
    public final void mo8488a() {
        synchronized (this.f36114d) {
            try {
                if (this.f36132v.f21669F) {
                    kd3.m7503b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f36133w != 3) {
                    this.f36133w = (byte) 3;
                    y70 y70Var = this.f36132v.f21675L;
                    if (y70Var != null) {
                        m13578h(y70Var);
                    }
                    boolean z = this.f36116f.f24734b == 0;
                    if (!z || !this.f36115e.f28048a.m8415g()) {
                        om3 om3Var = this.f36131u;
                        try {
                            om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                            if (!z) {
                                this.f36112b.getClass();
                                m84 m84Var = this.f36116f;
                                om3 om3Var2 = this.f36131u;
                                p84 p84VarM8231l = m84Var.m8231l();
                                try {
                                    qi0.m9892d(p84VarM8231l, om3Var2);
                                    p84VarM8231l.m9417e(true);
                                    this.f36112b.clear();
                                    this.f36112b.mo5208l();
                                    om3Var.m9186c();
                                } catch (Throwable th) {
                                    p84VarM8231l.m9417e(false);
                                    throw th;
                                }
                            }
                            om3Var.m9185b();
                            om3Var.m9184a();
                        } catch (Throwable th2) {
                            om3Var.m9184a();
                            throw th2;
                        }
                    }
                    this.f36123m.m8126a();
                    ir1 ir1Var = this.f36132v;
                    ir1Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        ir1Var.f21686b.mo6119x(ir1Var);
                        ir1Var.f21668E.clear();
                        ir1Var.f21703s.clear();
                        ir1Var.f21689e.f34991a.m12491U();
                        ir1Var.f21706v = null;
                        ir1Var.f21685a.clear();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f36111a.mo5191y(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m13574b() {
        this.f36113c.set(null);
        this.f36121k.f34991a.m12491U();
        this.f36122l.f34991a.m12491U();
        pw2 pw2Var = this.f36115e;
        if (pw2Var.f28048a.m8415g()) {
            return;
        }
        om3 om3Var = this.f36131u;
        try {
            om3Var.m9189g(pw2Var, this.f36132v.m6857C());
            om3Var.m9185b();
        } finally {
            om3Var.m9184a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13575c(Object obj, boolean z) {
        Object objM8132g = this.f36117g.m8132g(obj);
        if (objM8132g == null) {
            return;
        }
        boolean z2 = objM8132g instanceof mw2;
        mw2 mw2Var = this.f36118h;
        mw2 mw2Var2 = this.f36119i;
        lw2 lw2Var = this.f36123m;
        if (!z2) {
            yk3 yk3Var = (yk3) objM8132g;
            if (dt0.m4689R(lw2Var, obj, yk3Var) || yk3Var.m13153b(obj) == m72.f24705a) {
                return;
            }
            if (yk3Var.f35303g == null || z) {
                mw2Var.m8409a(yk3Var);
                return;
            } else {
                mw2Var2.m8409a(yk3Var);
                return;
            }
        }
        mw2 mw2Var3 = (mw2) objM8132g;
        Object[] objArr = mw2Var3.f25258b;
        long[] jArr = mw2Var3.f25257a;
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
                        yk3 yk3Var2 = (yk3) objArr[(i << 3) + i3];
                        if (!dt0.m4689R(lw2Var, obj, yk3Var2) && yk3Var2.m13153b(obj) != m72.f24705a) {
                            if (yk3Var2.f35303g == null || z) {
                                mw2Var.m8409a(yk3Var2);
                            } else {
                                mw2Var2.m8409a(yk3Var2);
                            }
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

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public final void m13576d(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM8411c;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zM8415g;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof vv3;
        lw2 lw2Var = this.f36120j;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            mw2 mw2Var = ((vv3) set).f32888a;
            Object[] objArr = mw2Var.f25258b;
            long[] jArr9 = mw2Var.f25257a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof yk3) {
                                    ((yk3) obj2).m13153b(obj);
                                } else {
                                    m13575c(obj2, z);
                                    Object objM8132g = lw2Var.m8132g(obj2);
                                    if (objM8132g != null) {
                                        if (objM8132g instanceof mw2) {
                                            mw2 mw2Var2 = (mw2) objM8132g;
                                            Object[] objArr2 = mw2Var2.f25258b;
                                            long[] jArr10 = mw2Var2.f25257a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                m13575c((wy0) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            m13575c((wy0) objM8132g, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof yk3) {
                    ((yk3) obj3).m13153b(null);
                } else {
                    m13575c(obj3, z);
                    Object objM8132g2 = lw2Var.m8132g(obj3);
                    if (objM8132g2 != null) {
                        if (objM8132g2 instanceof mw2) {
                            mw2 mw2Var3 = (mw2) objM8132g2;
                            Object[] objArr3 = mw2Var3.f25258b;
                            long[] jArr12 = mw2Var3.f25257a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                m13575c((wy0) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            m13575c((wy0) objM8132g2, z);
                        }
                    }
                }
            }
        }
        lw2 lw2Var2 = this.f36117g;
        mw2 mw2Var4 = this.f36118h;
        if (z) {
            mw2 mw2Var5 = this.f36119i;
            if (mw2Var5.m8416h()) {
                long[] jArr13 = lw2Var2.f24418a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = lw2Var2.f24419b[i18];
                                    Object obj5 = lw2Var2.f24420c[i18];
                                    if (obj5 instanceof mw2) {
                                        mw2 mw2Var6 = (mw2) obj5;
                                        Object[] objArr4 = mw2Var6.f25258b;
                                        long[] jArr14 = mw2Var6.f25257a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            yk3 yk3Var = (yk3) objArr5[i22];
                                                            if (mw2Var5.m8411c(yk3Var) || mw2Var4.m8411c(yk3Var)) {
                                                                mw2Var6.m8421m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zM8415g = mw2Var6.m8415g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        yk3 yk3Var2 = (yk3) obj5;
                                        zM8415g = mw2Var5.m8411c(yk3Var2) || mw2Var4.m8411c(yk3Var2);
                                    }
                                    if (zM8415g) {
                                        lw2Var2.m8137l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                mw2Var5.m8410b();
                m13581l();
                return;
            }
        }
        if (mw2Var4.m8416h()) {
            long[] jArr16 = lw2Var2.f24418a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = lw2Var2.f24419b[i26];
                                Object obj7 = lw2Var2.f24420c[i26];
                                if (obj7 instanceof mw2) {
                                    mw2 mw2Var7 = (mw2) obj7;
                                    Object[] objArr6 = mw2Var7.f25258b;
                                    long[] jArr17 = mw2Var7.f25257a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (mw2Var4.m8411c((yk3) objArr7[i30])) {
                                                            mw2Var7.m8421m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zM8411c = mw2Var7.m8415g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    zM8411c = mw2Var4.m8411c((yk3) obj7);
                                }
                                if (zM8411c) {
                                    lw2Var2.m8137l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            m13581l();
            mw2Var4.m8410b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13577e() {
        synchronized (this.f36114d) {
            try {
                m13578h(this.f36121k);
                m13587r();
            } catch (Throwable th) {
                try {
                    if (!this.f36115e.f28048a.m8415g()) {
                        om3 om3Var = this.f36131u;
                        try {
                            om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                            om3Var.m9185b();
                        } finally {
                            om3Var.m9184a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m13574b();
                    throw th2;
                }
            }
        }
    }

    @Override // p000.zk3
    /* JADX INFO: renamed from: f */
    public final m72 mo13320f(yk3 yk3Var, Object obj) {
        zi0 zi0Var;
        int i = yk3Var.f35298b;
        if ((i & 2) != 0) {
            yk3Var.f35298b = i | 4;
        }
        cr1 cr1Var = yk3Var.f35299c;
        if (cr1Var == null || !cr1Var.m4142a()) {
            return m72.f24705a;
        }
        m84 m84Var = this.f36116f;
        m84Var.getClass();
        cr1 cr1Var2 = yk3Var.f35299c;
        if (cr1Var2 != null && m84Var.m8232m(AbstractC1356y5.m12917k(cr1Var2))) {
            if (yk3Var.f35300d == null) {
                return m72.f24705a;
            }
            m72 m72VarM13591v = m13591v(yk3Var, cr1Var, obj);
            if (m72VarM13591v != m72.f24705a) {
                this.f36130t.m3145m();
            }
            return m72VarM13591v;
        }
        synchronized (this.f36114d) {
            zi0Var = this.f36128r;
        }
        if (zi0Var != null) {
            ir1 ir1Var = zi0Var.f36132v;
            if (ir1Var.f21669F && ir1Var.m6897j0(yk3Var, obj)) {
                return m72.f24708d;
            }
        }
        return m72.f24705a;
    }

    @Override // p000.zk3
    /* JADX INFO: renamed from: g */
    public final void mo13321g() {
        this.f36125o = true;
        this.f36130t.m3145m();
    }

    /* JADX WARN: Code duplicated, block: B:164:0x013d A[EDGE_INSN: B:164:0x013d->B:82:0x013d BREAK  A[LOOP:2: B:146:0x00f0->B:80:0x0133], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0133 A[Catch: all -> 0x0123, LOOP:2: B:146:0x00f0->B:80:0x0133, LOOP_END, TryCatch #4 {all -> 0x0123, blocks: (B:64:0x00f0, B:66:0x00ff, B:68:0x0109, B:70:0x010f, B:72:0x011f, B:76:0x0128, B:82:0x013d, B:90:0x015c, B:93:0x016f, B:80:0x0133, B:85:0x0147, B:99:0x018d, B:101:0x0199), top: B:146:0x00f0 }] */
    /* JADX INFO: renamed from: h */
    public final void m13578h(y70 y70Var) throws Throwable {
        InterfaceC0618en interfaceC0618en;
        om3 om3Var;
        om3 om3Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        om3 om3Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM8415g;
        long j3;
        y70 y70Var2 = this.f36122l;
        ir1 ir1Var = this.f36132v;
        xi0 xi0VarM6857C = ir1Var.m6857C();
        om3 om3Var4 = this.f36131u;
        om3Var4.m9189g(this.f36115e, xi0VarM6857C);
        try {
            if (y70Var.f34991a.m12493W()) {
                try {
                    if (y70Var2.f34991a.m12493W() && this.f36127q == null) {
                        om3Var4.m9185b();
                    }
                    return;
                } finally {
                    om3Var4.m9184a();
                }
            }
            n93 n93Var = this.f36127q;
            if (n93Var == null || (interfaceC0618en = n93Var.f25578l) == null) {
                interfaceC0618en = this.f36112b;
            }
            try {
                Trace.beginSection(z62.m13387o(interfaceC0618en, n93Var != null ? n93Var.f25578l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    n93 n93Var2 = this.f36127q;
                    if (n93Var2 == null || (om3Var = n93Var2.f25577k) == null) {
                        om3Var = om3Var4;
                    }
                    interfaceC0618en.getClass();
                    m84 m84Var = this.f36116f;
                    xi0 xi0VarM6857C2 = ir1Var.m6857C();
                    p84 p84VarM8231l = o84.m8980a(m84Var).m8231l();
                    int i3 = 0;
                    try {
                        y70Var.m13046u(interfaceC0618en, p84VarM8231l, om3Var, xi0VarM6857C2);
                        p84VarM8231l.m9417e(true);
                        interfaceC0618en.mo5208l();
                        Trace.endSection();
                        om3Var4.m9186c();
                        om3Var4.m9187d();
                        if (this.f36125o) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f36125o = false;
                                lw2 lw2Var = this.f36117g;
                                long[] jArr3 = lw2Var.f24418a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = lw2Var.f24419b[i8];
                                                    Object obj2 = lw2Var.f24420c[i8];
                                                    if (obj2 instanceof mw2) {
                                                        mw2 mw2Var = (mw2) obj2;
                                                        Object[] objArr = mw2Var.f25258b;
                                                        long[] jArr4 = mw2Var.f25257a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        om3Var3 = om3Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((yk3) objArr[i13]).m13152a()) {
                                                                                    mw2Var.m8421m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zM8415g = mw2Var.m8415g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        om3Var3 = om3Var4;
                                                        j = j4;
                                                        zM8415g = !((yk3) obj2).m13152a();
                                                    }
                                                    if (zM8415g) {
                                                        lw2Var.m8137l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    om3Var3 = om3Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                om3Var4 = om3Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            om3Var2 = om3Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            om3Var2 = om3Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        om3Var4 = om3Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    om3Var2 = om3Var4;
                                }
                                m13581l();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            om3Var2 = om3Var4;
                        }
                        try {
                            if (y70Var2.f34991a.m12493W() && this.f36127q == null) {
                                om3Var2.m9185b();
                            }
                            return;
                        } finally {
                            om3Var2.m9184a();
                        }
                    } catch (Throwable th3) {
                        try {
                            p84VarM8231l.m9417e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (y70Var2.f34991a.m12493W() && this.f36127q == null) {
                om3Var4.m9185b();
            }
            throw th;
        } finally {
            om3Var4.m9184a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13579i() {
        synchronized (this.f36114d) {
            try {
                y70 y70Var = this.f36122l;
                y70Var.getClass();
                if (!y70Var.f34991a.m12493W()) {
                    m13578h(this.f36122l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f36115e.f28048a.m8415g()) {
                        om3 om3Var = this.f36131u;
                        try {
                            om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                            om3Var.m9185b();
                        } finally {
                            om3Var.m9184a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m13574b();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13580j() {
        synchronized (this.f36114d) {
            try {
                this.f36132v.f21706v = null;
                if (!this.f36115e.f28048a.m8415g()) {
                    om3 om3Var = this.f36131u;
                    try {
                        om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                        om3Var.m9185b();
                        om3Var.m9184a();
                    } catch (Throwable th) {
                        om3Var.m9184a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f36115e.f28048a.m8415g()) {
                        om3 om3Var2 = this.f36131u;
                        try {
                            om3Var2.m9189g(this.f36115e, this.f36132v.m6857C());
                            om3Var2.m9185b();
                        } finally {
                            om3Var2.m9184a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    m13574b();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p000.zk3
    /* JADX INFO: renamed from: k */
    public final void mo13322k(Object obj) {
        yk3 yk3VarM6855A;
        int i;
        boolean z;
        ir1 ir1Var = this.f36132v;
        if (ir1Var.f21664A <= 0 && (yk3VarM6855A = ir1Var.m6855A()) != null) {
            int i2 = yk3VarM6855A.f35298b | 1;
            yk3VarM6855A.f35298b = i2;
            if ((i2 & 32) == 0) {
                yv2 yv2Var = yk3VarM6855A.f35302f;
                if (yv2Var == null) {
                    yv2Var = new yv2();
                    yk3VarM6855A.f35302f = yv2Var;
                }
                int i3 = yk3VarM6855A.f35301e;
                int iM13259c = yv2Var.m13259c(obj);
                if (iM13259c < 0) {
                    iM13259c = ~iM13259c;
                    i = -1;
                } else {
                    i = yv2Var.f35549c[iM13259c];
                }
                yv2Var.f35548b[iM13259c] = obj;
                yv2Var.f35549c[iM13259c] = i3;
                if (i == yk3VarM6855A.f35301e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.f36130t.m3145m();
            if (z) {
                return;
            }
            if (obj instanceof ic4) {
                ((ic4) obj).m6750g(1);
            }
            dt0.m4713o(this.f36117g, obj, yk3VarM6855A);
            if (obj instanceof wy0) {
                wy0 wy0Var = (wy0) obj;
                vy0 vy0VarM12439i = wy0Var.m12439i();
                lw2 lw2Var = this.f36120j;
                dt0.m4690S(lw2Var, obj);
                yv2 yv2Var2 = vy0VarM12439i.f32929e;
                Object[] objArr = yv2Var2.f35548b;
                long[] jArr = yv2Var2.f35547a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    hc4 hc4Var = (hc4) objArr[(i4 << 3) + i7];
                                    if (hc4Var instanceof ic4) {
                                        ((ic4) hc4Var).m6750g(1);
                                    }
                                    dt0.m4713o(lw2Var, hc4Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = vy0VarM12439i.f32930f;
                lw2 lw2Var2 = yk3VarM6855A.f35303g;
                if (lw2Var2 == null) {
                    lw2Var2 = new lw2();
                    yk3VarM6855A.f35303g = lw2Var2;
                }
                lw2Var2.m8138m(wy0Var, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m13581l() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zM8415g;
        int i4;
        int i5;
        lw2 lw2Var = this.f36120j;
        long[] jArr3 = lw2Var.f24418a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = lw2Var.f24419b[i10];
                            Object obj2 = lw2Var.f24420c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof mw2;
                            j5 = j8;
                            lw2 lw2Var2 = this.f36117g;
                            if (z) {
                                mw2 mw2Var = (mw2) obj2;
                                Object[] objArr = mw2Var.f25258b;
                                long[] jArr4 = mw2Var.f25257a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!lw2Var2.m8128c((wy0) objArr[i15])) {
                                                        mw2Var.m8421m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zM8415g = mw2Var.m8415g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                zM8415g = !lw2Var2.m8128c((wy0) obj2);
                            }
                            if (zM8415g) {
                                lw2Var.m8137l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        mw2 mw2Var2 = this.f36119i;
        if (!mw2Var2.m8416h()) {
            return;
        }
        Object[] objArr2 = mw2Var2.f25258b;
        long[] jArr5 = mw2Var2.f25257a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((yk3) objArr2[i20]).f35303g == null) {
                            mw2Var2.m8421m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13582m() {
        boolean z;
        synchronized (this.f36114d) {
            z = true;
            if (this.f36133w != 1) {
                z = false;
            }
            if (z) {
                this.f36133w = (byte) 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final void m13583n(mq1 mq1Var) {
        try {
            synchronized (this.f36114d) {
                m13586q();
                lw2 lw2Var = this.f36124n;
                this.f36124n = dt0.m4723y();
                try {
                    ir1 ir1Var = this.f36132v;
                    o64 o64Var = this.f36126p;
                    if (!ir1Var.f21689e.f34991a.m12493W()) {
                        qi0.m9889a("Expected applyChanges() to have been called");
                    }
                    ir1Var.f21679P = o64Var;
                    try {
                        ir1Var.m6908p(lw2Var, mq1Var);
                        ir1Var.f21679P = null;
                    } catch (Throwable th) {
                        ir1Var.f21679P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f36124n = lw2Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f36115e.f28048a.m8415g()) {
                    om3 om3Var = this.f36131u;
                    try {
                        om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                        om3Var.m9185b();
                    } finally {
                        om3Var.m9184a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m13574b();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final n93 m13584o(boolean z, mq1 mq1Var) {
        if (this.f36127q != null) {
            kd3.m7503b("A pausable composition is in progress");
        }
        n93 n93Var = new n93();
        n93Var.f25567a = this;
        n93Var.f25568b = this.f36111a;
        ir1 ir1Var = this.f36132v;
        n93Var.f25569c = ir1Var;
        n93Var.f25570d = mq1Var;
        n93Var.f25571e = z;
        InterfaceC0618en interfaceC0618en = this.f36112b;
        n93Var.f25572f = interfaceC0618en;
        n93Var.f25573g = this.f36114d;
        n93Var.f25574h = new AtomicReference(p93.f27470c);
        n93Var.f25575i = oh6.m9110p();
        n93Var.f25576j = uv3.f32207a;
        om3 om3Var = new om3();
        om3Var.m9189g(this.f36115e, ir1Var.m6857C());
        n93Var.f25577k = om3Var;
        Object objMo4832n = interfaceC0618en.mo4832n();
        tt2 tt2Var = new tt2((byte) 5, false);
        tt2Var.f31428b = new kv2();
        tt2Var.f31429c = new cw2();
        tt2Var.f31430d = objMo4832n;
        VarHandle.storeStoreFence();
        n93Var.f25578l = tt2Var;
        VarHandle.storeStoreFence();
        this.f36127q = n93Var;
        return n93Var;
    }

    /* JADX INFO: renamed from: p */
    public final void m13585p() {
        synchronized (this.f36114d) {
            try {
                if (this.f36127q != null) {
                    kd3.m7503b("Deactivate is not supported while pausable composition is in progress");
                }
                byte b = 1;
                boolean z = this.f36116f.f24734b == 0;
                if (!z || !this.f36115e.f28048a.m8415g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        om3 om3Var = this.f36131u;
                        try {
                            om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                            if (!z) {
                                this.f36112b.getClass();
                                m84 m84Var = this.f36116f;
                                om3 om3Var2 = this.f36131u;
                                p84 p84VarM8231l = m84Var.m8231l();
                                try {
                                    int i = p84VarM8231l.f27452t;
                                    er1 er1Var = new er1(b);
                                    er1Var.f18412b = om3Var2;
                                    er1Var.f18413c = p84VarM8231l;
                                    VarHandle.storeStoreFence();
                                    p84VarM8231l.m9424m(i, er1Var);
                                    p84VarM8231l.m9417e(true);
                                    this.f36112b.mo5208l();
                                    om3Var.m9186c();
                                } catch (Throwable th) {
                                    p84VarM8231l.m9417e(false);
                                    throw th;
                                }
                            }
                            om3Var.m9185b();
                            om3Var.m9184a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            om3Var.m9184a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f36117g.m8126a();
                this.f36120j.m8126a();
                this.f36124n.m8126a();
                this.f36121k.f34991a.m12491U();
                this.f36122l.f34991a.m12491U();
                ir1 ir1Var = this.f36132v;
                ir1Var.f21668E.clear();
                ir1Var.f21703s.clear();
                ir1Var.f21689e.f34991a.m12491U();
                ir1Var.f21706v = null;
                this.f36133w = (byte) 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13586q() {
        Object obj = y62.f34945w;
        AtomicReference atomicReference = this.f36113c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                qi0.m9890b("pending composition has not been applied");
                xy4.m12794w();
                return;
            }
            if (andSet instanceof Set) {
                m13576d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                qi0.m9890b("corrupt pendingModifications drain: " + atomicReference);
                xy4.m12794w();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m13576d(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m13587r() {
        AtomicReference atomicReference = this.f36113c;
        Object andSet = atomicReference.getAndSet(null);
        if (z62.m13387o(andSet, y62.f34945w)) {
            return;
        }
        if (andSet instanceof Set) {
            m13576d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m13576d(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f36127q == null) {
                qi0.m9889a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            qi0.m9890b("corrupt pendingModifications drain: " + atomicReference);
            xy4.m12794w();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13588s() {
        b81 b81Var = b81.f15153a;
        AtomicReference atomicReference = this.f36113c;
        Object andSet = atomicReference.getAndSet(b81Var);
        if (z62.m13387o(andSet, y62.f34945w) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m13576d((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            qi0.m9890b("corrupt pendingModifications drain: " + atomicReference);
            xy4.m12794w();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m13576d(set, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13589t() {
        String str;
        byte b = this.f36133w;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            kd3.m7503b(str);
        }
        if (this.f36127q == null) {
            return;
        }
        kd3.m7503b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: u */
    public final void m13590u(ArrayList arrayList) {
        pw2 pw2Var = this.f36115e;
        ir1 ir1Var = this.f36132v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((uu2) ((l73) arrayList.get(i)).f23833a).f32181c != this) {
                qi0.m9889a("Check failed");
                break;
            }
        }
        try {
            ir1Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    ir1Var.m6859E(arrayList);
                    ir1Var.m6896j();
                    Trace.endSection();
                } catch (Throwable th) {
                    ir1Var.m6878a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!pw2Var.f28048a.m8415g()) {
                    om3 om3Var = this.f36131u;
                    try {
                        om3Var.m9189g(pw2Var, ir1Var.m6857C());
                        om3Var.m9185b();
                    } finally {
                        om3Var.m9184a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m13574b();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf A[Catch: all -> 0x0042, LOOP:0: B:48:0x0088->B:60:0x00bf, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0066, B:40:0x006c, B:41:0x0072, B:43:0x0078, B:45:0x007c, B:48:0x0088, B:50:0x0098, B:52:0x00a4, B:54:0x00ad, B:57:0x00b7, B:60:0x00bf, B:61:0x00c2, B:64:0x00c7), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[Catch: all -> 0x0042, EDGE_INSN: B:64:0x00c7->B:65:0x00cc BREAK  A[LOOP:0: B:48:0x0088->B:60:0x00bf], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0066, B:40:0x006c, B:41:0x0072, B:43:0x0078, B:45:0x007c, B:48:0x0088, B:50:0x0098, B:52:0x00a4, B:54:0x00ad, B:57:0x00b7, B:60:0x00bf, B:61:0x00c2, B:64:0x00c7), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final m72 m13591v(yk3 yk3Var, cr1 cr1Var, Object obj) {
        synchronized (this.f36114d) {
            try {
                zi0 zi0Var = this.f36128r;
                zi0 zi0Var2 = null;
                if (zi0Var != null) {
                    m84 m84Var = this.f36116f;
                    int i = this.f36129s;
                    if (m84Var.f24739g) {
                        qi0.m9889a("Writer is active");
                    }
                    if (i < 0 || i >= m84Var.f24734b) {
                        qi0.m9889a("Invalid group index");
                    }
                    cr1 cr1VarM12917k = AbstractC1356y5.m12917k(cr1Var);
                    if (m84Var.m8232m(cr1VarM12917k)) {
                        int iM8981b = o84.m8981b(m84Var.f24733a, i) + i;
                        int i2 = cr1VarM12917k.f16390a;
                        if (i > i2 || i2 >= iM8981b) {
                            zi0Var = null;
                        }
                    } else {
                        zi0Var = null;
                    }
                    zi0Var2 = zi0Var;
                }
                if (zi0Var2 == null) {
                    ir1 ir1Var = this.f36132v;
                    if (ir1Var.f21669F && ir1Var.m6897j0(yk3Var, obj)) {
                        return m72.f24708d;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof wy0;
                        lw2 lw2Var = this.f36124n;
                        if (z) {
                            Object objM8132g = lw2Var.m8132g(yk3Var);
                            if (objM8132g == null) {
                                dt0.m4713o(this.f36124n, yk3Var, obj);
                                break;
                            }
                            if (objM8132g instanceof mw2) {
                                mw2 mw2Var = (mw2) objM8132g;
                                Object[] objArr = mw2Var.f25258b;
                                long[] jArr = mw2Var.f25257a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    dt0.m4713o(this.f36124n, yk3Var, obj);
                                    break;
                                }
                                int i3 = 0;
                                loop0: while (true) {
                                    long j = jArr[i3];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j) < 128 && objArr[(i3 << 3) + i5] == ia5.f21229t) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i4 == 8) {
                                            if (i3 == length) {
                                                i3++;
                                            }
                                        }
                                        dt0.m4713o(this.f36124n, yk3Var, obj);
                                        break;
                                    }
                                    if (i3 == length) {
                                        dt0.m4713o(this.f36124n, yk3Var, obj);
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                if (objM8132g != ia5.f21229t) {
                                    dt0.m4713o(this.f36124n, yk3Var, obj);
                                    break;
                                }
                            }
                        } else {
                            lw2Var.m8138m(yk3Var, ia5.f21229t);
                        }
                    } else {
                        this.f36124n.m8138m(yk3Var, ia5.f21229t);
                    }
                }
                if (zi0Var2 != null) {
                    return zi0Var2.m13591v(yk3Var, cr1Var, obj);
                }
                this.f36111a.mo5184n(this);
                return this.f36132v.f21669F ? m72.f24707c : m72.f24706b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m13592w(Object obj) {
        Object objM8132g = this.f36117g.m8132g(obj);
        if (objM8132g == null) {
            return;
        }
        boolean z = objM8132g instanceof mw2;
        lw2 lw2Var = this.f36123m;
        if (!z) {
            yk3 yk3Var = (yk3) objM8132g;
            if (yk3Var.m13153b(obj) != m72.f24708d || (obj instanceof wy0)) {
                return;
            }
            dt0.m4713o(lw2Var, obj, yk3Var);
            return;
        }
        mw2 mw2Var = (mw2) objM8132g;
        Object[] objArr = mw2Var.f25258b;
        long[] jArr = mw2Var.f25257a;
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
                        yk3 yk3Var2 = (yk3) objArr[(i << 3) + i3];
                        if (yk3Var2.m13153b(obj) == m72.f24708d && !(obj instanceof wy0)) {
                            dt0.m4713o(lw2Var, obj, yk3Var2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public final boolean m13593x(Set set) {
        boolean z = set instanceof vv3;
        lw2 lw2Var = this.f36120j;
        lw2 lw2Var2 = this.f36117g;
        if (z) {
            mw2 mw2Var = ((vv3) set).f32888a;
            Object[] objArr = mw2Var.f25258b;
            long[] jArr = mw2Var.f25257a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (lw2Var2.m8128c(obj) || lw2Var.m8128c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (lw2Var2.m8128c(obj2) || lw2Var.m8128c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m13594y() {
        synchronized (this.f36114d) {
            n93 n93Var = this.f36127q;
            boolean z = false;
            if (n93Var != null && (n93Var.f25574h.get() != p93.f27472e || n93Var.f25575i != oh6.m9110p())) {
                n93Var.f25574h.compareAndSet(p93.f27473f, p93.f27471d);
                ((kv2) n93Var.f25578l.f31428b).m7633a(9);
                return false;
            }
            m13586q();
            try {
                lw2 lw2Var = this.f36124n;
                this.f36124n = dt0.m4723y();
                try {
                    ir1 ir1Var = this.f36132v;
                    o64 o64Var = this.f36126p;
                    x53 x53Var = ir1Var.f21689e.f34991a;
                    if (!x53Var.m12493W()) {
                        qi0.m9889a("Expected applyChanges() to have been called");
                    }
                    if (lw2Var.f24422e > 0 || !ir1Var.f21703s.isEmpty()) {
                        ir1Var.f21679P = o64Var;
                        try {
                            ir1Var.m6908p(lw2Var, null);
                            ir1Var.f21679P = null;
                            z = !x53Var.m12493W();
                        } catch (Throwable th) {
                            ir1Var.f21679P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m13587r();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f36124n = lw2Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f36115e.f28048a.m8415g()) {
                        om3 om3Var = this.f36131u;
                        try {
                            om3Var.m9189g(this.f36115e, this.f36132v.m6857C());
                            om3Var.m9185b();
                        } finally {
                            om3Var.m9184a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    m13574b();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final void m13595z(vv3 vv3Var) {
        Object obj;
        Object obj2;
        do {
            obj = this.f36113c.get();
            if (obj == null || obj.equals(y62.f34945w)) {
                obj2 = vv3Var;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{obj, vv3Var};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f36113c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = vv3Var;
                obj2 = objArrCopyOf;
            }
        } while (!this.f36113c.compareAndSet(obj, obj2));
        if (obj == null) {
            synchronized (this.f36114d) {
                m13587r();
            }
        }
    }
}
