package p000;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.invoke.VarHandle;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: bi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0492bi extends ViewGroup implements ph0, s63, k33 {

    /* JADX INFO: renamed from: A */
    public static final C0891m f15283A = new C0891m((byte) 19);

    /* JADX INFO: renamed from: a */
    public g03 f15284a;

    /* JADX INFO: renamed from: b */
    public View f15285b;

    /* JADX INFO: renamed from: c */
    public r63 f15286c;

    /* JADX INFO: renamed from: d */
    public wp1 f15287d;

    /* JADX INFO: renamed from: e */
    public boolean f15288e;

    /* JADX INFO: renamed from: f */
    public wp1 f15289f;

    /* JADX INFO: renamed from: g */
    public wp1 f15290g;

    /* JADX INFO: renamed from: h */
    public nt2 f15291h;

    /* JADX INFO: renamed from: i */
    public yp1 f15292i;

    /* JADX INFO: renamed from: j */
    public ky0 f15293j;

    /* JADX INFO: renamed from: k */
    public yp1 f15294k;

    /* JADX INFO: renamed from: l */
    public lk2 f15295l;

    /* JADX INFO: renamed from: m */
    public av3 f15296m;

    /* JADX INFO: renamed from: n */
    public int[] f15297n;

    /* JADX INFO: renamed from: o */
    public long f15298o;

    /* JADX INFO: renamed from: p */
    public w05 f15299p;

    /* JADX INFO: renamed from: q */
    public yp1 f15300q;

    /* JADX INFO: renamed from: r */
    public C1293wh f15301r;

    /* JADX INFO: renamed from: s */
    public C1293wh f15302s;

    /* JADX INFO: renamed from: t */
    public yp1 f15303t;

    /* JADX INFO: renamed from: u */
    public int[] f15304u;

    /* JADX INFO: renamed from: v */
    public int f15305v;

    /* JADX INFO: renamed from: w */
    public int f15306w;

    /* JADX INFO: renamed from: x */
    public r50 f15307x;

    /* JADX INFO: renamed from: y */
    public boolean f15308y;

    /* JADX INFO: renamed from: z */
    public wf2 f15309z;

    /* JADX INFO: renamed from: e */
    public static g42 m3596e(g42 g42Var, int i, int i2, int i3, int i4) {
        int i5 = g42Var.f19606a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = g42Var.f19607b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = g42Var.f19608c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = g42Var.f19609d - i4;
        return g42.m5898a(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m3597g(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(sc6.m10675p(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    private final u63 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            q32.m9721c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f15286c).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: h */
    public static final void m3598h(gy4 gy4Var) {
        if (gy4Var.f15288e && gy4Var.isAttachedToWindow() && gy4Var.f15285b.getParent() == gy4Var) {
            u63 snapshotObserver = gy4Var.getSnapshotObserver();
            snapshotObserver.f31675a.m159e(gy4Var, f15283A, gy4Var.f15287d);
        }
    }

    @Override // p000.s63
    /* JADX INFO: renamed from: F */
    public final boolean mo3599F() {
        return isAttachedToWindow();
    }

    @Override // p000.ph0
    /* JADX INFO: renamed from: a */
    public final void mo3600a() {
        View view = this.f15285b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f15289f.invoke();
        }
    }

    @Override // p000.k33
    /* JADX INFO: renamed from: b */
    public final w05 mo3601b(w05 w05Var) {
        this.f15299p = new w05(w05Var);
        return m3604f(w05Var);
    }

    @Override // p000.ph0
    /* JADX INFO: renamed from: c */
    public final void mo3602c() {
        this.f15290g.invoke();
    }

    @Override // p000.ph0
    /* JADX INFO: renamed from: d */
    public final void mo3603d() {
        this.f15289f.invoke();
        removeAllViewsInLayout();
    }

    /* JADX INFO: renamed from: f */
    public final w05 m3604f(w05 w05Var) {
        t05 t05Var = w05Var.f33012a;
        g42 g42VarMo7777i = t05Var.mo7777i(-1);
        g42 g42Var = g42.f19605e;
        if (!g42VarMo7777i.equals(g42Var) || !t05Var.mo7778j(-9).equals(g42Var) || t05Var.mo8475h() != null) {
            w32 w32Var = (w32) this.f15309z.f33299G.f25607d;
            if (w32Var.f33059e0.f25208n) {
                long jM12827F0 = y42.m12827F0(w32Var.mo4005S(0L));
                int i = (int) (jM12827F0 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jM12827F0 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jMo4004R = y42.m12861j0(w32Var).mo4004R();
                int i3 = (int) (jMo4004R >> 32);
                int i4 = (int) (jMo4004R & 4294967295L);
                long j = w32Var.f16901c;
                long jM12827F1 = y42.m12827F0(w32Var.mo4005S((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jM12827F1 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jM12827F1));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return w05Var.f33012a.mo7782r(i, i2, i5, i7);
                }
            }
        }
        return w05Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        int[] iArr = this.f15304u;
        if (region == null) {
            return true;
        }
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final ky0 getDensity() {
        return this.f15293j;
    }

    public final View getInteropView() {
        return this.f15285b;
    }

    public final wf2 getLayoutNode() {
        return this.f15309z;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f15285b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final lk2 getLifecycleOwner() {
        return this.f15295l;
    }

    public final nt2 getModifier() {
        return this.f15291h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.f15307x.getClass();
        return 0;
    }

    public final yp1 getOnDensityChanged$ui() {
        return this.f15294k;
    }

    public final yp1 getOnModifierChanged$ui() {
        return this.f15292i;
    }

    public final yp1 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f15303t;
    }

    public final wp1 getRelease() {
        return this.f15290g;
    }

    public final wp1 getReset() {
        return this.f15289f;
    }

    public final av3 getSavedStateRegistryOwner() {
        return this.f15296m;
    }

    public final wp1 getUpdate() {
        return this.f15287d;
    }

    public final View getView() {
        return this.f15285b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f15308y) {
            this.f15309z.m12251D();
            return null;
        }
        View view = this.f15285b;
        C1293wh c1293wh = this.f15302s;
        RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 5);
        runnableC1054q0.f28115b = c1293wh;
        VarHandle.storeStoreFence();
        view.postOnAnimation(runnableC1054q0);
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f15285b.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15301r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f15308y) {
            this.f15309z.m12251D();
            return;
        }
        View view3 = this.f15285b;
        C1293wh c1293wh = this.f15302s;
        RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 5);
        runnableC1054q0.f28115b = c1293wh;
        VarHandle.storeStoreFence();
        view3.postOnAnimation(runnableC1054q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f31675a.m156b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f15285b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.f15285b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f15305v = i;
        this.f15306w = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f15285b.isNestedScrollingEnabled()) {
            return false;
        }
        lb5.m7910S(this.f15284a.m5872c(), null, null, new C1405zh(z, this, qs5.m10097b(f * (-1.0f), f2 * (-1.0f)), null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.f15285b.isNestedScrollingEnabled()) {
            return false;
        }
        lb5.m7910S(this.f15284a.m5872c(), null, null, new C0455ai((byte) 0, qs5.m10097b(f * (-1.0f), f2 * (-1.0f)), null, this), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        yp1 yp1Var = this.f15300q;
        if (yp1Var == null) {
            return true;
        }
        yp1Var.invoke(rect != null ? new jl3(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        yp1 yp1Var = this.f15303t;
        if (yp1Var != null) {
            yp1Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(ky0 ky0Var) {
        if (ky0Var != this.f15293j) {
            this.f15293j = ky0Var;
            yp1 yp1Var = this.f15294k;
            if (yp1Var != null) {
                yp1Var.invoke(ky0Var);
            }
        }
    }

    public final void setLifecycleOwner(lk2 lk2Var) {
        if (lk2Var != this.f15295l) {
            this.f15295l = lk2Var;
            setTag(C0995R.id.view_tree_lifecycle_owner, lk2Var);
        }
    }

    public final void setModifier(nt2 nt2Var) {
        if (nt2Var != this.f15291h) {
            this.f15291h = nt2Var;
            yp1 yp1Var = this.f15292i;
            if (yp1Var != null) {
                yp1Var.invoke(nt2Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(yp1 yp1Var) {
        this.f15294k = yp1Var;
    }

    public final void setOnModifierChanged$ui(yp1 yp1Var) {
        this.f15292i = yp1Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(yp1 yp1Var) {
        this.f15303t = yp1Var;
    }

    public final void setRelease(wp1 wp1Var) {
        this.f15290g = wp1Var;
    }

    public final void setReset(wp1 wp1Var) {
        this.f15289f = wp1Var;
    }

    public final void setSavedStateRegistryOwner(av3 av3Var) {
        if (av3Var != this.f15296m) {
            this.f15296m = av3Var;
            setTag(C0995R.id.view_tree_saved_state_registry_owner, av3Var);
        }
    }

    public final void setUpdate(wp1 wp1Var) {
        this.f15287d = wp1Var;
        this.f15288e = true;
        this.f15301r.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
