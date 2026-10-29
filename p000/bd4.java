package p000;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bd4 extends qx0 implements s31 {

    /* JADX INFO: renamed from: q */
    public C1289wd f15218q;

    /* JADX INFO: renamed from: r */
    public r61 f15219r;

    /* JADX INFO: renamed from: s */
    public RenderNode f15220s;

    /* JADX INFO: renamed from: R0 */
    public static boolean m3549R0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        long j;
        char c;
        long j2;
        boolean zM3549R0;
        float distance;
        float distance2;
        float distance3;
        float distance4;
        r61 r61Var = this.f15219r;
        C1289wd c1289wd = this.f15218q;
        j70 j70Var = yf2Var.f35194a;
        long jMo11227d = j70Var.mo11227d();
        boolean zM6270b = h74.m6270b(c1289wd.f33250g, 0L);
        boolean zM6270b2 = h74.m6270b(jMo11227d, c1289wd.f33250g);
        c1289wd.f33250g = jMo11227d;
        if (zM6270b2) {
            j = 4294967295L;
        } else {
            r61 r61Var2 = c1289wd.f33246c;
            long jM10010E = (((long) qq2.m10010E(Float.intBitsToFloat((int) (jMo11227d & 4294967295L)))) & 4294967295L) | (((long) qq2.m10010E(Float.intBitsToFloat((int) (jMo11227d >> 32)))) << 32);
            r61Var2.f29047c = jM10010E;
            EdgeEffect edgeEffect = r61Var2.f29048d;
            if (edgeEffect != null) {
                j = 4294967295L;
                edgeEffect.setSize((int) (jM10010E >> 32), (int) (jM10010E & 4294967295L));
            } else {
                j = 4294967295L;
            }
            EdgeEffect edgeEffect2 = r61Var2.f29049e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM10010E >> 32), (int) (jM10010E & j));
            }
            EdgeEffect edgeEffect3 = r61Var2.f29050f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM10010E & j), (int) (jM10010E >> 32));
            }
            EdgeEffect edgeEffect4 = r61Var2.f29051g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM10010E & j), (int) (jM10010E >> 32));
            }
            EdgeEffect edgeEffect5 = r61Var2.f29052h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM10010E >> 32), (int) (jM10010E & j));
            }
            EdgeEffect edgeEffect6 = r61Var2.f29053i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM10010E >> 32), (int) (jM10010E & j));
            }
            EdgeEffect edgeEffect7 = r61Var2.f29054j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM10010E & j), (int) (jM10010E >> 32));
            }
            EdgeEffect edgeEffect8 = r61Var2.f29055k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jM10010E & j), (int) (jM10010E >> 32));
            }
        }
        if (!zM6270b && !zM6270b2) {
            c1289wd.m12214a();
        }
        h70 h70VarM7248w = j70Var.f22064b.m7248w();
        Canvas canvas = AbstractC1362yb.f35080a;
        Canvas canvas2 = ((C1325xb) h70VarM7248w).f34122a;
        c1289wd.f33247d.getValue();
        if (h74.m6274f(j70Var.mo11227d())) {
            yf2Var.m13113a();
            return;
        }
        if (!canvas2.isHardwareAccelerated()) {
            EdgeEffect edgeEffect9 = r61Var.f29048d;
            if (edgeEffect9 != null) {
                edgeEffect9.finish();
            }
            EdgeEffect edgeEffect10 = r61Var.f29049e;
            if (edgeEffect10 != null) {
                edgeEffect10.finish();
            }
            EdgeEffect edgeEffect11 = r61Var.f29050f;
            if (edgeEffect11 != null) {
                edgeEffect11.finish();
            }
            EdgeEffect edgeEffect12 = r61Var.f29051g;
            if (edgeEffect12 != null) {
                edgeEffect12.finish();
            }
            EdgeEffect edgeEffect13 = r61Var.f29052h;
            if (edgeEffect13 != null) {
                edgeEffect13.finish();
            }
            EdgeEffect edgeEffect14 = r61Var.f29053i;
            if (edgeEffect14 != null) {
                edgeEffect14.finish();
            }
            EdgeEffect edgeEffect15 = r61Var.f29054j;
            if (edgeEffect15 != null) {
                edgeEffect15.finish();
            }
            EdgeEffect edgeEffect16 = r61Var.f29055k;
            if (edgeEffect16 != null) {
                edgeEffect16.finish();
            }
            yf2Var.m13113a();
            return;
        }
        float fMo3575E = yf2Var.mo3575E(30.0f);
        boolean z = r61.m10219f(r61Var.f29048d) || r61.m10220g(r61Var.f29052h) || r61.m10219f(r61Var.f29049e) || r61.m10220g(r61Var.f29053i);
        boolean z2 = r61.m10219f(r61Var.f29050f) || r61.m10220g(r61Var.f29054j) || r61.m10219f(r61Var.f29051g) || r61.m10220g(r61Var.f29055k);
        if (z && z2) {
            m3551S0().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z) {
            m3551S0().setPosition(0, 0, (qq2.m10010E(fMo3575E) * 2) + canvas2.getWidth(), canvas2.getHeight());
        } else {
            if (!z2) {
                yf2Var.m13113a();
                return;
            }
            m3551S0().setPosition(0, 0, canvas2.getWidth(), (qq2.m10010E(fMo3575E) * 2) + canvas2.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = m3551S0().beginRecording();
        if (r61.m10220g(r61Var.f29054j)) {
            EdgeEffect edgeEffectM10221a = r61Var.f29054j;
            if (edgeEffectM10221a == null) {
                edgeEffectM10221a = r61Var.m10221a(d63.f16815b);
                r61Var.f29054j = edgeEffectM10221a;
            }
            m3549R0(90.0f, edgeEffectM10221a, recordingCanvasBeginRecording);
            edgeEffectM10221a.finish();
        }
        if (r61.m10219f(r61Var.f29050f)) {
            EdgeEffect edgeEffectM10223c = r61Var.m10223c();
            zM3549R0 = m3549R0(270.0f, edgeEffectM10223c, recordingCanvasBeginRecording);
            c = ' ';
            if (r61.m10220g(r61Var.f29050f)) {
                j2 = j;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c1289wd.m12216c() & j2));
                EdgeEffect edgeEffectM10221a2 = r61Var.f29054j;
                if (edgeEffectM10221a2 == null) {
                    edgeEffectM10221a2 = r61Var.m10221a(d63.f16815b);
                    r61Var.f29054j = edgeEffectM10221a2;
                }
                try {
                    distance4 = edgeEffectM10223c.getDistance();
                } catch (Throwable unused) {
                    distance4 = 0.0f;
                }
                float f = 1.0f - fIntBitsToFloat;
                try {
                    edgeEffectM10221a2.onPullDistance(distance4, f);
                } catch (Throwable unused2) {
                    edgeEffectM10221a2.onPull(distance4, f);
                }
            } else {
                j2 = j;
            }
        } else {
            c = ' ';
            j2 = j;
            zM3549R0 = false;
        }
        if (r61.m10220g(r61Var.f29052h)) {
            EdgeEffect edgeEffectM10221a3 = r61Var.f29052h;
            if (edgeEffectM10221a3 == null) {
                edgeEffectM10221a3 = r61Var.m10221a(d63.f16814a);
                r61Var.f29052h = edgeEffectM10221a3;
            }
            m3549R0(180.0f, edgeEffectM10221a3, recordingCanvasBeginRecording);
            edgeEffectM10221a3.finish();
        }
        if (r61.m10219f(r61Var.f29048d)) {
            EdgeEffect edgeEffectM10225e = r61Var.m10225e();
            zM3549R0 = m3549R0(0.0f, edgeEffectM10225e, recordingCanvasBeginRecording) || zM3549R0;
            if (r61.m10220g(r61Var.f29048d)) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1289wd.m12216c() >> c));
                EdgeEffect edgeEffectM10221a4 = r61Var.f29052h;
                if (edgeEffectM10221a4 == null) {
                    edgeEffectM10221a4 = r61Var.m10221a(d63.f16814a);
                    r61Var.f29052h = edgeEffectM10221a4;
                }
                try {
                    distance3 = edgeEffectM10225e.getDistance();
                } catch (Throwable unused3) {
                    distance3 = 0.0f;
                }
                try {
                    edgeEffectM10221a4.onPullDistance(distance3, fIntBitsToFloat2);
                } catch (Throwable unused4) {
                    edgeEffectM10221a4.onPull(distance3, fIntBitsToFloat2);
                }
            }
        }
        if (r61.m10220g(r61Var.f29055k)) {
            EdgeEffect edgeEffectM10221a5 = r61Var.f29055k;
            if (edgeEffectM10221a5 == null) {
                edgeEffectM10221a5 = r61Var.m10221a(d63.f16815b);
                r61Var.f29055k = edgeEffectM10221a5;
            }
            m3549R0(270.0f, edgeEffectM10221a5, recordingCanvasBeginRecording);
            edgeEffectM10221a5.finish();
        }
        if (r61.m10219f(r61Var.f29051g)) {
            EdgeEffect edgeEffectM10224d = r61Var.m10224d();
            zM3549R0 = m3549R0(90.0f, edgeEffectM10224d, recordingCanvasBeginRecording) || zM3549R0;
            if (r61.m10220g(r61Var.f29051g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1289wd.m12216c() & j2));
                EdgeEffect edgeEffectM10221a6 = r61Var.f29055k;
                if (edgeEffectM10221a6 == null) {
                    edgeEffectM10221a6 = r61Var.m10221a(d63.f16815b);
                    r61Var.f29055k = edgeEffectM10221a6;
                }
                try {
                    distance2 = edgeEffectM10224d.getDistance();
                } catch (Throwable unused5) {
                    distance2 = 0.0f;
                }
                try {
                    edgeEffectM10221a6.onPullDistance(distance2, fIntBitsToFloat3);
                } catch (Throwable unused6) {
                    edgeEffectM10221a6.onPull(distance2, fIntBitsToFloat3);
                }
            }
        }
        if (r61.m10220g(r61Var.f29053i)) {
            EdgeEffect edgeEffectM10221a7 = r61Var.f29053i;
            if (edgeEffectM10221a7 == null) {
                edgeEffectM10221a7 = r61Var.m10221a(d63.f16814a);
                r61Var.f29053i = edgeEffectM10221a7;
            }
            m3549R0(0.0f, edgeEffectM10221a7, recordingCanvasBeginRecording);
            edgeEffectM10221a7.finish();
        }
        if (r61.m10219f(r61Var.f29049e)) {
            EdgeEffect edgeEffectM10222b = r61Var.m10222b();
            boolean z3 = m3549R0(180.0f, edgeEffectM10222b, recordingCanvasBeginRecording) || zM3549R0;
            if (r61.m10220g(r61Var.f29049e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1289wd.m12216c() >> c));
                EdgeEffect edgeEffectM10221a8 = r61Var.f29053i;
                if (edgeEffectM10221a8 == null) {
                    edgeEffectM10221a8 = r61Var.m10221a(d63.f16814a);
                    r61Var.f29053i = edgeEffectM10221a8;
                }
                try {
                    distance = edgeEffectM10222b.getDistance();
                } catch (Throwable unused7) {
                    distance = 0.0f;
                }
                float f2 = 1.0f - fIntBitsToFloat4;
                try {
                    edgeEffectM10221a8.onPullDistance(distance, f2);
                } catch (Throwable unused8) {
                    edgeEffectM10221a8.onPull(distance, f2);
                }
            }
            zM3549R0 = z3;
        }
        if (zM3549R0) {
            c1289wd.m12217d();
        }
        float f3 = z2 ? 0.0f : fMo3575E;
        if (z) {
            fMo3575E = 0.0f;
        }
        df2 layoutDirection = yf2Var.getLayoutDirection();
        C1325xb c1325xb = new C1325xb();
        c1325xb.f34122a = recordingCanvasBeginRecording;
        long jMo11227d2 = j70Var.mo11227d();
        ky0 ky0VarM7250y = j70Var.f22064b.m7250y();
        df2 df2VarM7216B = j70Var.f22064b.m7216B();
        h70 h70VarM7248w2 = j70Var.f22064b.m7248w();
        long jM7219E = j70Var.f22064b.m7219E();
        jp0 jp0Var = j70Var.f22064b;
        bu1 bu1Var = (bu1) jp0Var.f22482c;
        jp0Var.m7227Q(yf2Var);
        jp0Var.m7229S(layoutDirection);
        jp0Var.m7226P(c1325xb);
        jp0Var.m7230T(jMo11227d2);
        jp0Var.f22482c = null;
        c1325xb.mo6253j();
        try {
            ((ar3) j70Var.f22064b.f22481b).m3130A(f3, fMo3575E);
            try {
                yf2Var.m13113a();
                float f4 = -f3;
                float f5 = -fMo3575E;
                ((ar3) j70Var.f22064b.f22481b).m3130A(f4, f5);
                c1325xb.mo6251g();
                jp0 jp0Var2 = j70Var.f22064b;
                jp0Var2.m7227Q(ky0VarM7250y);
                jp0Var2.m7229S(df2VarM7216B);
                jp0Var2.m7226P(h70VarM7248w2);
                jp0Var2.m7230T(jM7219E);
                jp0Var2.f22482c = bu1Var;
                m3551S0().endRecording();
                int iSave = canvas2.save();
                canvas2.translate(f4, f5);
                canvas2.drawRenderNode(m3551S0());
                canvas2.restoreToCount(iSave);
            } catch (Throwable th) {
                ((ar3) j70Var.f22064b.f22481b).m3130A(-f3, -fMo3575E);
                throw th;
            }
        } catch (Throwable th2) {
            c1325xb.mo6251g();
            jp0 jp0Var3 = j70Var.f22064b;
            jp0Var3.m7227Q(ky0VarM7250y);
            jp0Var3.m7229S(df2VarM7216B);
            jp0Var3.m7226P(h70VarM7248w2);
            jp0Var3.m7230T(jM7219E);
            jp0Var3.f22482c = bu1Var;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final RenderNode m3551S0() {
        RenderNode renderNode = this.f15220s;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.f15220s = renderNode2;
        return renderNode2;
    }
}
