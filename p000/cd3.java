package p000;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cd3 extends AbstractC1091r0 {

    /* JADX INFO: renamed from: D */
    public static final t63 f15940D = new t63(3);

    /* JADX INFO: renamed from: A */
    public d83 f15941A;

    /* JADX INFO: renamed from: B */
    public boolean f15942B;

    /* JADX INFO: renamed from: C */
    public int[] f15943C;

    /* JADX INFO: renamed from: j */
    public wp1 f15944j;

    /* JADX INFO: renamed from: k */
    public ed3 f15945k;

    /* JADX INFO: renamed from: l */
    public String f15946l;

    /* JADX INFO: renamed from: m */
    public View f15947m;

    /* JADX INFO: renamed from: n */
    public boolean f15948n;

    /* JADX INFO: renamed from: o */
    public f70 f15949o;

    /* JADX INFO: renamed from: p */
    public WindowManager f15950p;

    /* JADX INFO: renamed from: q */
    public WindowManager.LayoutParams f15951q;

    /* JADX INFO: renamed from: r */
    public dd3 f15952r;

    /* JADX INFO: renamed from: s */
    public df2 f15953s;

    /* JADX INFO: renamed from: t */
    public d83 f15954t;

    /* JADX INFO: renamed from: u */
    public d83 f15955u;

    /* JADX INFO: renamed from: v */
    public s52 f15956v;

    /* JADX INFO: renamed from: w */
    public wy0 f15957w;

    /* JADX INFO: renamed from: x */
    public Rect f15958x;

    /* JADX INFO: renamed from: y */
    public aa4 f15959y;

    /* JADX INFO: renamed from: z */
    public C1185tk f15960z;

    private final mq1 getContent() {
        return (mq1) this.f15941A.getValue();
    }

    private final s52 getDisplayBounds() {
        View view = this.f15947m;
        Rect rect = this.f15958x;
        int i = this.f15945k.f18017a & 512;
        f70 f70Var = this.f15949o;
        if (i == 0) {
            f70Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            f70Var.getClass();
            rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
        }
        return new s52(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final cf2 getParentLayoutCoordinates() {
        return (cf2) this.f15955u.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m3975l(cd3 cd3Var) {
        cf2 parentLayoutCoordinates = cd3Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.mo4000K()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || cd3Var.m13899getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(mq1 mq1Var) {
        this.f15941A.setValue(mq1Var);
    }

    private final void setParentLayoutCoordinates(cf2 cf2Var) {
        this.f15955u.setValue(cf2Var);
    }

    @Override // p000.AbstractC1091r0
    /* JADX INFO: renamed from: a */
    public final void mo3976a(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-857613600);
        int i2 = i | (ir1Var.m6894i(this) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1017p0 c1017p0 = new C1017p0((byte) 27);
            c1017p0.f27254b = this;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1017p0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15945k.f18019c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                wp1 wp1Var = this.f15944j;
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p000.AbstractC1091r0
    /* JADX INFO: renamed from: g */
    public final void mo3977g(boolean z, int i, int i2, int i3, int i4) {
        WindowManager.LayoutParams layoutParams = this.f15951q;
        super.mo3977g(z, i, i2, i3, i4);
        this.f15945k.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        f70 f70Var = this.f15949o;
        WindowManager windowManager = this.f15950p;
        f70Var.getClass();
        windowManager.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f15957w.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f15951q;
    }

    public final df2 getParentLayoutDirection() {
        return this.f15953s;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final w52 m13899getPopupContentSizebOM6tXw() {
        return (w52) this.f15954t.getValue();
    }

    public final dd3 getPositionProvider() {
        return this.f15952r;
    }

    @Override // p000.AbstractC1091r0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15942B;
    }

    public final String getTestTag() {
        return this.f15946l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // p000.AbstractC1091r0
    /* JADX INFO: renamed from: h */
    public final void mo3978h(int i, int i2) {
        this.f15945k.getClass();
        s52 displayBounds = getDisplayBounds();
        super.mo3978h(View.MeasureSpec.makeMeasureSpec(displayBounds.f29918c - displayBounds.f29916a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.f29919d - displayBounds.f29917b, Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: m */
    public final void m3979m(gr1 gr1Var, pg0 pg0Var) {
        setParentCompositionContext(gr1Var);
        setContent(pg0Var);
        this.f15942B = true;
    }

    /* JADX INFO: renamed from: n */
    public final void m3980n(wp1 wp1Var, ed3 ed3Var, String str, df2 df2Var) {
        int i;
        this.f15944j = wp1Var;
        this.f15946l = str;
        WindowManager.LayoutParams layoutParams = this.f15951q;
        if (!z62.m13387o(this.f15945k, ed3Var)) {
            ed3Var.getClass();
            this.f15945k = ed3Var;
            boolean zM11537b = AbstractC1217uf.m11537b(this.f15947m);
            boolean z = ed3Var.f18018b;
            int i2 = ed3Var.f18017a;
            if (z && zM11537b) {
                i2 |= 8192;
            } else if (z && !zM11537b) {
                i2 &= -8193;
            }
            layoutParams.flags = i2;
            f70 f70Var = this.f15949o;
            WindowManager windowManager = this.f15950p;
            f70Var.getClass();
            windowManager.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = df2Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m3981o() {
        cf2 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo4000K()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo4004R = parentLayoutCoordinates.mo4004R();
            long jMo4007b = this.f15948n ? parentLayoutCoordinates.mo4007b(0L) : parentLayoutCoordinates.mo4009k(0L);
            s52 s52VarM12971h = y62.m12971h((((long) Math.round(Float.intBitsToFloat((int) (jMo4007b >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jMo4007b & 4294967295L))))), jMo4004R);
            if (s52VarM12971h.equals(this.f15956v)) {
                return;
            }
            this.f15956v = s52VarM12971h;
            m3983q();
        }
    }

    @Override // p000.AbstractC1091r0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15959y.m160f();
        if (this.f15945k.f18019c) {
            C1185tk c1185tk = this.f15960z;
            if (c1185tk == null) {
                wp1 wp1Var = this.f15944j;
                C1185tk c1185tk2 = new C1185tk((byte) 0);
                c1185tk2.f31205b = wp1Var;
                VarHandle.storeStoreFence();
                this.f15960z = c1185tk2;
                c1185tk = c1185tk2;
            }
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c1185tk);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        super.onDetachedFromWindow();
        aa4 aa4Var = this.f15959y;
        C1040pn c1040pn = aa4Var.f217h;
        if (c1040pn != null) {
            c1040pn.m9573k();
        }
        aa4Var.m155a();
        C1185tk c1185tk = this.f15960z;
        if (c1185tk != null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher()) != null) {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(c1185tk);
        }
        this.f15960z = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15945k.f18020d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            wp1 wp1Var = this.f15944j;
            if (wp1Var != null) {
                wp1Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            wp1 wp1Var2 = this.f15944j;
            if (wp1Var2 != null) {
                wp1Var2.invoke();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m3982p(cf2 cf2Var) {
        setParentLayoutCoordinates(cf2Var);
        m3981o();
    }

    /* JADX INFO: renamed from: q */
    public final void m3983q() {
        w52 w52VarM13899getPopupContentSizebOM6tXw;
        f70 f70Var = this.f15949o;
        WindowManager.LayoutParams layoutParams = this.f15951q;
        s52 s52Var = this.f15956v;
        if (s52Var == null || (w52VarM13899getPopupContentSizebOM6tXw = m13899getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = w52VarM13899getPopupContentSizebOM6tXw.f33109a;
        s52 displayBounds = getDisplayBounds();
        long j2 = (((long) (displayBounds.f29918c - displayBounds.f29916a)) << 32) | (((long) (displayBounds.f29919d - displayBounds.f29917b)) & 4294967295L);
        pl3 pl3Var = new pl3();
        pl3Var.f27736a = 0L;
        aa4 aa4Var = this.f15959y;
        ad3 ad3Var = new ad3();
        ad3Var.f259a = pl3Var;
        ad3Var.f260b = this;
        ad3Var.f261c = s52Var;
        ad3Var.f262d = j2;
        ad3Var.f263e = j;
        VarHandle.storeStoreFence();
        aa4Var.m159e(this, f15940D, ad3Var);
        long j3 = pl3Var.f27736a;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        if (this.f15945k.f18021e) {
            f70Var.getClass();
            setSystemGestureExclusionRects(kx5.m7699b0(new Rect(0, 0, (int) (j2 >> 32), (int) (j2 & 4294967295L))));
        }
        WindowManager windowManager = this.f15950p;
        f70Var.getClass();
        windowManager.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(df2 df2Var) {
        this.f15953s = df2Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m13900setPopupContentSizefhxjrPA(w52 w52Var) {
        this.f15954t.setValue(w52Var);
    }

    public final void setPositionProvider(dd3 dd3Var) {
        this.f15952r = dd3Var;
    }

    public final void setTestTag(String str) {
        this.f15946l = str;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC1091r0 getSubCompositionView() {
        return this;
    }
}
