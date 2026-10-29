package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fu1 {

    /* JADX INFO: renamed from: A */
    public int f19291A;

    /* JADX INFO: renamed from: B */
    public int f19292B;

    /* JADX INFO: renamed from: C */
    public int f19293C;

    /* JADX INFO: renamed from: a */
    public final k70 f19294a;

    /* JADX INFO: renamed from: b */
    public final j70 f19295b;

    /* JADX INFO: renamed from: c */
    public final RenderNode f19296c;

    /* JADX INFO: renamed from: d */
    public long f19297d;

    /* JADX INFO: renamed from: e */
    public Paint f19298e;

    /* JADX INFO: renamed from: f */
    public Matrix f19299f;

    /* JADX INFO: renamed from: g */
    public boolean f19300g;

    /* JADX INFO: renamed from: h */
    public float f19301h;

    /* JADX INFO: renamed from: i */
    public byte f19302i;

    /* JADX INFO: renamed from: j */
    public long f19303j;

    /* JADX INFO: renamed from: k */
    public float f19304k;

    /* JADX INFO: renamed from: l */
    public float f19305l;

    /* JADX INFO: renamed from: m */
    public float f19306m;

    /* JADX INFO: renamed from: n */
    public float f19307n;

    /* JADX INFO: renamed from: o */
    public float f19308o;

    /* JADX INFO: renamed from: p */
    public long f19309p;

    /* JADX INFO: renamed from: q */
    public long f19310q;

    /* JADX INFO: renamed from: r */
    public float f19311r;

    /* JADX INFO: renamed from: s */
    public float f19312s;

    /* JADX INFO: renamed from: t */
    public boolean f19313t;

    /* JADX INFO: renamed from: u */
    public int f19314u;

    /* JADX INFO: renamed from: v */
    public int f19315v;

    /* JADX INFO: renamed from: w */
    public int f19316w;

    /* JADX INFO: renamed from: x */
    public int f19317x;

    /* JADX INFO: renamed from: y */
    public boolean f19318y;

    /* JADX INFO: renamed from: z */
    public boolean f19319z;

    public fu1() {
        k70 k70Var = new k70();
        j70 j70Var = new j70();
        this.f19294a = k70Var;
        this.f19295b = j70Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f19296c = renderNode;
        this.f19297d = 0L;
        renderNode.setClipToBounds(false);
        m5806b(renderNode, 0);
        this.f19301h = 1.0f;
        this.f19302i = (byte) 3;
        this.f19303j = 9205357640488583168L;
        this.f19304k = 1.0f;
        this.f19305l = 1.0f;
        long j = pb0.f27495b;
        this.f19309p = j;
        this.f19310q = j;
        this.f19312s = 8.0f;
        this.f19293C = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m5805a() {
        boolean z = this.f19313t;
        boolean z2 = false;
        boolean z3 = z && !this.f19300g;
        if (z && this.f19300g) {
            z2 = true;
        }
        boolean z4 = this.f19318y;
        RenderNode renderNode = this.f19296c;
        if (z3 != z4) {
            this.f19318y = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.f19319z) {
            this.f19319z = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5806b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f19298e);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f19298e;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5807c() {
        int i = this.f19293C;
        RenderNode renderNode = this.f19296c;
        if (i != 1 && this.f19302i == 3) {
            m5806b(renderNode, i);
        } else {
            m5806b(renderNode, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5808d() {
        long j = this.f19303j;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f19296c;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.f19297d >> 32)) / 2.0f) + this.f19314u);
            renderNode.setPivotY((Float.intBitsToFloat((int) (this.f19297d & 4294967295L)) / 2.0f) + this.f19315v);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.f19314u);
            renderNode.setPivotY(Float.intBitsToFloat((int) (this.f19303j & 4294967295L)) + this.f19315v);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5809e() {
        int i = this.f19291A;
        this.f19296c.setPosition(i - this.f19314u, this.f19292B - this.f19315v, i + ((int) Float.intBitsToFloat((int) (this.f19297d >> 32))) + this.f19316w, this.f19292B + ((int) Float.intBitsToFloat((int) (this.f19297d & 4294967295L))) + this.f19317x);
    }
}
