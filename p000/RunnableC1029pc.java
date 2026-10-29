package p000;

import ads_mobile_sdk.C0200km;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import internal.p002J.AbstractC0768N;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.chromium.net.C0995R;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: renamed from: pc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1029pc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27514a;

    /* JADX INFO: renamed from: b */
    public Object f27515b;

    public RunnableC1029pc(qv2 qv2Var) {
        this.f27514a = (byte) 5;
        this.f27515b = qv2Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m9491a() {
        try {
            er0 er0Var = (er0) this.f27515b;
            synchronized (er0Var.f18402m) {
                try {
                    if (er0Var.m5290b()) {
                        return;
                    }
                    er0Var.f18408s = (byte) 2;
                    er0 er0Var2 = (er0) this.f27515b;
                    er0Var2.f18391b.onReadCompleted(er0Var2, null, null, false);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            er0 er0Var3 = (er0) this.f27515b;
            er0Var3.getClass();
            new gv5("CalledByNative method has thrown an exception", e);
            HashSet hashSet = CronetUrlRequestContext.f27017v;
            Log.e("cn_CronetUrlRequestContext", "Exception in CalledByNative method", e);
            synchronized (er0Var3.f18402m) {
                try {
                    if (er0Var3.m5290b()) {
                        return;
                    }
                    er0Var3.f18409t = (byte) 6;
                    er0Var3.f18408s = (byte) 6;
                    er0Var3.m5291c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m9492b() {
        tr0 tr0Var = (tr0) this.f27515b;
        sr0 sr0Var = tr0Var.f31375w;
        sr0Var.getClass();
        ry5.m10503a("CronetUploadDataStream#initializeWithRequest");
        try {
            synchronized (sr0Var.f30522e) {
                sr0Var.f30524g = (byte) 2;
            }
            try {
                tr0 tr0Var2 = sr0Var.f30520c;
                if (!tr0Var2.f31353a) {
                    CronetUrlRequestContext cronetUrlRequestContext = tr0Var2.f31358f;
                    Thread threadCurrentThread = Thread.currentThread();
                    cronetUrlRequestContext.getClass();
                    if (threadCurrentThread == null) {
                        throw new InlineExecutionProhibitedException();
                    }
                }
                sr0Var.f30521d = ((UploadDataProvider) sr0Var.f30519b.f16400b).getLength();
            } catch (Throwable th) {
                sr0Var.m10906e(th);
            }
            synchronized (sr0Var.f30522e) {
                sr0Var.f30524g = (byte) 3;
            }
            Trace.endSection();
            synchronized (tr0Var.f31357e) {
                try {
                    if (tr0Var.m11093b()) {
                        return;
                    }
                    tr0Var.f31375w.m10902a(tr0Var.f31354b);
                    AbstractC0768N.MabZ5m6r(tr0Var.f31354b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m9493c() {
        h16 h16Var = (h16) this.f27515b;
        ArrayDeque arrayDeque = h16Var.f20270c;
        synchronized (arrayDeque) {
            try {
                if (h16Var.f20271d) {
                    return;
                }
                Runnable runnable = (Runnable) arrayDeque.pollFirst();
                h16Var.f20271d = runnable != null;
                while (runnable != null) {
                    try {
                        runnable.run();
                        synchronized (arrayDeque) {
                            runnable = (Runnable) arrayDeque.pollFirst();
                            h16Var.f20271d = runnable != null;
                        }
                    } catch (Throwable th) {
                        synchronized (h16Var.f20270c) {
                            h16Var.f20271d = false;
                            try {
                                h16Var.f20268a.execute(h16Var.f20269b);
                            } catch (RejectedExecutionException unused) {
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:103:0x0216 A[Catch: RuntimeException -> 0x0235, TryCatch #2 {RuntimeException -> 0x0235, blocks: (B:47:0x0102, B:49:0x010b, B:52:0x0123, B:53:0x0131, B:55:0x0137, B:57:0x0145, B:58:0x014b, B:60:0x0153, B:80:0x01ac, B:82:0x01b2, B:83:0x01bf, B:89:0x01ce, B:100:0x0209, B:104:0x021a, B:103:0x0216, B:96:0x01e6, B:97:0x0201, B:64:0x0161, B:65:0x016b, B:67:0x0171, B:69:0x017f, B:70:0x0185, B:73:0x018c, B:74:0x0196, B:76:0x019c, B:78:0x01a4, B:51:0x011c), top: B:337:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x06eb  */
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
        int actionMasked;
        int i;
        boolean zM5140a;
        Object obj;
        ii4 ii4VarM9533b;
        long jNanoTime;
        yz5 yz5Var;
        ox5 ox5Var;
        Map asMap;
        String str;
        int i2;
        long length;
        long j;
        int i3;
        int i4;
        u06 u06Var;
        int i5;
        long j2;
        byte b = 0;
        switch (this.f27514a) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) this.f27515b;
                viewTreeObserverOnGlobalLayoutListenerC1140sc.removeCallbacks(this);
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30130m0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                if (actionMasked != 7) {
                    i = 9;
                    if (actionMasked != 8) {
                        if (actionMasked != 9) {
                            i = 2;
                        } else {
                            i = 7;
                        }
                    }
                } else {
                    i = 7;
                }
                viewTreeObserverOnGlobalLayoutListenerC1140sc.m10604I(motionEvent, i, viewTreeObserverOnGlobalLayoutListenerC1140sc.f30132n0, false);
                return;
            case 1:
                ek0 ek0Var = (ek0) this.f27515b;
                synchronized (ek0Var) {
                    zM5140a = ek0Var.m5140a();
                    if (zM5140a) {
                        synchronized (ek0Var) {
                            ek0Var.f18152b = true;
                        }
                    }
                }
                if (zM5140a) {
                    fk0 fk0VarM6012c = ek0Var.f18167q.m6012c();
                    ek0Var.f18166p.getClass();
                    if (new Date(System.currentTimeMillis()).before(fk0VarM6012c.f19052b)) {
                        ek0Var.m5145h();
                        return;
                    }
                    rg1 rg1Var = (rg1) ek0Var.f18161k;
                    nr6 nr6VarM10332e = rg1Var.m10332e();
                    nr6 nr6VarM10331c = rg1Var.m10331c();
                    nr6 nr6VarM12978k0 = y62.m12978k0(nr6VarM10332e, nr6VarM10331c);
                    ScheduledExecutorService scheduledExecutorService = ek0Var.f18158h;
                    ck0 ck0Var = new ck0((byte) 0);
                    ck0Var.f16074b = ek0Var;
                    ck0Var.f16075c = nr6VarM10332e;
                    ck0Var.f16076d = nr6VarM10331c;
                    VarHandle.storeStoreFence();
                    nr6 nr6VarM8822f = nr6VarM12978k0.m8822f(scheduledExecutorService, ck0Var);
                    nr6 nr6VarM12978k1 = y62.m12978k0(nr6VarM8822f);
                    ScheduledExecutorService scheduledExecutorService2 = ek0Var.f18158h;
                    C1163sz c1163sz = new C1163sz((byte) 5);
                    c1163sz.f30676b = ek0Var;
                    c1163sz.f30677c = nr6VarM8822f;
                    VarHandle.storeStoreFence();
                    nr6VarM12978k1.m8821e(scheduledExecutorService2, c1163sz);
                    return;
                }
                return;
            case 2:
                nz0 nz0Var = (nz0) this.f27515b;
                nz0Var.f26208Y.onDismiss(nz0Var.f26216g0);
                return;
            case 3:
                pn1 pn1Var = (pn1) this.f27515b;
                if (pn1Var.f27764I != null) {
                    pn1Var.m9576d();
                    return;
                }
                return;
            case 4:
                ((eo1) this.f27515b).m5217A(true);
                return;
            case 5:
                synchronized (((qv2) this.f27515b).f28822a) {
                    obj = ((qv2) this.f27515b).f28827f;
                    ((qv2) this.f27515b).f28827f = qv2.f28821k;
                    break;
                }
                ((qv2) this.f27515b).m10132e(obj);
                return;
            case 6:
                break;
            case 7:
                ((ol5) this.f27515b).m9173e();
                return;
            case 8:
                InterfaceC1074qk interfaceC1074qk = ((ol5) ((wd3) this.f27515b).f33259b).f26857b;
                interfaceC1074qk.disconnect(interfaceC1074qk.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 9:
                ((xl5) this.f27515b).f34399p.m3673f(new lk0(4, null, null));
                return;
            case 10:
                new Bundle();
                C0200km c0200km = (C0200km) this.f27515b;
                b70 b70Var = (b70) c0200km.f6401b;
                if ((b70Var.m3496t() instanceof s13) && ((AtomicBoolean) c0200km.f6400a).compareAndSet(false, true)) {
                    b70Var.resumeWith(ju4.f22634a);
                    return;
                }
                return;
            case 11:
                m9491a();
                return;
            case 12:
                ((ts5) this.f27515b).m11131c(new n56(4, "Web view timed out."));
                return;
            case 13:
                tt2 tt2Var = (tt2) this.f27515b;
                View view = (View) tt2Var.f31430d;
                if (view == null) {
                    return;
                }
                Activity activity = (Activity) tt2Var.f31428b;
                if (activity.isInPictureInPictureMode()) {
                    tt2Var.m11146F();
                    return;
                }
                try {
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = Math.min(activity.getResources().getDimensionPixelSize(C0995R.dimen.sdk_hsdp_loading_ui_height), (int) (k26.m7360b(activity) * 0.6f));
                        if (activity.getResources().getConfiguration().screenWidthDp > 640) {
                            layoutParams.width = k26.m7359a(activity, 640);
                        } else {
                            layoutParams.width = -1;
                        }
                        ((WindowManager) tt2Var.f31429c).updateViewLayout(view, layoutParams);
                        Log.i("HsdpLoadingPanel", "updateLoadingView: updated window size.");
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    Log.e("HsdpLoadingPanel", "updateLoadingView: error updating window size.", e);
                    return;
                }
            case 14:
                try {
                    sr0 sr0Var = (sr0) this.f27515b;
                    tr0 tr0Var = sr0Var.f30520c;
                    if (!tr0Var.f31353a) {
                        CronetUrlRequestContext cronetUrlRequestContext = tr0Var.f31358f;
                        Thread threadCurrentThread = Thread.currentThread();
                        cronetUrlRequestContext.getClass();
                        if (threadCurrentThread == null) {
                            throw new InlineExecutionProhibitedException();
                        }
                    }
                    sr0Var.f30519b.close();
                    return;
                } catch (Exception e2) {
                    Log.e("cn_".concat("sr0"), "Exception thrown when closing", e2);
                    return;
                }
            case 15:
                m9492b();
                return;
            case 16:
                ((gu5) this.f27515b).m6172a();
                return;
            case 17:
                try {
                    ((C0927mz) ((pq3) this.f27515b).f27897c).f25309B.mo7234b();
                    return;
                } catch (Throwable th) {
                    qv5.m10141i("BillingClient", "Exception calling onBillingServiceDisconnected.", th);
                    return;
                }
            case 18:
                zu5 zu5Var = (zu5) this.f27515b;
                C0927mz c0927mz = zu5Var.f36397e;
                c0927mz.m8435D(0);
                f00 f00Var = rz5.f29768k;
                c0927mz.m8434C(24, zu5Var.f36396d, f00Var);
                zu5Var.m13799d(f00Var);
                return;
            case 19:
                fx5 fx5Var = (fx5) this.f27515b;
                AtomicReference atomicReference = fx5Var.f19403k;
                String str2 = (String) fx5Var.f19393a.get();
                if (str2 == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                    return;
                }
                int size = ((Queue) atomicReference.get()).size();
                for (int i6 = 0; i6 < size; i6++) {
                    za6 za6Var = (za6) ((Queue) atomicReference.get()).poll();
                    if (za6Var != null) {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str2).toURL().openConnection();
                            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(fx5Var.f19394b));
                            httpURLConnection.setConnectTimeout(10000);
                            httpURLConnection.setReadTimeout(30000);
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                            za6Var.m6449b(httpURLConnection.getOutputStream());
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode != 200 && responseCode != 204) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                ((Queue) atomicReference.get()).add(za6Var);
                            }
                        } catch (IOException e3) {
                            Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e3.getMessage())));
                            ((Queue) atomicReference.get()).add(za6Var);
                        } catch (URISyntaxException e4) {
                            Log.w("UserMessagingPlatform", "Metrics reporting URL " + str2 + " is not valid: " + e4.getMessage());
                        }
                    }
                }
                return;
            case 20:
                ((zx5) this.f27515b).f36456h++;
                return;
            case 21:
                e06 e06Var = (e06) this.f27515b;
                if (e06Var == null || (yz5Var = e06Var.f17576h) == null) {
                    return;
                }
                this.f27515b = null;
                if (yz5Var.isDone()) {
                    Object obj2 = e06Var.f35605a;
                    if (obj2 == null) {
                        if (yz5Var.isDone()) {
                            if (yx5.f35604g.mo10952g(e06Var, null, e06.m4842h(yz5Var))) {
                                e06.m4843j(e06Var);
                                return;
                            }
                            return;
                        }
                        mx5 mx5Var = new mx5();
                        mx5Var.f25285a = e06Var;
                        mx5Var.f25286b = yz5Var;
                        VarHandle.storeStoreFence();
                        if (yx5.f35604g.mo10952g(e06Var, null, mx5Var)) {
                            try {
                                yz5Var.mo4845b(mx5Var, bz5.f15714a);
                                return;
                            } catch (Throwable th2) {
                                try {
                                    ox5Var = new ox5();
                                    ox5Var.f27195a = th2;
                                    break;
                                } catch (Error | Exception unused) {
                                    ox5Var = ox5.f27194b;
                                }
                                yx5.f35604g.mo10952g(e06Var, mx5Var, ox5Var);
                                return;
                            }
                        }
                        obj2 = e06Var.f35605a;
                    }
                    if (obj2 instanceof lx5) {
                        yz5Var.cancel(((lx5) obj2).f24455a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = e06Var.f17577i;
                    e06Var.f17577i = null;
                    String str3 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (jAbs > 10) {
                                str3 = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                            }
                        } catch (Throwable th3) {
                            b06 b06Var = new b06(str3);
                            ox5 ox5Var2 = new ox5();
                            ox5Var2.f27195a = b06Var;
                            if (yx5.f35604g.mo10952g(e06Var, null, ox5Var2)) {
                                e06.m4843j(e06Var);
                            }
                            throw th3;
                        }
                    }
                    b06 b06Var2 = new b06(str3 + ": " + yz5Var.toString());
                    ox5 ox5Var3 = new ox5();
                    ox5Var3.f27195a = b06Var2;
                    if (yx5.f35604g.mo10952g(e06Var, null, ox5Var3)) {
                        e06.m4843j(e06Var);
                    }
                    yz5Var.cancel(true);
                    return;
                } catch (Throwable th4) {
                    yz5Var.cancel(true);
                    throw th4;
                }
            case 22:
                ry5.m10503a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  onFailed running callback");
                try {
                    ((yn3) this.f27515b).run();
                    Trace.endSection();
                    return;
                } catch (Throwable th5) {
                    try {
                        Trace.endSection();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            case 23:
                i16 i16Var = ((r06) this.f27515b).f28940d;
                try {
                    dt0 dt0Var = i16Var.f21037u;
                    long j3 = i16Var.f21036t;
                    m26 m26Var = i16Var.f21031o;
                    if (m26Var != null) {
                        asMap = m26Var.f24606g.getAsMap();
                        m26 m26Var2 = i16Var.f21031o;
                        str = m26Var2.f24603d;
                        i2 = m26Var2.f24601b;
                    } else {
                        asMap = Collections.EMPTY_MAP;
                        str = "";
                        i2 = 0;
                    }
                    String str4 = str;
                    long length2 = 0;
                    for (Map.Entry entry : i16Var.f21020d.entrySet()) {
                        String str5 = (String) entry.getKey();
                        if (str5 != null) {
                            length2 += (long) str5.length();
                        }
                        String str6 = (String) entry.getValue();
                        if (str6 != null) {
                            length2 += (long) str6.length();
                        }
                    }
                    if (asMap == null) {
                        length = 0;
                    } else {
                        length = 0;
                        for (Map.Entry entry2 : asMap.entrySet()) {
                            String str7 = (String) entry2.getKey();
                            if (str7 != null) {
                                length += (long) str7.length();
                            }
                            if (entry2.getValue() != null) {
                                for (String str8 : (List) entry2.getValue()) {
                                    if (str8 != null) {
                                        length += (long) str8.length();
                                    }
                                }
                            }
                        }
                    }
                    if (asMap.containsKey("Content-Length")) {
                        try {
                            j2 = Long.parseLong((String) ((List) asMap.get("Content-Length")).get(0));
                        } catch (NumberFormatException unused2) {
                            j2 = 0;
                        }
                        j = j2;
                        break;
                    } else {
                        j = -1;
                    }
                    Duration durationOfSeconds = Duration.ofSeconds(0L);
                    int i7 = i16Var.f21022f.get();
                    if (i7 != 6) {
                        if (i7 == 7) {
                            i4 = 0;
                            i3 = 1;
                        } else {
                            if (i7 != 8) {
                                throw new IllegalStateException("Internal Cronet error: attempted to report metrics but current state (" + i7 + ") is not a done state!");
                            }
                            i3 = 3;
                        }
                        int i8 = i16Var.f21040x;
                        int i9 = i16Var.f21039w;
                        u06Var = i16Var.f21034r;
                        if (u06Var == null) {
                            i5 = i4;
                        } else {
                            i5 = u06Var.f36456h;
                        }
                        dt0Var.mo4111K(j3, new or0(length2, -1L, length, j, i2, durationOfSeconds, str4, i3, i8, i9, i5, i16Var.f21041y, Process.myUid(), ImplVersion.getCronetVersion()));
                        return;
                    }
                    i3 = 2;
                    i4 = 0;
                    int i10 = i16Var.f21040x;
                    int i11 = i16Var.f21039w;
                    u06Var = i16Var.f21034r;
                    if (u06Var == null) {
                        i5 = i4;
                    } else {
                        i5 = u06Var.f36456h;
                    }
                    dt0Var.mo4111K(j3, new or0(length2, -1L, length, j, i2, durationOfSeconds, str4, i3, i10, i11, i5, i16Var.f21041y, Process.myUid(), ImplVersion.getCronetVersion()));
                    return;
                } catch (RuntimeException e5) {
                    Log.i("cn_".concat("i16"), "Error while trying to log CronetTrafficInfo: ", e5);
                    return;
                }
            case 24:
                m9493c();
                return;
            case 25:
                a86 a86Var = (a86) this.f27515b;
                synchronized (a86Var.f169c) {
                    try {
                        v33 v33Var = (v33) a86Var.f170d;
                        if (v33Var != null) {
                            v33Var.mo140e();
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                    break;
                }
                return;
            case 26:
                ((qm6) ((e86) this.f27515b).f17899d).m9936L();
                return;
            case 27:
                Context context = (Context) ((tf6) this.f27515b).f31128b;
                long j4 = tf6.m11047b(context).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (j5 == -1 || System.currentTimeMillis() <= j5) {
                    return;
                }
                if (!tf6.m11047b(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 28:
                oj6 oj6Var = ((jj6) this.f27515b).f22344c;
                oj6Var.m9137G(new ComponentName(((oa6) oj6Var.f36084a).f26509a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            default:
                oj6 oj6Var2 = ((jj6) ((oz5) this.f27515b).f27250c).f22344c;
                ea6 ea6Var = ((oa6) oj6Var2.f36084a).f26515g;
                oa6.m9016l(ea6Var);
                hj6 hj6Var = new hj6(b);
                hj6Var.f20631b = oj6Var2;
                VarHandle.storeStoreFence();
                ea6Var.m5033D(hj6Var);
                return;
        }
        while (true) {
            pi4 pi4Var = (pi4) this.f27515b;
            synchronized (pi4Var) {
                ii4VarM9533b = pi4Var.m9533b();
            }
            if (ii4VarM9533b == null) {
                return;
            }
            oi4 oi4Var = ii4VarM9533b.f21462c;
            pi4 pi4Var2 = (pi4) this.f27515b;
            boolean zIsLoggable = pi4.f27638i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                ev0.m5359i0(ii4VarM9533b, oi4Var, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                pi4Var2.m9536e(ii4VarM9533b);
                if (zIsLoggable) {
                    ev0.m5359i0(ii4VarM9533b, oi4Var, "finished run in ".concat(ev0.m5350Z(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th8) {
                try {
                    ((ThreadPoolExecutor) pi4Var2.f27639a.f33090b).execute(this);
                    throw th8;
                } catch (Throwable th9) {
                    if (zIsLoggable) {
                        ev0.m5359i0(ii4VarM9533b, oi4Var, "failed a run in ".concat(ev0.m5350Z(System.nanoTime() - jNanoTime)));
                    }
                    throw th9;
                }
            }
        }
    }

    public /* synthetic */ RunnableC1029pc(byte b) {
        this.f27514a = b;
    }
}
