package p000;

import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1368yh implements xq2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ gy4 f35218a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wf2 f35219b;

    @Override // p000.xq2
    /* JADX INFO: renamed from: a */
    public final int mo6053a(s62 s62Var, List list, int i) {
        gy4 gy4Var = this.f35218a;
        gy4Var.measure(AbstractC0492bi.m3597g(0, i, gy4Var.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return gy4Var.getMeasuredHeight();
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: b */
    public final int mo5762b(s62 s62Var, List list, int i) {
        gy4 gy4Var = this.f35218a;
        gy4Var.measure(View.MeasureSpec.makeMeasureSpec(0, 0), AbstractC0492bi.m3597g(0, i, gy4Var.getLayoutParams().height));
        return gy4Var.getMeasuredWidth();
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: f */
    public final yq2 mo5763f(zq2 zq2Var, List list, long j) {
        gy4 gy4Var = this.f35218a;
        int childCount = gy4Var.getChildCount();
        Map map = w71.f33134a;
        if (childCount == 0) {
            return zq2Var.mo3583l0(kl0.m7541k(j), kl0.m7540j(j), map, new C0891m((byte) 21));
        }
        if (kl0.m7541k(j) != 0) {
            gy4Var.getChildAt(0).setMinimumWidth(kl0.m7541k(j));
        }
        if (kl0.m7540j(j) != 0) {
            gy4Var.getChildAt(0).setMinimumHeight(kl0.m7540j(j));
        }
        gy4Var.measure(AbstractC0492bi.m3597g(kl0.m7541k(j), kl0.m7539i(j), gy4Var.getLayoutParams().width), AbstractC0492bi.m3597g(kl0.m7540j(j), kl0.m7538h(j), gy4Var.getLayoutParams().height));
        int measuredWidth = gy4Var.getMeasuredWidth();
        int measuredHeight = gy4Var.getMeasuredHeight();
        wf2 wf2Var = this.f35219b;
        C1219uh c1219uh = new C1219uh((byte) 2);
        c1219uh.f31864b = gy4Var;
        c1219uh.f31865c = wf2Var;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(measuredWidth, measuredHeight, map, c1219uh);
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: g */
    public final int mo6054g(s62 s62Var, List list, int i) {
        gy4 gy4Var = this.f35218a;
        gy4Var.measure(AbstractC0492bi.m3597g(0, i, gy4Var.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return gy4Var.getMeasuredHeight();
    }

    @Override // p000.xq2
    /* JADX INFO: renamed from: i */
    public final int mo6055i(s62 s62Var, List list, int i) {
        gy4 gy4Var = this.f35218a;
        gy4Var.measure(View.MeasureSpec.makeMeasureSpec(0, 0), AbstractC0492bi.m3597g(0, i, gy4Var.getLayoutParams().height));
        return gy4Var.getMeasuredWidth();
    }
}
