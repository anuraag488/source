package p000;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1091r0 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public WeakReference f28914a;

    /* JADX INFO: renamed from: b */
    public IBinder f28915b;

    /* JADX INFO: renamed from: c */
    public n35 f28916c;

    /* JADX INFO: renamed from: d */
    public ui0 f28917d;

    /* JADX INFO: renamed from: e */
    public ii0 f28918e;

    /* JADX INFO: renamed from: f */
    public wp1 f28919f;

    /* JADX INFO: renamed from: g */
    public boolean f28920g;

    /* JADX INFO: renamed from: h */
    public boolean f28921h;

    /* JADX INFO: renamed from: i */
    public boolean f28922i;

    public AbstractC1091r0(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC0685ge viewOnAttachStateChangeListenerC0685ge = new ViewOnAttachStateChangeListenerC0685ge((byte) 1);
        viewOnAttachStateChangeListenerC0685ge.f19751b = this;
        VarHandle.storeStoreFence();
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0685ge);
        ds3 ds3Var = new ds3((byte) 29);
        n40.m8507q(this).f35980a.add(ds3Var);
        C1048pv c1048pv = new C1048pv((byte) 17);
        c1048pv.f28016b = this;
        c1048pv.f28017c = viewOnAttachStateChangeListenerC0685ge;
        c1048pv.f28018d = ds3Var;
        VarHandle.storeStoreFence();
        this.f28919f = c1048pv;
    }

    private final void setParentContext(ui0 ui0Var) {
        if (this.f28917d != ui0Var) {
            this.f28917d = ui0Var;
            if (ui0Var != null) {
                this.f28914a = null;
            }
            n35 n35Var = this.f28916c;
            if (n35Var != null) {
                n35Var.mo8488a();
                this.f28916c = null;
                if (isAttachedToWindow()) {
                    m10172f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f28915b != iBinder) {
            this.f28915b = iBinder;
            this.f28914a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3976a(int i, mi0 mi0Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m10169c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m10169c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m10168b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f28918e == null) {
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null) {
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.setComposeViewContext(m10175k(z62.m13397y(this), viewTreeObserverOnGlobalLayoutListenerC1140sc.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                m10172f();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10169c() {
        if (this.f28921h) {
            return;
        }
        qm5.m9919j(zi4.m13621u("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    /* JADX INFO: renamed from: d */
    public final void m10170d() {
        ii0 ii0Var;
        View view;
        if (this.f28917d == null && !isAttachedToWindow() && ((ii0Var = this.f28918e) == null || (view = ii0Var.f21434a) == null || !view.isAttachedToWindow())) {
            C1077qn.m9989o("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            m10172f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10171e() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc ? (ViewTreeObserverOnGlobalLayoutListenerC1140sc) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null && viewTreeObserverOnGlobalLayoutListenerC1140sc.f30080C0) {
            viewTreeObserverOnGlobalLayoutListenerC1140sc.getComposeViewContext().m6806b();
            viewTreeObserverOnGlobalLayoutListenerC1140sc.f30080C0 = false;
        }
        n35 n35Var = this.f28916c;
        if (n35Var != null) {
            n35Var.mo8488a();
        }
        this.f28916c = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final void m10172f() {
        if (this.f28916c == null) {
            byte b = 0;
            try {
                this.f28921h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ii0 ii0VarM10173i = this.f28918e;
                    if (ii0VarM10173i == null) {
                        ii0VarM10173i = m10173i();
                    }
                    C1017p0 c1017p0 = new C1017p0(b);
                    c1017p0.f27254b = this;
                    VarHandle.storeStoreFence();
                    this.f28916c = q35.m9724a(this, ii0VarM10173i, new pg0(1003123809, true, c1017p0));
                    Trace.endSection();
                    this.f28921h = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f28921h = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo3977g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m14027getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(C0995R.id.auto_clear_focus_behavior_tag);
        C0807jq c0807jq = tag instanceof C0807jq ? (C0807jq) tag : null;
        if (c0807jq != null) {
            return c0807jq.f22513a;
        }
        return 1;
    }

    public final ii0 getComposeViewContext$ui() {
        return this.f28918e;
    }

    public final boolean getHasComposition() {
        return this.f28916c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f28920g;
    }

    /* JADX INFO: renamed from: h */
    public void mo3978h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: i */
    public final ii0 m10173i() {
        ii0 composeViewContext;
        py4 py4Var;
        py4 py4Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc ? (ViewTreeObserverOnGlobalLayoutListenerC1140sc) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC1140sc.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewM13397y = z62.m13397y(this);
        ii0 ii0VarM13342A = z62.m13342A(viewM13397y);
        if (ii0VarM13342A != null) {
            return m10175k(viewM13397y, ii0VarM13342A);
        }
        ui0 ui0VarM10174j = m10174j();
        lk2 lk2VarM13694z = zp0.m13694z(viewM13397y);
        if (lk2VarM13694z == null) {
            if (composeViewContext != null) {
                composeViewContext.m6809e();
                lk2VarM13694z = composeViewContext.f21437d;
            } else {
                lk2VarM13694z = null;
            }
            if (lk2VarM13694z == null) {
                C1077qn.m9989o("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        lk2 lk2Var = lk2VarM13694z;
        av3 av3VarM4681D = dt0.m4681D(viewM13397y);
        if (av3VarM4681D == null) {
            if (composeViewContext != null) {
                composeViewContext.m6809e();
                av3VarM4681D = composeViewContext.f21438e;
            } else {
                av3VarM4681D = null;
            }
            if (av3VarM4681D == null) {
                C1077qn.m9989o("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        av3 av3Var = av3VarM4681D;
        py4 py4VarM5352b0 = ev0.m5352b0(viewM13397y);
        if (py4VarM5352b0 == null) {
            if (composeViewContext != null) {
                composeViewContext.m6809e();
                py4Var2 = composeViewContext.f21439f;
            }
            py4Var = py4Var2;
        } else {
            py4Var = py4VarM5352b0;
        }
        ii0 ii0Var = new ii0(z62.m13342A(z62.m13397y(viewM13397y)), viewM13397y, ui0VarM10174j, lk2Var, av3Var, py4Var);
        viewM13397y.setTag(C0995R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(ii0Var));
        return ii0Var;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f28922i || super.isTransitionGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ui0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ui0] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ui0] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [el3] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX INFO: renamed from: j */
    public final ui0 m10174j() {
        ui0 ui0Var;
        ?? M8926a = this.f28917d;
        if (M8926a == 0) {
            M8926a = o15.m8926a(this);
            if (M8926a == 0) {
                Object parent = getParent();
                while (true) {
                    if (M8926a != 0 || !(parent instanceof View)) {
                        M8926a = M8926a;
                        break;
                    }
                    M8926a = M8926a;
                    View view = (View) parent;
                    ui0 ui0VarM8926a = o15.m8926a(view);
                    parent = n40.m8506p(view);
                    M8926a = ui0VarM8926a;
                }
            }
            if (M8926a != 0) {
                ?? r2 = (!(M8926a instanceof el3) || ((cl3) ((el3) M8926a).f18234u.getValue()).compareTo(cl3.f16100b) > 0) ? M8926a : 0;
                if (r2 != 0) {
                    this.f28914a = new WeakReference(r2);
                }
            } else {
                M8926a = 0;
            }
            if (M8926a == 0) {
                WeakReference weakReference = this.f28914a;
                if (weakReference == null || (ui0Var = (ui0) weakReference.get()) == null || ((ui0Var instanceof el3) && ((cl3) ((el3) ui0Var).f18234u.getValue()).compareTo(cl3.f16100b) <= 0)) {
                    M8926a = ui0Var;
                    M8926a = ui0Var;
                    M8926a = 0;
                }
                if (M8926a == 0) {
                    M8926a = o15.m8927b(this);
                    ?? r1 = ((cl3) M8926a.f18234u.getValue()).compareTo(cl3.f16100b) > 0 ? M8926a : 0;
                    if (r1 != 0) {
                        this.f28914a = new WeakReference(r1);
                    }
                }
            }
        }
        return M8926a;
    }

    /* JADX INFO: renamed from: k */
    public final ii0 m10175k(View view, ii0 ii0Var) {
        ui0 ui0VarM10174j = m10174j();
        lk2 lk2VarM13694z = zp0.m13694z(view);
        py4 py4VarM5352b0 = ev0.m5352b0(view);
        av3 av3VarM4681D = dt0.m4681D(view);
        ii0Var.m6809e();
        if (ui0VarM10174j == ii0Var.f21436c) {
            ii0Var.m6809e();
            if (lk2VarM13694z == ii0Var.f21437d) {
                ii0Var.m6809e();
                if (py4VarM5352b0 == ii0Var.f21439f) {
                    ii0Var.m6809e();
                    if (av3VarM4681D == ii0Var.f21438e) {
                        return ii0Var;
                    }
                }
            }
        }
        ro0 ro0VarMo5182k = ui0VarM10174j.mo5182k();
        ii0Var.m6809e();
        if (ro0VarMo5182k != ii0Var.f21436c.mo5182k()) {
            m10171e();
        }
        if (lk2VarM13694z == null) {
            ii0Var.m6809e();
            lk2VarM13694z = ii0Var.f21437d;
        }
        lk2 lk2Var = lk2VarM13694z;
        if (av3VarM4681D == null) {
            ii0Var.m6809e();
            av3VarM4681D = ii0Var.f21438e;
        }
        ii0 ii0Var2 = new ii0(ii0Var, view, ui0VarM10174j, lk2Var, av3VarM4681D, py4VarM5352b0);
        view.setTag(C0995R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(ii0Var2));
        return ii0Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lw2 lw2Var = o15.f26290a;
        Object objM8506p = n40.m8506p(this);
        View view = this;
        while (objM8506p instanceof View) {
            View view2 = (View) objM8506p;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objM8506p = view2.getParent();
        }
        if (view.getParent() != null) {
            m10168b();
            return;
        }
        Handler handler = getHandler();
        RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 0);
        runnableC1054q0.f28115b = this;
        VarHandle.storeStoreFence();
        handler.postAtFrontOfQueue(runnableC1054q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo3977g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m10172f();
        mo3978h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m14028setAutoClearFocusBehavior17tfJxM(int i) {
        C0807jq c0807jq = new C0807jq();
        c0807jq.f22513a = i;
        VarHandle.storeStoreFence();
        setTag(C0995R.id.auto_clear_focus_behavior_tag, c0807jq);
    }

    public final void setComposeViewContext$ui(ii0 ii0Var) {
        if (this.f28918e != ii0Var) {
            if (ii0Var == null) {
                m10171e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc ? (ViewTreeObserverOnGlobalLayoutListenerC1140sc) childAt : null;
                if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null) {
                    ro0 coroutineContext = viewTreeObserverOnGlobalLayoutListenerC1140sc.getCoroutineContext();
                    ii0Var.m6809e();
                    if (coroutineContext != ii0Var.f21436c.mo5182k()) {
                        m10171e();
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.setComposeViewContext(ii0Var);
                }
            }
            this.f28918e = ii0Var;
        }
    }

    public final void setParentCompositionContext(ui0 ui0Var) {
        setParentContext(ui0Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f28920g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) ((r63) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f28922i = true;
    }

    public final void setViewCompositionStrategy(ey4 ey4Var) {
        wp1 wp1Var = this.f28919f;
        if (wp1Var != null) {
            wp1Var.invoke();
        }
        this.f28919f = ey4Var.mo5421c(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m10169c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m10169c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m10169c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m10169c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m10169c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
