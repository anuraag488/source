package p000;

import android.graphics.Bitmap;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rw4 extends jw4 {

    /* JADX INFO: renamed from: b */
    public iu1 f29689b;

    /* JADX INFO: renamed from: c */
    public String f29690c;

    /* JADX INFO: renamed from: d */
    public boolean f29691d;

    /* JADX INFO: renamed from: e */
    public p31 f29692e;

    /* JADX INFO: renamed from: f */
    public wp1 f29693f;

    /* JADX INFO: renamed from: g */
    public d83 f29694g;

    /* JADX INFO: renamed from: h */
    public o00 f29695h;

    /* JADX INFO: renamed from: i */
    public d83 f29696i;

    /* JADX INFO: renamed from: j */
    public long f29697j;

    /* JADX INFO: renamed from: k */
    public float f29698k;

    /* JADX INFO: renamed from: l */
    public float f29699l;

    /* JADX INFO: renamed from: m */
    public qw4 f29700m;

    @Override // p000.jw4
    /* JADX INFO: renamed from: a */
    public final void mo6934a(u31 u31Var) {
        m10478e(u31Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX INFO: renamed from: e */
    public final void m10478e(u31 u31Var, float f, o00 o00Var) {
        int i;
        o00 o00Var2;
        C0759ie c0759ieM13873h;
        char c;
        long j;
        u31 u31Var2;
        long jM9464c;
        o00 o00Var3;
        int i2;
        int i3;
        d83 d83Var = this.f29696i;
        d83 d83Var2 = this.f29694g;
        p31 p31Var = this.f29692e;
        iu1 iu1Var = this.f29689b;
        if (!iu1Var.f21788d || iu1Var.f21789e == 16) {
            i = 0;
        } else {
            o00 o00Var4 = (o00) d83Var2.getValue();
            int i4 = uw4.f32218a;
            if (!(o00Var4 instanceof o00) ? o00Var4 == null : (i3 = o00Var4.f26231c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(o00Var instanceof o00) ? o00Var == null : (i2 = o00Var.f26231c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (this.f29691d || !h74.m6270b(this.f29697j, u31Var.mo11227d())) {
            if (i == 1) {
                jM9464c = iu1Var.f21789e;
                int i5 = uw4.f32218a;
                if (pb0.m9465d(jM9464c) != 1.0f) {
                    jM9464c = pb0.m9464c(jM9464c, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                }
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(jM9464c), d24.m4295J(5));
                o00Var2 = new o00();
                o00Var2.f26229a = blendModeColorFilter;
                o00Var2.f26230b = jM9464c;
                o00Var2.f26231c = 5;
                VarHandle.storeStoreFence();
            } else {
                o00Var2 = null;
            }
            this.f29695h = o00Var2;
            this.f29698k = Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) / Float.intBitsToFloat((int) (((h74) d83Var.getValue()).f20418a >> 32));
            this.f29699l = Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L)) / Float.intBitsToFloat((int) (((h74) d83Var.getValue()).f20418a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32))))) << 32);
            df2 layoutDirection = u31Var.getLayoutDirection();
            qw4 qw4Var = this.f29700m;
            c0759ieM13873h = (C0759ie) p31Var.f27338c;
            C1325xb c1325xb = (C1325xb) p31Var.f27339d;
            if (c0759ieM13873h != null || c1325xb == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                j = 4294967295L;
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = c0759ieM13873h.f21276a;
                c = ' ';
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || p31Var.f27336a != i) {
                }
                p31Var.f27337b = jCeil;
                j70 j70Var = (j70) p31Var.f27340e;
                long jM13369a0 = z62.m13369a0(jCeil);
                i70 i70Var = j70Var.f22063a;
                ky0 ky0Var = i70Var.f21146a;
                df2 df2Var = i70Var.f21147b;
                h70 h70Var = i70Var.f21148c;
                long j2 = i70Var.f21149d;
                u31Var2 = u31Var;
                i70Var.f21146a = u31Var2;
                i70Var.f21147b = layoutDirection;
                i70Var.f21148c = c1325xb;
                i70Var.f21149d = jM13369a0;
                c1325xb.mo6253j();
                u31.m11225x(j70Var, pb0.f27495b, 0L, 0L, null, 62);
                qw4Var.invoke(j70Var);
                c1325xb.mo6251g();
                i70 i70Var2 = j70Var.f22063a;
                i70Var2.f21146a = ky0Var;
                i70Var2.f21147b = df2Var;
                i70Var2.f21148c = h70Var;
                i70Var2.f21149d = j2;
                c0759ieM13873h.f21276a.prepareToDraw();
                this.f29691d = false;
                this.f29697j = u31Var2.mo11227d();
            }
            c0759ieM13873h = zy5.m13873h((int) (jCeil >> c), (int) (jCeil & j), i);
            Canvas canvas = AbstractC1362yb.f35080a;
            c1325xb = new C1325xb();
            c1325xb.f34122a = new Canvas(AbstractC0647fd.m5679r(c0759ieM13873h));
            p31Var.f27338c = c0759ieM13873h;
            p31Var.f27339d = c1325xb;
            p31Var.f27336a = i;
            p31Var.f27337b = jCeil;
            j70 j70Var2 = (j70) p31Var.f27340e;
            long jM13369a1 = z62.m13369a0(jCeil);
            i70 i70Var3 = j70Var2.f22063a;
            ky0 ky0Var2 = i70Var3.f21146a;
            df2 df2Var2 = i70Var3.f21147b;
            h70 h70Var2 = i70Var3.f21148c;
            long j3 = i70Var3.f21149d;
            u31Var2 = u31Var;
            i70Var3.f21146a = u31Var2;
            i70Var3.f21147b = layoutDirection;
            i70Var3.f21148c = c1325xb;
            i70Var3.f21149d = jM13369a1;
            c1325xb.mo6253j();
            u31.m11225x(j70Var2, pb0.f27495b, 0L, 0L, null, 62);
            qw4Var.invoke(j70Var2);
            c1325xb.mo6251g();
            i70 i70Var4 = j70Var2.f22063a;
            i70Var4.f21146a = ky0Var2;
            i70Var4.f21147b = df2Var2;
            i70Var4.f21148c = h70Var2;
            i70Var4.f21149d = j3;
            c0759ieM13873h.f21276a.prepareToDraw();
            this.f29691d = false;
            this.f29697j = u31Var2.mo11227d();
        } else {
            C0759ie c0759ie = (C0759ie) p31Var.f27338c;
            if (i == (c0759ie != null ? c0759ie.m6770a() : 0)) {
                u31Var2 = u31Var;
            } else {
                if (i == 1) {
                    jM9464c = iu1Var.f21789e;
                    int i7 = uw4.f32218a;
                    if (pb0.m9465d(jM9464c) != 1.0f) {
                        jM9464c = pb0.m9464c(jM9464c, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    BlendModeColorFilter blendModeColorFilter2 = new BlendModeColorFilter(zy5.m13858V(jM9464c), d24.m4295J(5));
                    o00Var2 = new o00();
                    o00Var2.f26229a = blendModeColorFilter2;
                    o00Var2.f26230b = jM9464c;
                    o00Var2.f26231c = 5;
                    VarHandle.storeStoreFence();
                } else {
                    o00Var2 = null;
                }
                this.f29695h = o00Var2;
                this.f29698k = Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) / Float.intBitsToFloat((int) (((h74) d83Var.getValue()).f20418a >> 32));
                this.f29699l = Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L)) / Float.intBitsToFloat((int) (((h74) d83Var.getValue()).f20418a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32))))) << 32);
                df2 layoutDirection2 = u31Var.getLayoutDirection();
                qw4 qw4Var2 = this.f29700m;
                c0759ieM13873h = (C0759ie) p31Var.f27338c;
                C1325xb c1325xb2 = (C1325xb) p31Var.f27339d;
                if (c0759ieM13873h != null) {
                    c = ' ';
                    j = 4294967295L;
                    c0759ieM13873h = zy5.m13873h((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas2 = AbstractC1362yb.f35080a;
                    c1325xb2 = new C1325xb();
                    c1325xb2.f34122a = new Canvas(AbstractC0647fd.m5679r(c0759ieM13873h));
                    p31Var.f27338c = c0759ieM13873h;
                    p31Var.f27339d = c1325xb2;
                    p31Var.f27336a = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    c0759ieM13873h = zy5.m13873h((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas3 = AbstractC1362yb.f35080a;
                    c1325xb2 = new C1325xb();
                    c1325xb2.f34122a = new Canvas(AbstractC0647fd.m5679r(c0759ieM13873h));
                    p31Var.f27338c = c0759ieM13873h;
                    p31Var.f27339d = c1325xb2;
                    p31Var.f27336a = i;
                }
                p31Var.f27337b = jCeil2;
                j70 j70Var3 = (j70) p31Var.f27340e;
                long jM13369a2 = z62.m13369a0(jCeil2);
                i70 i70Var5 = j70Var3.f22063a;
                ky0 ky0Var3 = i70Var5.f21146a;
                df2 df2Var3 = i70Var5.f21147b;
                h70 h70Var3 = i70Var5.f21148c;
                long j4 = i70Var5.f21149d;
                u31Var2 = u31Var;
                i70Var5.f21146a = u31Var2;
                i70Var5.f21147b = layoutDirection2;
                i70Var5.f21148c = c1325xb2;
                i70Var5.f21149d = jM13369a2;
                c1325xb2.mo6253j();
                u31.m11225x(j70Var3, pb0.f27495b, 0L, 0L, null, 62);
                qw4Var2.invoke(j70Var3);
                c1325xb2.mo6251g();
                i70 i70Var6 = j70Var3.f22063a;
                i70Var6.f21146a = ky0Var3;
                i70Var6.f21147b = df2Var3;
                i70Var6.f21148c = h70Var3;
                i70Var6.f21149d = j4;
                c0759ieM13873h.f21276a.prepareToDraw();
                this.f29691d = false;
                this.f29697j = u31Var2.mo11227d();
            }
        }
        if (o00Var != null) {
            o00Var3 = o00Var;
        } else {
            o00Var3 = ((o00) d83Var2.getValue()) != null ? (o00) d83Var2.getValue() : this.f29695h;
        }
        C0759ie c0759ie2 = (C0759ie) p31Var.f27338c;
        if (c0759ie2 == null) {
            q32.m9721c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        u31.m11219M(u31Var2, c0759ie2, p31Var.f27337b, 0L, f, o00Var3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f29690c);
        sb.append("\n\tviewportWidth: ");
        d83 d83Var = this.f29696i;
        sb.append(Float.intBitsToFloat((int) (((h74) d83Var.getValue()).f20418a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((h74) d83Var.getValue()).f20418a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
