package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import java.lang.invoke.VarHandle;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: sc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1140sc extends ViewGroup implements r63, xq3, jw0, e63, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, yk1 {

    /* JADX INFO: renamed from: H0 */
    public static Class f30070H0;

    /* JADX INFO: renamed from: I0 */
    public static Method f30071I0;

    /* JADX INFO: renamed from: J0 */
    public static final cw2 f30072J0 = new cw2();

    /* JADX INFO: renamed from: K0 */
    public static RunnableC0484ba f30073K0;

    /* JADX INFO: renamed from: L0 */
    public static Method f30074L0;

    /* JADX INFO: renamed from: A */
    public cw2 f30075A;

    /* JADX INFO: renamed from: A0 */
    public C0570dc f30076A0;

    /* JADX INFO: renamed from: B */
    public cw2 f30077B;

    /* JADX INFO: renamed from: B0 */
    public boolean f30078B0;

    /* JADX INFO: renamed from: C */
    public boolean f30079C;

    /* JADX INFO: renamed from: C0 */
    public boolean f30080C0;

    /* JADX INFO: renamed from: D */
    public boolean f30081D;

    /* JADX INFO: renamed from: D0 */
    public boolean f30082D0;

    /* JADX INFO: renamed from: E */
    public gu2 f30083E;

    /* JADX INFO: renamed from: E0 */
    public wd3 f30084E0;

    /* JADX INFO: renamed from: F */
    public g90 f30085F;

    /* JADX INFO: renamed from: F0 */
    public View f30086F0;

    /* JADX INFO: renamed from: G */
    public d83 f30087G;

    /* JADX INFO: renamed from: G0 */
    public C0978oc f30088G0;

    /* JADX INFO: renamed from: H */
    public wy0 f30089H;

    /* JADX INFO: renamed from: I */
    public C1250vb f30090I;

    /* JADX INFO: renamed from: J */
    public C1287wb f30091J;

    /* JADX INFO: renamed from: K */
    public boolean f30092K;

    /* JADX INFO: renamed from: L */
    public u63 f30093L;

    /* JADX INFO: renamed from: M */
    public C0689gi f30094M;

    /* JADX INFO: renamed from: N */
    public kl0 f30095N;

    /* JADX INFO: renamed from: O */
    public boolean f30096O;

    /* JADX INFO: renamed from: P */
    public uq2 f30097P;

    /* JADX INFO: renamed from: Q */
    public long f30098Q;

    /* JADX INFO: renamed from: R */
    public int[] f30099R;

    /* JADX INFO: renamed from: S */
    public float[] f30100S;

    /* JADX INFO: renamed from: T */
    public Matrix f30101T;

    /* JADX INFO: renamed from: U */
    public float[] f30102U;

    /* JADX INFO: renamed from: V */
    public float[] f30103V;

    /* JADX INFO: renamed from: W */
    public long f30104W;

    /* JADX INFO: renamed from: a */
    public d83 f30105a;

    /* JADX INFO: renamed from: a0 */
    public boolean f30106a0;

    /* JADX INFO: renamed from: b */
    public long f30107b;

    /* JADX INFO: renamed from: b0 */
    public long f30108b0;

    /* JADX INFO: renamed from: c */
    public boolean f30109c;

    /* JADX INFO: renamed from: c0 */
    public yp1 f30110c0;

    /* JADX INFO: renamed from: d */
    public r22 f30111d;

    /* JADX INFO: renamed from: d0 */
    public dl4 f30112d0;

    /* JADX INFO: renamed from: e */
    public qk2 f30113e;

    /* JADX INFO: renamed from: e0 */
    public bl4 f30114e0;

    /* JADX INFO: renamed from: f */
    public rk2 f30115f;

    /* JADX INFO: renamed from: f0 */
    public AtomicReference f30116f0;

    /* JADX INFO: renamed from: g */
    public x01 f30117g;

    /* JADX INFO: renamed from: g0 */
    public ay0 f30118g0;

    /* JADX INFO: renamed from: h */
    public hp3 f30119h;

    /* JADX INFO: renamed from: h0 */
    public sw2 f30120h0;

    /* JADX INFO: renamed from: i */
    public C0461ao f30121i;

    /* JADX INFO: renamed from: i0 */
    public d83 f30122i0;

    /* JADX INFO: renamed from: j */
    public RunnableC0757ic f30123j;

    /* JADX INFO: renamed from: j0 */
    public d42 f30124j0;

    /* JADX INFO: renamed from: k */
    public d83 f30125k;

    /* JADX INFO: renamed from: k0 */
    public ot2 f30126k0;

    /* JADX INFO: renamed from: l */
    public View f30127l;

    /* JADX INFO: renamed from: l0 */
    public C0835kh f30128l0;

    /* JADX INFO: renamed from: m */
    public bl1 f30129m;

    /* JADX INFO: renamed from: m0 */
    public MotionEvent f30130m0;

    /* JADX INFO: renamed from: n */
    public ro0 f30131n;

    /* JADX INFO: renamed from: n0 */
    public long f30132n0;

    /* JADX INFO: renamed from: o */
    public ViewOnDragListenerC1141sd f30133o;

    /* JADX INFO: renamed from: o0 */
    public pq3 f30134o0;

    /* JADX INFO: renamed from: p */
    public d83 f30135p;

    /* JADX INFO: renamed from: p0 */
    public cw2 f30136p0;

    /* JADX INFO: renamed from: q */
    public wy0 f30137q;

    /* JADX INFO: renamed from: q0 */
    public float f30138q0;

    /* JADX INFO: renamed from: r */
    public j42 f30139r;

    /* JADX INFO: renamed from: r0 */
    public float f30140r0;

    /* JADX INFO: renamed from: s */
    public wf2 f30141s;

    /* JADX INFO: renamed from: s0 */
    public float f30142s0;

    /* JADX INFO: renamed from: t */
    public lv2 f30143t;

    /* JADX INFO: renamed from: t0 */
    public float f30144t0;

    /* JADX INFO: renamed from: u */
    public ll3 f30145u;

    /* JADX INFO: renamed from: u0 */
    public RunnableC1029pc f30146u0;

    /* JADX INFO: renamed from: v */
    public l14 f30147v;

    /* JADX INFO: renamed from: v0 */
    public RunnableC0757ic f30148v0;

    /* JADX INFO: renamed from: w */
    public ViewOnAttachStateChangeListenerC1400zc f30149w;

    /* JADX INFO: renamed from: w0 */
    public boolean f30150w0;

    /* JADX INFO: renamed from: x */
    public ViewOnAttachStateChangeListenerC0758id f30151x;

    /* JADX INFO: renamed from: x0 */
    public mq1 f30152x0;

    /* JADX INFO: renamed from: y */
    public C0722he f30153y;

    /* JADX INFO: renamed from: y0 */
    public c32 f30154y0;

    /* JADX INFO: renamed from: z */
    public C0739hv f30155z;

    /* JADX INFO: renamed from: z0 */
    public C0570dc f30156z0;

    /* JADX INFO: renamed from: d */
    public static void m10590d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) childAt).m10622v();
            } else if (childAt instanceof ViewGroup) {
                m10590d((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m10591f(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        xy4.m12787p();
        return 0L;
    }

    private final k70 getCanvasHolder() {
        return getComposeViewContext().f21454u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f30137q.getValue()).booleanValue();
    }

    private final dl4 getLegacyTextInputServiceAndroid() {
        dl4 dl4Var = this.f30112d0;
        if (dl4Var != null) {
            return dl4Var;
        }
        View view = getView();
        ExecutorC0646fc executorC0646fc = new ExecutorC0646fc();
        executorC0646fc.f18898a = this;
        VarHandle.storeStoreFence();
        jp0 jp0Var = new jp0((byte) 23, false);
        jp0Var.f22481b = view;
        aj2 aj2Var = aj2.f14537b;
        byte b = 1;
        g32 g32Var = new g32(b);
        g32Var.f19558b = jp0Var;
        VarHandle.storeStoreFence();
        jp0Var.f22482c = i25.m6630z(aj2Var, g32Var);
        jp0Var.f22483d = new w42(view);
        VarHandle.storeStoreFence();
        dl4 dl4Var2 = new dl4();
        dl4Var2.f17158a = view;
        dl4Var2.f17159b = jp0Var;
        dl4Var2.f17160c = executorC0646fc;
        dl4Var2.f17162e = new r54((byte) 27);
        dl4Var2.f17163f = new r54((byte) 28);
        dl4Var2.f17164g = new xk4(4, ql4.f28556b, "");
        dl4Var2.f17165h = l12.f23696f;
        dl4Var2.f17166i = new ArrayList();
        sj4 sj4Var = new sj4(b);
        sj4Var.f30344b = dl4Var2;
        VarHandle.storeStoreFence();
        dl4Var2.f17167j = i25.m6630z(aj2Var, sj4Var);
        ds0 ds0Var = new ds0();
        ds0Var.f17313a = this;
        ds0Var.f17314b = jp0Var;
        ds0Var.f17315c = new Object();
        ds0Var.f17325m = C1106rf.f29217d;
        ds0Var.f17328p = new CursorAnchorInfo.Builder();
        ds0Var.f17329q = rq2.m10392b();
        ds0Var.f17330r = new Matrix();
        VarHandle.storeStoreFence();
        dl4Var2.f17169l = ds0Var;
        dl4Var2.f17170m = new uw2(new cl4[16]);
        VarHandle.storeStoreFence();
        this.f30112d0 = dl4Var2;
        return dl4Var2;
    }

    private final ii0 get_composeViewContext() {
        return (ii0) this.f30105a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m10592h(ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: k */
    public static void m10593k(wf2 wf2Var) {
        wf2Var.m12252E();
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            m10593k((wf2) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10594m() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m10595n(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !hu2.f20881a.m6506a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.f30135p.setValue(Boolean.valueOf(z));
    }

    private void setDensity(ky0 ky0Var) {
        this.f30125k.setValue(ky0Var);
    }

    private void setLayoutDirection(df2 df2Var) {
        this.f30122i0.setValue(df2Var);
    }

    private final void set_composeViewContext(ii0 ii0Var) {
        this.f30105a.setValue(ii0Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX INFO: renamed from: A */
    public final void m10596A(ViewStructure viewStructure) {
        C1287wb autofillManager = getAutofillManager();
        if (autofillManager != null) {
            wf2 wf2Var = autofillManager.f33200b.f23703a;
            AutofillId autofillId = autofillManager.f33205g;
            String str = autofillManager.f33203e;
            ll3 ll3Var = autofillManager.f33202d;
            zp0.m13659K(viewStructure, wf2Var, autofillId, str, ll3Var);
            Object[] objArr = q23.f28158a;
            cw2 cw2Var = new cw2(2);
            cw2Var.m4200a(wf2Var);
            cw2Var.m4200a(viewStructure);
            while (cw2Var.m4209j()) {
                ViewStructure viewStructure2 = (ViewStructure) cw2Var.m4211l(cw2Var.f16533b - 1);
                List listM12288o = ((wf2) cw2Var.m4211l(cw2Var.f16533b - 1)).m12288o();
                int size = listM12288o.size();
                for (int i = 0; i < size; i++) {
                    wf2 wf2Var2 = (wf2) ((aw2) listM12288o).get(i);
                    if (!wf2Var2.f33310R && wf2Var2.m12256J() && wf2Var2.m12257K()) {
                        e14 e14VarM12297x = wf2Var2.m12297x();
                        if (e14VarM12297x != null) {
                            lw2 lw2Var = e14VarM12297x.f17631a;
                            if (lw2Var.m8127b(d14.f16710g) || lw2Var.m8127b(d14.f16711h) || lw2Var.m8127b(m14.f24569r) || lw2Var.m8127b(m14.f24570s) || (Build.VERSION.SDK_INT >= 34 && lw2Var.m8127b(C0638f5.f18757k))) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                zp0.m13659K(viewStructureNewChild, wf2Var2, autofillId, str, ll3Var);
                                cw2Var.m4200a(wf2Var2);
                                cw2Var.m4200a(viewStructureNewChild);
                            } else {
                                cw2Var.m4200a(wf2Var2);
                                cw2Var.m4200a(viewStructure2);
                            }
                        } else {
                            cw2Var.m4200a(wf2Var2);
                            cw2Var.m4200a(viewStructure2);
                        }
                    }
                }
            }
        }
        C1250vb autofill = getAutofill();
        if (autofill != null) {
            C0739hv c0739hv = autofill.f32502b;
            LinkedHashMap linkedHashMap = c0739hv.f20887a;
            LinkedHashMap linkedHashMap2 = c0739hv.f20887a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    xy4.m12778e();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId(autofill.f32503c, iIntValue);
                viewStructureNewChild2.setId(iIntValue, autofill.f32501a.getContext().getPackageName(), null, null);
                bm0.f15408a.getClass();
                viewStructureNewChild2.setAutofillType(am0.f14624c.f22170b);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m10597B() {
        int[] iArr = this.f30099R;
        if (this.f30106a0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f30104W) {
            this.f30104W = jCurrentAnimationTimeMillis;
            float[] fArr = this.f30102U;
            g60.f19621a.m5905a(this, fArr, this.f30101T, iArr);
            lb5.m7907P(fArr, this.f30103V);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f30108b0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m10598C(MotionEvent motionEvent) {
        this.f30104W = AnimationUtils.currentAnimationTimeMillis();
        float[] fArr = this.f30102U;
        g60.f19621a.m5905a(this, fArr, this.f30101T, this.f30099R);
        lb5.m7907P(fArr, this.f30103V);
        float x = motionEvent.getX();
        long jM10393c = rq2.m10393c((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), fArr);
        this.f30108b0 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jM10393c >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jM10393c & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m10599D() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m10600E(wp1 wp1Var) {
        C0461ao c0461ao = this.f30121i;
        boolean zIsEmpty = c0461ao.isEmpty();
        c0461ao.addLast(wp1Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.f30123j);
            } else {
                C1077qn.m9987m("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m10601F(wf2 wf2Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (wf2Var != null) {
            while (wf2Var != null && wf2Var.m12292s() == uf2.f31821a) {
                if (!this.f30096O) {
                    wf2 wf2VarM12295v = wf2Var.m12295v();
                    if (wf2VarM12295v == null) {
                        break;
                    }
                    long j = ((w32) wf2VarM12295v.f33299G.f25607d).f16902d;
                    if (kl0.m7537g(j) && kl0.m7536f(j)) {
                        break;
                    }
                }
                wf2Var = wf2Var.m12295v();
            }
            if (wf2Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: G */
    public final long m10602G(long j) {
        m10597B();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f30108b0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f30108b0 & 4294967295L));
        return rq2.m10393c((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f30103V);
    }

    /* JADX INFO: renamed from: H */
    public final int m10603H(MotionEvent motionEvent) {
        Object obj;
        g90 g90Var = this.f30085F;
        gu2 gu2Var = this.f30083E;
        if (this.f30078B0) {
            this.f30078B0 = false;
            cj2 cj2Var = getComposeViewContext().f21453t;
            int metaState = motionEvent.getMetaState();
            cj2Var.getClass();
            d83 d83Var = zz4.f36511a;
            sc3 sc3Var = new sc3();
            sc3Var.f30159a = metaState;
            VarHandle.storeStoreFence();
            d83Var.setValue(sc3Var);
        }
        nh3 nh3VarM6167c = gu2Var.m6167c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (nh3VarM6167c == null) {
            if (!g90Var.f19661a) {
                po2 po2Var = (po2) ((w42) g90Var.f19664d).f33090b;
                int i = po2Var.f27863d;
                Object[] objArr = po2Var.f27862c;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                po2Var.f27863d = 0;
                po2Var.f27860a = false;
                ((nw1) g90Var.f19663c).m8869c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) nh3VarM6167c.f25810b;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i3 = size - 1;
            obj = arrayList.get(size);
            if (((nc3) obj).f25677e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i3 < 0) {
                obj = null;
                break;
            }
            size = i3;
        }
        nc3 nc3Var = (nc3) obj;
        if (nc3Var != null) {
            this.f30107b = nc3Var.f25676d;
        }
        int iM5939c = g90Var.m5939c(nh3VarM6167c, this, m10615o(motionEvent));
        nh3VarM6167c.f25811c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM5939c & 1) != 0) {
            return iM5939c;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        gu2Var.f20131c.delete(pointerId);
        gu2Var.f20130b.delete(pointerId);
        return iM5939c;
    }

    /* JADX INFO: renamed from: I */
    public final void m10604I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jM10618r = m10618r((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM10618r >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM10618r & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.f30085F.m5939c(this.f30083E.m6167c(motionEventObtain, this), this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final void m10605J(mq1 mq1Var, ym0 ym0Var) {
        C1103rc c1103rc;
        if (ym0Var instanceof C1103rc) {
            c1103rc = (C1103rc) ym0Var;
            int i = c1103rc.f29146v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1103rc.f29146v = i - Integer.MIN_VALUE;
            } else {
                c1103rc = new C1103rc(this, ym0Var);
            }
        } else {
            c1103rc = new C1103rc(this, ym0Var);
        }
        Object obj = c1103rc.f29144t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c1103rc.f29146v;
        if (i2 == 0) {
            k43.m7376J(obj);
            AtomicReference atomicReference = this.f30116f0;
            C0522cc c0522cc = new C0522cc((byte) 0);
            c0522cc.f15920b = this;
            VarHandle.storeStoreFence();
            c1103rc.f29146v = 1;
            if (zp0.m13685q(new C1312wz(c0522cc, atomicReference, mq1Var, (wm0) null), c1103rc) == ap0Var) {
                return;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            k43.m7376J(obj);
        }
        xy4.m12794w();
    }

    /* JADX INFO: renamed from: K */
    public final void m10606K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (z62.m13387o(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(gq6.m6078c(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX INFO: renamed from: L */
    public final void m10607L() {
        boolean z;
        int i;
        int[] iArr = this.f30099R;
        getLocationOnScreen(iArr);
        long j = this.f30098Q;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.f30104W >= 0) {
            z = false;
        } else {
            this.f30098Q = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                uw2 uw2VarM12248A = getRoot().m12248A();
                Object[] objArr = uw2VarM12248A.f32211a;
                int i5 = uw2VarM12248A.f32213c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((wf2) objArr[i6]).f33300H.f14483p.m12378F0();
                }
                z = true;
            }
        }
        m10597B();
        View rootView = this.f30086F0;
        if (rootView == null) {
            rootView = getRootView();
            this.f30086F0 = rootView;
        }
        ll3 rectManager = getRectManager();
        long j2 = this.f30098Q;
        long jM12827F0 = y42.m12827F0(this.f30108b0);
        float[] fArr = this.f30102U;
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        mm4 mm4Var = rectManager.f24129d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f24132g = mm4Var.m8359b(j2, jM12827F0, fArr, width, height) || rectManager.f24132g;
        this.f30097P.m11612a(z);
        getRectManager().m8027a();
    }

    /* JADX INFO: renamed from: M */
    public final void m10608M(float f) {
        if (m10594m()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f30138q0) || f > this.f30138q0) {
                    this.f30138q0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f30140r0) || f < this.f30140r0) {
                    this.f30140r0 = f;
                }
            }
        }
    }

    @Override // p000.yk1
    /* JADX INFO: renamed from: a */
    public final void mo10609a(sl1 sl1Var, sl1 sl1Var2) {
        C0940nb c0940nb;
        boolean z;
        C0940nb c0940nb2;
        boolean z2;
        if (sl1Var != null) {
            sl1 sl1Var3 = sl1Var;
            if (!sl1Var3.f25195a.f25208n) {
                q32.m9721c("visitAncestors called on an unattached node");
            }
            mt2 mt2Var = sl1Var3.f25195a;
            wf2 wf2VarM10652X = sc6.m10652X(sl1Var);
            mw2 mw2Var = null;
            ArrayList arrayList = null;
            while (wf2VarM10652X != null) {
                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 2097152) != 0) {
                    while (mt2Var != null) {
                        if ((mt2Var.f25197c & 2097152) != 0) {
                            mt2 mt2VarM10644P = mt2Var;
                            uw2 uw2Var = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof a32) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(mt2VarM10644P);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (mt2VarM10644P.f25197c & 2097152) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i = 0;
                                    for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                        if ((mt2Var2.f25197c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                mt2VarM10644P = mt2Var2;
                                            } else {
                                                if (uw2Var == null) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var.m11663b(mt2Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var);
                            }
                        }
                        mt2Var = mt2Var.f25199e;
                    }
                }
                wf2VarM10652X = wf2VarM10652X.m12295v();
                mt2Var = (wf2VarM10652X == null || (c0940nb2 = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb2.f25609f;
            }
            if (arrayList == null) {
                return;
            }
            if (sl1Var2 != null) {
                if (!sl1Var2.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2 mt2Var3 = sl1Var2.f25195a;
                wf2 wf2VarM10652X2 = sc6.m10652X(sl1Var2);
                mw2 mw2Var2 = null;
                while (wf2VarM10652X2 != null) {
                    if ((((mt2) wf2VarM10652X2.f33299G.f25610g).f25198d & 2097152) != 0) {
                        while (mt2Var3 != null) {
                            if ((mt2Var3.f25197c & 2097152) != 0) {
                                mt2 mt2VarM10644P2 = mt2Var3;
                                uw2 uw2Var2 = null;
                                while (mt2VarM10644P2 != null) {
                                    if (mt2VarM10644P2 instanceof a32) {
                                        if (mw2Var2 == null) {
                                            mw2 mw2Var3 = uv3.f32207a;
                                            mw2Var2 = new mw2();
                                        }
                                        mw2Var2.m8409a(mt2VarM10644P2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (mt2VarM10644P2.f25197c & 2097152) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                        int i2 = 0;
                                        for (mt2 mt2Var4 = ((qx0) mt2VarM10644P2).f28863p; mt2Var4 != null; mt2Var4 = mt2Var4.f25200f) {
                                            if ((mt2Var4.f25197c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    mt2VarM10644P2 = mt2Var4;
                                                } else {
                                                    if (uw2Var2 == null) {
                                                        uw2Var2 = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P2 != null) {
                                                        uw2Var2.m11663b(mt2VarM10644P2);
                                                        mt2VarM10644P2 = null;
                                                    }
                                                    uw2Var2.m11663b(mt2Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    mt2VarM10644P2 = sc6.m10644P(uw2Var2);
                                }
                            }
                            mt2Var3 = mt2Var3.f25199e;
                        }
                    }
                    wf2VarM10652X2 = wf2VarM10652X2.m12295v();
                    mt2Var3 = (wf2VarM10652X2 == null || (c0940nb = wf2VarM10652X2.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                }
                mw2Var = mw2Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                a32 a32Var = (a32) arrayList.get(i3);
                if (!(mw2Var != null ? mw2Var.m8411c(a32Var) : false)) {
                    a32Var.mo29G();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        sl1 sl1Var = ((bl1) getFocusOwner()).f15396c;
        if (!sl1Var.f25208n) {
            return;
        }
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitSubtreeIf called on an unattached node");
        }
        uw2 uw2Var = new uw2(new mt2[16]);
        mt2 mt2Var = sl1Var.f25195a;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 == null) {
            sc6.m10663e(uw2Var, mt2Var);
        } else {
            uw2Var.m11663b(mt2Var2);
        }
        while (true) {
            int i3 = uw2Var.f32213c;
            if (i3 == 0) {
                return;
            }
            mt2 mt2Var3 = (mt2) uw2Var.m11672l(i3 - 1);
            if ((mt2Var3.f25198d & 1024) != 0) {
                for (mt2 mt2Var4 = mt2Var3; mt2Var4 != null && mt2Var4.f25208n; mt2Var4 = mt2Var4.f25200f) {
                    if ((mt2Var4.f25197c & 1024) != 0) {
                        mt2 mt2VarM10644P = mt2Var4;
                        uw2 uw2Var2 = null;
                        while (mt2VarM10644P != null) {
                            int i4 = 0;
                            if (mt2VarM10644P instanceof sl1) {
                                sl1 sl1Var2 = (sl1) mt2VarM10644P;
                                if (sl1Var2.f25208n && sl1Var2.m10855Q0().f19067a) {
                                    super.addFocusables(arrayList, i, i2);
                                    sl1 sl1Var3 = ((bl1) getFocusOwner()).f15396c;
                                    if (sl1Var3.f25208n) {
                                        if (!sl1Var3.f25195a.f25208n) {
                                            q32.m9721c("visitSubtreeIf called on an unattached node");
                                        }
                                        uw2 uw2Var3 = new uw2(new mt2[16]);
                                        mt2 mt2Var5 = sl1Var3.f25195a;
                                        mt2 mt2Var6 = mt2Var5.f25200f;
                                        if (mt2Var6 == null) {
                                            sc6.m10663e(uw2Var3, mt2Var5);
                                        } else {
                                            uw2Var3.m11663b(mt2Var6);
                                        }
                                        while (true) {
                                            int i5 = uw2Var3.f32213c;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            mt2 mt2Var7 = (mt2) uw2Var3.m11672l(i5 - 1);
                                            if ((mt2Var7.f25198d & 1024) != 0) {
                                                for (mt2 mt2Var8 = mt2Var7; mt2Var8 != null && mt2Var8.f25208n; mt2Var8 = mt2Var8.f25200f) {
                                                    if ((mt2Var8.f25197c & 1024) != 0) {
                                                        mt2 mt2VarM10644P2 = mt2Var8;
                                                        uw2 uw2Var4 = null;
                                                        while (mt2VarM10644P2 != null) {
                                                            if (mt2VarM10644P2 instanceof sl1) {
                                                                sl1 sl1Var4 = (sl1) mt2VarM10644P2;
                                                                if (sl1Var4.f25208n) {
                                                                    fl1 fl1VarM10855Q0 = sl1Var4.m10855Q0();
                                                                    if (sl1Var4.f25208n && !sl1Var4.f30366o && fl1VarM10855Q0.f19067a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((mt2VarM10644P2.f25197c & 1024) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                                                int i6 = 0;
                                                                for (mt2 mt2Var9 = ((qx0) mt2VarM10644P2).f28863p; mt2Var9 != null; mt2Var9 = mt2Var9.f25200f) {
                                                                    if ((mt2Var9.f25197c & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            mt2VarM10644P2 = mt2Var9;
                                                                        } else {
                                                                            if (uw2Var4 == null) {
                                                                                uw2Var4 = new uw2(new mt2[16]);
                                                                            }
                                                                            if (mt2VarM10644P2 != null) {
                                                                                uw2Var4.m11663b(mt2VarM10644P2);
                                                                                mt2VarM10644P2 = null;
                                                                            }
                                                                            uw2Var4.m11663b(mt2Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            mt2VarM10644P2 = sc6.m10644P(uw2Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            sc6.m10663e(uw2Var3, mt2Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                for (mt2 mt2Var10 = ((qx0) mt2VarM10644P).f28863p; mt2Var10 != null; mt2Var10 = mt2Var10.f25200f) {
                                    if ((mt2Var10.f25197c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            mt2VarM10644P = mt2Var10;
                                        } else {
                                            if (uw2Var2 == null) {
                                                uw2Var2 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var2.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var2.m11663b(mt2Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var2);
                        }
                    }
                }
            }
            sc6.m10663e(uw2Var, mt2Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        e14 e14VarM12297x;
        yp1 yp1Var;
        yp1 yp1Var2;
        C1287wb autofillManager = getAutofillManager();
        if (autofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                wf2 wf2Var = (wf2) autofillManager.f33200b.f23705c.m8197b(iKeyAt);
                if (wf2Var != null && (e14VarM12297x = wf2Var.m12297x()) != null) {
                    lw2 lw2Var = e14VarM12297x.f17631a;
                    Object objM8132g = lw2Var.m8132g(d14.f16710g);
                    if (objM8132g == null) {
                        objM8132g = null;
                    }
                    C1353y2 c1353y2 = (C1353y2) objM8132g;
                    if (c1353y2 != null && (yp1Var2 = (yp1) c1353y2.f34818b) != null) {
                    }
                    Object objM8132g2 = lw2Var.m8132g(d14.f16711h);
                    C1353y2 c1353y3 = (C1353y2) (objM8132g2 != null ? objM8132g2 : null);
                    if (c1353y3 != null && (yp1Var = (yp1) c1353y3.f34818b) != null) {
                    }
                }
            }
        }
        C1250vb autofill = getAutofill();
        if (autofill != null) {
            C0739hv c0739hv = autofill.f32502b;
            if (c0739hv.f20887a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c0739hv.f20887a.get(Integer.valueOf(iKeyAt2)) != null) {
                        xy4.m12778e();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new t13("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new t13("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new t13("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10610c(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM7293d;
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = this.f30149w;
        if (z62.m13387o(str, viewOnAttachStateChangeListenerC1400zc.f35941D)) {
            int iM7293d2 = viewOnAttachStateChangeListenerC1400zc.f35939B.m7293d(i);
            if (iM7293d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7293d2);
                return;
            }
            return;
        }
        if (!z62.m13387o(str, viewOnAttachStateChangeListenerC1400zc.f35942E) || (iM7293d = viewOnAttachStateChangeListenerC1400zc.f35940C.m7293d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM7293d);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f30149w.m13485f(i, this.f30107b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f30149w.m13485f(i, this.f30107b, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cw2 cw2Var = this.f30075A;
        if (!isAttachedToWindow()) {
            m10593k(getRoot());
        }
        m10619s(true);
        k94.m7451h().mo5021m();
        this.f30079C = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            k70 canvasHolder = getCanvasHolder();
            C1325xb c1325xb = canvasHolder.f22949a;
            Canvas canvas2 = c1325xb.f34122a;
            c1325xb.f34122a = canvas;
            getRoot().m12284j(c1325xb, null);
            canvasHolder.f22949a.f34122a = canvas2;
            if (cw2Var.m4209j()) {
                int i = cw2Var.f16533b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((du1) ((q63) cw2Var.m4206g(i2))).m4739g();
                }
            }
            int i3 = iy4.f21895a;
            cw2Var.m4203d();
            this.f30079C = false;
            Trace.endSection();
            cw2 cw2Var2 = this.f30077B;
            if (cw2Var2 != null) {
                cw2Var.m4201b(cw2Var2);
                cw2Var2.m4203d();
            }
            if (m10594m()) {
                if (Float.compare(this.f30138q0, this.f30142s0) != 0) {
                    float f = this.f30138q0;
                    this.f30142s0 = f;
                    AbstractC1296wk.m12313a(this, f);
                }
                View view = this.f30127l;
                if (view != null) {
                    if (Float.compare(this.f30140r0, this.f30144t0) != 0) {
                        float f2 = this.f30140r0;
                        this.f30144t0 = f2;
                        AbstractC1296wk.m12313a(view, f2);
                    }
                    if (!Float.isNaN(this.f30140r0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f30138q0 = Float.NaN;
                this.f30140r0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0375  */
    /* JADX WARN: Code duplicated, block: B:219:0x037c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0384  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:229:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:241:0x0424  */
    /* JADX WARN: Code duplicated, block: B:318:0x050f A[PHI: r4
  0x050f: PHI (r4v44 ??) = (r4v66 ??), (r4v67 ??), (r4v68 ??) binds: [B:299:0x04d1, B:301:0x04d5, B:316:0x0508] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:406:0x065a  */
    /* JADX WARN: Code duplicated, block: B:413:0x066d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [mt2] */
    /* JADX WARN: Type inference failed for: r3v37, types: [mt2] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60, types: [mt2] */
    /* JADX WARN: Type inference failed for: r3v61, types: [mt2] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r5v104 */
    /* JADX WARN: Type inference failed for: r5v105 */
    /* JADX WARN: Type inference failed for: r5v106 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v75 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        c32 c32Var;
        String str;
        int i;
        C0795je c0795je;
        long jValueAt;
        long eventTime;
        long jFloatToRawIntBits;
        ?? r0;
        a32 a32Var;
        C0940nb c0940nb;
        boolean z;
        ?? r3;
        C0940nb c0940nb2;
        ?? r4;
        ?? M10644P;
        a32 a32Var2;
        boolean z2;
        int size;
        int size2;
        C0940nb c0940nb3;
        boolean z3;
        ?? r5;
        C0940nb c0940nb4;
        ?? uw2Var;
        ?? M10644P2;
        int action;
        c32 c32Var2;
        boolean z4;
        C0867lc c0867lc;
        int size3;
        C0940nb c0940nb5;
        boolean z5;
        mt2 mt2VarM10644P;
        C0940nb c0940nb6;
        MotionEvent motionEvent2 = motionEvent;
        c32 c32Var3 = this.f30154y0;
        RunnableC0757ic runnableC0757ic = this.f30148v0;
        if (this.f30150w0) {
            removeCallbacks(runnableC0757ic);
            if (motionEvent2.getActionMasked() == 8) {
                this.f30150w0 = false;
            } else {
                runnableC0757ic.run();
            }
        }
        if (m10595n(motionEvent2) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str2 = "visitAncestors called on an unattached node";
        int i2 = 16;
        int i3 = 1;
        if (motionEvent2.getActionMasked() == 8) {
            if (!motionEvent2.isFromSource(4194304)) {
                return (m10613j(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent2.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent2.getEventTime();
            motionEvent2.getDeviceId();
            bl1 bl1Var = (bl1) getFocusOwner();
            if (bl1Var.f15397d.f34331e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            sl1 sl1VarM13844H = zy5.m13844H(bl1Var.f15396c);
            if (sl1VarM13844H != null) {
                if (!sl1VarM13844H.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2 mt2Var = sl1VarM13844H.f25195a;
                wf2 wf2VarM10652X = sc6.m10652X(sl1VarM13844H);
                loop0: while (true) {
                    if (wf2VarM10652X == null) {
                        mt2VarM10644P = null;
                        break;
                    }
                    if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 16384) != 0) {
                        while (mt2Var != null) {
                            if ((mt2Var.f25197c & 16384) != 0) {
                                mt2VarM10644P = mt2Var;
                                uw2 uw2Var2 = null;
                                while (mt2VarM10644P != null) {
                                    if (mt2VarM10644P instanceof C0867lc) {
                                        break loop0;
                                    }
                                    if ((mt2VarM10644P.f25197c & 16384) != 0 && (mt2VarM10644P instanceof qx0)) {
                                        int i4 = 0;
                                        for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                            if ((mt2Var2.f25197c & 16384) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    mt2VarM10644P = mt2Var2;
                                                } else {
                                                    if (uw2Var2 == null) {
                                                        uw2Var2 = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P != null) {
                                                        uw2Var2.m11663b(mt2VarM10644P);
                                                        mt2VarM10644P = null;
                                                    }
                                                    uw2Var2.m11663b(mt2Var2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    mt2VarM10644P = sc6.m10644P(uw2Var2);
                                }
                            }
                            mt2Var = mt2Var.f25199e;
                        }
                    }
                    wf2VarM10652X = wf2VarM10652X.m12295v();
                    mt2Var = (wf2VarM10652X == null || (c0940nb6 = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb6.f25609f;
                }
                c0867lc = (C0867lc) mt2VarM10644P;
            } else {
                c0867lc = null;
            }
            if (c0867lc != null) {
                if (!c0867lc.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2 mt2Var3 = c0867lc.f25195a.f25199e;
                wf2 wf2VarM10652X2 = sc6.m10652X(c0867lc);
                ArrayList arrayList = null;
                while (wf2VarM10652X2 != null) {
                    if ((((mt2) wf2VarM10652X2.f33299G.f25610g).f25198d & 16384) != 0) {
                        while (mt2Var3 != null) {
                            if ((mt2Var3.f25197c & 16384) != 0) {
                                mt2 mt2VarM10644P2 = mt2Var3;
                                uw2 uw2Var3 = null;
                                while (mt2VarM10644P2 != null) {
                                    if (mt2VarM10644P2 instanceof C0867lc) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(mt2VarM10644P2);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (mt2VarM10644P2.f25197c & 16384) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                        int i5 = 0;
                                        for (mt2 mt2Var4 = ((qx0) mt2VarM10644P2).f28863p; mt2Var4 != null; mt2Var4 = mt2Var4.f25200f) {
                                            if ((mt2Var4.f25197c & 16384) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    mt2VarM10644P2 = mt2Var4;
                                                } else {
                                                    if (uw2Var3 == null) {
                                                        uw2Var3 = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P2 != null) {
                                                        uw2Var3.m11663b(mt2VarM10644P2);
                                                        mt2VarM10644P2 = null;
                                                    }
                                                    uw2Var3.m11663b(mt2Var4);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    mt2VarM10644P2 = sc6.m10644P(uw2Var3);
                                }
                            }
                            mt2Var3 = mt2Var3.f25199e;
                        }
                    }
                    wf2VarM10652X2 = wf2VarM10652X2.m12295v();
                    mt2Var3 = (wf2VarM10652X2 == null || (c0940nb5 = wf2VarM10652X2.f33299G) == null) ? null : (vh4) c0940nb5.f25609f;
                }
                if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i6 = size3 - 1;
                        ((C0867lc) arrayList.get(size3)).getClass();
                        if (i6 < 0) {
                            break;
                        }
                        size3 = i6;
                    }
                }
                mt2 mt2VarM10644P3 = c0867lc.f25195a;
                uw2 uw2Var4 = null;
                while (mt2VarM10644P3 != null) {
                    if (!(mt2VarM10644P3 instanceof C0867lc) && (mt2VarM10644P3.f25197c & 16384) != 0 && (mt2VarM10644P3 instanceof qx0)) {
                        int i7 = 0;
                        for (mt2 mt2Var5 = ((qx0) mt2VarM10644P3).f28863p; mt2Var5 != null; mt2Var5 = mt2Var5.f25200f) {
                            if ((mt2Var5.f25197c & 16384) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    mt2VarM10644P3 = mt2Var5;
                                } else {
                                    if (uw2Var4 == null) {
                                        uw2Var4 = new uw2(new mt2[16]);
                                    }
                                    if (mt2VarM10644P3 != null) {
                                        uw2Var4.m11663b(mt2VarM10644P3);
                                        mt2VarM10644P3 = null;
                                    }
                                    uw2Var4.m11663b(mt2Var5);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    mt2VarM10644P3 = sc6.m10644P(uw2Var4);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    mt2 mt2VarM10644P4 = c0867lc.f25195a;
                    uw2 uw2Var5 = null;
                    while (mt2VarM10644P4 != null) {
                        if (!(mt2VarM10644P4 instanceof C0867lc) && (mt2VarM10644P4.f25197c & 16384) != 0 && (mt2VarM10644P4 instanceof qx0)) {
                            int i8 = 0;
                            for (mt2 mt2Var6 = ((qx0) mt2VarM10644P4).f28863p; mt2Var6 != null; mt2Var6 = mt2Var6.f25200f) {
                                if ((mt2Var6.f25197c & 16384) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        mt2VarM10644P4 = mt2Var6;
                                    } else {
                                        if (uw2Var5 == null) {
                                            uw2Var5 = new uw2(new mt2[16]);
                                        }
                                        if (mt2VarM10644P4 != null) {
                                            uw2Var5.m11663b(mt2VarM10644P4);
                                            mt2VarM10644P4 = null;
                                        }
                                        uw2Var5.m11663b(mt2Var6);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        mt2VarM10644P4 = sc6.m10644P(uw2Var5);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            ((C0867lc) arrayList.get(i9)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent2.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        gu2 gu2Var = this.f30083E;
        r22 r22Var = this.f30111d;
        po2 po2Var = gu2Var.f20133e;
        SparseLongArray sparseLongArray = gu2Var.f20130b;
        int actionMasked = motionEvent2.getActionMasked();
        gu2Var.m6166b(motionEvent2);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            gu2Var.f20131c.clear();
            c32Var = c32Var3;
            str = "visitAncestors called on an unattached node";
            i2 = 16;
            c0795je = null;
        } else {
            gu2Var.m6165a(motionEvent2);
            int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent2.getActionIndex() : 0;
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            int pointerCount = motionEvent2.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i10 = 0;
            while (i10 < pointerCount) {
                int i11 = i3;
                int pointerId = motionEvent2.getPointerId(i10);
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                } else {
                    jValueAt = gu2Var.f20129a;
                    gu2Var.f20129a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                SparseLongArray sparseLongArray2 = sparseLongArray;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent2.getX(i10))) << 32) | (((long) Float.floatToRawIntBits(motionEvent2.getY(i10))) & 4294967295L);
                ?? r10 = i10 != actionIndex ? i11 : 0;
                fu2 fu2Var = (fu2) po2Var.m9590a(jValueAt);
                if (i10 == actionIndex) {
                    po2Var.m9593d(jValueAt);
                } else {
                    if (z6) {
                        long eventTime2 = 1 | ((motionEvent2.getEventTime() & 2147483647L) << i11) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32);
                        fu2 fu2Var2 = new fu2();
                        fu2Var2.f19320a = eventTime2;
                        VarHandle.storeStoreFence();
                        po2Var.m9592c(jValueAt, fu2Var2);
                    }
                    r22 r22Var2 = r22Var;
                    po2 po2Var2 = po2Var;
                    long eventTime3 = motionEvent2.getEventTime();
                    float pressure = motionEvent2.getPressure(i10);
                    int i12 = i10;
                    if (fu2Var != null) {
                        eventTime = (fu2Var.f19320a >> i11) & 2147483647L;
                    } else {
                        eventTime = motionEvent2.getEventTime();
                    }
                    c32 c32Var4 = c32Var3;
                    if (fu2Var != null) {
                        int i13 = (int) (fu2Var.f19320a >>> 32);
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i13 >>> 16))) << 32) | (((long) Float.floatToRawIntBits((short) (i13 & 65535))) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = jFloatToRawIntBits2;
                    }
                    long j = jFloatToRawIntBits;
                    if (fu2Var != null || (fu2Var.f19320a & 1) == 0) {
                        r0 = 0;
                    } else {
                        r0 = i11;
                    }
                    s22 s22Var = new s22();
                    s22Var.f29831a = jValueAt;
                    s22Var.f29832b = eventTime3;
                    s22Var.f29833c = jFloatToRawIntBits2;
                    s22Var.f29834d = r10;
                    s22Var.f29835e = pressure;
                    s22Var.f29836f = eventTime;
                    s22Var.f29837g = j;
                    s22Var.f29838h = r0;
                    VarHandle.storeStoreFence();
                    arrayList2.add(s22Var);
                    i10 = i12 + 1;
                    motionEvent2 = motionEvent;
                    sparseLongArray = sparseLongArray2;
                    i3 = i11;
                    actionMasked = actionMasked;
                    pointerCount = pointerCount;
                    c32Var3 = c32Var4;
                    actionIndex = actionIndex;
                    r22Var = r22Var2;
                    gu2Var = gu2Var;
                    str2 = str2;
                    po2Var = po2Var2;
                }
                r22 r22Var3 = r22Var;
                po2 po2Var3 = po2Var;
                long eventTime4 = motionEvent2.getEventTime();
                float pressure2 = motionEvent2.getPressure(i10);
                int i14 = i10;
                if (fu2Var != null) {
                    eventTime = (fu2Var.f19320a >> i11) & 2147483647L;
                } else {
                    eventTime = motionEvent2.getEventTime();
                }
                c32 c32Var5 = c32Var3;
                if (fu2Var != null) {
                    int i15 = (int) (fu2Var.f19320a >>> 32);
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (i15 >>> 16))) << 32) | (((long) Float.floatToRawIntBits((short) (i15 & 65535))) & 4294967295L);
                } else {
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                long j2 = jFloatToRawIntBits;
                if (fu2Var != null) {
                    r0 = 0;
                } else {
                    r0 = 0;
                }
                s22 s22Var2 = new s22();
                s22Var2.f29831a = jValueAt;
                s22Var2.f29832b = eventTime4;
                s22Var2.f29833c = jFloatToRawIntBits2;
                s22Var2.f29834d = r10;
                s22Var2.f29835e = pressure2;
                s22Var2.f29836f = eventTime;
                s22Var2.f29837g = j2;
                s22Var2.f29838h = r0;
                VarHandle.storeStoreFence();
                arrayList2.add(s22Var2);
                i10 = i14 + 1;
                motionEvent2 = motionEvent;
                sparseLongArray = sparseLongArray2;
                i3 = i11;
                actionMasked = actionMasked;
                pointerCount = pointerCount;
                c32Var3 = c32Var5;
                actionIndex = actionIndex;
                r22Var = r22Var3;
                gu2Var = gu2Var;
                str2 = str2;
                po2Var = po2Var3;
            }
            c32Var = c32Var3;
            str = str2;
            int i16 = i3;
            r22 r22Var4 = r22Var;
            int i17 = actionMasked;
            gu2Var.m6169e(motionEvent2);
            if (r22Var4 != null) {
                i = r22Var4.f28967a;
            } else {
                if (!motionEvent2.isFromSource(2097152)) {
                    C1077qn.m9987m("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent2.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i16);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                                    i = 1;
                                } else if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                }
                            }
                            i = 0;
                        }
                        i = 2;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
            }
            if (i17 == 0 || i17 == 1 || i17 == 2 || i17 != 5) {
            }
            c0795je = new C0795je((byte) 0);
            c0795je.f22194c = arrayList2;
            c0795je.f22193b = i;
            c0795je.f22195d = motionEvent2;
            if (arrayList2.isEmpty()) {
                C1077qn.m9987m("changes cannot be empty");
                return false;
            }
            VarHandle.storeStoreFence();
        }
        if (c0795je == null) {
            c32 c32Var6 = c32Var;
            sl1 sl1VarM3620f = ((bl1) getFocusOwner()).m3620f();
            if (sl1VarM3620f != null) {
                if (!sl1VarM3620f.f25195a.f25208n) {
                    q32.m9721c(str);
                }
                mt2 mt2Var7 = sl1VarM3620f.f25195a;
                wf2 wf2VarM10652X3 = sc6.m10652X(sl1VarM3620f);
                loop26: while (true) {
                    if (wf2VarM10652X3 == null) {
                        r3 = 0;
                        break;
                    }
                    int i18 = 2097152;
                    if ((((mt2) wf2VarM10652X3.f33299G.f25610g).f25198d & 2097152) != 0) {
                        while (mt2Var7 != null) {
                            if ((mt2Var7.f25197c & i18) != 0) {
                                r3 = mt2Var7;
                                ?? r6 = 0;
                                while (r3 != 0) {
                                    if (r3 instanceof a32) {
                                        break loop26;
                                    }
                                    if ((r3.f25197c & i18) == 0 || !(r3 instanceof qx0)) {
                                        r4 = r6;
                                        r4 = r6;
                                        r4 = r6;
                                        M10644P = sc6.m10644P(r4);
                                    } else {
                                        mt2 mt2Var8 = ((qx0) r3).f28863p;
                                        ?? uw2Var6 = r6;
                                        ?? r7 = r3;
                                        int i19 = 0;
                                        while (mt2Var8 != null) {
                                            if ((mt2Var8.f25197c & i18) != 0) {
                                                i19++;
                                                if (i19 == 1) {
                                                    r4 = r6;
                                                    r4 = r6;
                                                    uw2Var6 = uw2Var6;
                                                    r7 = mt2Var8;
                                                } else {
                                                    if (uw2Var6 == 0) {
                                                        uw2Var6 = new uw2(new mt2[16]);
                                                    }
                                                    if (r7 != 0) {
                                                        uw2Var6.m11663b(r7);
                                                        r7 = 0;
                                                    }
                                                    uw2Var6.m11663b(mt2Var8);
                                                }
                                            } else {
                                                r4 = r6;
                                                r4 = r6;
                                            }
                                            mt2Var8 = mt2Var8.f25200f;
                                            i18 = 2097152;
                                            r7 = r7;
                                            uw2Var6 = uw2Var6;
                                        }
                                        r4 = r6;
                                        r4 = r6;
                                        if (i19 == 1) {
                                            M10644P = r7;
                                            r4 = uw2Var6;
                                        } else {
                                            r4 = uw2Var6;
                                            r4 = r6;
                                            r4 = r6;
                                            r4 = r6;
                                            M10644P = sc6.m10644P(r4);
                                        }
                                    }
                                    i18 = 2097152;
                                    r3 = M10644P;
                                    r6 = r4;
                                }
                            }
                            mt2Var7 = mt2Var7.f25199e;
                            i18 = 2097152;
                        }
                    }
                    wf2VarM10652X3 = wf2VarM10652X3.m12295v();
                    mt2Var7 = (wf2VarM10652X3 == null || (c0940nb2 = wf2VarM10652X3.f33299G) == null) ? null : (vh4) c0940nb2.f25609f;
                }
                a32Var = (a32) r3;
            } else {
                a32Var = null;
            }
            if (a32Var != null) {
                mt2 mt2Var9 = (mt2) a32Var;
                if (!mt2Var9.f25195a.f25208n) {
                    q32.m9721c(str);
                }
                mt2 mt2Var10 = mt2Var9.f25195a.f25199e;
                wf2 wf2VarM10652X4 = sc6.m10652X(a32Var);
                ArrayList arrayList3 = null;
                while (wf2VarM10652X4 != null) {
                    int i20 = 2097152;
                    if ((((mt2) wf2VarM10652X4.f33299G.f25610g).f25198d & 2097152) != 0) {
                        while (mt2Var10 != null) {
                            if ((mt2Var10.f25197c & i20) != 0) {
                                mt2 mt2VarM10644P5 = mt2Var10;
                                uw2 uw2Var7 = null;
                                while (mt2VarM10644P5 != null) {
                                    if (mt2VarM10644P5 instanceof a32) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(mt2VarM10644P5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        if ((mt2VarM10644P5.f25197c & 2097152) != 0 && (mt2VarM10644P5 instanceof qx0)) {
                                            uw2 uw2Var8 = uw2Var7;
                                            mt2 mt2Var11 = mt2VarM10644P5;
                                            int i21 = 0;
                                            for (mt2 mt2Var12 = ((qx0) mt2VarM10644P5).f28863p; mt2Var12 != null; mt2Var12 = mt2Var12.f25200f) {
                                                if ((mt2Var12.f25197c & 2097152) != 0) {
                                                    i21++;
                                                    if (i21 == 1) {
                                                        mt2Var11 = mt2Var12;
                                                    } else {
                                                        if (uw2Var8 == null) {
                                                            uw2Var8 = new uw2(new mt2[16]);
                                                        }
                                                        if (mt2Var11 != null) {
                                                            uw2Var8.m11663b(mt2Var11);
                                                            mt2Var11 = null;
                                                        }
                                                        uw2Var8.m11663b(mt2Var12);
                                                    }
                                                }
                                            }
                                            if (i21 == 1) {
                                                mt2VarM10644P5 = mt2Var11;
                                                uw2Var7 = uw2Var8;
                                            } else {
                                                uw2Var7 = uw2Var8;
                                            }
                                        }
                                    }
                                    mt2VarM10644P5 = sc6.m10644P(uw2Var7);
                                }
                            }
                            i20 = 2097152;
                            mt2Var10 = mt2Var10.f25199e;
                        }
                    }
                    wf2VarM10652X4 = wf2VarM10652X4.m12295v();
                    mt2Var10 = (wf2VarM10652X4 == null || (c0940nb = wf2VarM10652X4.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                }
                a32Var.mo29G();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i22 = 0; i22 < size5; i22++) {
                        ((a32) arrayList3.get(i22)).mo29G();
                    }
                }
            }
            c32Var6.f15781b = 0;
            c32Var6.f15782c = true;
            return true;
        }
        bl1 bl1Var2 = (bl1) getFocusOwner();
        if (!bl1Var2.f15397d.f34331e) {
            sl1 sl1VarM3620f2 = bl1Var2.m3620f();
            if (sl1VarM3620f2 != null) {
                if (!sl1VarM3620f2.f25195a.f25208n) {
                    q32.m9721c(str);
                }
                mt2 mt2Var13 = sl1VarM3620f2.f25195a;
                wf2 wf2VarM10652X5 = sc6.m10652X(sl1VarM3620f2);
                loop14: while (true) {
                    if (wf2VarM10652X5 == null) {
                        r5 = 0;
                        break;
                    }
                    int i23 = 2097152;
                    if ((((mt2) wf2VarM10652X5.f33299G.f25610g).f25198d & 2097152) != 0) {
                        while (mt2Var13 != null) {
                            if ((mt2Var13.f25197c & i23) != 0) {
                                r5 = mt2Var13;
                                ?? r8 = 0;
                                while (r5 != 0) {
                                    if (r5 instanceof a32) {
                                        break loop14;
                                    }
                                    if ((r5.f25197c & i23) == 0 || !(r5 instanceof qx0)) {
                                        uw2Var = r8;
                                        uw2Var = r8;
                                        uw2Var = r8;
                                        M10644P2 = sc6.m10644P(uw2Var);
                                    } else {
                                        mt2 mt2Var14 = ((qx0) r5).f28863p;
                                        int i24 = 0;
                                        while (mt2Var14 != null) {
                                            if ((mt2Var14.f25197c & i23) != 0) {
                                                i24++;
                                                if (i24 == 1) {
                                                    uw2Var = r8;
                                                    uw2Var = r8;
                                                    M10644P2 = r5;
                                                    uw2Var = r8;
                                                    uw2Var = uw2Var;
                                                    M10644P2 = mt2Var14;
                                                } else {
                                                    if (uw2Var == 0) {
                                                        uw2Var = new uw2(new mt2[i2]);
                                                    }
                                                    if (M10644P2 != 0) {
                                                        uw2Var.m11663b(M10644P2);
                                                        M10644P2 = 0;
                                                    }
                                                    uw2Var.m11663b(mt2Var14);
                                                }
                                            } else {
                                                uw2Var = r8;
                                                uw2Var = r8;
                                                M10644P2 = r5;
                                                uw2Var = r8;
                                            }
                                            mt2Var14 = mt2Var14.f25200f;
                                            i2 = 16;
                                            i23 = 2097152;
                                            M10644P2 = M10644P2;
                                            uw2Var = uw2Var;
                                        }
                                        uw2Var = r8;
                                        uw2Var = r8;
                                        M10644P2 = r5;
                                        uw2Var = r8;
                                        uw2Var = uw2Var;
                                        if (i24 != 1) {
                                            uw2Var = r8;
                                            uw2Var = r8;
                                            uw2Var = r8;
                                            M10644P2 = sc6.m10644P(uw2Var);
                                        }
                                    }
                                    i2 = 16;
                                    i23 = 2097152;
                                    r5 = M10644P2;
                                    r8 = uw2Var;
                                }
                            }
                            mt2Var13 = mt2Var13.f25199e;
                            i2 = 16;
                            i23 = 2097152;
                        }
                    }
                    wf2VarM10652X5 = wf2VarM10652X5.m12295v();
                    mt2Var13 = (wf2VarM10652X5 == null || (c0940nb4 = wf2VarM10652X5.f33299G) == null) ? null : (vh4) c0940nb4.f25609f;
                    i2 = 16;
                }
                a32Var2 = (a32) r5;
            } else {
                a32Var2 = null;
            }
            if (a32Var2 != null) {
                mt2 mt2Var15 = (mt2) a32Var2;
                if (!mt2Var15.f25195a.f25208n) {
                    q32.m9721c(str);
                }
                mt2 mt2Var16 = mt2Var15.f25195a.f25199e;
                wf2 wf2VarM10652X6 = sc6.m10652X(a32Var2);
                ArrayList arrayList4 = null;
                while (wf2VarM10652X6 != null) {
                    int i25 = 2097152;
                    if ((((mt2) wf2VarM10652X6.f33299G.f25610g).f25198d & 2097152) != 0) {
                        while (mt2Var16 != null) {
                            if ((mt2Var16.f25197c & i25) != 0) {
                                mt2 mt2VarM10644P6 = mt2Var16;
                                uw2 uw2Var9 = null;
                                while (mt2VarM10644P6 != null) {
                                    if (mt2VarM10644P6 instanceof a32) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(mt2VarM10644P6);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i26 = 2097152;
                                        if ((mt2VarM10644P6.f25197c & 2097152) != 0 && (mt2VarM10644P6 instanceof qx0)) {
                                            mt2 mt2Var17 = ((qx0) mt2VarM10644P6).f28863p;
                                            int i27 = 0;
                                            while (mt2Var17 != null) {
                                                if ((mt2Var17.f25197c & i26) != 0) {
                                                    i27++;
                                                    if (i27 == 1) {
                                                        mt2VarM10644P6 = mt2Var17;
                                                    } else {
                                                        if (uw2Var9 == null) {
                                                            uw2Var9 = new uw2(new mt2[16]);
                                                        }
                                                        if (mt2VarM10644P6 != null) {
                                                            uw2Var9.m11663b(mt2VarM10644P6);
                                                            mt2VarM10644P6 = null;
                                                        }
                                                        uw2Var9.m11663b(mt2Var17);
                                                    }
                                                }
                                                mt2Var17 = mt2Var17.f25200f;
                                                i26 = 2097152;
                                            }
                                            if (i27 == 1) {
                                            }
                                        }
                                    }
                                    mt2VarM10644P6 = sc6.m10644P(uw2Var9);
                                }
                            }
                            mt2Var16 = mt2Var16.f25199e;
                            i25 = 2097152;
                        }
                    }
                    wf2VarM10652X6 = wf2VarM10652X6.m12295v();
                    mt2Var16 = (wf2VarM10652X6 == null || (c0940nb3 = wf2VarM10652X6.f33299G) == null) ? null : (vh4) c0940nb3.f25609f;
                }
                if (arrayList4 != null && (size2 = arrayList4.size() - 1) >= 0) {
                    while (true) {
                        int i28 = size2 - 1;
                        ((a32) arrayList4.get(size2)).mo30K(c0795je, fc3.f18903a);
                        if (i28 < 0) {
                            break;
                        }
                        size2 = i28;
                    }
                }
                a32Var2.mo30K(c0795je, fc3.f18903a);
                a32Var2.mo30K(c0795je, fc3.f18904b);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i29 = 0; i29 < size6; i29++) {
                        ((a32) arrayList4.get(i29)).mo30K(c0795je, fc3.f18904b);
                    }
                }
                if (arrayList4 != null && (size = arrayList4.size() - 1) >= 0) {
                    while (true) {
                        int i30 = size - 1;
                        ((a32) arrayList4.get(size)).mo30K(c0795je, fc3.f18905c);
                        if (i30 < 0) {
                            break;
                        }
                        size = i30;
                    }
                }
                a32Var2.mo30K(c0795je, fc3.f18905c);
            }
            ArrayList arrayList5 = (ArrayList) c0795je.f22194c;
            int size7 = arrayList5.size();
            int i31 = 0;
            while (true) {
                if (i31 < size7) {
                    if (((s22) arrayList5.get(i31)).f29839i) {
                        z2 = true;
                        break;
                    }
                    i31++;
                }
            }
            c32Var.getClass();
            MotionEvent motionEvent3 = (MotionEvent) c0795je.f22195d;
            action = motionEvent3.getAction();
            if (action != 0) {
                z4 = true;
                if ((action != 1 || action == 2) && z2) {
                    c32Var2 = c32Var;
                    c32Var2.f15781b = 0;
                    c32Var2.f15782c = true;
                } else {
                    c32Var2 = c32Var;
                }
            } else {
                c32Var2 = c32Var;
                z4 = true;
                c32Var2.f15781b = c0795je.f22193b;
                c32Var2.f15782c = false;
            }
            c32Var2.f15783d.onTouchEvent(motionEvent3);
            return z4;
        }
        System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        z2 = false;
        c32Var.getClass();
        MotionEvent motionEvent4 = (MotionEvent) c0795je.f22195d;
        action = motionEvent4.getAction();
        if (action != 0) {
            z4 = true;
            if (action != 1) {
                c32Var2 = c32Var;
                c32Var2.f15781b = 0;
                c32Var2.f15782c = true;
            } else {
                c32Var2 = c32Var;
                c32Var2.f15781b = 0;
                c32Var2.f15782c = true;
            }
        } else {
            c32Var2 = c32Var;
            z4 = true;
            c32Var2.f15781b = c0795je.f22193b;
            c32Var2.f15782c = false;
        }
        c32Var2.f15783d.onTouchEvent(motionEvent4);
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        if (m10616p(r24) == false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        int iM13496u;
        RunnableC0757ic runnableC0757ic = this.f30148v0;
        if (this.f30150w0) {
            removeCallbacks(runnableC0757ic);
            runnableC0757ic.run();
        }
        if (!m10595n(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = this.f30149w;
            ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = viewOnAttachStateChangeListenerC1400zc.f35951d;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC1400zc.f35954g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.m10619s(true);
                    qw1 qw1Var = new qw1();
                    wf2 root = viewTreeObserverOnGlobalLayoutListenerC1140sc.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(y)) & 4294967295L) | (((long) Float.floatToRawIntBits(x)) << 32);
                    C0940nb c0940nb = root.f33299G;
                    e13 e13Var = (e13) c0940nb.f25608e;
                    kr2 kr2Var = e13.f17595X;
                    ((e13) c0940nb.f25608e).m4877f1(e13.f17601d0, e13Var.m4867V0(jFloatToRawIntBits, true), qw1Var, 1, true);
                    int iM7689T = kx5.m7689T(qw1Var);
                    while (true) {
                        if (-1 < iM7689T) {
                            wf2 wf2VarM10652X = sc6.m10652X((mt2) qw1Var.f28847a.m4206g(iM7689T));
                            if (viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(wf2VarM10652X) == null) {
                                if (wf2VarM10652X.f33299G.m8671i(8)) {
                                    iM13496u = viewOnAttachStateChangeListenerC1400zc.m13496u(wf2VarM10652X.f33312b);
                                    i14 i14VarM7605f = ks5.m7605f(wf2VarM10652X, false);
                                    if (C0006a5.m88z(i14VarM7605f) && !zt5.m13757B(i14VarM7605f)) {
                                        break;
                                    }
                                }
                                iM7689T--;
                            }
                        }
                        iM13496u = Integer.MIN_VALUE;
                        break;
                    }
                    boolean zDispatchGenericMotionEvent2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i = viewOnAttachStateChangeListenerC1400zc.f35952e;
                    if (i != iM13496u) {
                        viewOnAttachStateChangeListenerC1400zc.f35952e = iM13496u;
                        ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, iM13496u, 128, null, 12);
                        ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, i, 256, null, 12);
                    }
                    zDispatchGenericMotionEvent = iM13496u == Integer.MIN_VALUE ? zDispatchGenericMotionEvent2 : true;
                } else if (action != 10) {
                    zDispatchGenericMotionEvent = false;
                } else {
                    int i2 = viewOnAttachStateChangeListenerC1400zc.f35952e;
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != Integer.MIN_VALUE) {
                            viewOnAttachStateChangeListenerC1400zc.f35952e = Integer.MIN_VALUE;
                            ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, Integer.MIN_VALUE, 128, null, 12);
                            ViewOnAttachStateChangeListenerC1400zc.m13474y(viewOnAttachStateChangeListenerC1400zc, i2, 256, null, 12);
                        }
                    } else {
                        zDispatchGenericMotionEvent = viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    }
                }
            } else {
                zDispatchGenericMotionEvent = false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m10615o(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f30130m0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f30130m0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f30150w0 = true;
                        postDelayed(runnableC0757ic, 8L);
                        return zDispatchGenericMotionEvent;
                    }
                    return zDispatchGenericMotionEvent;
                }
                if ((m10613j(motionEvent) & 1) != 0 || zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = 1;
        if (!isFocused()) {
            zk1 focusOwner = getFocusOwner();
            C0675g4 c0675g4 = new C0675g4(b);
            c0675g4.f19600b = this;
            c0675g4.f19601c = keyEvent;
            VarHandle.storeStoreFence();
            return ((bl1) focusOwner).m3618d(keyEvent, c0675g4);
        }
        cj2 cj2Var = getComposeViewContext().f21453t;
        int metaState = keyEvent.getMetaState();
        cj2Var.getClass();
        d83 d83Var = zz4.f36511a;
        sc3 sc3Var = new sc3();
        sc3Var.f30159a = metaState;
        VarHandle.storeStoreFence();
        d83Var.setValue(sc3Var);
        return ((bl1) getFocusOwner()).m3618d(keyEvent, new da2((byte) 12)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0940nb c0940nb;
        if (isFocused()) {
            bl1 bl1Var = (bl1) getFocusOwner();
            if (bl1Var.f15397d.f34331e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                sl1 sl1VarM13844H = zy5.m13844H(bl1Var.f15396c);
                if (sl1VarM13844H != null) {
                    if (!sl1VarM13844H.f25195a.f25208n) {
                        q32.m9721c("visitAncestors called on an unattached node");
                    }
                    mt2 mt2Var = sl1VarM13844H.f25195a;
                    wf2 wf2VarM10652X = sc6.m10652X(sl1VarM13844H);
                    while (wf2VarM10652X != null) {
                        if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 131072) != 0) {
                            while (mt2Var != null) {
                                if ((mt2Var.f25197c & 131072) != 0) {
                                    mt2 mt2VarM10644P = mt2Var;
                                    uw2 uw2Var = null;
                                    while (mt2VarM10644P != null) {
                                        if ((mt2VarM10644P.f25197c & 131072) != 0 && (mt2VarM10644P instanceof qx0)) {
                                            int i = 0;
                                            for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                                if ((mt2Var2.f25197c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        mt2VarM10644P = mt2Var2;
                                                    } else {
                                                        if (uw2Var == null) {
                                                            uw2Var = new uw2(new mt2[16]);
                                                        }
                                                        if (mt2VarM10644P != null) {
                                                            uw2Var.m11663b(mt2VarM10644P);
                                                            mt2VarM10644P = null;
                                                        }
                                                        uw2Var.m11663b(mt2Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        mt2VarM10644P = sc6.m10644P(uw2Var);
                                    }
                                }
                                mt2Var = mt2Var.f25199e;
                            }
                        }
                        wf2VarM10652X = wf2VarM10652X.m12295v();
                        mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.f30082D0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.f30082D0 = false;
            m10596A(viewStructure);
        } catch (Throwable th) {
            this.f30082D0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object obj;
        sl1 sl1VarM3620f;
        Object tag;
        RunnableC0757ic runnableC0757ic = this.f30148v0;
        if (this.f30150w0) {
            removeCallbacks(runnableC0757ic);
            MotionEvent motionEvent2 = this.f30130m0;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f30150w0 = false;
            } else {
                runnableC0757ic.run();
            }
        }
        if (!m10595n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m10616p(motionEvent))) {
            int iM10613j = m10613j(motionEvent);
            if ((iM10613j & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (tag = view.getTag(C0995R.id.auto_clear_focus_behavior_tag)) == null) {
                    obj = tag;
                    C0807jq c0807jq = new C0807jq();
                    c0807jq.f22513a = 1;
                    VarHandle.storeStoreFence();
                    obj = c0807jq;
                }
                obj = tag;
                C0807jq c0807jq2 = new C0807jq();
                c0807jq2.f22513a = 1;
                VarHandle.storeStoreFence();
                if (obj.equals(c0807jq2) && (sl1VarM3620f = ((bl1) getFocusOwner()).m3620f()) != null) {
                    e13 e13VarM10651W = sc6.m10651W(sl1VarM3620f);
                    if (!y42.m12861j0(e13VarM10651W).mo4003Q(e13VarM10651W, true).m7166a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((bl1) getFocusOwner()).m3616b(8, false, true);
                    }
                }
            }
            if ((iM10613j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        jl3 jl3VarM12314a;
        if (view == null || this.f30097P.f32096c) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
        if (viewFindNextFocus == null || !AbstractC0647fd.m5683v(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            sl1 sl1VarM13844H = zy5.m13844H(((bl1) getFocusOwner()).f15396c);
            jl3VarM12314a = sl1VarM13844H != null ? zy5.m13846J(sl1VarM13844H) : null;
            if (jl3VarM12314a == null) {
                jl3VarM12314a = wk1.m12314a(view, this);
            }
        } else {
            jl3VarM12314a = wk1.m12314a(view, this);
        }
        mk1 mk1VarM12317d = wk1.m12317d(i);
        int i2 = mk1VarM12317d != null ? mk1VarM12317d.f24973a : 6;
        ql3 ql3Var = new ql3();
        zk1 focusOwner = getFocusOwner();
        C0607ec c0607ec = new C0607ec((byte) 0);
        c0607ec.f17957b = ql3Var;
        VarHandle.storeStoreFence();
        if (((bl1) focusOwner).m3619e(i2, jl3VarM12314a, c0607ec) == null) {
            return view;
        }
        Object obj = ql3Var.f28555a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || y42.m12868q0(zy5.m13846J((sl1) obj), wk1.m12314a(viewFindNextFocus, this), jl3VarM12314a, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    /* JADX INFO: renamed from: g */
    public final q63 m10611g(mq1 mq1Var, b13 b13Var, bu1 bu1Var) {
        uw2 uw2Var;
        Reference referencePoll;
        Object obj;
        if (bu1Var != null) {
            return new du1(bu1Var, null, this, mq1Var, b13Var);
        }
        pq3 pq3Var = this.f30134o0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) pq3Var.f27897c;
            uw2Var = (uw2) pq3Var.f27896b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                uw2Var.m11671k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = uw2Var.f32213c;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) uw2Var.m11672l(i - 1)).get();
        } while (obj == null);
        q63 q63Var = (q63) obj;
        if (q63Var == null) {
            return new du1(getGraphicsContext().mo3312b(), getGraphicsContext(), this, mq1Var, b13Var);
        }
        du1 du1Var = (du1) q63Var;
        au1 au1Var = du1Var.f17391b;
        if (au1Var == null) {
            throw d55.m4363h("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!du1Var.f17390a.f15626s) {
            q32.m9719a("layer should have been released before reuse");
        }
        du1Var.f17390a = au1Var.mo3312b();
        du1Var.f17396g = false;
        du1Var.f17393d = mq1Var;
        du1Var.f17394e = b13Var;
        du1Var.f17406q = false;
        du1Var.f17407r = false;
        du1Var.f17408s = true;
        rq2.m10395e(du1Var.f17397h);
        float[] fArr = du1Var.f17398i;
        if (fArr != null) {
            rq2.m10395e(fArr);
        }
        du1Var.f17404o = to4.f31292b;
        du1Var.f17409t = false;
        du1Var.f17395f = 9223372034707292159L;
        du1Var.f17405p = null;
        du1Var.f17403n = 0;
        return q63Var;
    }

    public InterfaceC1094r3 getAccessibilityManager() {
        return getComposeViewContext().f21444k;
    }

    public final C0689gi getAndroidViewsHandler$ui() {
        if (this.f30094M == null) {
            C0689gi c0689gi = new C0689gi(getContext());
            c0689gi.setClipChildren(false);
            c0689gi.f19797a = new HashMap();
            c0689gi.f19798b = new HashMap();
            VarHandle.storeStoreFence();
            this.f30094M = c0689gi;
            addView(c0689gi, -1);
            requestLayout();
        }
        return this.f30094M;
    }

    public C0739hv getAutofillTree() {
        return this.f30155z;
    }

    public ha0 getClipboard() {
        return getComposeViewContext().f21447n;
    }

    public ia0 getClipboardManager() {
        return getComposeViewContext().f21446m;
    }

    public final ii0 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f30080C0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f30087G.getValue();
    }

    public final ViewOnAttachStateChangeListenerC0758id getContentCaptureManager$ui() {
        return this.f30151x;
    }

    public ro0 getCoroutineContext() {
        return this.f30131n;
    }

    public ky0 getDensity() {
        return (ky0) this.f30125k.getValue();
    }

    public jl3 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            sl1 sl1VarM13844H = zy5.m13844H(((bl1) getFocusOwner()).f15396c);
            if (sl1VarM13844H != null) {
                return zy5.m13846J(sl1VarM13844H);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return wk1.m12314a(viewFindFocus, this);
        }
        return null;
    }

    public zk1 getFocusOwner() {
        return this.f30129m;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        jl3 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f22396a);
            rect.top = Math.round(embeddedViewFocusRect.f22397b);
            rect.right = Math.round(embeddedViewFocusRect.f22398c);
            rect.bottom = Math.round(embeddedViewFocusRect.f22399d);
            return;
        }
        if (z62.m13387o(((bl1) getFocusOwner()).m3619e(6, null, new C0891m((byte) 10)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public am1 getFontFamilyResolver() {
        return (am1) this.f30120h0.getValue();
    }

    public zl1 getFontLoader() {
        return getComposeViewContext().f21448o;
    }

    public final qk2 getFrameEndScheduler$ui() {
        return this.f30113e;
    }

    public au1 getGraphicsContext() {
        return this.f30153y;
    }

    public fv1 getHapticFeedBack() {
        return getComposeViewContext().f21450q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f30097P.f32095b.m7221G() || !this.f30121i.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public d42 getInputModeManager() {
        d42 d42Var = this.f30124j0;
        if (d42Var == null) {
            int i = isInTouchMode() ? 1 : 2;
            d42Var = new d42();
            b42 b42Var = new b42();
            b42Var.f15077a = i;
            VarHandle.storeStoreFence();
            d42Var.f16776a = k43.m7398w(b42Var);
            VarHandle.storeStoreFence();
            this.f30124j0 = d42Var;
        }
        return d42Var;
    }

    public final j42 getInsetsListener() {
        return this.f30139r;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f30104W;
    }

    @Override // android.view.View, android.view.ViewParent
    public df2 getLayoutDirection() {
        return (df2) this.f30122i0.getValue();
    }

    public zm2 getLocaleList() {
        return (zm2) this.f30089H.getValue();
    }

    public long getMeasureIteration() {
        uq2 uq2Var = this.f30097P;
        if (!uq2Var.f32096c) {
            q32.m9719a("measureIteration should be only used during the measure/layout pass");
        }
        return uq2Var.f32100g ? 1L : 0L;
    }

    public ot2 getModifierLocalManager() {
        return this.f30126k0;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1140sc getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public cb3 getPlacementScope() {
        t63 t63Var = eb3.f17951a;
        to2 to2Var = new to2((byte) 1);
        to2Var.f31287c = this;
        VarHandle.storeStoreFence();
        return to2Var;
    }

    public final mq1 getPlayNavigationSoundEffect$ui() {
        return this.f30152x0;
    }

    public kc3 getPointerIconService() {
        return this.f30088G0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final r22 m14030getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f30111d;
    }

    public ll3 getRectManager() {
        return this.f30145u;
    }

    public hp3 getRetainedValuesStore() {
        return this.f30119h;
    }

    public wf2 getRoot() {
        return this.f30141s;
    }

    public final x01 getSavedStateRegistry() {
        x01 x01Var = this.f30117g;
        if (x01Var != null) {
            return x01Var;
        }
        ii0 composeViewContext = getComposeViewContext();
        composeViewContext.m6809e();
        av3 av3Var = composeViewContext.f21438e;
        View view = (View) getParent();
        Object tag = view.getTag(C0995R.id.compose_view_saveable_id_tag);
        LinkedHashMap linkedHashMap = null;
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view.getId());
        }
        String strM13620t = zi4.m13620t("SaveableStateRegistry:", strValueOf);
        yu3 savedStateRegistry = av3Var.getSavedStateRegistry();
        Bundle bundleM13253a = savedStateRegistry.m13253a(strM13620t);
        if (bundleM13253a != null) {
            linkedHashMap = new LinkedHashMap();
            for (String str : bundleM13253a.keySet()) {
                linkedHashMap.put(str, bundleM13253a.getParcelableArrayList(str));
            }
        }
        mu3 mu3VarM9279a = ou3.m9279a(linkedHashMap, new dh0((byte) 10));
        boolean z = false;
        if (savedStateRegistry.m13254b(strM13620t) == null) {
            try {
                vf0 vf0Var = new vf0((byte) 1);
                vf0Var.f32563b = mu3VarM9279a;
                VarHandle.storeStoreFence();
                savedStateRegistry.m13255c(strM13620t, vf0Var);
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        y01 y01Var = new y01();
        y01Var.f34756a = z;
        y01Var.f34757b = savedStateRegistry;
        y01Var.f34758c = strM13620t;
        VarHandle.storeStoreFence();
        x01 x01Var2 = new x01();
        x01Var2.f33895a = mu3VarM9279a;
        x01Var2.f33896b = y01Var;
        VarHandle.storeStoreFence();
        this.f30117g = x01Var2;
        return x01Var2;
    }

    public final boolean getScrollCaptureInProgress() {
        wd3 wd3Var = this.f30084E0;
        if (wd3Var != null && ((Boolean) ((d83) wd3Var.f33259b).getValue()).booleanValue()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc) {
                return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public l14 getSemanticsOwner() {
        return this.f30147v;
    }

    public yf2 getSharedDrawScope() {
        return getComposeViewContext().f21452s;
    }

    public boolean getShowLayoutBounds() {
        return C1111rk.f29369a.m10349a(this);
    }

    public u63 getSnapshotObserver() {
        return this.f30093L;
    }

    public ea4 getSoftwareKeyboardController() {
        ay0 ay0Var = this.f30118g0;
        if (ay0Var != null) {
            return ay0Var;
        }
        bl4 textInputService = getTextInputService();
        ay0 ay0Var2 = new ay0();
        ay0Var2.f14939a = textInputService;
        VarHandle.storeStoreFence();
        this.f30118g0 = ay0Var2;
        return ay0Var2;
    }

    public bl4 getTextInputService() {
        bl4 bl4Var = this.f30114e0;
        if (bl4Var != null) {
            return bl4Var;
        }
        bl4 bl4Var2 = new bl4(getLegacyTextInputServiceAndroid());
        this.f30114e0 = bl4Var2;
        return bl4Var2;
    }

    public yl4 getTextToolbar() {
        C0835kh c0835kh = this.f30128l0;
        if (c0835kh != null) {
            return c0835kh;
        }
        C0835kh c0835kh2 = new C0835kh();
        am4[] am4VarArr = am4.f14631a;
        VarHandle.storeStoreFence();
        this.f30128l0 = c0835kh2;
        return c0835kh2;
    }

    public final wq3 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public fy4 getViewConfiguration() {
        return getComposeViewContext().f21451r;
    }

    public yz4 getWindowInfo() {
        return getComposeViewContext().f21453t;
    }

    /* JADX INFO: renamed from: i */
    public final void m10612i(wf2 wf2Var, boolean z) {
        this.f30097P.m11615f(wf2Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:106:0x0155 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:107:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0164  */
    /* JADX WARN: Code duplicated, block: B:111:0x0166  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x016d A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:118:0x017f A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0182 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0191 A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #1 {all -> 0x0078, blocks: (B:14:0x0036, B:16:0x0040, B:22:0x0050, B:38:0x007f, B:40:0x0083, B:42:0x0092, B:43:0x0098, B:44:0x00a3, B:53:0x00b6, B:55:0x00bc, B:122:0x0191, B:123:0x019d, B:25:0x0058, B:31:0x0064, B:34:0x006c), top: B:148:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:124:0x01a1, B:128:0x01ad, B:130:0x01b5, B:132:0x01bf, B:131:0x01b8), top: B:146:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01b8 A[Catch: all -> 0x01d0, TryCatch #0 {all -> 0x01d0, blocks: (B:124:0x01a1, B:128:0x01ad, B:130:0x01b5, B:132:0x01bf, B:131:0x01b8), top: B:146:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0124 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0130 A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x013a A[Catch: all -> 0x002f, TryCatch #3 {all -> 0x002f, blocks: (B:4:0x001c, B:6:0x0025, B:57:0x00c8, B:59:0x00cf, B:67:0x00e0, B:72:0x00ed, B:73:0x00f0, B:75:0x00f4, B:77:0x00fa, B:79:0x00fe, B:81:0x0104, B:83:0x010a, B:86:0x0112, B:87:0x011e, B:89:0x0124, B:91:0x012a, B:93:0x0130, B:95:0x0136, B:97:0x013a, B:98:0x013e, B:104:0x0151, B:106:0x0155, B:108:0x015c, B:115:0x016d, B:116:0x0177, B:118:0x017f, B:119:0x0182, B:120:0x0189), top: B:151:0x001c }] */
    /* JADX INFO: renamed from: j */
    public final int m10613j(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc;
        int i;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent3;
        int iM10603H;
        nw1 nw1Var;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc2;
        MotionEvent motionEvent4;
        int pointerId;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z5;
        nw1 nw1Var2;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc3 = this;
        gu2 gu2Var = viewTreeObserverOnGlobalLayoutListenerC1140sc3.f30083E;
        g90 g90Var = viewTreeObserverOnGlobalLayoutListenerC1140sc3.f30085F;
        viewTreeObserverOnGlobalLayoutListenerC1140sc3.removeCallbacks(viewTreeObserverOnGlobalLayoutListenerC1140sc3.f30146u0);
        try {
            m10598C(motionEvent);
            viewTreeObserverOnGlobalLayoutListenerC1140sc3.f30106a0 = true;
            viewTreeObserverOnGlobalLayoutListenerC1140sc3.m10619s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC1140sc3.f30130m0;
                boolean z6 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = this;
                        i = 9;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = this;
                        i = 9;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                    if (motionEvent3 != null) {
                        motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        if (motionEvent.getAction() == i) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        gu2Var.f20131c.delete(pointerId);
                                        gu2Var.f20130b.delete(pointerId);
                                    }
                                    nw1Var2 = (nw1) g90Var.f19663c;
                                    if (nw1Var2.f26146d) {
                                        nw1Var2.f26146d = true;
                                    } else {
                                        nw1Var2.f26149g.f21953a.m11668g();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        gu2Var.f20131c.delete(pointerId);
                                        gu2Var.f20130b.delete(pointerId);
                                    }
                                    nw1Var2 = (nw1) g90Var.f19663c;
                                    if (nw1Var2.f26146d) {
                                        nw1Var2.f26146d = true;
                                    } else {
                                        nw1Var2.f26149g.f21953a.m11668g();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    gu2Var.f20131c.delete(pointerId);
                                    gu2Var.f20130b.delete(pointerId);
                                }
                                nw1Var2 = (nw1) g90Var.f19663c;
                                if (nw1Var2.f26146d) {
                                    nw1Var2.f26146d = true;
                                } else {
                                    nw1Var2.f26149g.f21953a.m11668g();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    gu2Var.f20131c.delete(pointerId);
                                    gu2Var.f20130b.delete(pointerId);
                                }
                                nw1Var2 = (nw1) g90Var.f19663c;
                                if (nw1Var2.f26146d) {
                                    nw1Var2.f26146d = true;
                                } else {
                                    nw1Var2.f26149g.f21953a.m11668g();
                                }
                            }
                        }
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10604I(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iM10603H = m10603H(motionEvent);
                    Trace.endSection();
                    if ((iM10603H & 4) != 0) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc2 = this;
                    } else {
                        nw1Var = (nw1) g90Var.f19663c;
                        if (nw1Var.f26146d) {
                            nw1Var.f26146d = true;
                        } else {
                            nw1Var.f26149g.f21953a.m11668g();
                        }
                        viewTreeObserverOnGlobalLayoutListenerC1140sc2 = this;
                        viewTreeObserverOnGlobalLayoutListenerC1140sc2.m10604I(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1140sc2.f30106a0 = false;
                    return iM10603H;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!g90Var.f19661a) {
                            po2 po2Var = (po2) ((w42) g90Var.f19664d).f33090b;
                            int i2 = po2Var.f27863d;
                            Object[] objArr = po2Var.f27862c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                objArr[i3] = null;
                            }
                            po2Var.f27863d = 0;
                            po2Var.f27860a = false;
                            ((nw1) g90Var.f19663c).m8869c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z6) {
                        motionEvent2 = motionEvent7;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc3.m10604I(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !m10615o(motionEvent)) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = this;
                        i = 9;
                    } else {
                        i = 9;
                        viewTreeObserverOnGlobalLayoutListenerC1140sc = this;
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10604I(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent2 == null || motionEvent2.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        if (motionEvent.getAction() == i || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        gu2Var.f20131c.delete(pointerId);
                                        gu2Var.f20130b.delete(pointerId);
                                    }
                                    nw1Var2 = (nw1) g90Var.f19663c;
                                    if (nw1Var2.f26146d) {
                                        nw1Var2.f26146d = true;
                                    } else {
                                        nw1Var2.f26149g.f21953a.m11668g();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            gu2Var.f20131c.delete(pointerId);
                            gu2Var.f20130b.delete(pointerId);
                        }
                    }
                    viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10604I(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iM10603H = m10603H(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iM10603H & 4) != 0 && z3) {
                            nw1Var = (nw1) g90Var.f19663c;
                            if (nw1Var.f26146d) {
                                nw1Var.f26146d = true;
                            } else {
                                nw1Var.f26149g.f21953a.m11668g();
                            }
                            viewTreeObserverOnGlobalLayoutListenerC1140sc2 = this;
                            viewTreeObserverOnGlobalLayoutListenerC1140sc2.m10604I(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC1140sc2 = this;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC1140sc2.f30106a0 = false;
                        return iM10603H;
                    } catch (Throwable th) {
                        th = th;
                        viewTreeObserverOnGlobalLayoutListenerC1140sc3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        viewTreeObserverOnGlobalLayoutListenerC1140sc3.f30106a0 = false;
        throw th;
    }

    /* JADX INFO: renamed from: l */
    public final void m10614l(wf2 wf2Var) {
        this.f30097P.m11624r(wf2Var, false);
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            m10614l((wf2) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10615o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        hp3 hp3Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().m12256J()) {
            getRoot().m12275e(this);
        }
        byte b = 1;
        setAttached(true);
        this.f30139r.onViewAttachedToWindow(this);
        if (!this.f30080C0) {
            getComposeViewContext().m6807c();
        }
        boolean z = false;
        this.f30080C0 = false;
        m10614l(getRoot());
        m10593k(getRoot());
        getSnapshotObserver().f31675a.m160f();
        ViewTreeObserverOnGlobalLayoutListenerC1140sc outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            C1077qn.m9989o("Expected the view to be attached to window.");
            return;
        }
        C0570dc c0570dc = new C0570dc(b);
        c0570dc.f16913b = this;
        VarHandle.storeStoreFence();
        outOfFrameExecutor.m10600E(c0570dc);
        getComposeViewContext().m6809e();
        ii0 composeViewContext = getComposeViewContext();
        composeViewContext.m6809e();
        py4 py4Var = composeViewContext.f21439f;
        qk2 qk2Var = this.f30113e;
        if (py4Var == null || qk2Var == null) {
            hp3Var = null;
        } else {
            js1 js1Var = new js1(py4Var.mo2976c(), new ny4(), br0.f15519b);
            r90 r90VarM10361a = rl3.m10361a(sk2.class);
            C1283w7 c1283w7 = (C1283w7) js1Var.f22555a;
            String strM10248a = r90VarM10361a.m10248a();
            if (strM10248a == null) {
                C1077qn.m9987m("Local and anonymous classes can not be ViewModels");
                return;
            }
            sk2 sk2Var = (sk2) c1283w7.m12122I(r90VarM10361a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM10248a));
            int id = ((View) getParent()).getId();
            lv2 lv2Var = sk2Var.f30353b;
            Object objM8197b = lv2Var.m8197b(id);
            if (objM8197b == null) {
                objM8197b = new cw2(1);
                lv2Var.m8121h(id, objM8197b);
            }
            cw2 cw2Var = (cw2) objM8197b;
            Object[] objArr = cw2Var.f16532a;
            int i = cw2Var.f16533b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((rk2) obj).f29372c) {
                    break;
                } else {
                    i2++;
                }
            }
            rk2 rk2Var = (rk2) obj;
            if (rk2Var == null) {
                rk2Var = new rk2();
                s92 s92Var = new s92();
                s92Var.f30009b = true;
                s92Var.f30012e = new lw2();
                VarHandle.storeStoreFence();
                w42 w42Var = new w42((byte) 4, z);
                w42Var.f33090b = s92Var;
                if (!s92Var.f30010c) {
                    if (s92Var.f30011d) {
                        ld3.m7957a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    s92Var.m10564a();
                    s92Var.f30011d = true;
                }
                VarHandle.storeStoreFence();
                rk2Var.f29370a = w42Var;
                rk2Var.f29371b = w42Var;
                VarHandle.storeStoreFence();
                cw2Var.m4200a(rk2Var);
            }
            rk2Var.f29372c = true;
            this.f30115f = rk2Var;
            hp3Var = rk2Var.f29371b;
        }
        if (hp3Var == null) {
            hp3Var = ia5.f21222m;
        }
        this.f30119h = hp3Var;
        yp1 yp1Var = this.f30110c0;
        if (yp1Var != null) {
            yp1Var.invoke(getComposeViewContext());
            this.f30110c0 = null;
        }
        ii0 composeViewContext2 = getComposeViewContext();
        composeViewContext2.m6809e();
        gk2 lifecycle = composeViewContext2.f21437d.getLifecycle();
        lifecycle.mo6015a(this);
        lifecycle.mo6015a(this.f30151x);
        d42 inputModeManager = getInputModeManager();
        b = isInTouchMode() ? (byte) 1 : (byte) 2;
        d83 d83Var = inputModeManager.f16776a;
        b42 b42Var = new b42();
        b42Var.f15077a = b;
        VarHandle.storeStoreFence();
        d83Var.setValue(b42Var);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        C0523cd.f15936a.m3973b(this);
        C1287wb autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((bl1) getFocusOwner()).f15400g.m4200a(autofillManager);
            getSemanticsOwner().f23706d.m4200a(autofillManager);
        }
        ((bl1) getFocusOwner()).f15400g.m4200a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        n34 n34Var = (n34) this.f30116f0.get();
        C0723hf c0723hf = (C0723hf) (n34Var != null ? n34Var.f25423b : null);
        if (c0723hf == null) {
            return getLegacyTextInputServiceAndroid().f17161d;
        }
        n34 n34Var2 = (n34) c0723hf.f20526d.get();
        a42 a42Var = (a42) (n34Var2 != null ? n34Var2.f25423b : null);
        return a42Var != null && (a42Var.f99e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m10606K(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0140  */
    /* JADX WARN: Code duplicated, block: B:103:0x0144  */
    /* JADX WARN: Code duplicated, block: B:104:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0152  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        n34 n34Var = (n34) this.f30116f0.get();
        C0723hf c0723hf = (C0723hf) (n34Var != null ? n34Var.f25423b : null);
        byte b = 10;
        if (c0723hf != null) {
            n34 n34Var2 = (n34) c0723hf.f20526d.get();
            a42 a42Var = (a42) (n34Var2 != null ? n34Var2.f25423b : null);
            if (a42Var == null) {
                return null;
            }
            synchronized (a42Var.f97c) {
                if (a42Var.f99e) {
                    return null;
                }
                gl3 gl3VarM11902a = a42Var.f95a.m11902a(editorInfo);
                b71 b71Var = new b71(b);
                b71Var.f15141b = a42Var;
                VarHandle.storeStoreFence();
                InputConnection g23Var = Build.VERSION.SDK_INT >= 34 ? new g23(gl3VarM11902a, b71Var) : new f23(gl3VarM11902a, b71Var);
                a42Var.f98d.m11663b(new ez4(g23Var));
                return g23Var;
            }
        }
        dl4 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.f17161d) {
            return null;
        }
        l12 l12Var = legacyTextInputServiceAndroid.f17165h;
        xk4 xk4Var = legacyTextInputServiceAndroid.f17164g;
        int i3 = l12Var.f23700d;
        int i4 = 4;
        if (i3 == 1) {
            i = 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                C1077qn.m9989o("invalid ImeAction");
                return null;
            }
            i = 6;
        }
        editorInfo.imeOptions = i;
        int i5 = l12Var.f23699c;
        byte b2 = 17;
        if (i5 != 1) {
            if (i5 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i5 == 3) {
                editorInfo.inputType = 2;
                i4 = 2;
            } else if (i5 == 4) {
                editorInfo.inputType = 3;
                i4 = 3;
            } else if (i5 == 5) {
                editorInfo.inputType = 17;
                i4 = 17;
            } else if (i5 == 6) {
                i4 = 33;
                editorInfo.inputType = 33;
            } else if (i5 == 7) {
                i4 = 129;
                editorInfo.inputType = 129;
            } else if (i5 == 8) {
                editorInfo.inputType = 18;
                i4 = 18;
            } else if (i5 == 9) {
                i4 = 8194;
                editorInfo.inputType = 8194;
            } else if (i5 == 10) {
                i4 = 145;
                editorInfo.inputType = 145;
            } else if (i5 == 11) {
                i4 = 113;
                editorInfo.inputType = 113;
            } else if (i5 == 12) {
                i4 = 97;
                editorInfo.inputType = 97;
            } else if (i5 == 13) {
                i4 = 49;
                editorInfo.inputType = 49;
            } else if (i5 == 14) {
                i4 = 65;
                editorInfo.inputType = 65;
            } else if (i5 == 15) {
                i4 = 81;
                editorInfo.inputType = 81;
            } else if (i5 == 16) {
                i4 = 177;
                editorInfo.inputType = 177;
            } else if (i5 == 17) {
                i4 = 193;
                editorInfo.inputType = 193;
            } else if (i5 == 18) {
                editorInfo.inputType = 4;
            } else {
                i4 = 20;
                if (i5 == 19) {
                    editorInfo.inputType = 20;
                } else if (i5 == 20) {
                    i4 = 36;
                    editorInfo.inputType = 36;
                } else if (i5 == 21) {
                    i4 = 4098;
                    editorInfo.inputType = 4098;
                } else if (i5 == 22) {
                    i4 = 12290;
                    editorInfo.inputType = 12290;
                } else if (i5 == 23) {
                    i4 = 8210;
                    editorInfo.inputType = 8210;
                } else if (i5 == 24) {
                    i4 = 4114;
                    editorInfo.inputType = 4114;
                } else {
                    if (i5 != 25) {
                        C1077qn.m9989o("Invalid Keyboard Type");
                        return null;
                    }
                    i4 = 12306;
                    editorInfo.inputType = 12306;
                }
            }
            if ((i4 & 15) == 1) {
                i4 |= 131072;
                editorInfo.inputType = i4;
                if (i3 == 1) {
                    editorInfo.imeOptions = 1073741824 | i;
                }
            }
            if ((i4 & 15) == 1) {
                i2 = l12Var.f23697a;
                if (i2 == 1) {
                    i4 |= 4096;
                    editorInfo.inputType = i4;
                } else if (i2 == 2) {
                    i4 |= 8192;
                    editorInfo.inputType = i4;
                } else if (i2 == 3) {
                    i4 |= 16384;
                    editorInfo.inputType = i4;
                }
                if (l12Var.f23698b) {
                    editorInfo.inputType = 32768 | i4;
                }
            }
            long j = xk4Var.f34342b;
            int i6 = ql4.f28557c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            editorInfo.setInitialSurroundingSubText(xk4Var.f34341a.f24092b, 0);
            editorInfo.imeOptions |= 33554432;
            xk4 xk4Var2 = legacyTextInputServiceAndroid.f17164g;
            boolean z = legacyTextInputServiceAndroid.f17165h.f23698b;
            w42 w42Var = new w42(b2, false);
            w42Var.f33090b = legacyTextInputServiceAndroid;
            VarHandle.storeStoreFence();
            fl3 fl3Var = new fl3();
            fl3Var.f19080a = w42Var;
            fl3Var.f19081b = z;
            fl3Var.f19083d = xk4Var2;
            fl3Var.f19086g = new ArrayList();
            fl3Var.f19087h = true;
            VarHandle.storeStoreFence();
            legacyTextInputServiceAndroid.f17166i.add(new WeakReference(fl3Var));
            return fl3Var;
        }
        editorInfo.inputType = 1;
        i4 = 1;
        if ((i4 & 15) == 1) {
            i4 |= 131072;
            editorInfo.inputType = i4;
            if (i3 == 1) {
                editorInfo.imeOptions = 1073741824 | i;
            }
        }
        if ((i4 & 15) == 1) {
            i2 = l12Var.f23697a;
            if (i2 == 1) {
                i4 |= 4096;
                editorInfo.inputType = i4;
            } else if (i2 == 2) {
                i4 |= 8192;
                editorInfo.inputType = i4;
            } else if (i2 == 3) {
                i4 |= 16384;
                editorInfo.inputType = i4;
            }
            if (l12Var.f23698b) {
                editorInfo.inputType = 32768 | i4;
            }
        }
        long j2 = xk4Var.f34342b;
        int i7 = ql4.f28557c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        editorInfo.setInitialSurroundingSubText(xk4Var.f34341a.f24092b, 0);
        editorInfo.imeOptions |= 33554432;
        xk4 xk4Var3 = legacyTextInputServiceAndroid.f17164g;
        boolean z2 = legacyTextInputServiceAndroid.f17165h.f23698b;
        w42 w42Var2 = new w42(b2, false);
        w42Var2.f33090b = legacyTextInputServiceAndroid;
        VarHandle.storeStoreFence();
        fl3 fl3Var2 = new fl3();
        fl3Var2.f19080a = w42Var2;
        fl3Var2.f19081b = z2;
        fl3Var2.f19083d = xk4Var3;
        fl3Var2.f19086g = new ArrayList();
        fl3Var2.f19087h = true;
        VarHandle.storeStoreFence();
        legacyTextInputServiceAndroid.f17166i.add(new WeakReference(fl3Var2));
        return fl3Var2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        i14 i14Var;
        ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id = this.f30151x;
        viewOnAttachStateChangeListenerC0758id.getClass();
        for (long j : jArr) {
            k14 k14Var = (k14) viewOnAttachStateChangeListenerC0758id.m6755d().m8197b((int) j);
            if (k14Var != null && (i14Var = k14Var.f22816a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(viewOnAttachStateChangeListenerC0758id.f21260a.getAutofillId(), i14Var.f21014f);
                Object objM8132g = i14Var.f21012d.f17631a.m8132g(m14.f24535B);
                if (objM8132g == null) {
                    objM8132g = null;
                }
                List list = (List) objM8132g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C0875lk(yl2.m13170a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f30139r.onViewDetachedFromWindow(this);
        View view = this.f30127l;
        if (m10594m() && view != null) {
            removeView(view);
        }
        cw2 cw2Var = f30072J0;
        synchronized (cw2Var) {
            cw2Var.m4210k(this);
        }
        getComposeViewContext().m6806b();
        aa4 aa4Var = getSnapshotObserver().f31675a;
        C1040pn c1040pn = aa4Var.f217h;
        if (c1040pn != null) {
            c1040pn.m9573k();
        }
        aa4Var.m155a();
        ii0 composeViewContext = getComposeViewContext();
        composeViewContext.m6809e();
        gk2 lifecycle = composeViewContext.f21437d.getLifecycle();
        lifecycle.mo6017c(this.f30151x);
        lifecycle.mo6017c(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        rk2 rk2Var = this.f30115f;
        if (rk2Var != null) {
            rk2Var.f29372c = false;
        }
        this.f30115f = null;
        C0523cd.f15936a.m3972a(this);
        C1287wb autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().f23706d.m4210k(autofillManager);
            ((bl1) getFocusOwner()).f15400g.m4210k(autofillManager);
        }
        ll3 rectManager = getRectManager();
        rectManager.f24132g = rectManager.f24129d.m8359b(0L, 0L, null, 0, 0);
        getRectManager().m8027a();
        ll3 rectManager2 = getRectManager();
        RunnableC1054q0 runnableC1054q0 = rectManager2.f24134i;
        if (runnableC1054q0 != null) {
            rectManager2.f24127b.removeCallbacks(runnableC1054q0);
            rectManager2.f24134i = null;
        }
        ((bl1) getFocusOwner()).f15400g.m4210k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        bl1 bl1Var = (bl1) getFocusOwner();
        kx5.m7713i0(bl1Var.f15396c, true);
        if (bl1Var.m3620f() != null) {
            sl1 sl1VarM3620f = bl1Var.m3620f();
            bl1Var.m3623i(null);
            if (sl1VarM3620f != null) {
                sl1VarM3620f.m10854P0(nl1.f25927a, nl1.f25929c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f30104W = 0L;
        m10607L();
        if (Build.VERSION.SDK_INT < 34) {
            m10606K(getResources().getConfiguration());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f30104W = 0L;
            this.f30097P.m11617k(this.f30156z0);
            this.f30095N = null;
            m10607L();
            if (this.f30094M != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        uq2 uq2Var = this.f30097P;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().m12256J()) {
                getRoot().m12275e(this);
            }
            if (!isAttachedToWindow()) {
                m10614l(getRoot());
            }
            long jM10591f = m10591f(i);
            long jM10591f2 = m10591f(i2);
            long jM5547r = C0638f5.m5547r((int) (jM10591f >>> 32), (int) (jM10591f & 4294967295L), (int) (jM10591f2 >>> 32), (int) (4294967295L & jM10591f2));
            kl0 kl0Var = this.f30095N;
            if (kl0Var == null) {
                this.f30095N = kl0.m7531a(jM5547r);
                this.f30096O = false;
            } else if (!kl0.m7533c(kl0Var.f23210a, jM5547r)) {
                this.f30096O = true;
            }
            uq2Var.m11625s(jM5547r);
            uq2Var.m11619m();
            setMeasuredDimension(getRoot().f33300H.f14483p.f16899a, getRoot().f33300H.f14483p.f16900b);
            if (this.f30094M != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f33300H.f14483p.f16899a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f33300H.f14483p.f16900b, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.f30082D0) {
            return;
        }
        m10596A(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        jc3 jc3Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (jc3Var = ((C0978oc) getPointerIconService()).f26545a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return jc3Var instanceof C0796jf ? PointerIcon.getSystemIcon(context, ((C0796jf) jc3Var).f22201b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // p000.jw0
    public final void onResume() {
        d70 d70VarMo5190v;
        rk2 rk2Var = this.f30115f;
        if (rk2Var != null) {
            qk2 qk2Var = this.f30113e;
            w42 w42Var = rk2Var.f29370a;
            s92 s92Var = (s92) w42Var.f33090b;
            if (!s92Var.f30009b || s92Var.f30011d) {
                return;
            }
            try {
                g32 g32Var = new g32((byte) 7);
                g32Var.f19558b = rk2Var;
                VarHandle.storeStoreFence();
                d70VarMo5190v = ((p35) qk2Var).f27344a.mo5190v(g32Var);
            } catch (CancellationException unused) {
                s92 s92Var2 = (s92) w42Var.f33090b;
                if (!s92Var2.f30010c) {
                    if (s92Var2.f30011d) {
                        ld3.m7957a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    s92Var2.m10564a();
                    s92Var2.f30011d = true;
                }
                d70VarMo5190v = null;
            }
            d70 d70Var = rk2Var.f29373d;
            if (d70Var != null) {
                d70Var.cancel();
            }
            rk2Var.f29373d = d70VarMo5190v;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        df2 df2Var;
        if (this.f30109c) {
            int[] iArr = wk1.f33443a;
            if (i != 0) {
                df2Var = i != 1 ? null : df2.f17012b;
            } else {
                df2Var = df2.f17011a;
            }
            if (df2Var == null) {
                df2Var = df2.f17011a;
            }
            setLayoutDirection(df2Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        wd3 wd3Var = this.f30084E0;
        if (wd3Var != null) {
            l14 semanticsOwner = getSemanticsOwner();
            ro0 coroutineContext = getCoroutineContext();
            uw2 uw2Var = new uw2(new zw3[16]);
            y62.m12974i0(semanticsOwner.m7810a(), 0, new yw3(1, uw2Var, uw2.class, "add", "add(Ljava/lang/Object;)Z", 8));
            yp1[] yp1VarArr = {new fv3((byte) 23), new fv3((byte) 24)};
            bf0 bf0Var = new bf0();
            bf0Var.f15232a = yp1VarArr;
            VarHandle.storeStoreFence();
            Arrays.sort(uw2Var.f32211a, 0, uw2Var.f32213c, bf0Var);
            int i = uw2Var.f32213c;
            zw3 zw3Var = (zw3) (i == 0 ? null : uw2Var.f32211a[i - 1]);
            if (zw3Var == null) {
                return;
            }
            s52 s52Var = zw3Var.f36430c;
            um0 um0VarM13670b = zp0.m13670b(coroutineContext);
            i14 i14Var = zw3Var.f36428a;
            wh0 wh0Var = new wh0();
            wh0Var.f33373a = i14Var;
            wh0Var.f33374b = s52Var;
            wh0Var.f33375c = wd3Var;
            wh0Var.f33376d = this;
            wh0Var.f33377e = new um0(um0VarM13670b.f31989a.plus(xz0.f34733b));
            int i2 = s52Var.f29919d - s52Var.f29917b;
            qm4 qm4Var = new qm4(wh0Var, null);
            ex1 ex1Var = new ex1();
            ex1Var.f18554a = i2;
            ex1Var.f18556c = qm4Var;
            VarHandle.storeStoreFence();
            wh0Var.f33378f = ex1Var;
            VarHandle.storeStoreFence();
            e13 e13Var = zw3Var.f36431d;
            jl3 jl3VarMo4003Q = y42.m12861j0(e13Var).mo4003Q(e13Var, true);
            long jM10525a = s52Var.m10525a();
            ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(this, gq6.m6070H(y62.m12964d0(jl3VarMo4003Q)), new Point((int) (jM10525a >> 32), (int) (jM10525a & 4294967295L)), wh0Var);
            scrollCaptureTarget.setScrollBounds(gq6.m6070H(s52Var));
            consumer.accept(scrollCaptureTarget);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m10607L();
    }

    @Override // p000.jw0
    public final void onStop() {
        rk2 rk2Var = this.f30115f;
        if (rk2Var != null) {
            s92 s92Var = (s92) rk2Var.f29370a.f33090b;
            if (s92Var.f30009b && !s92Var.f30011d) {
                d70 d70Var = rk2Var.f29373d;
                if (d70Var != null) {
                    d70Var.cancel();
                }
                rk2Var.f29373d = null;
                return;
            }
            if (s92Var.f30010c) {
                return;
            }
            if (!s92Var.f30011d) {
                ld3.m7957a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((lw2) s92Var.f30012e).m8134i()) {
                ld3.m7957a("Attempted to start retaining exited values with pending exited values");
            }
            s92Var.f30011d = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        d42 inputModeManager = getInputModeManager();
        int i = z ? 1 : 2;
        d83 d83Var = inputModeManager.f16776a;
        b42 b42Var = new b42();
        b42Var.f15077a = i;
        VarHandle.storeStoreFence();
        d83Var.setValue(b42Var);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id = this.f30151x;
        viewOnAttachStateChangeListenerC0758id.getClass();
        if (z62.m13387o(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            oh6.m9111q(viewOnAttachStateChangeListenerC0758id, longSparseArray);
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = viewOnAttachStateChangeListenerC0758id.f21260a;
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 1);
        runnableC1285w9.f33164b = viewOnAttachStateChangeListenerC0758id;
        runnableC1285w9.f33165c = longSparseArray;
        VarHandle.storeStoreFence();
        viewTreeObserverOnGlobalLayoutListenerC1140sc.post(runnableC1285w9);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.f30078B0 = true;
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10616p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f30130m0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final void m10617q(float[] fArr) {
        m10597B();
        rq2.m10398h(fArr, this.f30102U);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f30108b0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f30108b0 & 4294967295L));
        float[] fArr2 = this.f30100S;
        rq2.m10395e(fArr2);
        rq2.m10399i(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        float fM5685y = AbstractC0647fd.m5685y(0, 0, fArr2, fArr);
        float fM5685y2 = AbstractC0647fd.m5685y(0, 1, fArr2, fArr);
        float fM5685y3 = AbstractC0647fd.m5685y(0, 2, fArr2, fArr);
        float fM5685y4 = AbstractC0647fd.m5685y(0, 3, fArr2, fArr);
        float fM5685y5 = AbstractC0647fd.m5685y(1, 0, fArr2, fArr);
        float fM5685y6 = AbstractC0647fd.m5685y(1, 1, fArr2, fArr);
        float fM5685y7 = AbstractC0647fd.m5685y(1, 2, fArr2, fArr);
        float fM5685y8 = AbstractC0647fd.m5685y(1, 3, fArr2, fArr);
        float fM5685y9 = AbstractC0647fd.m5685y(2, 0, fArr2, fArr);
        float fM5685y10 = AbstractC0647fd.m5685y(2, 1, fArr2, fArr);
        float fM5685y11 = AbstractC0647fd.m5685y(2, 2, fArr2, fArr);
        float fM5685y12 = AbstractC0647fd.m5685y(2, 3, fArr2, fArr);
        float fM5685y13 = AbstractC0647fd.m5685y(3, 0, fArr2, fArr);
        float fM5685y14 = AbstractC0647fd.m5685y(3, 1, fArr2, fArr);
        float fM5685y15 = AbstractC0647fd.m5685y(3, 2, fArr2, fArr);
        float fM5685y16 = AbstractC0647fd.m5685y(3, 3, fArr2, fArr);
        fArr[0] = fM5685y;
        fArr[1] = fM5685y2;
        fArr[2] = fM5685y3;
        fArr[3] = fM5685y4;
        fArr[4] = fM5685y5;
        fArr[5] = fM5685y6;
        fArr[6] = fM5685y7;
        fArr[7] = fM5685y8;
        fArr[8] = fM5685y9;
        fArr[9] = fM5685y10;
        fArr[10] = fM5685y11;
        fArr[11] = fM5685y12;
        fArr[12] = fM5685y13;
        fArr[13] = fM5685y14;
        fArr[14] = fM5685y15;
        fArr[15] = fM5685y16;
    }

    /* JADX INFO: renamed from: r */
    public final long m10618r(long j) {
        m10597B();
        long jM10393c = rq2.m10393c(j, this.f30102U);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f30108b0 >> 32)) + Float.intBitsToFloat((int) (jM10393c >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f30108b0 & 4294967295L)) + Float.intBitsToFloat((int) (jM10393c & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        byte b = 1;
        if (!isFocused()) {
            mk1 mk1VarM12317d = wk1.m12317d(i);
            int i2 = mk1VarM12317d != null ? mk1VarM12317d.f24973a : 7;
            zk1 focusOwner = getFocusOwner();
            jl3 jl3Var = rect != null ? new jl3(rect.left, rect.top, rect.right, rect.bottom) : null;
            C0720hc c0720hc = new C0720hc((byte) 0);
            c0720hc.f20474b = i2;
            VarHandle.storeStoreFence();
            Boolean boolM3619e = ((bl1) focusOwner).m3619e(i2, jl3Var, c0720hc);
            Boolean bool = Boolean.TRUE;
            if (!z62.m13387o(boolM3619e, bool)) {
                zk1 focusOwner2 = getFocusOwner();
                C0720hc c0720hc2 = new C0720hc(b);
                c0720hc2.f20474b = i2;
                VarHandle.storeStoreFence();
                if (!z62.m13387o(((bl1) focusOwner2).m3619e(i2, null, c0720hc2), bool)) {
                    if (hasFocus() && (i2 == 1 || i2 == 2)) {
                        return ((bl1) getFocusOwner()).m3622h(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m10619s(boolean z) {
        uq2 uq2Var = this.f30097P;
        if (uq2Var.f32095b.m7221G() || ((uw2) uq2Var.f32098e.f35738b).f32213c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (uq2Var.m11617k(z ? this.f30156z0 : this.f30076A0)) {
                    requestLayout();
                }
                uq2Var.m11612a(false);
                getRectManager().m8027a();
                if (this.f30081D) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f30081D = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f30149w.f35955h = j;
    }

    public final void setComposeViewContext(ii0 ii0Var) {
        ro0 coroutineContext = getCoroutineContext();
        ii0Var.m6809e();
        if (coroutineContext != ii0Var.f21436c.mo5182k() && !((aw2) getRoot().m12288o()).isEmpty()) {
            q32.m9719a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        e94 e94VarM5353c0 = ev0.m5353c0();
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            ii0 ii0Var2 = get_composeViewContext();
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            if (ii0Var != ii0Var2) {
                if (isAttachedToWindow()) {
                    ii0Var2.m6806b();
                    ii0Var.m6807c();
                }
                set_composeViewContext(ii0Var);
                ii0Var.m6809e();
                setCoroutineContext(ii0Var.f21436c.mo5182k());
            }
        } catch (Throwable th) {
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f30080C0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f30087G.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id) {
        this.f30151x = viewOnAttachStateChangeListenerC0758id;
    }

    public void setCoroutineContext(ro0 ro0Var) {
        this.f30131n = ro0Var;
    }

    public final void setFrameEndScheduler$ui(qk2 qk2Var) {
        this.f30113e = qk2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f30104W = j;
    }

    public final void setOnReadyForComposition(yp1 yp1Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f30080C0) {
            yp1Var.invoke(getComposeViewContext());
        } else {
            this.f30110c0 = yp1Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(mq1 mq1Var) {
        this.f30152x0 = mq1Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m14031setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(r22 r22Var) {
        this.f30111d = r22Var;
    }

    public void setUncaughtExceptionHandler(wq3 wq3Var) {
        this.f30097P.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m10620t(wf2 wf2Var, long j) {
        uq2 uq2Var = this.f30097P;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            uq2Var.m11618l(wf2Var, j);
            if (!uq2Var.f32095b.m7221G()) {
                uq2Var.m11612a(false);
                getRectManager().m8027a();
                this.f30076A0.invoke();
                if (this.f30081D) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f30081D = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10621u(int i) {
        if (i != 7 && i != 8) {
            Integer numM12316c = wk1.m12316c(i);
            if (numM12316c == null) {
                throw d55.m4363h("Invalid focus direction");
            }
            int iIntValue = numM12316c.intValue();
            sl1 sl1VarM3620f = ((bl1) getFocusOwner()).m3620f();
            if (sl1VarM3620f == null) {
                C1077qn.m9989o("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM12316c2 = wk1.m12316c(i);
            if (numM12316c2 == null) {
                throw d55.m4363h("Invalid focus direction");
            }
            int iIntValue2 = numM12316c2.intValue();
            gy4 gy4Var = sc6.m10652X(sl1VarM3620f).f33326p;
            View interopView = gy4Var != null ? gy4Var.getInteropView() : null;
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC0647fd.m5683v(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return wk1.m12315b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m10622v() {
        cw2 cw2Var;
        Object[] objArr;
        byte b = 0;
        if (this.f30092K) {
            aa4 aa4Var = getSnapshotObserver().f31675a;
            t63 t63Var = new t63(b);
            synchronized (aa4Var.f216g) {
                try {
                    uw2 uw2Var = aa4Var.f215f;
                    int i = uw2Var.f32213c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = uw2Var.f32211a;
                        if (i2 >= i) {
                            break;
                        }
                        z94 z94Var = (z94) objArr[i2];
                        z94Var.m13461d(t63Var);
                        if (!z94Var.f35893f.m8135j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = uw2Var.f32211a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    uw2Var.f32213c = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f30092K = false;
        }
        C0689gi c0689gi = this.f30094M;
        if (c0689gi != null) {
            m10590d(c0689gi);
        }
        C1287wb autofillManager = getAutofillManager();
        if (autofillManager != null) {
            mv2 mv2Var = autofillManager.f33206h;
            if (mv2Var.f25234d == 0 && autofillManager.f33207i) {
                autofillManager.f33199a.m13308F().commit();
                autofillManager.f33207i = false;
            }
            if (mv2Var.f25234d != 0) {
                autofillManager.f33207i = true;
            }
        }
        while (this.f30136p0.m4209j() && this.f30136p0.m4206g(0) != null) {
            int i5 = this.f30136p0.f16533b;
            int i6 = 0;
            while (true) {
                cw2Var = this.f30136p0;
                if (i6 < i5) {
                    wp1 wp1Var = (wp1) cw2Var.m4206g(i6);
                    this.f30136p0.m4214o(i6, null);
                    if (wp1Var != null) {
                        wp1Var.invoke();
                    }
                    i6++;
                }
            }
            cw2Var.m4212m(0, i5);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10623w(wf2 wf2Var) {
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = this.f30149w;
        viewOnAttachStateChangeListenerC1400zc.f35971x = true;
        if (viewOnAttachStateChangeListenerC1400zc.m13493o()) {
            viewOnAttachStateChangeListenerC1400zc.m13494p(wf2Var);
        }
        ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id = this.f30151x;
        viewOnAttachStateChangeListenerC0758id.f21266g = true;
        if (viewOnAttachStateChangeListenerC0758id.m6756f()) {
            viewOnAttachStateChangeListenerC0758id.f21267h.mo5493n(ju4.f22634a);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m10624x(wf2 wf2Var, boolean z, boolean z2, boolean z3) {
        wf2 wf2VarM12295v;
        wf2 wf2VarM12295v2;
        uq2 uq2Var = this.f30097P;
        if (!z) {
            if (uq2Var.m11624r(wf2Var, z2) && z3) {
                m10601F(wf2Var);
                return;
            }
            return;
        }
        jp0 jp0Var = uq2Var.f32095b;
        wf2 wf2Var2 = wf2Var.f33319i;
        ag2 ag2Var = wf2Var.f33300H;
        if (wf2Var2 == null) {
            q32.m9721c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = ag2Var.f14471d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    C0670g.m5864c();
                    return;
                }
                if (!ag2Var.f14472e || z2) {
                    ag2Var.f14472e = true;
                    ag2Var.f14483p.f33637v = true;
                    if (wf2Var.f33310R) {
                        return;
                    }
                    if ((z62.m13387o(wf2Var.m12258L(), Boolean.TRUE) || uq2.m11609h(wf2Var)) && ((wf2VarM12295v = wf2Var.m12295v()) == null || !wf2VarM12295v.f33300H.f14472e)) {
                        jp0Var.m7235c(wf2Var, k72.f22957a);
                    } else if ((wf2Var.m12257K() || uq2.m11610i(wf2Var)) && ((wf2VarM12295v2 = wf2Var.m12295v()) == null || !wf2VarM12295v2.m12291r())) {
                        jp0Var.m7235c(wf2Var, k72.f22959c);
                    }
                    if (uq2Var.f32097d || !z3) {
                        return;
                    }
                    m10601F(wf2Var);
                    return;
                }
                return;
            }
        }
        uq2Var.f32101h.m11663b(new tq2(wf2Var, true, z2));
    }

    /* JADX INFO: renamed from: y */
    public final void m10625y(wf2 wf2Var, boolean z, boolean z2) {
        ag2 ag2Var = wf2Var.f33300H;
        uq2 uq2Var = this.f30097P;
        if (!z) {
            uq2Var.getClass();
            int iOrdinal = ag2Var.f14471d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                C0670g.m5864c();
                return;
            }
            wf2 wf2VarM12295v = wf2Var.m12295v();
            boolean z3 = wf2VarM12295v == null || wf2VarM12295v.m12257K();
            if (!z2) {
                if (wf2Var.m12291r()) {
                    return;
                }
                if (wf2Var.m12290q() && wf2Var.m12257K() == z3 && wf2Var.m12257K() == ag2Var.f14483p.f33636u) {
                    return;
                }
            }
            wq2 wq2Var = ag2Var.f14483p;
            wq2Var.f33638w = true;
            wq2Var.f33639x = true;
            if (!wf2Var.f33310R && wq2Var.f33636u && z3) {
                if ((wf2VarM12295v == null || !wf2VarM12295v.m12290q()) && (wf2VarM12295v == null || !wf2VarM12295v.m12291r())) {
                    uq2Var.f32095b.m7235c(wf2Var, k72.f22960d);
                }
                if (uq2Var.f32097d) {
                    return;
                }
                m10601F(null);
                return;
            }
            return;
        }
        jp0 jp0Var = uq2Var.f32095b;
        int iOrdinal2 = ag2Var.f14471d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    C0670g.m5864c();
                    return;
                }
            }
        }
        if ((ag2Var.f14472e || ag2Var.f14473f) && !z2) {
            return;
        }
        ag2Var.f14473f = true;
        ag2Var.f14474g = true;
        wq2 wq2Var2 = ag2Var.f14483p;
        wq2Var2.f33638w = true;
        wq2Var2.f33639x = true;
        if (wf2Var.f33310R) {
            return;
        }
        wf2 wf2VarM12295v2 = wf2Var.m12295v();
        if (z62.m13387o(wf2Var.m12258L(), Boolean.TRUE) && ((wf2VarM12295v2 == null || !wf2VarM12295v2.f33300H.f14472e) && (wf2VarM12295v2 == null || !wf2VarM12295v2.f33300H.f14473f))) {
            jp0Var.m7235c(wf2Var, k72.f22958b);
        } else if (wf2Var.m12257K() && ((wf2VarM12295v2 == null || !wf2VarM12295v2.m12290q()) && (wf2VarM12295v2 == null || !wf2VarM12295v2.m12291r()))) {
            jp0Var.m7235c(wf2Var, k72.f22960d);
        }
        if (uq2Var.f32097d) {
            return;
        }
        m10601F(null);
    }

    /* JADX INFO: renamed from: z */
    public final void m10626z() {
        ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = this.f30149w;
        viewOnAttachStateChangeListenerC1400zc.f35971x = true;
        Handler handler = viewOnAttachStateChangeListenerC1400zc.f35951d.getHandler();
        if (viewOnAttachStateChangeListenerC1400zc.m13493o() && !viewOnAttachStateChangeListenerC1400zc.f35946I && handler != null) {
            viewOnAttachStateChangeListenerC1400zc.f35946I = true;
            handler.post(viewOnAttachStateChangeListenerC1400zc.f35948K);
        }
        ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id = this.f30151x;
        viewOnAttachStateChangeListenerC0758id.f21266g = true;
        Handler handler2 = viewOnAttachStateChangeListenerC0758id.f21260a.getHandler();
        if (!viewOnAttachStateChangeListenerC0758id.m6756f() || viewOnAttachStateChangeListenerC0758id.f21272m || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC0758id.f21272m = true;
        handler2.post(viewOnAttachStateChangeListenerC0758id.f21273n);
    }

    public C1250vb getAutofill() {
        return this.f30090I;
    }

    public C1287wb getAutofillManager() {
        return this.f30091J;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC1141sd m14034getDragAndDropManager() {
        return this.f30133o;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public lv2 m14036getLayoutNodes() {
        return this.f30143t;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void setShowLayoutBounds(boolean z) {
    }

    public final void setUncaughtExceptionHandler$ui(wq3 wq3Var) {
    }

    @sy0
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m14029getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @sy0
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public xq3 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }
}
