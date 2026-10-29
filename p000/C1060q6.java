package p000;

import ads_mobile_sdk.sg0;
import ads_mobile_sdk.z01;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1060q6 extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f28231d = 0;

    /* JADX INFO: renamed from: a */
    public InterfaceC1309ww f28232a;

    /* JADX INFO: renamed from: b */
    public C0516c6 f28233b;

    /* JADX INFO: renamed from: c */
    public b80 f28234c;

    /* JADX INFO: renamed from: a */
    public final void m9743a() {
        b80 b80Var = this.f28234c;
        if (b80Var != null) {
            x45.f33989a.getClass();
            lb5.m7910S((zo0) ((sg0) z01.m2787a()).f11524u.get(), null, null, new wp4(b80Var, null, (byte) 14), 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9744b() {
        C0516c6 c0516c6 = this.f28233b;
        if (this.f28232a == null && c0516c6 != null) {
            setMinimumHeight((int) Math.ceil(TypedValue.applyDimension(1, c0516c6.f15823b, getContext().getResources().getDisplayMetrics())));
            setMinimumWidth((int) Math.ceil(TypedValue.applyDimension(1, c0516c6.f15822a, getContext().getResources().getDisplayMetrics())));
        } else {
            setMinimumHeight(0);
            setMinimumWidth(0);
        }
        requestLayout();
    }

    public final InterfaceC1309ww getBannerAd() {
        return this.f28232a;
    }
}
