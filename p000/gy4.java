package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.lang.invoke.VarHandle;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gy4 extends AbstractC0492bi {

    /* JADX INFO: renamed from: B */
    public final View f20194B;

    /* JADX INFO: renamed from: C */
    public final g03 f20195C;

    /* JADX INFO: renamed from: D */
    public ku3 f20196D;

    /* JADX INFO: renamed from: E */
    public yp1 f20197E;

    /* JADX INFO: renamed from: F */
    public yp1 f20198F;

    /* JADX INFO: renamed from: G */
    public yp1 f20199G;

    public gy4(Context context, yp1 yp1Var, gr1 gr1Var, lu3 lu3Var, int i, r63 r63Var) {
        View view = (View) yp1Var.invoke(context);
        g03 g03Var = new g03();
        super(context);
        this.f15284a = g03Var;
        this.f15285b = view;
        this.f15286c = r63Var;
        lw2 lw2Var = o15.f26290a;
        setTag(C0995R.id.androidx_compose_ui_view_composition_context, gr1Var);
        byte b = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C1331xh c1331xh = new C1331xh(this);
        int i2 = cy4.f16619a;
        wd3.m12235n(this, c1331xh);
        yx4.m13270a(this, this);
        this.f15287d = new C0515c5((byte) 10);
        byte b2 = 11;
        this.f15289f = new C0515c5((byte) 11);
        this.f15290g = new C0515c5((byte) 12);
        kt2 kt2Var = kt2.f23428a;
        this.f15291h = kt2Var;
        this.f15293j = oh6.m9098d(1.0f, 1.0f);
        byte b3 = 2;
        this.f15297n = new int[2];
        this.f15298o = 0L;
        C1293wh c1293wh = new C1293wh(b);
        c1293wh.f33372b = this;
        VarHandle.storeStoreFence();
        this.f15301r = c1293wh;
        byte b4 = 1;
        C1293wh c1293wh2 = new C1293wh(b4);
        c1293wh2.f33372b = this;
        VarHandle.storeStoreFence();
        this.f15302s = c1293wh2;
        this.f15304u = new int[2];
        this.f15305v = Integer.MIN_VALUE;
        this.f15306w = Integer.MIN_VALUE;
        this.f15307x = new r50((byte) 13);
        wf2 wf2Var = new wf2(3);
        wf2Var.f33326p = this;
        nt2 nt2VarM5458a = f14.m5458a(d24.m4289D(kt2Var, n40.f25430a, g03Var), true, new C0891m((byte) 20));
        rc3 rc3Var = new rc3();
        C1283w7 c1283w7 = new C1283w7((byte) 15);
        c1283w7.f33126b = rc3Var;
        c1283w7.f33128d = qc3.f28383a;
        VarHandle.storeStoreFence();
        rc3Var.f29153d = c1283w7;
        VarHandle.storeStoreFence();
        C1256vh c1256vh = new C1256vh(b3);
        c1256vh.f32604b = this;
        VarHandle.storeStoreFence();
        rc3Var.f29150a = c1256vh;
        C1143sf c1143sf = new C1143sf((byte) 4);
        C1143sf c1143sf2 = rc3Var.f29151b;
        if (c1143sf2 != null) {
            c1143sf2.f30223b = null;
        }
        rc3Var.f29151b = c1143sf;
        c1143sf.f30223b = rc3Var;
        setOnRequestDisallowInterceptTouchEvent$ui(c1143sf);
        nt2 nt2VarMo7630d = nt2VarM5458a.mo7630d(rc3Var);
        C1164t c1164t = new C1164t(b3);
        c1164t.f30700c = this;
        c1164t.f30699b = wf2Var;
        c1164t.f30701d = this;
        VarHandle.storeStoreFence();
        nt2 nt2VarM5542m = C0638f5.m5542m(nt2VarMo7630d, c1164t);
        C1219uh c1219uh = new C1219uh(b);
        c1219uh.f31864b = this;
        c1219uh.f31865c = wf2Var;
        VarHandle.storeStoreFence();
        nt2 nt2VarM9120z = oh6.m9120z(nt2VarM5542m, c1219uh);
        C1256vh c1256vh2 = new C1256vh(b);
        c1256vh2.f32604b = this;
        VarHandle.storeStoreFence();
        y20 y20Var = new y20();
        y20Var.f34819a = c1256vh2;
        VarHandle.storeStoreFence();
        nt2 nt2VarMo7630d2 = nt2VarM9120z.mo7630d(y20Var);
        wf2Var.m12278f0(this.f15291h.mo7630d(nt2VarMo7630d2));
        C0558d0 c0558d0 = new C0558d0((byte) 7);
        c0558d0.f16655b = wf2Var;
        c0558d0.f16656c = nt2VarMo7630d2;
        VarHandle.storeStoreFence();
        this.f15292i = c0558d0;
        wf2Var.m12272b0(this.f15293j);
        C1127s c1127s = new C1127s(b2);
        c1127s.f29778b = wf2Var;
        VarHandle.storeStoreFence();
        this.f15294k = c1127s;
        C1219uh c1219uh2 = new C1219uh(b4);
        c1219uh2.f31864b = this;
        c1219uh2.f31865c = wf2Var;
        VarHandle.storeStoreFence();
        wf2Var.f33306N = c1219uh2;
        C1256vh c1256vh3 = new C1256vh(b4);
        c1256vh3.f32604b = this;
        VarHandle.storeStoreFence();
        wf2Var.f33307O = c1256vh3;
        C1368yh c1368yh = new C1368yh();
        c1368yh.f35218a = this;
        c1368yh.f35219b = wf2Var;
        VarHandle.storeStoreFence();
        wf2Var.m12276e0(c1368yh);
        this.f15309z = wf2Var;
        this.f20194B = view;
        this.f20195C = g03Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo8112d = lu3Var != null ? lu3Var.mo8112d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo8112d instanceof SparseArray ? (SparseArray) objMo8112d : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (lu3Var != null) {
            C1293wh c1293wh3 = new C1293wh(b3);
            c1293wh3.f33372b = this;
            VarHandle.storeStoreFence();
            setSavableRegistryEntry(lu3Var.mo8109a(strValueOf, c1293wh3));
        }
        C0891m c0891m = zp0.f36238a;
        this.f20197E = c0891m;
        this.f20198F = c0891m;
        this.f20199G = c0891m;
    }

    /* JADX INFO: renamed from: i */
    public static final void m6196i(gy4 gy4Var) {
        gy4Var.f20199G.invoke(gy4Var.f20194B);
        gy4Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(ku3 ku3Var) {
        ku3 ku3Var2 = this.f20196D;
        if (ku3Var2 != null) {
            ((tt2) ku3Var2).m11145D();
        }
        this.f20196D = ku3Var;
    }

    public final g03 getDispatcher() {
        return this.f20195C;
    }

    public final yp1 getReleaseBlock() {
        return this.f20199G;
    }

    public final yp1 getResetBlock() {
        return this.f20198F;
    }

    public /* bridge */ /* synthetic */ AbstractC1091r0 getSubCompositionView() {
        return null;
    }

    public final yp1 getUpdateBlock() {
        return this.f20197E;
    }

    public final void setReleaseBlock(yp1 yp1Var) {
        this.f20199G = yp1Var;
        C1293wh c1293wh = new C1293wh((byte) 3);
        c1293wh.f33372b = this;
        VarHandle.storeStoreFence();
        setRelease(c1293wh);
    }

    public final void setResetBlock(yp1 yp1Var) {
        this.f20198F = yp1Var;
        C1293wh c1293wh = new C1293wh((byte) 4);
        c1293wh.f33372b = this;
        VarHandle.storeStoreFence();
        setReset(c1293wh);
    }

    public final void setUpdateBlock(yp1 yp1Var) {
        this.f20197E = yp1Var;
        C1293wh c1293wh = new C1293wh((byte) 5);
        c1293wh.f33372b = this;
        VarHandle.storeStoreFence();
        setUpdate(c1293wh);
    }

    public View getViewRoot() {
        return this;
    }
}
