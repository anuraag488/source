package p000;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bu1 {

    /* JADX INFO: renamed from: A */
    public boolean f15606A;

    /* JADX INFO: renamed from: B */
    public RectF f15607B;

    /* JADX INFO: renamed from: a */
    public final fu1 f15608a;

    /* JADX INFO: renamed from: f */
    public Outline f15613f;

    /* JADX INFO: renamed from: j */
    public float f15617j;

    /* JADX INFO: renamed from: k */
    public lb5 f15618k;

    /* JADX INFO: renamed from: l */
    public C0489bf f15619l;

    /* JADX INFO: renamed from: m */
    public C0489bf f15620m;

    /* JADX INFO: renamed from: n */
    public boolean f15621n;

    /* JADX INFO: renamed from: o */
    public j70 f15622o;

    /* JADX INFO: renamed from: p */
    public C1253ve f15623p;

    /* JADX INFO: renamed from: q */
    public int f15624q;

    /* JADX INFO: renamed from: s */
    public boolean f15626s;

    /* JADX INFO: renamed from: t */
    public long f15627t;

    /* JADX INFO: renamed from: u */
    public long f15628u;

    /* JADX INFO: renamed from: v */
    public int f15629v;

    /* JADX INFO: renamed from: w */
    public int f15630w;

    /* JADX INFO: renamed from: x */
    public int f15631x;

    /* JADX INFO: renamed from: y */
    public int f15632y;

    /* JADX INFO: renamed from: z */
    public long f15633z;

    /* JADX INFO: renamed from: b */
    public ky0 f15609b = q31.f28194a;

    /* JADX INFO: renamed from: c */
    public df2 f15610c = df2.f17011a;

    /* JADX INFO: renamed from: d */
    public yp1 f15611d = C1035pi.f27627y;

    /* JADX INFO: renamed from: e */
    public final C1183ti f15612e = new C1183ti(this, 5);

    /* JADX INFO: renamed from: g */
    public boolean f15614g = true;

    /* JADX INFO: renamed from: h */
    public long f15615h = 0;

    /* JADX INFO: renamed from: i */
    public long f15616i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final g90 f15625r = new g90();

    static {
        z62.m13387o(Build.FINGERPRINT, "robolectric");
    }

    public bu1(fu1 fu1Var) {
        this.f15608a = fu1Var;
        fu1Var.f19313t = false;
        fu1Var.m5805a();
        this.f15627t = 0L;
        this.f15628u = 0L;
        this.f15633z = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m3684a() {
        fu1 fu1Var = this.f15608a;
        RenderNode renderNode = fu1Var.f19296c;
        if (this.f15614g) {
            boolean z = this.f15606A;
            if (z || fu1Var.f19308o > 0.0f) {
                C0489bf c0489bf = this.f15619l;
                if (c0489bf != null) {
                    RectF rectF = this.f15607B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f15607B = rectF;
                    }
                    boolean z2 = c0489bf instanceof C0489bf;
                    if (!z2) {
                        qm5.m9919j("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = c0489bf.f15228a;
                    path.computeBounds(rectF, false);
                    Outline outline = this.f15613f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f15613f = outline;
                    }
                    if (!z2) {
                        qm5.m9919j("Unable to obtain android.graphics.Path");
                        return;
                    }
                    outline.setPath(path);
                    outline.offset(this.f15629v, this.f15630w);
                    this.f15621n = !outline.canClip();
                    this.f15619l = c0489bf;
                    outline.setAlpha(fu1Var.f19301h);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    fu1Var.f19300g = true;
                    fu1Var.m5805a();
                    if (this.f15621n && this.f15606A) {
                        fu1Var.f19313t = false;
                        fu1Var.m5805a();
                        renderNode.discardDisplayList();
                    } else {
                        fu1Var.f19313t = this.f15606A;
                        fu1Var.m5805a();
                    }
                } else {
                    fu1Var.f19313t = z;
                    fu1Var.m5805a();
                    Outline outline2 = this.f15613f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f15613f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jM13369a0 = z62.m13369a0(this.f15628u);
                    long j = this.f15615h;
                    long j2 = this.f15616i;
                    long j3 = j2 == 9205357640488583168L ? jM13369a0 : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2)), this.f15617j);
                    outline3.setAlpha(fu1Var.f19301h);
                    z62.m13361T(j3);
                    renderNode.setOutline(outline3);
                    fu1Var.f19300g = true;
                    fu1Var.m5805a();
                }
            } else {
                fu1Var.f19313t = false;
                fu1Var.m5805a();
                renderNode.setOutline(null);
                fu1Var.f19300g = false;
                fu1Var.m5805a();
            }
        }
        this.f15614g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m3685b() {
        if (this.f15626s && this.f15624q == 0) {
            g90 g90Var = this.f15625r;
            bu1 bu1Var = (bu1) g90Var.f19662b;
            if (bu1Var != null) {
                bu1Var.f15624q--;
                bu1Var.m3685b();
                g90Var.f19662b = null;
            }
            mw2 mw2Var = (mw2) g90Var.f19664d;
            if (mw2Var != null) {
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
                                    bu1 bu1Var2 = (bu1) objArr[(i << 3) + i3];
                                    bu1Var2.f15624q--;
                                    bu1Var2.m3685b();
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
                mw2Var.m8410b();
            }
            this.f15608a.f19296c.discardDisplayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m3686c(u31 u31Var) {
        g90 g90Var = this.f15625r;
        g90Var.f19663c = (bu1) g90Var.f19662b;
        mw2 mw2Var = (mw2) g90Var.f19664d;
        if (mw2Var != null && mw2Var.m8416h()) {
            mw2 mw2Var2 = (mw2) g90Var.f19665e;
            if (mw2Var2 == null) {
                mw2 mw2Var3 = uv3.f32207a;
                mw2Var2 = new mw2();
                g90Var.f19665e = mw2Var2;
            }
            mw2Var2.m8418j(mw2Var);
            mw2Var.m8410b();
        }
        g90Var.f19661a = true;
        this.f15611d.invoke(u31Var);
        g90Var.f19661a = false;
        bu1 bu1Var = (bu1) g90Var.f19663c;
        if (bu1Var != null) {
            bu1Var.f15624q--;
            bu1Var.m3685b();
        }
        mw2 mw2Var4 = (mw2) g90Var.f19665e;
        if (mw2Var4 == null || !mw2Var4.m8416h()) {
            return;
        }
        Object[] objArr = mw2Var4.f25258b;
        long[] jArr = mw2Var4.f25257a;
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
                            bu1 bu1Var2 = (bu1) objArr[(i << 3) + i3];
                            bu1Var2.f15624q--;
                            bu1Var2.m3685b();
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
        mw2Var4.m8410b();
    }

    /* JADX INFO: renamed from: d */
    public final lb5 m3687d() {
        lb5 h63Var;
        lb5 lb5Var = this.f15618k;
        C0489bf c0489bf = this.f15619l;
        if (lb5Var != null) {
            return lb5Var;
        }
        if (c0489bf != null) {
            g63 g63Var = new g63();
            g63Var.f19622o = c0489bf;
            VarHandle.storeStoreFence();
            this.f15618k = g63Var;
            return g63Var;
        }
        long jM13369a0 = z62.m13369a0(this.f15628u);
        long j = this.f15615h;
        long j2 = this.f15616i;
        if (j2 != 9205357640488583168L) {
            jM13369a0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM13369a0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM13369a0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f15617j;
        if (f > 0.0f) {
            h63Var = new i63(C0638f5.m5531b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            h63Var = new h63(new jl3(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f15618k = h63Var;
        return h63Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m3688e() {
        ky0 ky0Var = this.f15609b;
        df2 df2Var = this.f15610c;
        fu1 fu1Var = this.f15608a;
        j70 j70Var = fu1Var.f19295b;
        RenderNode renderNode = fu1Var.f19296c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        float f = fu1Var.f19314u;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fu1Var.f19315v)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            k70 k70Var = fu1Var.f19294a;
            C1325xb c1325xb = k70Var.f22949a;
            Canvas canvas = c1325xb.f34122a;
            c1325xb.f34122a = recordingCanvasBeginRecording;
            jp0 jp0Var = j70Var.f22064b;
            jp0Var.m7227Q(ky0Var);
            jp0Var.m7229S(df2Var);
            jp0Var.f22482c = this;
            jp0Var.m7230T(fu1Var.f19297d);
            jp0Var.m7226P(c1325xb);
            float f2 = fu1Var.f19314u;
            C1183ti c1183ti = this.f15612e;
            if (f2 > 0.0f || fu1Var.f19315v > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                c1325xb.mo6249e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                c1183ti.invoke(j70Var);
                c1325xb.mo6249e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                c1183ti.invoke(j70Var);
            }
            k70Var.f22949a.f34122a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3689f(float f) {
        fu1 fu1Var = this.f15608a;
        if (fu1Var.f19301h == f) {
            return;
        }
        fu1Var.f19301h = f;
        fu1Var.f19296c.setAlpha(f);
    }

    /* JADX INFO: renamed from: g */
    public final void m3690g(long j) {
        if (b33.m3425c(this.f15633z, j)) {
            return;
        }
        this.f15633z = j;
        fu1 fu1Var = this.f15608a;
        fu1Var.f19303j = j;
        fu1Var.m5808d();
    }

    /* JADX INFO: renamed from: h */
    public final void m3691h(long j, long j2) {
        fu1 fu1Var = this.f15608a;
        RenderNode renderNode = fu1Var.f19296c;
        fu1Var.f19291A = (int) (j >> 32);
        fu1Var.f19292B = (int) (j & 4294967295L);
        boolean zM6270b = h74.m6270b(fu1Var.f19297d, z62.m13369a0(j2));
        fu1Var.f19297d = z62.m13369a0(j2);
        fu1Var.m5809e();
        if (zM6270b || !b33.m3425c(fu1Var.f19303j, 9205357640488583168L)) {
            return;
        }
        renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + fu1Var.f19314u);
        renderNode.setPivotY((((int) (j2 & 4294967295L)) / 2.0f) + fu1Var.f19315v);
    }

    /* JADX INFO: renamed from: i */
    public final void m3692i(long j, long j2, float f) {
        float f2 = this.f15629v;
        long jM3430h = b33.m3430h(j, (((long) Float.floatToRawIntBits(this.f15630w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (b33.m3425c(this.f15615h, jM3430h) && h74.m6270b(this.f15616i, j2) && this.f15617j == f && this.f15619l == null) {
            return;
        }
        this.f15618k = null;
        this.f15619l = null;
        this.f15614g = true;
        this.f15621n = false;
        this.f15615h = jM3430h;
        this.f15616i = j2;
        this.f15617j = f;
        m3684a();
    }
}
