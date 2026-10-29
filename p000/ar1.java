package p000;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14797a;

    /* JADX INFO: renamed from: b */
    public Object f14798b;

    /* JADX INFO: renamed from: c */
    public Object f14799c;

    public /* synthetic */ ar1(byte b) {
        this.f14797a = b;
    }

    /* JADX INFO: renamed from: a */
    private final void m3124a() {
        a86 a86Var = (a86) this.f14799c;
        synchronized (a86Var.f169c) {
            try {
                e43 e43Var = (e43) a86Var.f170d;
                if (e43Var != null) {
                    e43Var.onSuccess(((nr6) this.f14798b).m8824h());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f14798b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p000.e24.f17642f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f14798b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f14798b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3125b() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((e24) this.f14799c).f17644b) {
                    if (z) {
                        runnable = (Runnable) ((e24) this.f14799c).f17644b.poll();
                        this.f14798b = runnable;
                        if (runnable == null) {
                            ((e24) this.f14799c).f17645c = 1;
                        }
                    } else {
                        e24 e24Var = (e24) this.f14799c;
                        if (e24Var.f17645c != 4) {
                            e24Var.f17646d++;
                            e24Var.f17645c = 4;
                            z = true;
                            runnable = (Runnable) ((e24) this.f14799c).f17644b.poll();
                            this.f14798b = runnable;
                            if (runnable == null) {
                                ((e24) this.f14799c).f17645c = 1;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.f14798b = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        Thread.currentThread().interrupt();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM6989p;
        gz1 zq6Var;
        boolean zBooleanValue;
        boolean z = false;
        Typeface typeface = null;
        switch (this.f14797a) {
            case 0:
                zq1 zq1Var = (zq1) this.f14799c;
                zl2 zl2Var = (zl2) this.f14798b;
                if ((zl2Var instanceof AbstractC0782j1) && (thM6989p = ((AbstractC0782j1) zl2Var).m6989p()) != null) {
                    zq1Var.onFailure(thM6989p);
                    return;
                }
                try {
                    zq1Var.onSuccess(qs5.m10121z(zl2Var));
                    return;
                } catch (Error | RuntimeException e) {
                    zq1Var.onFailure(e);
                    return;
                } catch (ExecutionException e2) {
                    zq1Var.onFailure(e2.getCause());
                    return;
                }
            case 1:
                jp0 jp0Var = (jp0) this.f14798b;
                Typeface typeface2 = (Typeface) this.f14799c;
                b70 b70Var = (b70) jp0Var.f22481b;
                wm1 wm1Var = ((vt1) jp0Var.f22482c).f32854c;
                Context context = (Context) jp0Var.f22483d;
                ThreadLocal threadLocal = es4.f18439a;
                if (typeface2 != null) {
                    if (wm1Var.f33488a.isEmpty()) {
                        typeface = typeface2;
                    } else {
                        ThreadLocal threadLocal2 = es4.f18439a;
                        Paint paint = (Paint) threadLocal2.get();
                        if (paint == null) {
                            paint = new Paint();
                            threadLocal2.set(paint);
                        }
                        paint.setFontVariationSettings(null);
                        paint.setTypeface(typeface2);
                        paint.setFontVariationSettings(oh6.m9081F(wm1Var, context));
                        typeface = paint.getTypeface();
                    }
                }
                b70Var.resumeWith(typeface);
                return;
            case 2:
                wn2 wn2VarM12326e = wn2.m12326e();
                String str = ox0.f27181e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                q25 q25Var = (q25) this.f14798b;
                sb.append(q25Var.f28162a);
                wn2VarM12326e.m12328b(str, sb.toString());
                ((ox0) this.f14799c).f27182a.mo3747c(q25Var);
                return;
            case 3:
                ((mm1) this.f14798b).accept(this.f14799c);
                return;
            case 4:
                try {
                    m3125b();
                    return;
                } catch (Error e3) {
                    synchronized (((e24) this.f14799c).f17644b) {
                        ((e24) this.f14799c).f17645c = 1;
                        throw e3;
                    }
                }
            case 5:
                try {
                    ((Runnable) this.f14799c).run();
                    synchronized (((j24) this.f14798b).f21971d) {
                        ((j24) this.f14798b).m6995a();
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((j24) this.f14798b).f21971d) {
                        ((j24) this.f14798b).m6995a();
                        throw th;
                    }
                }
            case 6:
                p60 p60Var = (p60) this.f14798b;
                boolean zIsCancelled = p60Var.isCancelled();
                b70 b70Var2 = (b70) this.f14799c;
                if (zIsCancelled) {
                    b70Var2.mo115m(null);
                    return;
                }
                while (true) {
                    try {
                        try {
                            Object obj = p60Var.f27392b.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            b70Var2.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th2) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    } catch (ExecutionException e4) {
                        b70Var2.resumeWith(k43.m7389n(e4.getCause()));
                        return;
                    }
                }
                break;
            case 7:
                xl5 xl5Var = (xl5) this.f14799c;
                gm5 gm5Var = (gm5) this.f14798b;
                lk0 lk0Var = gm5Var.f19887e;
                if (lk0Var.f24097e == 0) {
                    lm5 lm5Var = gm5Var.f19888f;
                    y42.m12854a0(lm5Var);
                    lk0 lk0Var2 = lm5Var.f24183f;
                    if (lk0Var2.f24097e != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(lk0Var2)), new Exception());
                        xl5Var.f34399p.m3673f(lk0Var2);
                        xl5Var.f34398o.disconnect();
                        return;
                    }
                    bt0 bt0Var = xl5Var.f34399p;
                    IBinder iBinder = lm5Var.f24182e;
                    if (iBinder == null) {
                        zq6Var = null;
                    } else {
                        int i = AbstractBinderC1169t4.f30745j;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        zq6Var = iInterfaceQueryLocalInterface instanceof gz1 ? (gz1) iInterfaceQueryLocalInterface : new zq6(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                    }
                    Set set = xl5Var.f34396m;
                    bt0Var.getClass();
                    if (zq6Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        bt0Var.m3673f(new lk0(4, null, null));
                    } else {
                        bt0Var.f15567d = zq6Var;
                        bt0Var.f15568e = set;
                        if (bt0Var.f15564a) {
                            ((InterfaceC1074qk) bt0Var.f15565b).getRemoteService(zq6Var, set);
                        }
                    }
                } else {
                    xl5Var.f34399p.m3673f(lk0Var);
                }
                xl5Var.f34398o.disconnect();
                return;
            case 8:
                Toast.makeText(((ep5) this.f14798b).f18359a, (String) this.f14799c, 1).show();
                return;
            case 9:
                C0927mz c0927mz = (C0927mz) this.f14798b;
                C0964nz c0964nz = (C0964nz) this.f14799c;
                f00 f00Var = rz5.f29768k;
                c0927mz.m8450u(24, 3, f00Var);
                c0964nz.m8899a(f00Var);
                return;
            case 10:
                Future future = (Future) this.f14798b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f14799c;
                future.cancel(true);
                qv5.m10140h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                tt2 tt2Var = (tt2) this.f14798b;
                View view = (View) this.f14799c;
                Log.i("HsdpLoadingPanel", "hideLoading");
                try {
                    if (view.getParent() != null) {
                        ((WindowManager) tt2Var.f31429c).removeView(view);
                    }
                    break;
                } catch (RuntimeException e5) {
                    Log.e("HsdpLoadingPanel", "Error removing view from WindowManager", e5);
                }
                tt2Var.f31430d = null;
                return;
            case 12:
                ru5 ru5Var = (ru5) this.f14798b;
                String str2 = (String) this.f14799c;
                synchronized (zy5.class) {
                    Boolean bool = zy5.f36472a;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                        break;
                    } else {
                        try {
                            ru5Var.evaluateJavascript("(function(){})()", null);
                            bool = Boolean.TRUE;
                            zy5.f36472a = bool;
                        } catch (IllegalStateException unused2) {
                            bool = Boolean.FALSE;
                            zy5.f36472a = bool;
                        }
                        zBooleanValue = bool.booleanValue();
                        break;
                    }
                    throw th;
                }
                if (zBooleanValue) {
                    ru5Var.evaluateJavascript(str2, null);
                    return;
                } else {
                    ru5Var.loadUrl("javascript:".concat(str2));
                    return;
                }
            case 13:
                ((cw5) this.f14798b).m4223g((Runnable) this.f14799c);
                return;
            case 14:
                nr6 nr6Var = (nr6) this.f14798b;
                boolean z2 = nr6Var.f26060d;
                my5 my5Var = (my5) this.f14799c;
                if (z2) {
                    my5Var.f25307d.m8831o();
                    return;
                }
                try {
                    ((my5) this.f14799c).f25307d.m8828l(my5Var.f25306c.mo3681h(nr6Var));
                    return;
                } catch (jt3 e6) {
                    boolean z3 = e6.getCause() instanceof Exception;
                    my5 my5Var2 = (my5) this.f14799c;
                    if (z3) {
                        my5Var2.f25307d.m8830n((Exception) e6.getCause());
                        return;
                    } else {
                        my5Var2.f25307d.m8830n(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((my5) this.f14799c).f25307d.m8830n(e7);
                    return;
                }
            case 15:
                ry5.m10503a("JavaUploadDataSinkBase#executeOnExecutor " + ((String) this.f14798b) + " running callback");
                try {
                    ((oz5) this.f14799c).run();
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 16:
                i16 i16Var = (i16) this.f14798b;
                i16Var.m6558c(new oz5(i16Var, (yg3) this.f14799c), "read");
                return;
            case 17:
                my5 my5Var3 = (my5) this.f14799c;
                nr6 nr6Var2 = my5Var3.f25307d;
                try {
                    nr6 nr6Var3 = (nr6) my5Var3.f25306c.mo3681h((nr6) this.f14798b);
                    if (nr6Var3 == null) {
                        my5Var3.mo141g(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    sz0 sz0Var = mi4.f24959b;
                    nr6Var3.m8820d(sz0Var, my5Var3);
                    nr6Var3.m8819c(sz0Var, my5Var3);
                    nr6Var3.m8817a(sz0Var, my5Var3);
                    return;
                } catch (jt3 e8) {
                    if (e8.getCause() instanceof Exception) {
                        nr6Var2.m8830n((Exception) e8.getCause());
                        return;
                    } else {
                        nr6Var2.m8830n(e8);
                        return;
                    }
                } catch (Exception e9) {
                    nr6Var2.m8830n(e9);
                    return;
                }
            case 18:
                try {
                    ((f36) this.f14798b).onRequestFinished((sf6) this.f14799c);
                    return;
                } catch (Exception e10) {
                    Log.e("cn_HttpEngineWrapper", "Exception thrown from observation task", e10);
                    return;
                }
            case 19:
                v86 v86Var = (v86) this.f14799c;
                oa6 oa6Var = v86Var.f32468b.f35029b;
                ea6 ea6Var = oa6Var.f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", v86Var.f32467a);
                try {
                    xt5 xt5Var = (xt5) ((eu5) this.f14798b);
                    Parcel parcelM7550G = xt5Var.m7550G();
                    st5.m10913b(parcelM7550G, bundle);
                    Parcel parcelM7549F = xt5Var.m7549F(parcelM7550G, 1);
                    Bundle bundle2 = (Bundle) st5.m10912a(parcelM7549F, Bundle.CREATOR);
                    parcelM7549F.recycle();
                    if (bundle2 == null) {
                        d76 d76Var = oa6Var.f26514f;
                        oa6.m9016l(d76Var);
                        d76Var.f16835j.m12504a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e11) {
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12505b(e11.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                ea6 ea6Var2 = oa6Var.f26515g;
                oa6.m9016l(ea6Var2);
                ea6Var2.mo5038t();
                throw new IllegalStateException("Unexpected call on client side");
            case 20:
                qm6 qm6Var = ((jc6) this.f14799c).f22167a;
                qm6Var.m9928A();
                yo5 yo5Var = (yo5) this.f14798b;
                if (yo5Var.f35434f.m12714f() == null) {
                    qm6Var.getClass();
                    String str3 = yo5Var.f35432d;
                    y42.m12854a0(str3);
                    cp6 cp6VarM9939O = qm6Var.m9939O(str3);
                    if (cp6VarM9939O != null) {
                        qm6Var.m9945Y(yo5Var, cp6VarM9939O);
                        return;
                    }
                    return;
                }
                qm6Var.getClass();
                String str4 = yo5Var.f35432d;
                y42.m12854a0(str4);
                cp6 cp6VarM9939O2 = qm6Var.m9939O(str4);
                if (cp6VarM9939O2 != null) {
                    qm6Var.m9944X(yo5Var, cp6VarM9939O2);
                    return;
                }
                return;
            case 21:
                mg6 mg6Var = (mg6) this.f14799c;
                mg6Var.mo5038t();
                mg6Var.m9741u();
                Bundle bundle3 = (Bundle) this.f14798b;
                String string = bundle3.getString("name");
                y42.m12851X(string);
                oa6 oa6Var2 = (oa6) mg6Var.f36084a;
                if (!oa6Var2.m9018a()) {
                    d76 d76Var3 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16831L.m12504a("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    xm6 xm6Var = new xm6(0L, null, string, "");
                    try {
                        dn6 dn6Var = oa6Var2.f26517i;
                        oa6.m9014j(dn6Var);
                        bundle3.getString("app_id");
                        oa6Var2.m9027n().m9146P(new yo5(bundle3.getString("app_id"), "", xm6Var, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), dn6Var.m4598W(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        return;
                    } catch (IllegalArgumentException unused3) {
                        return;
                    }
                }
            case 22:
                ((mg6) this.f14799c).m8311L((Boolean) this.f14798b, true);
                return;
            case 23:
                mg6 mg6Var2 = (mg6) this.f14798b;
                mg6Var2.mo5038t();
                List<cl6> list = (List) this.f14799c;
                s86 s86Var = ((oa6) mg6Var2.f36084a).f26513e;
                oa6.m9014j(s86Var);
                SparseArray sparseArrayM10555A = s86Var.m10555A();
                for (cl6 cl6Var : list) {
                    int i2 = cl6Var.f16116f;
                    if (!sparseArrayM10555A.contains(i2) || ((Long) sparseArrayM10555A.get(i2)).longValue() < cl6Var.f16115e) {
                        mg6Var2.m8318U().add(cl6Var);
                    }
                }
                mg6Var2.m8319W();
                return;
            case 24:
                oa6 oa6Var3 = (oa6) ((mg6) this.f14798b).f36084a;
                e66 e66VarM9029p = oa6Var3.m9029p();
                String str5 = (String) this.f14799c;
                String str6 = e66VarM9029p.f17849O;
                if (str6 != null && !str6.equals(str5)) {
                    z = true;
                }
                e66VarM9029p.f17849O = str5;
                if (z) {
                    oa6Var3.m9029p().m4939z();
                    return;
                }
                return;
            case 25:
                m3124a();
                return;
            case 26:
                oj6 oj6Var = (oj6) this.f14799c;
                s56 s56Var = oj6Var.f26789h;
                oa6 oa6Var4 = (oa6) oj6Var.f36084a;
                if (s56Var == null) {
                    d76 d76Var4 = oa6Var4.f26514f;
                    oa6.m9016l(d76Var4);
                    d76Var4.f16835j.m12504a("Failed to send current screen to service");
                    return;
                }
                try {
                    eh6 eh6Var = (eh6) this.f14798b;
                    if (eh6Var == null) {
                        s56Var.mo5573m(0L, null, null, oa6Var4.f26509a.getPackageName());
                    } else {
                        s56Var.mo5573m(eh6Var.f18107c, eh6Var.f18105a, eh6Var.f18106b, oa6Var4.f26509a.getPackageName());
                    }
                    oj6Var.m9139I();
                    return;
                } catch (RemoteException e12) {
                    d76 d76Var5 = ((oa6) oj6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var5);
                    d76Var5.f16835j.m12505b(e12, "Failed to send current screen to the service");
                    return;
                }
            case 27:
                ((jj6) this.f14799c).f22344c.m9137G((ComponentName) this.f14798b);
                return;
            case 28:
                qm6 qm6Var2 = (qm6) this.f14798b;
                qm6Var2.m9928A();
                Runnable runnable2 = (Runnable) this.f14799c;
                qm6Var2.mo9020c().mo5038t();
                ArrayList arrayList = qm6Var2.f28606p;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    qm6Var2.f28606p = arrayList;
                }
                arrayList.add(runnable2);
                qm6Var2.m9973q();
                return;
            default:
                a86 a86Var = (a86) this.f14799c;
                nr6 nr6Var4 = (nr6) a86Var.f170d;
                try {
                    nr6 nr6VarMo3146n = ((le4) a86Var.f169c).mo3146n(((nr6) this.f14798b).m8824h());
                    sz0 sz0Var2 = mi4.f24959b;
                    nr6VarMo3146n.m8820d(sz0Var2, a86Var);
                    nr6VarMo3146n.m8819c(sz0Var2, a86Var);
                    nr6VarMo3146n.m8817a(sz0Var2, a86Var);
                    return;
                } catch (CancellationException unused4) {
                    a86Var.mo140e();
                    return;
                } catch (jt3 e13) {
                    if (e13.getCause() instanceof Exception) {
                        a86Var.mo141g((Exception) e13.getCause());
                        return;
                    } else {
                        nr6Var4.m8830n(e13);
                        return;
                    }
                } catch (Exception e14) {
                    nr6Var4.m8830n(e14);
                    return;
                }
        }
    }

    public String toString() {
        String str;
        switch (this.f14797a) {
            case 0:
                String simpleName = ar1.class.getSimpleName();
                z32 z32Var = new z32((byte) 21);
                byte b = 22;
                boolean z = false;
                nh3 nh3Var = new nh3(b, z);
                z32Var.f35739c = nh3Var;
                z32Var.f35738b = simpleName;
                VarHandle.storeStoreFence();
                zq1 zq1Var = (zq1) this.f14799c;
                nh3 nh3Var2 = new nh3(b, z);
                nh3Var.f25811c = nh3Var2;
                nh3Var2.f25810b = zq1Var;
                return z32Var.toString();
            case 4:
                Runnable runnable = (Runnable) this.f14798b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((e24) this.f14799c).f17645c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
