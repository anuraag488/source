package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: yf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1366yf extends mt2 implements bj0, y23, s31, af2 {

    /* JADX INFO: renamed from: o */
    public nv2 f35177o;

    /* JADX INFO: renamed from: p */
    public by0 f35178p;

    /* JADX INFO: renamed from: q */
    public float f35179q;

    /* JADX INFO: renamed from: r */
    public long f35180r;

    /* JADX INFO: renamed from: s */
    public boolean f35181s;

    /* JADX INFO: renamed from: t */
    public cw2 f35182t;

    /* JADX INFO: renamed from: u */
    public C0910mi f35183u;

    /* JADX INFO: renamed from: v */
    public C0910mi f35184v;

    /* JADX INFO: renamed from: w */
    public r50 f35185w;

    /* JADX INFO: renamed from: x */
    public iq3 f35186x;

    /* JADX INFO: renamed from: y */
    public up3 f35187y;

    /* JADX INFO: renamed from: z */
    public vp3 f35188z;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        m13109O0(false);
        lb5.m7910S(m8391C0(), null, null, new it1((Object) this, (wm0) null, (byte) 22), 3);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        up3 up3Var = this.f35187y;
        if (up3Var != null) {
            this.f35188z = null;
            z62.m13348G(this);
            yg3 yg3Var = up3Var.f32062d;
            vp3 vp3Var = (vp3) ((LinkedHashMap) yg3Var.f35215b).get(this);
            if (vp3Var != null) {
                vp3Var.m11947c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) yg3Var.f35215b;
                vp3 vp3Var2 = (vp3) linkedHashMap.get(this);
                if (vp3Var2 != null) {
                }
                linkedHashMap.remove(this);
                up3Var.f32061c.add(vp3Var);
            }
        }
        this.f35185w = null;
        this.f35186x = null;
        this.f35181s = false;
        this.f35180r = 0L;
        this.f35179q = 0.0f;
        this.f35182t.m4203d();
    }

    /* JADX INFO: renamed from: O0 */
    public final iq3 m13109O0(boolean z) {
        boolean z2;
        iq3 iq3Var = this.f35186x;
        ql3 ql3Var = new ql3();
        if (z || iq3Var == null) {
            jp1 jp1Var = new jp1((byte) 15);
            jp1Var.f22485b = ql3Var;
            jp1Var.f22486c = this;
            VarHandle.storeStoreFence();
            c20.m3797B(this, jp1Var);
            Object obj = ql3Var.f28555a;
            if (obj == null) {
                z62.m13366Y("resolvedConfiguration");
                throw null;
            }
            z2 = !((iq3) obj).equals(iq3Var);
        } else {
            ql3Var.f28555a = iq3Var;
            z2 = false;
        }
        Object obj2 = ql3Var.f28555a;
        if (obj2 == null) {
            z62.m13366Y("resolvedConfiguration");
            throw null;
        }
        iq3 iq3Var2 = (iq3) obj2;
        this.f35186x = iq3Var2;
        if (z2) {
            m13111Q0(iq3Var2);
            z62.m13348G(this);
        }
        Object obj3 = ql3Var.f28555a;
        if (obj3 != null) {
            return (iq3) obj3;
        }
        z62.m13366Y("resolvedConfiguration");
        throw null;
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        m13109O0(true);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m13110P0(hf3 hf3Var) {
        vp3 vp3Var;
        if (!(hf3Var instanceof ff3)) {
            if (hf3Var instanceof gf3) {
                vp3 vp3Var2 = this.f35188z;
                if (vp3Var2 != null) {
                    vp3Var2.m11948d();
                    return;
                }
                return;
            }
            if (!(hf3Var instanceof ef3) || (vp3Var = this.f35188z) == null) {
                return;
            }
            vp3Var.m11948d();
            return;
        }
        ff3 ff3Var = (ff3) hf3Var;
        long j = this.f35180r;
        float f = this.f35179q;
        up3 up3Var = this.f35187y;
        if (up3Var == null) {
            Object obj = (View) sj3.m10825u(this, AndroidCompositionLocals_androidKt.f14655f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    xy4.m12783l("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    Context context = viewGroup.getContext();
                    up3 up3Var2 = new up3(context);
                    up3Var2.f32059a = (byte) 5;
                    ArrayList arrayList = new ArrayList();
                    up3Var2.f32060b = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    up3Var2.f32061c = arrayList2;
                    yg3 yg3Var = new yg3((byte) 2);
                    yg3Var.f35215b = new LinkedHashMap();
                    yg3Var.f35216c = new LinkedHashMap();
                    VarHandle.storeStoreFence();
                    up3Var2.f32062d = yg3Var;
                    up3Var2.setClipChildren(false);
                    vp3 vp3Var3 = new vp3(context);
                    up3Var2.addView(vp3Var3);
                    arrayList.add(vp3Var3);
                    arrayList2.add(vp3Var3);
                    up3Var2.f32063e = 1;
                    up3Var2.setTag(C0995R.id.hide_in_inspector_tag, Boolean.TRUE);
                    VarHandle.storeStoreFence();
                    viewGroup.addView(up3Var2);
                    up3Var = up3Var2;
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof up3) {
                    up3Var = (up3) childAt;
                    break;
                }
                i++;
            }
            this.f35187y = up3Var;
        }
        ArrayList arrayList3 = up3Var.f32060b;
        yg3 yg3Var2 = up3Var.f32062d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) yg3Var2.f35215b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) yg3Var2.f35215b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) yg3Var2.f35216c;
        vp3 vp3Var4 = (vp3) linkedHashMap.get(this);
        if (vp3Var4 == null) {
            ArrayList arrayList4 = up3Var.f32061c;
            vp3Var4 = (vp3) (arrayList4.isEmpty() ? null : arrayList4.remove(0));
            if (vp3Var4 == null) {
                if (up3Var.f32063e > kx5.m7689T(arrayList3)) {
                    vp3Var4 = new vp3(up3Var.getContext());
                    up3Var.addView(vp3Var4);
                    arrayList3.add(vp3Var4);
                } else {
                    vp3Var4 = (vp3) arrayList3.get(up3Var.f32063e);
                    C1366yf c1366yf = (C1366yf) linkedHashMap3.get(vp3Var4);
                    if (c1366yf != null) {
                        c1366yf.f35188z = null;
                        z62.m13348G(c1366yf);
                        vp3 vp3Var5 = (vp3) linkedHashMap2.get(c1366yf);
                        if (vp3Var5 != null) {
                        }
                        linkedHashMap2.remove(c1366yf);
                        vp3Var4.m11947c();
                    }
                }
                int i2 = up3Var.f32063e;
                if (i2 < up3Var.f32059a - 1) {
                    up3Var.f32063e = i2 + 1;
                } else {
                    up3Var.f32063e = 0;
                }
            }
            linkedHashMap2.put(this, vp3Var4);
            linkedHashMap3.put(vp3Var4, this);
        }
        iq3 iq3VarM13109O0 = m13109O0(false);
        hq3 hq3Var = iq3VarM13109O0.f21639d;
        float f2 = hq3Var instanceof gq3 ? ((gq3) hq3Var).f20028a : 0.0f;
        boolean z = iq3VarM13109O0.f21636a;
        int iM10010E = qq2.m10010E(f);
        long jM7278m = iq3VarM13109O0.f21638c.m7278m();
        C1053q c1053q = new C1053q((byte) 2);
        c1053q.f28113b = this;
        VarHandle.storeStoreFence();
        vp3 vp3Var6 = vp3Var4;
        vp3Var6.m11946b(ff3Var, z, j, iM10010E, jM7278m, f2, c1053q);
        this.f35188z = vp3Var6;
        z62.m13348G(this);
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m13111Q0(iq3 iq3Var) {
        float fMo3575E;
        if (!this.f35181s) {
            return false;
        }
        ky0 ky0Var = sc6.m10652X(this).f33336z;
        if (Float.isNaN(iq3Var.f21637b)) {
            boolean z = iq3Var.f21636a;
            long j = this.f35180r;
            fMo3575E = b33.m3426d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32)) / 2.0f;
            if (z) {
                fMo3575E += ky0Var.mo3575E(10.0f);
            }
        } else {
            fMo3575E = ky0Var.mo3575E(iq3Var.f21637b);
        }
        boolean z2 = this.f35179q == fMo3575E;
        boolean z3 = !z2;
        if (!z2) {
            this.f35179q = fMo3575E;
        }
        return z3;
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        yf2Var.m13113a();
        j70 j70Var = yf2Var.f35194a;
        h70 h70VarM7248w = j70Var.f22064b.m7248w();
        vp3 vp3Var = this.f35188z;
        if (vp3Var != null) {
            iq3 iq3VarM13109O0 = m13109O0(false);
            hq3 hq3Var = iq3VarM13109O0.f21639d;
            vp3Var.m11949e(this.f35180r, qq2.m10010E(this.f35179q), iq3VarM13109O0.f21638c.m7278m(), hq3Var instanceof gq3 ? ((gq3) hq3Var).f20028a : 0.0f);
            Canvas canvas = AbstractC1362yb.f35080a;
            vp3Var.draw(((C1325xb) h70VarM7248w).f34122a);
        }
        float fFloatValue = ((Number) this.f35183u.m8328d()).floatValue();
        if (fFloatValue > 0.0f) {
            iq3 iq3VarM13109O1 = m13109O0(false);
            long jM9464c = pb0.m9464c(iq3VarM13109O1.f21638c.m7278m(), fFloatValue, 0.0f, 0.0f, 0.0f, 14);
            if (iq3VarM13109O1.f21636a) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j70Var.mo11227d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j70Var.mo11227d() & 4294967295L));
                jp0 jp0Var = j70Var.f22064b;
                long jM7219E = jp0Var.m7219E();
                jp0Var.m7248w().mo6253j();
                try {
                    ((jp0) ((ar3) jp0Var.f22481b).f14813b).m7248w().mo6248d(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    u31.m11222g0(yf2Var, jM9464c, this.f35179q, 0L, 124);
                    d55.m4374s(jp0Var, jM7219E);
                } catch (Throwable th) {
                    d55.m4374s(jp0Var, jM7219E);
                    throw th;
                }
            } else {
                u31.m11222g0(yf2Var, jM9464c, this.f35179q, 0L, 124);
            }
        }
        if (((Number) this.f35184v.m8328d()).floatValue() > 0.0f) {
            r50 r50Var = this.f35185w;
            if (r50Var == null) {
                r50Var = new r50((byte) 16);
                VarHandle.storeStoreFence();
            }
            this.f35185w = r50Var;
            m13109O0(false);
        }
    }

    @Override // p000.af2, p000.cr2
    /* JADX INFO: renamed from: b */
    public final void mo2964b(long j) {
        cw2 cw2Var = this.f35182t;
        this.f35181s = true;
        this.f35180r = z62.m13369a0(j);
        if (m13111Q0(m13109O0(false))) {
            z62.m13348G(this);
        }
        Object[] objArr = cw2Var.f16532a;
        int i = cw2Var.f16533b;
        for (int i2 = 0; i2 < i; i2++) {
            m13110P0((hf3) objArr[i2]);
        }
        cw2Var.m4203d();
    }
}
