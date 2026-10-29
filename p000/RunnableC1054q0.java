package p000;

import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.ax2;
import ads_mobile_sdk.e62;
import ads_mobile_sdk.gd2;
import ads_mobile_sdk.k44;
import ads_mobile_sdk.l44;
import ads_mobile_sdk.m24;
import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: q0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1054q0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28114a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f28115b;

    public /* synthetic */ RunnableC1054q0(byte b) {
        this.f28114a = b;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0374  */
    /* JADX WARN: Code duplicated, block: B:185:0x037e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0380 A[Catch: all -> 0x03af, LOOP:1: B:173:0x0325->B:186:0x0380, LOOP_END, TryCatch #7 {all -> 0x03af, blocks: (B:170:0x0317, B:173:0x0325, B:175:0x0335, B:177:0x0341, B:179:0x034a, B:181:0x0359, B:183:0x0376, B:186:0x0380, B:187:0x0384, B:189:0x0396, B:193:0x03ab, B:194:0x03ae, B:188:0x0389), top: B:229:0x0317, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindViewById;
        View viewFindFocus;
        byte b = this.f28114a;
        byte b2 = 23;
        Map mapUnmodifiableMap = null;
        byte b3 = 1;
        int i = 0;
        Object obj = this.f28115b;
        switch (b) {
            case 0:
                ((AbstractC1091r0) obj).m10168b();
                return;
            case 1:
                ((g32) obj).invoke();
                return;
            case 2:
                ViewOnAttachStateChangeListenerC1400zc viewOnAttachStateChangeListenerC1400zc = (ViewOnAttachStateChangeListenerC1400zc) obj;
                Trace.beginSection("Compose:semantics:measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC1400zc.f35951d.m10619s(true);
                    Trace.endSection();
                    Trace.beginSection("Compose:semantics:checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC1400zc.m13486g();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC1400zc.f35946I = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 3:
                ViewOnAttachStateChangeListenerC0758id viewOnAttachStateChangeListenerC0758id = (ViewOnAttachStateChangeListenerC0758id) obj;
                boolean zM6756f = viewOnAttachStateChangeListenerC0758id.m6756f();
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = viewOnAttachStateChangeListenerC0758id.f21260a;
                if (zM6756f) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10619s(true);
                        lv2 lv2Var = viewOnAttachStateChangeListenerC0758id.f21270k;
                        int[] iArr = lv2Var.f24666b;
                        long[] jArr = lv2Var.f24665a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = i; i4 < i3; i4++) {
                                        if ((255 & j) < 128) {
                                            int i5 = iArr[(i2 << 3) + i4];
                                            if (!viewOnAttachStateChangeListenerC0758id.m6755d().m8196a(i5)) {
                                                viewOnAttachStateChangeListenerC0758id.f21263d.add(new xl0(i5, viewOnAttachStateChangeListenerC0758id.f21269j, yl0.f35313b, null));
                                                viewOnAttachStateChangeListenerC0758id.f21267h.mo5493n(ju4.f22634a);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i3 == 8) {
                                        if (i2 != length) {
                                            i2++;
                                            i = 0;
                                        }
                                    }
                                } else if (i2 != length) {
                                    i2++;
                                    i = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            viewOnAttachStateChangeListenerC0758id.m6758h(viewTreeObserverOnGlobalLayoutListenerC1140sc.getSemanticsOwner().m7810a(), viewOnAttachStateChangeListenerC0758id.f21271l);
                            Trace.endSection();
                            viewOnAttachStateChangeListenerC0758id.m6754c(viewOnAttachStateChangeListenerC0758id.m6755d());
                            viewOnAttachStateChangeListenerC0758id.m6761k();
                            viewOnAttachStateChangeListenerC0758id.f21272m = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((C0651fh) obj).f18978h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 5:
                ((C1293wh) obj).invoke();
                return;
            case 6:
                yf0 yf0Var = (yf0) obj;
                Runnable runnable = yf0Var.f35190b;
                if (runnable != null) {
                    runnable.run();
                    yf0Var.f35190b = null;
                    return;
                }
                return;
            case 7:
                eg0.m5120d((eg0) obj);
                return;
            case 8:
                Iterator it = ((eo1) obj).f18317n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    xy4.m12778e();
                    return;
                }
                return;
            case 9:
                ((C1163sz) obj).getClass();
                return;
            case 10:
                ((m82) obj).m8225k();
                return;
            case 11:
                t82 t82Var = (t82) obj;
                if (t82Var != null) {
                    t82Var.mo4993a(null);
                    return;
                }
                return;
            case 12:
                vp3.setRippleState$lambda$1((vp3) obj);
                return;
            case 13:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 14:
                dl4 dl4Var = (dl4) obj;
                jp0 jp0Var = dl4Var.f17159b;
                dl4Var.f17171n = null;
                uw2 uw2Var = dl4Var.f17170m;
                View view2 = dl4Var.f17158a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    uw2Var.m11668g();
                    return;
                }
                Object[] objArr = uw2Var.f32211a;
                int i6 = uw2Var.f32213c;
                Boolean bool = null;
                Boolean boolValueOf = null;
                for (int i7 = 0; i7 < i6; i7++) {
                    cl4 cl4Var = (cl4) objArr[i7];
                    int iOrdinal = cl4Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            C0670g.m5864c();
                            return;
                        } else if (!z62.m13387o(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(cl4Var == cl4.f16108c);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                uw2Var.m11668g();
                if (z62.m13387o(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((pg2) jp0Var.f22482c).getValue()).restartInput((View) jp0Var.f22481b);
                }
                if (boolValueOf != null) {
                    boolean zBooleanValue = boolValueOf.booleanValue();
                    w42 w42Var = (w42) jp0Var.f22483d;
                    if (zBooleanValue) {
                        pq3 pq3Var = (pq3) w42Var.f33090b;
                        View view3 = (View) pq3Var.f27897c;
                        WindowInsetsController windowInsetsController = view3 != null ? view3.getWindowInsetsController() : null;
                        if (windowInsetsController != null) {
                            windowInsetsController.show(WindowInsets.Type.ime());
                        }
                        View view4 = (View) pq3Var.f27896b;
                        if (view4 != null) {
                            if (view4.isInEditMode() || view4.onCheckIsTextEditor()) {
                                view4.requestFocus();
                                viewFindViewById = view4;
                            } else {
                                viewFindViewById = view4.getRootView().findFocus();
                            }
                            if (viewFindViewById == null) {
                                viewFindViewById = view4.getRootView().findViewById(R.id.content);
                            }
                            if (viewFindViewById != null && viewFindViewById.hasWindowFocus()) {
                                RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 13);
                                runnableC1054q0.f28115b = viewFindViewById;
                                VarHandle.storeStoreFence();
                                viewFindViewById.post(runnableC1054q0);
                            }
                        }
                    } else {
                        pq3 pq3Var2 = (pq3) w42Var.f33090b;
                        View view5 = (View) pq3Var2.f27897c;
                        WindowInsetsController windowInsetsController2 = view5 != null ? view5.getWindowInsetsController() : null;
                        if (windowInsetsController2 != null) {
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            fa4 fa4Var = new fa4();
                            fa4Var.f18881a = atomicBoolean;
                            VarHandle.storeStoreFence();
                            windowInsetsController2.addOnControllableInsetsChangedListener(fa4Var);
                            if (!atomicBoolean.get() && view5 != null) {
                                ((InputMethodManager) view5.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view5.getWindowToken(), 0);
                            }
                            windowInsetsController2.removeOnControllableInsetsChangedListener(fa4Var);
                            windowInsetsController2.hide(WindowInsets.Type.ime());
                        } else {
                            View view6 = (View) pq3Var2.f27896b;
                            if (view6 != null) {
                                ((InputMethodManager) view6.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view6.getWindowToken(), 0);
                            }
                        }
                    }
                }
                if (z62.m13387o(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((pg2) jp0Var.f22482c).getValue()).restartInput((View) jp0Var.f22481b);
                    return;
                }
                return;
            case 15:
                C1126rz c1126rz = (C1126rz) obj;
                ((AtomicReference) c1126rz.f29739c).set(null);
                synchronized (c1126rz) {
                    if (((AtomicMarkableReference) c1126rz.f29738b).isMarked()) {
                        sd2 sd2Var = (sd2) ((AtomicMarkableReference) c1126rz.f29738b).getReference();
                        synchronized (sd2Var) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(sd2Var.f30180a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c1126rz.f29738b;
                        atomicMarkableReference.set((sd2) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    if1 if1Var = (if1) c1126rz.f29740d;
                    ((us2) if1Var.f21325b).m11646h((String) if1Var.f21324a, mapUnmodifiableMap, c1126rz.f29737a);
                    return;
                }
                return;
            case 16:
                ((C0310ra) obj).onSuccess((sz4) new f70((byte) 22));
                return;
            case 17:
                C1283w7 c1283w7 = (C1283w7) obj;
                pt3 pt3Var = (pt3) c1283w7.f33126b;
                C1040pn c1040pn = new C1040pn(b2);
                c1040pn.f27754b = c1283w7;
                VarHandle.storeStoreFence();
                pt3Var.m9675k(c1040pn);
                return;
            case 18:
                ((AtomicBoolean) obj).set(true);
                return;
            case 19:
                ax2 ax2Var = (ax2) obj;
                m24 m24Var = (m24) ax2Var.f791a.get();
                long j2 = ax2Var.f795e;
                if (j2 <= 0) {
                    m24Var.m1686a();
                    return;
                }
                ti5 ti5Var = m24Var.f7089e;
                RunnableC1054q0 runnableC1054q1 = new RunnableC1054q0(b2);
                runnableC1054q1.f28115b = m24Var;
                VarHandle.storeStoreFence();
                ti5Var.mo306a(runnableC1054q1, j2);
                return;
            case 20:
                e62 e62Var = (e62) obj;
                synchronized (e62Var) {
                    try {
                        if (e62Var.f2809d.get()) {
                            return;
                        }
                        Context context = e62Var.f2807b.getContext();
                        if (context != null) {
                            View view7 = e62Var.f2810e;
                            if (view7 == null) {
                                view7 = new View(context);
                                view7.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                                e62Var.f2810e = view7;
                            }
                            if (!e62Var.f2807b.equals(view7.getParent())) {
                                e62Var.f2807b.addView(e62Var.f2810e);
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 21:
                gd2 gd2Var = (gd2) obj;
                qk3 qk3Var = new qk3(gd2Var, b3);
                try {
                    Object systemService = gd2Var.f3917a.getSystemService("connectivity");
                    systemService.getClass();
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(qk3Var);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 22:
                l44 l44Var = (l44) obj;
                k44 k44Var = new k44();
                k44Var.f6069a = l44Var;
                VarHandle.storeStoreFence();
                try {
                    Object systemService2 = l44Var.f6702b.getSystemService("appops");
                    systemService2.getClass();
                    ((AppOpsManager) systemService2).startWatchingActive(l44.f6700h, l44Var.f6703c, k44Var);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 23:
                ((m24) obj).m1686a();
                return;
            default:
                ((HttpURLConnection) obj).disconnect();
                return;
        }
    }
}
